package RepeatFull.Collection;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorEx {
    public static void main(String[] args) {
        ListIteratorEx listIteratorEx = new ListIteratorEx();
        listIteratorEx.test();
    }
    public void test() {
        String temp = "madam";
        List<Character> lis = new LinkedList<>();
        char[] chars = temp.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            lis.add(chars[i]);
        }
        ListIterator<Character> characterListIterator = lis.listIterator();
        while (characterListIterator.hasNext() && characterListIterator.hasPrevious()) {
            if (characterListIterator.next().equals(characterListIterator.previous())) {
                System.out.println("true");
            }
        }
    }
}
