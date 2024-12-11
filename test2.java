public class test2 {
    
    public static void main(String[] args) {
        Dog bruno = new Dog();
        bruno.makeSound();

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
