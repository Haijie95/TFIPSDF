package src.practice.main;

import src.practice.models.Car;
import src.practice.models.TurboChargedCar;

public class Main {
    public static void main(String[] args){
        // Car myCar = new Car();
        // Car myOtherCar =  new Car();
        Car myCar = new Car("registration2");
        Car myOtherCar =  new TurboChargedCar("registration1");

        myCar.setColour("red");
        myCar.setMake("Honda");
        // myCar.setRegistration("S19820A");
        // myCar.setRegistrationDate(todayDate);

        myCar.horn();
        System.out.printf("color: %s, make: %s, registration: %s\n",myCar.getColour(),myCar.getMake(),myCar.getRegistration());

        //accelerate 3 times
        myCar.accelerate();
        myCar.accelerate();
        myCar.accelerate();

        System.out.printf("acceleration: %d\n",myCar.getAcceleration());


        //cast into turbocharged car type to use its method
        if(myOtherCar instanceof TurboChargedCar){
            TurboChargedCar turbo=(TurboChargedCar)myOtherCar;
            turbo.setTurbo((true));
        }
    }
}
