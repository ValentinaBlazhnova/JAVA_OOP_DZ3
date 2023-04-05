public class Element {
    private int element;

    public Element(int element) { //конструктор
        this.element = element;
    }

    public int getElement() { //Геттер
        return element;
    }

    public void setElement(int element) { //Сеттер
        this.element = element;
    }

    @Override
    public String toString() {
        return String.format("Element %s", element);
    } 
}
