package pack4;

import java.text.NumberFormat;
import java.util.*;
import java.io.*; // Import the File class
import java.io.FileNotFoundException; // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
/*
Date: April 4, 2023
Name : Erin Tomorri
Teacher: Mrs. Katsman
Description: This program will display the code and allow the user to input their math question
*/

/*use this if the txt file is empty 
Names, Distance from dummy, angle, velocity, gravity,height
1.Erin,20,30,25,9.8,10
*/

public class Main {
    /*public static void write(Projectile projectile[], int numPeople, int count) { // this is the wrting function this
                                                                                  // will write over the txt file with
                                                                                  // the new text
        NumberFormat decimal = NumberFormat.getNumberInstance();
        try {
            FileWriter writer = new FileWriter("text.txt"); // finds the text file
            String temp = "Names, Distance from dummy, Angle, Velocity, Gravity, Height \n"; // allocates the temp with
                                                                                             // a the title and coloums
                                                                                             // of the menus
            for (int i = 0; i < numPeople + count; i++) {
                // this gets all the data such as names, dummy distance, angle, velocity and etc
                // and stores it to the end of temp
                temp = temp + i;
                temp = temp + "." + projectile[i].getNames() + "," + projectile[i].getDummy() + ","
                        + decimal.format(projectile[i].getAngle() * 180 / Math.PI) + "," + projectile[i].getVelocity()
                        + "," + projectile[i].getAcceleration() + "," + projectile[i].getHeight() + "\n";
            }
            writer.write(temp); // writes the txt file
            writer.close();
        } catch (IOException e) { // a basic exception to check if everything works
            e.printStackTrace();
        }
    }

    public static int count() { // this opens the file and checks how many projectiles were in the past
        String filePath = "text.txt"; // opens the text file
        File file = new File(filePath);
        int count = -1; // starts the count of the lines at -1 because the first line is the "title"

        if (file.exists()) { // checks if the file exists
            System.out.println("File exists.");
        } else {
            System.out.println("File does not exist.");
        }
        try {
            File myObj = new File("text.txt");
            Scanner myReader = new Scanner(myObj); // opens the file and scans it
            while (myReader.hasNextLine()) { // checks if it has a next line
                myReader.nextLine(); // checks the next line to see if there is something
                count++; // counts the projectiles
            }
            myReader.close();
            return count; // returns the number of projectiles

        } catch (FileNotFoundException e) { // basic exection error
            System.out.println("An error occurred.");
            e.printStackTrace(); // trace the error
        }
        return count;
    }

    public static void read(int count, Projectile projectile[]) { // reads the file and allocates the projectiles arrays
                                                                  // filled with the text file

        try {
            NumberFormat decimal = NumberFormat.getNumberInstance();
            String prev;
            int j = 0;
            File myObj = new File("text.txt");
            Scanner myReader = new Scanner(myObj);
            Scanner scan = new Scanner(System.in);
            do { // a do while loop to check if the user wants to check their previous games
                System.out.println("Would you like to see previous games (Y/N)");
                prev = scan.next().toLowerCase();
            } while (!prev.equals("y") && !prev.equals("n")); // the condition to check if they answered yes or no
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                if (j == 0) {
                    if (myReader.hasNextLine()) {
                        System.out.println("");
                        data = myReader.nextLine();
                    }
                }
                
                j++;
                data = data.substring(data.indexOf('.') + 1);
                String name = data.substring(0, data.indexOf(',')); // saves the name of the projectile into name
                                                                    // variable
                data = data.substring(data.indexOf(',') + 1);
                double dummyDistance = Double.parseDouble(data.substring(0, data.indexOf(','))); // saves the dummy
                                                                                                 // distance into a
                                                                                                 // double
                data = data.substring(data.indexOf(',') + 1);

                double angle = Double.parseDouble(data.substring(0, data.indexOf(','))); // saves the angle into a
                                                                                         // double
                data = data.substring(data.indexOf(',') + 1);

                double velocity = Double.parseDouble(data.substring(0, data.indexOf(','))); // save the velocity into a
                                                                                            // double
                data = data.substring(data.indexOf(',') + 1);

                double grav = Double.parseDouble(data.substring(0, data.indexOf(','))); // save the gravity into a
                                                                                        // double
                data = data.substring(data.indexOf(',') + 1);

                double height = Double.parseDouble(data); // save the height into a double


                projectile[j - 1] = new Projectile(name, height, velocity, angle, dummyDistance); // stores the value
                                                                                                  // into a new
                                                                                                  // projectile class
                projectile[j - 1].setDistanceXkick(); // does the x kick math
                projectile[j - 1].setDistanceYkick(); // does the y kick math
                projectile[j - 1].setTimekick();
                projectile[j - 1].setDistanceFromDummyKick();
                projectile[j - 1].setAcceleration(grav);

            }
            if (prev.equals("y")) { // checks if the user wants to check their previous attempts
                System.out.println("Names, Distance from dummy, Angle, Velocity, Gravity, Height");
                for (int i = 0; i <= count-1; i++) {
                    System.out.println(i + 1 + "." + projectile[i].getNames() + "," + projectile[i].getDummy() + ","// displays the previous attempts to the user if they want
                            + decimal.format(projectile[i].getAngle() * 180 / Math.PI) + ","
                            + projectile[i].getVelocity() + "," + projectile[i].getAcceleration() + ","
                            + projectile[i].getHeight() + "\n");
                }
            }
            System.out.println("Awesome now tell me about your parabolas/projectiles \n");
            myReader.close(); // close reader

        } catch (FileNotFoundException e) { // basic catch exceptions
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }*/

    public static void intro() {
        System.out.println("Hello, you are at the NFL combine, you are here to show your abilities.");
        System.out.println(
                "This is a critical event for aspiring football players, as it provides a platform to showcase their skills and potentially get drafted to play for an NFL team. The combine tests players in a variety of physical and mental drills.");
        System.out.println(
                "Your performance here could have a significant impact on your future in football, so make sure to give it your all and leave a lasting impression on the scouts and coaches in attendance. Good luck! ");
    }

    // get user name
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

    public static double dummy(Scanner scanner) { // determine the distance which your dummy is at

        System.out.println("How far is your practice dummy in meters: ");
        double dummy = scanner.nextDouble();
        while (dummy < 0) {
            System.out.println("How far is your practice dummy in meters (must be positive): ");
            dummy = scanner.nextDouble();
        }
        return dummy;
    }

    public static double height(Scanner scanner) {// determine the height which you throw the ball

        System.out.println("At what height are you throwing the ball in meters: ");
        double height = scanner.nextDouble();
        while (height < 0) {
            System.out.println("At what height are you throwing the ball in meters: ");
            height = scanner.nextDouble();
        }
        return height;
    }

    /*
     * public static boolean kick(Scanner scanner) {
     * 
     * 
     * System.out.println("Are you kicking the ball (Y/N): ");
     * char kick = scanner.next().charAt(0);
     * while ((kick != 'y' && kick != 'n') && (kick != 'Y' && kick != 'N')) {
     * System.out.println("Are you kicking the ball (Y/N): ");
     * kick = scanner.next().charAt(0);
     * }
     * if (kick == 'y' || kick == 'Y') {
     * return true;
     * }
     * return false;
     * }
     */
    public static Projectile[] sort(Projectile[] players) { // bubble sort the users in order to determine whos first,
                                                            // second, third and so on
        int n = players.length;
        System.out.println(n);
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                if (players[j].getDistanceFromDummy() > players[j + 1].getDistanceFromDummy()) {
                    // swap arr[j+1] and arr[j]
                    Projectile temp = players[j];
                    players[j] = players[j + 1];
                    players[j + 1] = temp;
                }
            }
        }
        return (players);

    }

    public static void undershot() { // display the parabola of the shot
        // its very hard to make a parabola
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

    public static void onshotThrow() {// display the parabola of the shot
        // its very hard to make a parabola
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

    public static void overshotThrow() {// display the parabola of the shot
        // its very hard to make a parabola
        System.out.println("You hit overshot the target");
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

    public static void collideThrow() {// display the parabola of the shot
        // its very hard to make a parabola
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

    public static void undershotThrow() {// display the parabola of the shot
        // its very hard to make a parabola
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

    public static void onshot() {// display the parabola of the shot
        // its very hard to make a parabola
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

    public static void overshot() {// display the parabola of the shot
        // its very hard to make a parabola
        System.out.println("You overshot the target");
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

    public static void collide() {// display the parabola of the shot
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

    public static void menu() {
        System.out.println("███╗░░░███╗███████╗███╗░░██╗██╗░░░██╗");
        System.out.println("████╗░████║██╔════╝████╗░██║██║░░░██║");
        System.out.println("██╔████╔██║█████╗░░██╔██╗██║██║░░░██║");
        System.out.println("██║╚██╔╝██║██╔══╝░░██║╚████║██║░░░██║║");
        System.out.println("██║░╚═╝░██║███████╗██║░╚███║╚██████╔╝║");
        System.out.println("╚═╝░░░░░╚═╝╚══════╝╚═╝░░╚══╝░╚═════╝░");
        System.out.println(" ");
        ;
        System.out.println(" ");
        ;
        System.out.println(" ");
        ;
        System.out.println("█▄▀ █ █▀▀ █▄▀");
        ;
        System.out.println("█░█ █ █▄▄ █░█");
        ; // idk why it wants it with double semicolons
        System.out.println(" ");
        ;
        System.out.println(" ");
        ;
        System.out.println(" ");
        ;
        System.out.println("█▀█ █▀█");
        ;
        System.out.println("█▄█ █▀▄");
        ;
        System.out.println(" ");
        ;
        System.out.println(" ");
        ;
        System.out.println(" ");
        ;

        System.out.println("▀█▀ █░█ █▀█ █▀█ █░█░█");
        ;
        System.out.println("░█░ █▀█ █▀▄ █▄█ ▀▄▀▄▀");
        ;
        System.out.println(" ");
        ;
        System.out.println(" ");
        ;
        System.out.println(" ");
        ;
        System.out.println("░Do you want to kick or throw: ");
        ;
    }

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        boolean checkPlayAgain = true;
        intro();
        while (checkPlayAgain) { // determine if you kick or throw the ball
            menu();
            String action = myScanner.next().toLowerCase();
            while (!action.equals("kick") && !action.equals("throw")) { // check if they didnt put kick or throw
                action = myScanner.next().toLowerCase();
            }

            Projectile[] players;
            double[] distances;
            System.out.println("How many people are playing: "); // ask the user for how many people are playing
            int numPeople = myScanner.nextInt();
            int count = count();
            players = new Projectile[numPeople + count];
            
            read(count,players);


            System.out.println("What is the gravity of the planet you are playing on: ");
            double grav = myScanner.nextDouble(); // the gravity

            if (action.equals("kick")) {
                // Code for kicking
                // Store distance from dummy for all players
                distances = new double[numPeople];
                double dummyDistance = dummy(myScanner);

                for (int i = count; i <= numPeople+count-1; i++) {
                    // Store info of players and ask for name, angle, and velocity
                    String name = name(myScanner);
                    double angle = angle(myScanner);
                    double velocity = velocity(myScanner);

                    players[i] = new Projectile(name, velocity, angle, dummyDistance);
                    players[i].setDistanceXkick(); // davit check over to see if we can make this better
                    players[i].setDistanceYkick(); // it works but might lose us marks
                    players[i].setTimekick();
                    players[i].setDistanceFromDummyKick();
                    players[i].setAcceleration(grav);

                }

                // sort the distances array here, from least to greatest based on how close they
                // got to the dummy
                players = sort(players);

                // Dsiplay if only 1 player participated
                if (players.length == 1) {
                    String message = players[0].toString();
                    System.out.println(message);
                    // Display if more than 1 player participating
                } else {
                    for (int i = 0; i < numPeople+count; i++) { // Display users in order from closest to furthest and
                                                               // their distance from the dummy
                        Projectile element = players[i];
                        System.out.println(i + 1 + ". " + element.getNames() + "- Landed "
                                + element.getDistanceFromDummy() + " away");
                    }
                }
            } else {
                distances = new double[numPeople];
                double dummyDistance = dummy(myScanner);
                for (int i = count; i <= numPeople+count-1; i++) {
                    // Store info of players
                    String name = name(myScanner);
                    double angle = angle(myScanner);
                    double velocity = velocity(myScanner);
                    double height = height(myScanner);
                    // call the class and make a player array

                    players[i] = new Projectile(name, height, velocity, angle, dummyDistance);
                    players[i].setTimeThrow();
                    players[i].setDistanceXthrow();
                    players[i].setDistanceYthrow();
                    players[i].setDistanceFromDummyThrow();

                }
                // store the users info based on how close they got to the dummy
                for (int i = 0; i < numPeople; i++) {
                    distances[i] = players[i].getDistanceFromDummy();
                    System.out.println(distances[i]);
                }

                players = sort(players);

                if (players.length == 1) {
                    String message = players[0].toString();
                    System.out.println(message);

                    // Display if more than 1 player participating
                } else {
                    for (int i = 0; i < numPeople+count; i++) {
                        Projectile element = players[i];// Display users in order from closest to furthest and their
                                                        // distance from the dummy
                        System.out.println(i + 1 + ". " + element.getNames() + "- Landed "
                                + element.getDistanceFromDummy() + " away");
                    }
                }
            }
            // display the shots and if they collided with each other
            if (players.length == 2 && players[0].equals(players[1])) {
                if (action.equals("kick")) {
                    collide();
                } else {
                    collideThrow();
                }
            } else if (players.length == 1 && players[0].getDistanceFromDummy() > 0) {
                if (action.equals("kick")) {
                    overshot();
                } else {
                    overshotThrow();
                }
            } else if (players.length == 1 && players[0].getDistanceFromDummy() < 0) {
                if (action.equals("kick")) {
                    undershot();
                } else {
                    undershotThrow();
                }
            } else if (players.length == 1 && players[0].getDistanceFromDummy() == 0) {
                if (action.equals("kick")) {
                    onshot();
                } else {
                    onshotThrow();
                }
            }
            // Ask user if they want to try again
            write(players, numPeople, count);
            System.out.println("Do you want to try again? (Input y or n): ");
            String check = myScanner.next();
            if (!(check.equalsIgnoreCase("y"))) {
                checkPlayAgain = false;
            }
        }
        System.out.println("bye");
        myScanner.close();
    }
}
