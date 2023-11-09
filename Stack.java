// implementation of a pushdown stack
public class Stack<Item> {
    private Node head;

    private class Node{
        Item item;
        Node next;

        public Node(Item item, Node next){
            this.item = item;
            this.next = next;
        }
    }

    public Stack(){
        head = null;
    }

    public boolean isEmpty(){
        if(head == null){
            return true;
        }
        return false;
    }

    public void push(Item item){
        Node newNode = new Node(item, null);
        if(isEmpty()){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public Item pop(){
        Item returnItem = head.item;
        Node temp = head.next;
        head = temp;
        return returnItem;
    }

    //For Debug
    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.item);
            temp = temp.next;
        }
    }

    //For Debug
    public static void main(String args[]){
        Stack<Integer> myStack = new Stack<>();
        myStack.push(1);
        myStack.push(2);
        myStack.pop();
        myStack.pop();
        myStack.print();
    }
}