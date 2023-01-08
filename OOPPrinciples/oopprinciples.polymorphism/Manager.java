package OOPPrinciples.oopprinciples.polymorphism;
public class Manager {
    public static void main(String[] arg){ // tính đa hình ở đây thể hiện bởi hai phuong thước price và topping
        Shop shop = new Shop();
        shop.price(96); // Trả về là : gia tien la : 96
        shop.price("Ice Cream", 10); // kết quả: Ice Cream co gia la : 10
        shop.topping(); // Trả về là : ban goi topping va gia thanh toan
        // ở đây phương thức price được gọi 2 lần tuy nhiên 2 phương thức này có signature khác nhau, và thông qua đó sẽ biết được là phương thức nào dc gọi
        // topping đã được ghi đè ở lớp Shop nên cho kết quả khác
    }
}
