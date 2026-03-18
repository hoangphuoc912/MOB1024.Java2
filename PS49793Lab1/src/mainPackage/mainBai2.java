package mainPackage;

import java.util.ArrayList;
import entity.*;

public class mainBai2 {
    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();

        list.add(new FullTimeEmployee("E01", "A", 1000, 200, 50));
        list.add(new FullTimeEmployee("E02", "B", 1200, 100, 30));
        list.add(new PartTimeEmployee("E03", "C", 50, 10));
        list.add(new PartTimeEmployee("E04", "D", 40, 8));

        for (Employee e : list) {
            System.out.println(e);
        }

        Employee max = list.get(0);

        for (Employee e : list) {
            if (e.income() > max.income()) {
                max = e;
            }
        }

        System.out.println("Nhan vien thu nhap cao nhat:");
        System.out.println(max);
    }
}