public class ListNode {
    int value;
    ListNode next;

    public ListNode(int value){
        this.value = value;
        this.next = null;
    }
}

class LinkedList{
    ListNode head;

    public LinkedList(){ 
        this.head = null;
    }

    public void addNode(int data){
        ListNode newNode = new ListNode(data);
        if(head == null){
            head = newNode;
        }else{
            ListNode temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void deleteNode(int data){
        ListNode previous = null;
        if(head == null){
            System.out.println("List is empty.");
            return;
        }
        if(head.value == data){
            head = head.next;
            System.out.println("You have deleted " + head.value);
            return;
        }
        
        ListNode current = head;
        while(current != null && current.value != data){
            previous = current;
            current = current.next;
        }
        if(current == null){
            System.out.println("Could not find " +data);
            return;
        }
    
        previous.next = current.next;
        System.out.println("You have deleted " + current.value + ". \nElements in the linked list now: ");
        display();        

    }

    public void display(){
        ListNode temp = head;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
    
}