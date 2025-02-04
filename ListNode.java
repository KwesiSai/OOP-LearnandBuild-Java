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

    public void display(){
        ListNode temp = head;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
    
}