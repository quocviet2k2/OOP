package OOPPrinciples.oopprinciples.polymorphism;
public class Shop extends Polymorphism{
    public Shop(){
        super();
    }
    public void price(String product,double price){
        System.out.println(  product + " co gia la : " + price);
    }
    @Override
    public void topping(){
        System.out.println("ban goi topping va gia thanh toan");
    }
}
