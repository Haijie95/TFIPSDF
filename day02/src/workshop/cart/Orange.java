package src.workshop.cart;

public class Orange extends Item{

    //inheritance

    public Orange(){
        super("orange","Orange");}

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
