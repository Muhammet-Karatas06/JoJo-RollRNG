import java.util.Scanner;

public class MainScreen {
    
    public static void main(String[] args) {
        
        System.out.println("\nIf you are a JoJo Fan, Let's roll and find your chance");

    while (true) { 
        
    

        System.out.println("\nWhich one do you wanna know about your faith\n\n[Stand]\n\n[Spec]\n");

        Scanner in = new Scanner(System.in);

        String choice = in.nextLine();

        if(choice.toLowerCase().contains("Stand".toLowerCase())) {

            RollStand Stand = new RollStand();
            Stand.RollStandFunc();
            //System.out.println(choice);
        }
        else if (choice.toLowerCase().contains("Spec".toLowerCase())) {
            
            RollSpec Spec = new RollSpec();
            Spec.RollSpecFunc();
            //System.out.println(choice);
        }
        else {

            System.out.println(choice);
        }

        }
    }

}
