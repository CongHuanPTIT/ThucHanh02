package music.data;

import java.io.*;
import java.util.*;
import music.business.Product;

public class ProductIO {
	private static ArrayList<Product> products = null;

	public static ArrayList<Product> getProducts(String path) {

	}

	public static Product getProduct(String productCode, String path) {
	}

	public static boolean exists(String productCode, String path) {
		products = getProducts(path);
		for (Product p : products) {
			if (productCode != null && productCode.equalsIgnoreCase(p.getCode())) {
				return true;
			}
		}
		return false;
	}

	private static void saveProducts(ArrayList<Product> products, String path) {
		try {
			File file = new File(path);
			PrintWriter out = new PrintWriter(new FileWriter(file));
			for (Product p : products) {
				out.println(p.getCode() + "|" + p.getDescription() + "|" + p.getPrice());

			}
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void insert(Product product, String path) {
		products = getProducts(path);
		products.add(product);
		saveProducts(products, path);
	}
}
