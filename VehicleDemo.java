// Define the Vehicle interface with common functionalities
interface Vehicle {
    void changeGear(int newGear);
    void speedUp(int increment);
    void applyBrakes(int decrement);
    void displayStatus();
}

// Implement the Vehicle interface for a Bicycle
class Bicycle implements Vehicle {
    private int gear;
    private int speed;

    public Bicycle() {
        gear = 1; // Bicycles typically start in first gear
        speed = 0;
    }

    @Override
    public void changeGear(int newGear) {
        gear = newGear;
    }

    @Override
    public void speedUp(int increment) {
        speed += increment;
    }

    @Override
    public void applyBrakes(int decrement) {
        speed -= decrement;
    }

    @Override
    public void displayStatus() {
        System.out.println("Bicycle - Gear: " + gear + ", Speed: " + speed + " mph");
    }
}

// Implement the Vehicle interface for a Bike
class Bike implements Vehicle {
    private int gear;
    private int speed;

    public Bike() {
        gear = 1; // Bikes typically start in first gear
        speed = 0;
    }

    @Override
    public void changeGear(int newGear) {
        gear = newGear;
    }

    @Override
    public void speedUp(int increment) {
        speed += increment;
    }

    @Override
    public void applyBrakes(int decrement) {
        speed -= decrement;
    }

    @Override
    public void displayStatus() {
        System.out.println("Bike - Gear: " + gear + ", Speed: " + speed + " mph");
    }
}

// Implement the Vehicle interface for a Car
class Car implements Vehicle {
    private int gear;
    private int speed;

    public Car() {
        gear = 1; // Cars typically start in first gear
        speed = 0;
    }

    @Override
    public void changeGear(int newGear) {
        gear = newGear;
    }

    @Override
    public void speedUp(int increment) {
        speed += increment;
    }

    @Override
    public void applyBrakes(int decrement) {
        speed -= decrement;
    }

    @Override
    public void displayStatus() {
        System.out.println("Car - Gear: " + gear + ", Speed: " + speed + " mph");
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        // Create instances of different vehicles
        Bicycle bicycle = new Bicycle();
        Bike bike = new Bike();
        Car car = new Car();

        // Perform actions and display status
        bicycle.changeGear(3);
        bicycle.speedUp(10);
        bicycle.displayStatus();
        bicycle.applyBrakes(5); // Brakes applied
        bicycle.displayStatus(); // Display reduced speed

        bike.changeGear(4);
        bike.speedUp(20);
        bike.displayStatus();
        bike.applyBrakes(8); // Brakes applied
        bike.displayStatus(); // Display reduced speed

        car.changeGear(5);
        car.speedUp(50);
        car.displayStatus();
        car.applyBrakes(20); // Brakes applied
        car.displayStatus(); // Display reduced speed
    }
}
