package src.practice.models;

import java.util.Date;

public class Car {
    //properties/members
    private String colour;
    //private is to make it such that only Car object can access these variables not any other objects can
    private String make;
    private String registration;
    //we do not put them as variables in main, these are members of the class, class members
    private Integer accelerate=0;
    private Date registrationDate;

    //Contructor //default constructor will be gone
    public Car(String registration){
        this.registration=registration;
    }
    public Car(){} //overloaded constructor
    public Car(String registration,String colour){
        this.registration=registration;
        this.colour=colour;
    }

    //access methods to our members
    //getMemberName,setMemberName

    //this is a method
    public String getColour(){ //colour is a string
        return this.colour.toUpperCase();
    }//this allows u to read a property

    public void setColour(String colour){
        this.colour=colour;
    }

    //make, getter and setter
    public String getMake(){
        return this.make;
    }

    public void setMake(String make){
        switch (make.toLowerCase()){
            case"honda":
                this.make=make;
                break;
            case "toyota":
                this.make=make;
                break;
            case "mazda":
                this.make=make;
                break;
            default:

            /*
            case"honda":
            case"mazda":
            case"toyota":
                this.make=make;
                break;;

             or

             if (make.equals("mazda")||make.equals"toyota")
            */


        }
        this.make=make;
    }

    public Integer getAcceleration(){
        return this.accelerate;
    }
    public String getRegistration() {
        return this.registration;
    }
    public void setRegistration(String registration) {
        this.registration = registration;
    }
    public java.util.Date getRegistrationDate() {
        return this.registrationDate;
    }
    public void setRegistrationDate(java.util.Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    //methods
    public void horn() {
        System.out.println("Horn Horn Horn");

    }
    public void accelerate(){
        if(this.accelerate<200)
            this.accelerate++;
    }
    public void accelerate(Integer n){ //this is called overloading, same method with different parameter can do the same for constructor
        for (int i=0;i<n;i++){
            this.accelerate();
        }
    }
    public void decelerate(){
        if (this.accelerate>0)
            accelerate--;

    }
}
