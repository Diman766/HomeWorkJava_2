
class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.push(2);
        list.push(4);
        list.push(8);
        list.push(10);

        System.out.println(
                "Original linked list ");
        list.printList(LinkedList.head);

        list.reverse();
        System.out.println("");
        System.out.println(
                "The reversed Linked List is ");
        list.printList(LinkedList.head);
    }
}