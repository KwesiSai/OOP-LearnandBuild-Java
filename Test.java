public class Test {
    int x = 15;
    String car = "Toyota";
    public static void main(String[] args){
        Test newObject = new Test();
        newObject.x = 29;
        System.out.println(newObject.x);
        System.out.println(newObject.car);
        Test secondObject = new Test();
        System.out.println(secondObject.x);
    
        
    }
}
