package OOPPrinciples.oopprinciples.abstraction;
public class Manager {
    public static void main(String[] arg){
        Area area = new Area();
        System.out.println(area.getAreaRectangle(5,4));
        System.out.println(area.getAreaSquare(5));
        // lớp Abstraction là 1 lớp trừu tượng và nó có 2 phương thức không đầy đủ là
        // getAreaRectangle và getAreaSquare, cả 2 phương thức này chỉ cho biết giá trị đầu vào
        // và đầu ra mà nó đã ẩn đi cách thức hoạt động của nó, đó là thể hiện của tính trừu tượng
    }
}
