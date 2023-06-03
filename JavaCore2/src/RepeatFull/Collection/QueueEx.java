package RepeatFull.Collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
    public static void main(String[] args) {
        Queue<String> list = new LinkedList<>();
        list.poll(); // Вернёт null если элементов больше нет
        list.offer("dfgdf"); // В отличие от метода add если очередь ограничено, то он не даст добавить сверх этого ограничения
        list.element(); // Показывает верхний(первый) элемент в очереди, выбрасывает Exe если нет в очереди
        list.peek(); // Показывает верхний(первый) элемент в очереди, НЕ выбрасывает Exe если нет в очереди
    }
}
