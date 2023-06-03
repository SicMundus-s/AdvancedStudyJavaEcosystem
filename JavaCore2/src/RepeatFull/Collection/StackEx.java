package RepeatFull.Collection;

import java.util.Stack;

public class StackEx {
    public static void main(String[] args) {
        Stack<String> stringStack = new Stack<>();
        stringStack.push("N1");
        stringStack.push("N2");
        stringStack.push("N3");
        stringStack.push("N4");
        System.out.println(stringStack);
        String N4 = stringStack.pop();
        System.out.println(stringStack);
        String N3 = stringStack.peek();


    }
}
