package week_2.day_08;

public class Day08_CarClass {
    private String model;
    private String speed;
    private String acceleration;
    private String brake;

    // Constructor to initialize the car object with the parameters
    public Day08_CarClass(String model, String speed, String acceleration, String brake) { 
        this.model = model;
        this.speed = "0";
        this.acceleration = acceleration;
        this.brake = brake;
    }
    public void accelerate (int incrementSpeed) {
        this.speed = String.valueOf(Integer.parseInt(this.speed) + incrementSpeed);
        System.out.println("Accelerating... Current speed: " + this.speed + " km/h");
    }

    public void brake (int decrementSpeed) {
        this.speed = String.valueOf(Integer.parseInt(this.speed) - decrementSpeed);
        System.out.println("Braking... Current speed: " + this.speed + " km/h");
    } 

    public static void main(String[] args) {
        Day08_CarClass myCar = new Day08_CarClass("Toyota", "0", "5", "3");
        myCar.accelerate(10);
        myCar.brake(5);
    }
}