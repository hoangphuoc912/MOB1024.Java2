package mainPackage;

import java.util.ArrayList;
import entity.*;

public class MainBai4 {
    public static void main(String[] args) {

        ArrayList<Vehicle> list = new ArrayList<>();

        list.add(new Car("C01", "Toyota", 300, 0.1, 50));
        list.add(new Car("C02", "Honda", 250, 0.08, 40));
        list.add(new Motorbike("M01", "Yamaha", 100, 20));
        list.add(new Motorbike("M02", "Suzuki", 120, 25));
        list.add(new Vehicle("V01", "Xe dap", 50));

        System.out.println("DANH SACH PHUONG TIEN");
        for (Vehicle v : list) {
        	System.out.println(v.toString());
        }

        Vehicle max = list.get(0);
        for (Vehicle v : list) {
            if (v.totalCost() > max.totalCost()) {
                max = v;
            }
        }

        System.out.println("\nPhuong tien co chi phi cao nhat:");
        System.out.println(max);
    }
}