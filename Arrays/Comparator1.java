package Arrays;

import java.util.Comparator;

// y r //it is a part of MobileDriver class jaa  ke dekho same file me hai
public class Comparator1 implements Comparable {
 String brand;
 double price;
 int ram;
@Override
public String toString() {
	return "Comparator [brand=" + brand + ", price=" + price + ", ram=" + ram + "]";
}
public Comparator1(String brand, double price, int ram) {
	this.brand = brand;
	this.price = price;
	this.ram = ram;
}
 public int compareTo(Object o) {
	 return(int) (this.price - ((Comparator1 )o).price);
 }
}
