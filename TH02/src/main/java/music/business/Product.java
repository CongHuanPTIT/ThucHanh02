package music.business;

import java.text.NumberFormat;
import java.io.Serializable;

public class Product implements Serializable {
	private String code, desc;
	private double price;
	
	public Product() {
		code = "";
		desc = "";
		price = 0;
	}
}
