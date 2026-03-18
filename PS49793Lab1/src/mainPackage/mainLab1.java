package mainPackage;

import java.util.ArrayList;

//import dao.ProductDAO;
import entity.ImportedProduct;
import entity.Product;

public class mainLab1 {	
	public static void main(String[] args) {
		ArrayList<Product> listProduct = new ArrayList<Product>();
		
		Product p1 = new Product("Ao01", "Ao thun", 10);
		listProduct.add(p1);
		listProduct.add(new Product("Ao02", "Ao so mi", 12));
		listProduct.add(new ImportedProduct("Quan01", "Quan tay",15,0.1,1));
		listProduct.add(new ImportedProduct("Quan02", "Quan Jean", 20, 0.15, 1));
		listProduct.add(new ImportedProduct("Quan03", "Quan dui", -3, 0.15, 1));
		
//		Product p2 = new ProductDAO();
//		p2.NewProduct();
//		listProduct.add(p2);
		
		for (Product p : listProduct) {
			System.out.println(p.toString());
		}
		// Tìm sản phẩm có giá cao nhất
		Product max = listProduct.get(0);

		for (Product p : listProduct) {
		    if (p.finalPrice() > max.finalPrice()) {
		        max = p;
		    }
		}

		System.out.println("\nSan pham co gia cao nhat:");
		System.out.println(max);
	}
}
