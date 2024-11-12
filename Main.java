import java.util.Scanner;

public class Main {
	public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
		// System.out.println("Hello World");
        // System.out.print("The world dey bee");
        // System.out.println(" It dey bee keke ");
        // System.out.println(590454);
        // System.out.println(100 * 45);
        // String name = "Abraham"; //String type is use for words or group of words and must be put in double quotes
        // int age = 22; //int is used for integers, negative and positive integers
        // float weight = 73.55f; //float is used for positive and negative decimals
        // char gender = 'M'; //char is for single letters or characters and must be wrapped in single quotes
        // boolean married = false; // Boolean is for storing boolean states, true or false
        // System.out.println(name);
        // System.out.println(age);
        // System.out.println(gender);
        // System.out.println(married);
        // System.out.println(weight);
        // final int newage = 23;
        // //The final keyword declares a variable as a constant
        // System.out.println(newage);
        // System.out.println("Hey there my dear " + name); //Printing text and variables 
        // String nickname = "Mafia";
        // String userName = name + nickname;
        // String username = name + " " + nickname;
        // System.out.println(username);
        // System.out.println(userName);
        
        //Variables and identifies
        //real life code to calculate area of a rectangle
        int length = 6;
        int breadth = 4;
        int area = length * breadth;

        System.out.println("The area of the rectangle is: " + area);
        System.out.println(length < breadth);
        if(length > breadth){
            System.out.println("This is truly a rectangle");
        }
        System.out.println("Enter your age");
        int theAge = scanner.nextInt();  
        switch(theAge){
            case 10: System.out.println("Oh my 10 year old.");
            break;
            case 20: System.out.println("Oh my 20 oldieeee");
            break;
            default: System.out.println("Well i don't know what to say about your age");
            break;
        }

        int num = 5;
        do{
            System.out.println(num);
            num++;
        }
        while (num<15);
        
        // if(theAge < 10){
        //     System.out.println("You are a child");
        // }
        // else if(theAge > 10 && theAge < 20){
        //     System.out.println("You are not a child but you are a teen");
        // }
        // else{
        //     System.out.println("Oh you've grown ankasa, not oluman but you are an adult");
        // }

}
    //Ignore this because it is a comment
    /*
     * This is a multiline comment which will also be ignored by the compiler
     */
}
