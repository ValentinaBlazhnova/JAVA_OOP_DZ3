public class Main {
    public static void main(String[] args){
        LinkedList linkedList = new LinkedList();
        linkedList.addElement(new Element(5));
        linkedList.addElement(new Element(1));
        linkedList.addElement(new Element(3));
        linkedList.addElement(new Element(8));
        linkedList.addElement(new Element(7));

        for (Element element : linkedList) { //Итератор вводим для вывода через foreach списка
            System.out.println(element); 
        }
    }   
}
