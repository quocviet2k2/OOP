package OOPPrinciples.oopprinciples.encapsulation;
public class ManagerScore {
    public static void main(String[] arg) {
        // tính đóng gói thể hiện ở phạm vi truy cập của biến
        Encapsulation encapsulation = new Encapsulation();
        //System.out.println(encapsulation.speed);
        // kết quả: lỗi, vì biên speed  là private nên nó chỉ có thể truy cập trong nội bộ class
        encapsulation.setSpeed(10); // thực hiện gán biến speed thông qua hàm set
        System.out.println(encapsulation.evaluate); // kết quả: unknown vì biến evaluate là biên public nên nó có thể truy cập từ toàn bộ class
    }
}
