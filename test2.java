public class test2 {
    public static void main(String[] args) {
        Dog bruno = new Dog();
        bruno.makeSound();

        intensity malaria = intensity.HIGH;

        switch(malaria){
            case HIGH: System.out.println("High intensity of plasmodium detected");
            break; 
            case MID: System.out.println("High intensity of plasmodium detected");
            break; 
            case LOW: System.out.println("High intensity of plasmodium detected"); 
            break;
            default: System.out.println("No observation made");
            break;
        }
        for(intensity var : intensity.values()){
            System.out.println(var);
        };
    }
}
interface Animal {
    public void makeSound();
    public void sleep();
}

class Dog implements Animal {
    public void makeSound() {

        System.out.println("roww roww");
    }
    public void sleep(){
        System.out.println("zzzzz");
    }
}
enum intensity {
    HIGH,
    MID,
    LOW
}

