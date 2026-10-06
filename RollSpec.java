
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RollSpec {

public void RollSpecFunc() {
    
    List<String> Specs = new ArrayList<>(List.of(
    "*Jonathan Hamon*","*William Hamon*","Vampirism*","*Dio Brando's Vampirism*","*Joseph Hamon*","*Ceaser Hamon*","*Lisa Lisa Hamon*","*Pillarman : Super Flexibility*","*Pillarman : Warrior of Wind*","*Pillarman : Crying Flame*",
    "*Pillarman : Mastermind of Light*","Peacemaker","Spin","Luck"));



System.out.println("\nLet's Start");

Random RNGSpec = new Random();

int NumberSpec = RNGSpec.nextInt(Specs.size());

System.out.println("\n"+Specs.get(NumberSpec));

}

}

    
