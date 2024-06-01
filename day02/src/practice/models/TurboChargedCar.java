package src.practice.models;

//derived class (child class)
public class TurboChargedCar  extends Car{ //inherits all the methods
    public TurboChargedCar(String registration){
        super(registration); // this has to be the first line SUPERRRRR
    }

    private Boolean turbo=false;

    @Override
    public void accelerate(){
        super.accelerate(); //to use parent method need to use super
        super.accelerate();
        super.accelerate();
        super.accelerate();
        super.accelerate();
        System.out.println("Vrooooooooommmmmmmmmmmmmm!");
    }

    public Boolean getTurbo(){
        return turbo;
    }
    public void setTurbo(Boolean turbo){
        this.turbo=turbo;
    }
}
