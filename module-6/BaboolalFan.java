/*
* Brijette Baboolal
* 06/20/2025
* BaboolalFan.java
*
* This program defines a class that models a fan with properties 
* like speed, power status, radius, and color. It allows creating fan 
* objects with default or custom values and provides methods to get or 
* update their attributes. The program also includes test code that demonstrates 
* how to create and modify fan objects and display their current state.
*/

public class BaboolalFan {
    // Constants
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Fields
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    // No-arg constructor
    public BaboolalFan() {
        this.speed = STOPPED;
        this.on = false;
        this.radius = 6.0;
        this.color = "white";
    }

    // Argument constructor
    public BaboolalFan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    // Getters and Setters
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed >= STOPPED && speed <= FAST) {
            this.speed = speed;
        }
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // toString method
    @Override
    public String toString() {
        if (on) {
            return "Fan is ON\nSpeed: " + speed + "\nColor: " + color + "\nRadius: " + radius;
        } else {
            return "Fan is OFF\nColor: " + color + "\nRadius: " + radius;
        }
    }
}
