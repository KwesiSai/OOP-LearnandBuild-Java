

public class Main {
	public static void main(String[] args){
        String message = newMethod("Emily"); //calling methods
        System.out.println(message);

    }
    //Defining methods
    public static String newMethod(String person){
        return "Hey " + person + " we are onto methods now!!!";
    }
}        
