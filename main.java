package pack4;
import java.util.*;

import javax.swing.text.StyledEditorKit.BoldAction;

public class main {
    public static void intro() {
        System.out.println("Hello, ADD STORY HERE");
    }


    public static String name(Scanner scanner) {
        System.out.println("What is your name: ");
        String name = scanner.next();
        return name;
    }


    public static double velocity(Scanner scanner) {
        // The velocity of the object is declared


        System.out.println("What is the velocity that the ball is going at: ");
        double velocity = scanner.nextDouble();
        while (velocity < 0) {
            System.out.println("What is the velocity that the ball is going at (must be positive): ");
            velocity = scanner.nextDouble();
        }
        return velocity;
    }


    public static double angle(Scanner scanner) {


        // The angle of the object is declared
        System.out.println("What is the angle that the ball is thrown at: ");
        double angle = scanner.nextDouble();
        while (angle > 90 || angle < 0) {
            System.out.println("What is the angle that the ball is thrown at (must be between 90 and 0): ");
            angle = scanner.nextDouble();
        }
        return angle;
    }


    public static double dummy(Scanner scanner) {


        System.out.println("How far is your practice dummy: ");
        double dummy = scanner.nextDouble();
        while (dummy < 0) {
            System.out.println("What is the angle that the ball is thrown at (must be positive): ");
            dummy = scanner.nextDouble();
        }
        return dummy;
    }


    public static double height(Scanner scanner) {


        System.out.println("At what height are you throwing the ball in meters (Include your height also): ");
        double height = scanner.nextDouble();
        while (height < 0) {
            System.out.println("At what height are you throwing the ball in meters (Include your height also): ");
            height = scanner.nextDouble();
        }
        return height;
    }

    public static boolean kick(Scanner scanner) {


        System.out.println("Are you kicking the ball (Y/N): ");
        char kick = scanner.next().charAt(0);
        while ((kick != 'y' && kick != 'n') && (kick != 'Y' && kick != 'N')) {
            System.out.println("Are you kicking the ball (Y/N): ");
            kick = scanner.next().charAt(0);
        }
        if (kick == 'y' || kick == 'Y') {
            return true;
        }
        return false;
    }
    public static projectile[] sort(projectile[] players){ // bubble sort
        int n = players.length;
        for (int i = 0; i < n - 1; i++){
            for (int j = 0; j < n - i - 1; j++){
                if (players[j].getDistanceFromDummy() > players[j + 1].getDistanceFromDummy()) {
                    // swap arr[j+1] and arr[j]
                    projectile temp = players[j];
                    players[j] = players[j + 1];
                    players[j + 1] = temp;
                }
            }
        }   
        return (players);
        
    }
    public static void undershot(){
        //its very hard to make a parabola
            System.out.println("You undershot the target ");
            System.out.println("        ... ");
            System.out.println("       .   .");
            System.out.println("      .     .");
            System.out.println("     .       .");
            System.out.println("    .         .");
            System.out.println("   .           .");
            System.out.println("  .             .");
            System.out.println(" .               .");
            System.out.println(".                 . #");
    }
    public static void onshot(){
        //its very hard to make a parabola
        System.out.println("You hit the target ");
        System.out.println("        ... ");
        System.out.println("       .   .");
        System.out.println("      .     .");
        System.out.println("     .       .");
        System.out.println("    .         .");
        System.out.println("   .           .");
        System.out.println("  .             .");
        System.out.println(" .               .");
        System.out.println(".                 #");
    }
    public static void overshot(){
        //its very hard to make a parabola
        System.out.println("You hit undershot the target");
        System.out.println("        ... ");
        System.out.println("       .   .");
        System.out.println("      .     .");
        System.out.println("     .       .");
        System.out.println("    .         .");
        System.out.println("   .           .");
        System.out.println("  .             .");
        System.out.println(" .               .");
        System.out.println(".               # .");
    }
    public static void collide(){
        System.out.println("You collided with your friends object");
        System.out.println("        ... ");
        System.out.println("       .   .");
        System.out.println("      .     .");
        System.out.println("     .       .");
        System.out.println("    .         .");
        System.out.println("   .           .");
        System.out.println("  .             .");
        System.out.println(" .                      .");
        System.out.println(".               #            .");
    }
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        boolean checkPlayAgain = true;
       
        while (checkPlayAgain) {
            System.out.println("Do you want to throw or kick the ball: ");
            projectile[] players;
            double[] distances;


            String action = myScanner.next().toLowerCase();


            if (action.equals("kick")) {
                // Code for kicking
                System.out.println("How many people are kicking: ");
                int numPeople = myScanner.nextInt();
                players = new projectile[numPeople];
                // Store distance from dummy for all players
                distances = new double[numPeople];
                double dummyDistance = dummy(myScanner);
                for (int i = 0; i < numPeople; i++) {
                    // Store info of players
                    String name = name(myScanner);
                    double angle = angle(myScanner);
                    double velocity = velocity(myScanner);

                    players[i] = new projectile(name, velocity, angle, dummyDistance);
                    players[i].setDistanceXkick(); //davit check over to see if we can make this better
                    players[i].setDistanceYkick(); //it works but might lose us marks
                    players[i].setTimekick();
                    players[i].setDistanceFromDummyKick();

                }

                for (int i = 0; i < numPeople; i++) {
                    distances[i] = players[i].getDistanceFromDummy();
                }


                // sort the distances array here, from least to greatest
                players = sort(players);

                // Dsiplay if only 1 player participated
                if (players.length == 1) {
                    String message = players[0].toString();
                    System.out.println(message);
                // Display if more than 1 player participating
                } else {
                    for (int i = 0; i < players.length; i++) {
                        projectile element = players[i];
                        System.out.println(i + 1 + ". " + element.getNames() + "- Landed "+ element.getDistanceFromDummy() + " away" );
                    }
                }

            }else {
                System.out.println("How many people are throwing: ");
                int numPeople = myScanner.nextInt();
                players = new projectile[numPeople];
                distances = new double[numPeople];
                double dummyDistance = dummy(myScanner);
                for (int i = 0; i < numPeople; i++) {
                    // Store info of players
                    String name = name(myScanner);
                    double angle = angle(myScanner);
                    double velocity = velocity(myScanner);
                    double height = height(myScanner);
                    players[i] = new projectile(name, height, velocity, angle, dummyDistance);
                    players[i].setTimeThrow();
                    players[i].setDistanceXthrow();
                    players[i].setDistanceYthrow();
                    players[i].setDistanceFromDummyThrow();
            
                }

                for (int i = 0; i < numPeople; i++) {
                    distances[i] = players[i].getDistanceFromDummy();
                }
                
                players = sort(players);

                if (players.length == 1) {
                    String message = players[0].toString();
                    System.out.println(message);
                    
                // Display if more than 1 player participating
                }else {
                    for (int i = 0; i < players.length; i++) {
                        projectile element = players[i];
                        System.out.println(i + 1 + ". " + element.getNames() + "- Landed "+ element.getDistanceFromDummy() + " away" );
                    }
                }
            }
            if(players.length == 2 && players[0].equals(players[1])){
                collide();
            }else if (players.length == 1 && players[0].getDistanceFromDummy() > 0){
                overshot();
            } else if (players.length == 1 && players[0].getDistanceFromDummy()<0){
                undershot();
            }else if (players.length == 1 && players[0].getDistanceFromDummy()==0){
                onshot();
            }
            //Ask user if they want to try again
            System.out.println("Do you want to try again? (Input y or n): ");
            String check = myScanner.next();
            if (!(check.equalsIgnoreCase("y"))) {
                checkPlayAgain = false;
            }      
        }
        myScanner.close();
    }
}
