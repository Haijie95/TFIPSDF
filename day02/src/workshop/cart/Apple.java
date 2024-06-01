package src.workshop.cart;

public class Apple extends Item{

    //inheritance

    public Apple(){
        super("apple","Apple");}

    //members
    private String type="";

    //getter setter
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
}
