package Multithreading.AccountDeadLock;

public class AccountThread extends Thread {
        private final Account accountFrom;
        private final Account accountTo;
        public AccountThread(Account accountFrom, Account accountTo) {
            this.accountFrom = accountFrom;
            this.accountTo = accountTo;
        }

    /**
     *
     * 1 ----- account1 -> account2
     *
     * 2 ----- account2 -> account1
     *
     * Происходит deadlock, один поток ждёт освобождение монитора у account1, а второй поток ждёт освобождение монитора у account2
     */
    @Override
    public void run() {
        synchronized (accountFrom) {
            synchronized (accountTo) {
                for (int i = 0; i < 2000; i++) {
                    if(accountFrom.takeOff(10)) {
                        accountTo.addMoney(10);
                    }
                }
            }
        }
    }
}
