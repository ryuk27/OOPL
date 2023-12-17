interface Vehicle {
void changeGear(int newGear);
void speedUp(int increment);
void applyBrakes(int decrement);
void displayStatus();
}

class Bicycle implements Vehicle {
private int gear;
private int speed;

public Bicycle() {
gear = 1;
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

class Bike implements Vehicle {
private int gear;
private int speed;

public Bike() {
gear = 1;
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

class Car implements Vehicle {
private int gear;
private int speed;

public Car() {
gear = 1;
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

Bicycle bicycle = new Bicycle();
Bike bike = new Bike();
Car car = new Car();

bicycle.changeGear(3);
bicycle.speedUp(10);
bicycle.displayStatus();
bicycle.applyBrakes(5);
bicycle.displayStatus();
    
bike.changeGear(4);
bike.speedUp(20);
bike.displayStatus();
bike.applyBrakes(8);
bike.displayStatus();

car.changeGear(5);
car.speedUp(50);
car.displayStatus();
car.applyBrakes(20);
car.displayStatus();
}
}
