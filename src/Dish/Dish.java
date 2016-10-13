package Dish;


public class Dish {
    private int price;
    private String name;
    private String op;

    public Dish(String name, String op)
    {
        this.name=name;
        this.op=op;
        price=0;
    }
    public Dish(String name, String op, int price){
        this.name=name;
        this.price=price;
        this.op=op;
    }
    public void setPrice(int price){
        this.price=price;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setOp(String op){
        this.op=op;
    }
    public int getPrice(){
        return price;
    }
    public String getName(){
        return name;
    }
    public String getOp() {return op;}
}
