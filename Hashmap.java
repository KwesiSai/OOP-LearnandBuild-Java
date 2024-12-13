import java.util.HashMap;
import java.util.Scanner;

public class Hashmap{
    public static void main (String[] args){

        HashMap<String, Integer> eligibleVoters = new HashMap<>();

        eligibleVoters.put("Emily Korkor", 22);
        Scanner userInput = new Scanner(System.in);
        String voterName = userInput.nextLine();
        Integer voterAge = userInput.nextInt();
        eligibleVoters.put(voterName, voterAge);

        System.out.println(eligibleVoters.get("Emily Korkor"));
        System.out.println(eligibleVoters.size());

    }

}