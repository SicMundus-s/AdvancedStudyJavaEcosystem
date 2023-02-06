package ReflectionAPI;

public interface test {
    long interfaceVar = 10L;

    default void printInterfaceVar() {
        System.out.println(interfaceVar);
    }
}
