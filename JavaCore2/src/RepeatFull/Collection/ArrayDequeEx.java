package RepeatFull.Collection;

import java.util.ArrayDeque;

// Двунаправленная очередь. Fifo and Lifo. Работает как обычная очередь, то есть при добавлении элемент встаёт в
// начало очереди, при удалении удаляется первый элемент. Но главное отличие это возможность добавлять в конец и в начало
// Все остальные методы работают по аналогии с очередью, но только в двунаправленном режиме
public class ArrayDequeEx {
    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.add(1);
        arrayDeque.add(5);
        arrayDeque.add(7);
        arrayDeque.add(8);
        arrayDeque.add(10);
        System.out.println(arrayDeque);
        arrayDeque.remove();
        System.out.println(arrayDeque);

    }
}
