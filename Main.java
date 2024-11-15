

public class Main {
	public static void main(String[] args){
        String message = newMethod("Dear", "Emily"); //calling methods
        System.out.println(message);
        Test oneobj = new Test();
        System.out.println(oneobj.car);

        int myfactorial = factorial(4);
        System.out.println(myfactorial);

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
