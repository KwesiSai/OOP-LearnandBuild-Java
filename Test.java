public class Test {
    //Instance variables
    int code;
    String name;

    //Constructor
    public Test(String name, int code){
        this.name = name;
        this.code = code;
    }
    //class method
    public void display(){
        System.out.println(name);
        System.out.println(code);

    }
    public static void main(String[] args){
        Test newTest = new Test("English", 101);
        newTest.display();
        
    }
}
