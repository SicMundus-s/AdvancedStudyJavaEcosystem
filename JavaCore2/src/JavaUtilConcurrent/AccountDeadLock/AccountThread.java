package JavaUtilConcurrent.AccountDeadLock;

public class AccountThread extends Thread {
    private final Account accountFrom;
    private final Account accountTo;

    public AccountThread(Account accountFrom, Account accountTo) {
        this.accountFrom = accountFrom;
        this.accountTo = accountTo;
    }

    /**
     * 1 ----- account1 -> account2
     * <p>
     * 2 ----- account2 -> account1
     * <p>
     * Происходит deadlock, один поток ждёт освобождение монитора у account1, а второй поток ждёт освобождение монитора у account2
     */
    @Override
    public void run() {
        for (int i = 0; i < 2000; i++) {
            lockAccounts();
            try {
                if (accountFrom.takeOff(10)) {
                    accountTo.addMoney(10);
                }
            } finally {
                accountFrom.getLock().unlock();
                accountTo.getLock().unlock();
            }
        }
    }

    private void lockAccounts() {
        while (true) {
            boolean fromLockResult = accountFrom.getLock().tryLock();
            boolean toLockResult = accountTo.getLock().tryLock();
            if (fromLockResult && toLockResult) {
                break;
            }
            if (fromLockResult) {
                accountFrom.getLock().unlock();
            }
            if (toLockResult) {
                accountTo.getLock().unlock();
            }
        }
    }
}
