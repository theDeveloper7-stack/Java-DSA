package OOP.Inheritance;

public class BoxPrice extends BoxWeight {
    float price;
    BoxPrice(){
        super();
        this.price = -1;
    }

    public BoxPrice(BoxPrice other){
        super(other);
        this.price = other.price;
    }

    public BoxPrice(float length, float width, float height, float weight, float price){
        super(length,width,height,weight);
        this.price = price;
    }
}
