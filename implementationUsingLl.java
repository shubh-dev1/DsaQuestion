package stackDsa;
public class implementationUsingLl {


    Node head;
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    // function to check is stack is empty or not
    public boolean isEmpty(){
        return head == null;
    }

    // to push the element in the stack
    public  void push(int data){
        Node newnode = new Node(data);
        if(isEmpty()){
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }
    // remove the top element in the stack
    public void pop(){
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return;
        }
        head = head.next;
    }

    // to dispaly the top element in the stack
    public int peek(){
        if(isEmpty()){
            return -1;
        }
        return head.data;
    }
    public static void main(String[] args) {
        implementationUsingLl stack = new implementationUsingLl();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println(stack.peek());
        while(!stack.isEmpty()){
            System.out.print(stack.peek()+" ");
            stack.pop();

        }

    }
}


