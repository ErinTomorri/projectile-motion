package pack4;
import java.util.*;
/*Date: March 30, 2023
Name: Erin Tomorri
Teacher: Ms. Katsman
Description: This program will gather all of the users information and send it to the class, acting like the front end
*/
public class main {
    public static void intro() {
        System.out.println("Hello, you are at the  NFL combine, you are here to show your abilities.");
        System.out.println("This is a critical event for aspiring football players, as it provides a platform to showcase their skills and potentially get drafted to play for an NFL team. The combine tests players in a variety of physical and mental drills.");
        System.out.println("Your performance here could have a significant impact on your future in football, so make sure to give it your all and leave a lasting impression on the scouts and coaches in attendance. Good luck! ");
    }

    //get user name
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


    public static double dummy(Scanner scanner) { //determine the distance which your dummy is at 


        System.out.println("How far is your practice dummy: ");
        double dummy = scanner.nextDouble();
        while (dummy < 0) {
            System.out.println("What is the angle that the ball is thrown at (must be positive): ");
            dummy = scanner.nextDouble();
        }
        return dummy;
    }


    public static double height(Scanner scanner) {//determine the height which you throw the ball


        System.out.println("At what height are you throwing the ball in meters: ");
        double height = scanner.nextDouble();
        while (height < 0) {
            System.out.println("At what height are you throwing the ball in meters: ");
            height = scanner.nextDouble();
        }
        return height;
    }

    /*public static boolean kick(Scanner scanner) {


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
    }*/
    public static projectile[] sort(projectile[] players){ // bubble sort the users in order to determine whos first, second, third and so on
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
    public static void undershot(){ //display the parabola of the shot 
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
    public static void onshotThrow(){//display the parabola of the shot 
        //its very hard to make a parabola
        System.out.println("You hit the target ");
        System.out.println("        ... ");
        System.out.println("       .   .");
        System.out.println("      .     .");
        System.out.println("     .       .");
        System.out.println("    .         .");
        System.out.println("____           .");
        System.out.println("    |            .");
        System.out.println("    |             .");
        System.out.println("    |              #");
    }
    public static void overshotThrow(){//display the parabola of the shot 
        //its very hard to make a parabola
        System.out.println("You hit undershot the target");
        System.out.println("        ... ");
        System.out.println("       .   .");
        System.out.println("      .     .");
        System.out.println("     .       .");
        System.out.println("    .         .");
        System.out.println("____           .");
        System.out.println("    |            .");
        System.out.println("    |             .");
        System.out.println("    |             #.");
    }
    public static void collideThrow(){//display the parabola of the shot 
        //its very hard to make a parabola
        System.out.println("You collided with your friends object");
        System.out.println("        ... ");
        System.out.println("       .   .");
        System.out.println("      .     .");
        System.out.println("     .       .");
        System.out.println("    .         .");
        System.out.println("____           .");
        System.out.println("    |            .");
        System.out.println("    |                   .");
        System.out.println("    |            #            .");
    }
    public static void undershotThrow(){//display the parabola of the shot 
        //its very hard to make a parabola
            System.out.println("You undershot the target ");
            System.out.println("        ... ");
            System.out.println("       .   .");
            System.out.println("      .     .");
            System.out.println("     .       .");
            System.out.println("    .         .");
            System.out.println("____           .");
            System.out.println("    |            .");
            System.out.println("    |             .");
            System.out.println("    |              . #");
    }
    public static void onshot(){//display the parabola of the shot 
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
    public static void overshot(){//display the parabola of the shot 
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
    public static void collide(){//display the parabola of the shot 
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
        intro();
        while (checkPlayAgain) { // determine if you kick or throw the ball
            System.out.println("Do you want to throw or kick the ball: ");
            String action = myScanner.next().toLowerCase();
            while (!action.equals("kick") && !action.equals("throw")){
                System.out.println("Do you want to throw or kick the ball: ");
                action = myScanner.next().toLowerCase();
            }

            projectile[] players;
            double[] distances;
            System.out.println("How many people are playing: "); // ask the user for how many people are playing
            int numPeople = myScanner.nextInt();
            players = new projectile[numPeople];

            System.out.println("What is the gravity of the planet you are playing on: ");
            double grav = myScanner.nextDouble(); //the gravity
            
            if (action.equals("kick")) {
                // Code for kicking
                // Store distance from dummy for all players
                distances = new double[numPeople];
                double dummyDistance = dummy(myScanner);
                for (int i = 0; i < numPeople; i++) {
                    // Store info of players and ask for name, angle, and velocity
                    String name = name(myScanner);
                    double angle = angle(myScanner);
                    double velocity = velocity(myScanner);

                    players[i] = new projectile(name, velocity, angle, dummyDistance);
                    players[i].setDistanceXkick(); //davit check over to see if we can make this better
                    players[i].setDistanceYkick(); //it works but might lose us marks
                    players[i].setTimekick();
                    players[i].setDistanceFromDummyKick();
                    players[i].setAcceleration(grav);

                }
                // store the users info based on how close they got to the dummy
                for (int i = 0; i < numPeople; i++) {
                    distances[i] = players[i].getDistanceFromDummy();
                }

                // sort the distances array here, from least to greatest based on how close they got to the dummy
                players = sort(players);

                // Dsiplay if only 1 player participated
                if (players.length == 1) {
                    String message = players[0].toString();
                    System.out.println(message);
                // Display if more than 1 player participating
                } else {
                    for (int i = 0; i < players.length; i++) { //Display users in order from closest to furthest and their distance from the dummy
                        projectile element = players[i];
                        System.out.println(i + 1 + ". " + element.getNames() + "- Landed "+ element.getDistanceFromDummy() + " away" );
                    }
                }
            }else{
                distances = new double[numPeople];
                double dummyDistance = dummy(myScanner);
                for (int i = 0; i < numPeople; i++) {
                    // Store info of players 
                    String name = name(myScanner);
                    double angle = angle(myScanner);
                    double velocity = velocity(myScanner);
                    double height = height(myScanner);
                    //call the class and make a player array 
                    players[i] = new projectile(name, height, velocity, angle, dummyDistance);
                    players[i].setTimeThrow();
                    players[i].setDistanceXthrow();
                    players[i].setDistanceYthrow();
                    players[i].setDistanceFromDummyThrow();
            
                }
                // store the users info based on how close they got to the dummy
                for (int i = 0; i < numPeople; i++) {
                    distances[i] = players[i].getDistanceFromDummy();
                }
                
                players = sort(players); //sort the players 

                if (players.length == 1) {
                    String message = players[0].toString();
                    System.out.println(message);
                    
                // Display if more than 1 player participating
                }else {
                    for (int i = 0; i < players.length; i++) {
                        projectile element = players[i];//Display users in order from closest to furthest and their distance from the dummy
                        System.out.println(i + 1 + ". " + element.getNames() + "- Landed "+ element.getDistanceFromDummy() + " away" );
                    }
                }
            }
            // display the shots and if they collided with each other
            if(players.length == 2 && players[0].equals(players[1])){
                collide();
            }else if (players.length == 1 && players[0].getDistanceFromDummy() > 0){
                if (action.equals("kick")){
                    overshot();
                }else{
                    overshotThrow();
                }
            } else if (players.length == 1 && players[0].getDistanceFromDummy()<0){
                if (action.equals("kick")){
                    undershot();
                }else{
                    undershotThrow();
                }
            }else if (players.length == 1 && players[0].getDistanceFromDummy()==0){
                if (action.equals("kick")){
                    onshot();
                }else{
                    onshotThrow();
                }
            }
            //Ask user if they want to try again
            System.out.println("Do you want to try again? (Input y or n): ");
            String check = myScanner.next();
            if (!(check.equalsIgnoreCase("y"))) {
                checkPlayAgain = false;
            }      
        }
        System.out.println("Bye");
        myScanner.close();
    }
}
