
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RollAction {

public static void main(String[] args) {
    
List<String> Stands = new ArrayList<>(List.of(
    "Star Platinum","Hermit Purple","Hierophant Green","Magician Red","Silver Chariot","The World","Crazy Diamond","The Hand","Echoes","Heaven's Door","Hot Chilie Pepper","Killer Queen","Golden Experience",
    "Six Pistols","Aerosmith","Sticky Finger","Moody Blues","Purple Haze","Metallica","King Crimson","Stone Free"));





System.out.println("Let's Start");

Random RNG = new Random();

int Number = RNG.nextInt(Stands.size());

System.out.println(Stands.get(Number));


}

}

    
