import java.util.LinkedList;

class Node<E> {
    public E data;
    public Node<E> next;

    public Node(final E data, final Node<E> next) {
        if (data == null) throw new IllegalArgumentException("data is null");
        this.data = data;
        this.next = next;
    }

    public Node(final E data) {
        this(data, null);
    }

    public String toString() {
        return "Node@" + hashCode() + "(" + data +
                (next != null ? ", Node@" + next.hashCode() + ")" : ")");
    }

    final List<String> theList = new LinkedList<String>(Arrays.asList("Hey", "Grant", "What", "Izzup"));
    public static void printList(List<String> theList) {
        final Iterator i = theList.iterator();
        while(i.hasNext()){
            String value = (String) i.next();
            System.out.print(value + " ");
        }
    }

    public static <E> void printNode(Node<E> curr) {
        if (curr == null) {
            return;
        }
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println(curr);

    }

    public static <E> Node<E> deleteNode(Node<E> curr, int position) {
        if (position == 1) {
            curr = curr.next;
            curr.next = null;
            return curr;
        } else {
            Node<E> previous = curr;
            int i = 1;
            while (i < position - 1) {
                previous = previous.next;
                i++;
            }
            Node<E> current = previous.next;
            previous.next = current.next;
            current.next = null;
            return current;
        }
    }
   public static  <E> void printNodeCycle(Node<E> curr, Node<E> head) {
        if (curr == null) {
            return;
        }
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
            if (curr.next == head) {
                break;
            }
        }
        System.out.println(curr.data);
    }
   public static  <E> Node<E> insertAfter(Node<E> previous, Node<E> data) {
        data.next = previous.next;
        previous.next = data;
        return previous;
    }


    public static void main(String[] args){
        Node<String> Hey = new Node<>("Hey");
        Node<String> Grant = new Node<>("Grant");
        Node<String> What = new Node<>("What");
        Node<String> Izzup = new Node<>("Izzup");

        Hey.next = Grant;
        Grant.next = What;
        What.next = Izzup;

        LinkedList<Node<String>> list = new LinkedList<>();
        List<String> theList = new LinkedList<String>(Arrays.asList("Hey", "Grant", "What", "Izzup"));

        //Question: Which way to create the list more clearly conveys the actual structure of the list?
        // The single-lined statement because it's more concise and the ".next" statements are tedious

        //Question: What happens if you use the printNode method on this circular list?
        // It would print forever

        //Question: How would you describe the shape of any noncyclical structure you can build using the Node class?
        // Furthermore, can you build structures with branches that look like trees,
        // where a node can have more than one successor or neighbor?
        //     It would look like a lot of dendrites acting on each other if triggered


        printNodeCycle(Hey,Hey);
        deleteNode(What,3);
        insertAfter(Grant, What);
        printNode(Hey);
        printList(theList);





    }
}
// Question: What is the purpose of "E" in this class definition?
// E is a generic class

// Question: What is the purpose of "this" in the second constructor definition?
// It calls the first constructor again if the "next" node did not pass

// Question: What is the purpose of "toString" in this class definition?
// It returns the hashCode and the data, and then the hashCode of the next link if it's there






