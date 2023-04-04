package pack4;
/*
Date: March 30, 2023
Name: Davit Najaryan
Teacher: Ms. Katsman
Description: This program will calculate various characteristics of projectile motion
*/

import java.util.*;


public class projectile {


    // Intilize variables
    private double distanceXkick, distanceYkick, velocity, acceleration, angle, dummy, timeKick, timeThrow,
            distanceXthrow, distanceYthrow, velocityYKick, velocityXKick, velocityYthrow, velocityXthrow, height,
            temptime, distanceFromDummy;
    private String names;


    {

        distanceXkick = 0;
        distanceYkick = 0;
        distanceXthrow = 0;
        distanceYthrow = 0;
        velocityXKick = 0;
        velocityYKick = 0;
        velocityXthrow = 0;
        velocityYthrow = 0;
        velocity = 0;
        acceleration = 9.81;
        angle = 0;
        dummy = 0;
        names = "";
        timeKick = 0;
        timeThrow = 0;
        height = 0;
        temptime = 0;
        distanceFromDummy = 0;
    }


    // Overload
    public projectile(String newName, double newHeight, double newVelocity, double newAngle, double newDummy) {
        names = newName;
        velocity = newVelocity;
        angle = (newAngle * Math.PI) / 180;
        dummy = newDummy;
        setDistanceXthrow();
        height = newHeight;
        distanceFromDummy = Math.abs(distanceXthrow - dummy);
    }


    //Constructor for simulating a kick
    public projectile(String newName, double newVelocity, double newAngle, double newDummy) {
        names = newName;
        velocity = newVelocity;
        angle = (newAngle * Math.PI) / 180;
        dummy = newDummy;

    }

    //Get gravity for chosen planet from main
    public void setAcceleration(double newGravity){
        acceleration = newGravity;
    }

    // Set the names of the players
    public void setName(String newName) {
        names = newName;
    }
    public String getNames() {
        return names;
    }
    public void setDistanceFromDummyKick(){
        distanceFromDummy = distanceXkick - dummy;
    }
    
    public void setDistanceFromDummyThrow(){
        distanceFromDummy = distanceXthrow - dummy;
    }

    // Get velocity from main user input
    public void getVelocity(double newVelocity) {
        velocity = newVelocity;
    }


    public double getDistanceFromDummy() {
        return distanceFromDummy;
    }


    // Get acceleration from main user input
    public void getAngle(double newAngle) {
        angle = newAngle * Math.PI;
        angle = angle / 180;
    }


    // Get position of dummy
    public void getDummy(double newDummy) {
        dummy = newDummy;
    }


    public void getHeight(double newHeight) {
        height = newHeight;
    }


    /*
     * Formulas when the player is kicking the ball
     */
    // Calculate distanceX while kicking
    public void setDistanceXkick() {
        double tempStep = ((Math.pow(velocity, 2)) * (Math.sin(2 * angle)));
        distanceXkick = (tempStep / acceleration);
    }


    // Calculate distanceY while kicking
    public void setDistanceYkick() {
        double tempStep = (Math.pow((velocity * Math.sin(angle)), 2));
        distanceYkick = tempStep / (2 * acceleration);
    }


    // Calculate time in seconds while kicking
    public void setTimekick() {
        timeKick = (velocity * Math.sin(angle)) / acceleration;
    }


    /*
     * Formulas when the player is throwing the ball
     */


    public void setDistanceXthrow() {
        distanceXthrow = velocityXthrow * timeThrow;
    }


    public void setDistanceYthrow() {
        temptime = velocityYthrow / acceleration;
        distanceYthrow = height + (velocityYthrow * temptime) - (0.5 * acceleration * Math.pow(temptime, 2));
    }


    public void setTimeThrow() { // determine the time the object takes 
        velocityXthrow = (velocity * Math.cos(angle));
        velocityYthrow = (velocity * Math.sin(angle));
        
        // quadratic formulas
        timeThrow = (velocityYthrow) + (Math.sqrt((Math.pow(velocityYthrow, 2)) - (4*(acceleration/2)*-(height))));
        timeThrow = timeThrow/acceleration;
        if (timeThrow<0){
            timeThrow = (velocityYthrow) - (Math.sqrt((Math.pow(velocityYthrow, 2)) - (4*(acceleration/2)*-(height))));
            timeThrow = timeThrow/acceleration;
        }
    }

    // toStirng 
    public String toString(){
        if (distanceXkick != 0){
            if (angle == 0){
            return (names + " kicked the ball " + distanceYkick + " meters high and " + distanceXkick + " meters away. Time: " + timeKick + "seconds");
            }else{
                return (names + " kicked the ball " + distanceYkick + " meters high and " + distanceXkick + " meters away. Time: " + timeKick*2 + "seconds");
            }
        }else{
            if (angle == 0){
                return (names + " threw the ball " + distanceYthrow + " meters high and " + distanceXthrow + " meters away. Time: " + timeThrow + "seconds");
            }else{
                return (names + " threw the ball " + distanceYthrow + " meters high and " + distanceXthrow + " meters away. Time: " + timeThrow*2 + "seconds");
                
            }
        }
    }
    public boolean equals(projectile s){ // checks if balls collided
        if (s.distanceXkick == distanceXkick){
            return true;
        } else if (s.distanceXthrow == distanceXthrow){
            return true;
        } else if (s.distanceYthrow == distanceYthrow){    
            return true;
        } else if (s.distanceYkick == distanceYkick){
            return true;
        }
        return false;
    }
}
