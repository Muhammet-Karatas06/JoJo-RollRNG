
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RollStand {

public void RollStandFunc() {
    
    List<String> Stands = new ArrayList<>(List.of(
    "Star Platinum","Hermit Purple","Hierophant Green","Magician Red","Silver Chariot","The World","Crazy Diamond","The Hand","Echoes","Heaven's Door","Hot Chilie Pepper","Killer Queen","Golden Experience",
    "Six Pistols","Aerosmith","Sticky Finger","Moody Blues","Purple Haze","Metallica","King Crimson","Stone Free"));



System.out.println("\nLet's Start");

Random RNGStand = new Random();

int NumberStand = RNGStand.nextInt(Stands.size());

System.out.println("\n"+Stands.get(NumberStand));

}

}

    
