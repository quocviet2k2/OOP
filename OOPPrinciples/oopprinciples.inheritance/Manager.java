package OOPPrinciples.oopprinciples.inheritance;
public class Manager {
    public static void main(String[] arg){ // tính kế thừa
        SubClass manager = new SubClass();
        manager.talk(); // Trả về là: Quiet!
        manager.talk2(); // Trả về là : No!
        //lớp subClass là lớp con của lớp Inheritance nên nó sẽ được kế thừa toàn bộ thuọc tính public/protected của lớp cha, ở đây lớp SubClass có thể gọi đến talk()
    }
}
