package src.workshop.cart;

public class Item {

    //members
    private String name="";
    private String code="";
    private Float price=0f;
    private Integer quantity=0;

    //constructor
    public Item(String name,String code){
        this.name=name;
        this.code=code;
    }

    //getter and setter
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCode() {
        return this.code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public Float getPrice() {
        return this.price;
    }
    public void setPrice(Float price) {
        this.price = price;
    }
    public Integer getQuantity() {
        return this.quantity;
    }
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    //method
    public Float totalCost(){
        //float totalCost=this.quantity*this.price;
        //return totalCost;
        return this.price*this.quantity;
    }
}
