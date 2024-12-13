import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collections;

public class test2 {
    public static void main(String[] args) {
        Dog bruno = new Dog();
        bruno.makeSound();
        LocalDateTime todaysDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("E, MMM dd yyyy hh:mm:ss");
        String formattedDate = formatter.format(todaysDateTime);
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        evenNumbers.add(2);
        evenNumbers.add(32);
        evenNumbers.add(14);

        System.out.println(evenNumbers);
        Collections.sort(evenNumbers);
        System.out.println(evenNumbers);



        intensity malaria = intensity.HIGH;
        System.out.println(formattedDate);

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

        System.out.println(evenNumbers.get(1));

        LinkedList<String> familyMembers = new LinkedList<>();

        familyMembers.add("Jacobatie");
        familyMembers.add("Kekoule");
        familyMembers.add("Madina");

        for(String a : familyMembers){
            System.out.println(a);
        }
        System.out.println(familyMembers.get(1));

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

