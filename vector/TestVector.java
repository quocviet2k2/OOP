package vector;
import java.util.List;
import java.util.ArrayList;

public class TestVector {
    public static void main(String[] args) {
        double array[] = {1.3, 2.6, 3.9, 5.2};
        double array2[] = {0,1,2,3};
        ArrayVector arrayVector1 = new ArrayVector(array);
        ArrayVector arrayVector2 = new ArrayVector(array2);
        System.out.println(arrayVector1);
        arrayVector1.insert(1,0);
        System.out.println(arrayVector1);
        arrayVector1.remove(2);
        System.out.println(arrayVector1);
        ArrayVector a = arrayVector1.plus(arrayVector2);
        System.out.println(a);
        ArrayVector b = arrayVector1.minus(arrayVector2);
        System.out.println(b);
        System.out.println();
        List<Double> list1 = new ArrayList<>();
        list1.add(1.0);
        list1.add(2.0);
        list1.add(3.0);
        list1.add(4.0);
        List<Double> list2 = new ArrayList<>();
        list2.add(1.0);
        list2.add(2.0);
        list2.add(3.0);
        list2.add(4.0);
        ListVector lst1 = new ListVector(list1);
        ListVector lst2 = new ListVector(list2);
        System.out.println(lst1);
        lst1.insert(0, 0);
        System.out.println(lst1);
        lst1.remove(2);
        System.out.println(lst1);
        ListVector c = lst1.plus(lst2);
        System.out.println(c);
        ListVector d = lst1.minus(lst2);
        System.out.println(d);
    }
}