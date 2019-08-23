package InterviewQuotions;

public class SingleLinkedListExample {
    private Node head;
    private Node last;
    public static void main(String org[]){
        SingleLinkedListExample single = new SingleLinkedListExample();
        single.add(1);
        single.add(2);
        single.add(3);
        single.add(345);
        single.print();
        single.delete(2);
        single.print();
    }
    public void print(){
        Node dummyHead = head;
        while (dummyHead!=null) {
            System.out.print(dummyHead.value);
            dummyHead = dummyHead.next;
            if (dummyHead!=null) System.out.print("->");
        }
    }
    public void delete(int value){
        boolean isValueExist = false;
        Node node = null;
        while (head!=null && !isValueExist) {
            if (head.value == value && head.next == null) {
                head = null;
                isValueExist = true;
                break;
            } else if (head.value == value && head.next != null) {
                head = head.next;
                isValueExist = true;
                if (head.next == last) {
                    last = null;
                }
            } else if (last.value == value) {
                last.next = null;
                isValueExist = true;
                break;
            } else if (head.next != null && head.next.value == value) {
                head.next = head.next.next;
            } else if (head.next != null && head.next.value != value){
                //node = head
            }
        }
        if(isValueExist) {
            System.out.print(value +":Deleted from list");
        } else {
            System.out.print(value +":Not in list");
        }

    }

    public boolean add(int value){
        if( head == null ) {
            head = new Node(value,null);
        } else if (last == null){
            last = new Node(value,null);
            head.next = last;
        } else {
            Node node = last;
            last = new Node(value , null);
            node.next = last;
        }
        return true;
    }

    class Node{
        private int value;
        private Node next;
        public Node(int value,Node next){
            this.value = value;
            this.next = next;
        }

    }
}
