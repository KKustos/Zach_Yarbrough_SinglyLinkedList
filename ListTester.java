public class ListTester {
    public static void main(String[] args){
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(5);
        list.add(6);
        list.add(76);
        list.add(-26);
        list.add(9);
        list.add(0);
        list.remove();
        list.removeAt(0);
        list.printValues();
    }
}