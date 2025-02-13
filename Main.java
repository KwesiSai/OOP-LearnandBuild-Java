

public class Main {
	public static void main(String[] args){
        // String message = newMethod("Dear", "Emily"); //calling methods
        // System.out.println(message);

        // int myfactorial = factorial(4);
        // System.out.println(myfactorial);

        // Binary newConvertoBinary = new Binary();
        // System.out.println(newConvertoBinary.binaryToDecimal("0"));
        // System.out.println(newConvertoBinary.binaryToDecimal("1"));
        // System.out.println(newConvertoBinary.binaryToDecimal("0101"));
        // System.out.println(newConvertoBinary.binaryToDecimal("1010"));
        // System.out.println(newConvertoBinary.binaryToDecimal("10111010"));

        LinkedList myLinkedList =  new LinkedList();

        myLinkedList.addNode(10);
        myLinkedList.addNode(15);
        myLinkedList.addNode(12);
        myLinkedList.addNode(9);
        myLinkedList.addNode(2);
        myLinkedList.display();
        myLinkedList.deleteNode(12);
        myLinkedList.deleteNode(20);



    }
    //Defining methods
    public static String newMethod(String person){
        return "Hey " + person + " we are onto methods now!!!";
    }
    //Method overloading
    public static String newMethod(String greeting, String person){
        return greeting + " " + person + " we are onto methods now!!!";
    }
    //Using recursion to find factorial of a number
    public static int factorial (int num){
        if(num == 1){
        return 1;
        }
        else if(num == 0){
        return 1;
        }
        else{
            return num * factorial(num - 1);
        }
    }
}        
