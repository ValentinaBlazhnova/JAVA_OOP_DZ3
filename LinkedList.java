import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LinkedList implements Iterable<Element> { // Cписок элементов
    private List<Element> elements = new ArrayList<>();

    public void addElement(Element element) { // Добавление элементов в список
        elements.add(element);
    }

    private class ElementIterator implements Iterator<Element>{
        private int thisIndex = 0; //Индекс текущего элемента

        @Override
        public boolean hasNext() { // hasNext проверяет  есть ли еще элементы.
            return elements.size() > thisIndex;
        }

        @Override
        public Element next() { // next возвращает следующий элемент.
            return elements.get(thisIndex++);//Сначала возвращает элем(get), потом увеличивает на 1(++)
        }
    }

    @Override
    public Iterator<Element> iterator() {
        return new ElementIterator();
    }
}
