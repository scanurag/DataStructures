package www.aur.online.testing.opss;
public class Mobile {
private String name;
private double price;
private int ram;
private int rom;
private String color;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public int getRam() {
	return ram;
}
public void setRam(int ram) {
	this.ram = ram;
}
public int getRom() {
	return rom;
}
public void setRom(int rom) {
	this.rom = rom;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public Mobile(String name,double price,int ram,int rom,String color) {
	this.name=name;
	this.price=price;
	this.ram=ram;
	this.rom=rom;
	this.color=color;
}
public void show() {
	System.out.println(name);
	System.out.println(price);
	System.out.println(ram);
	System.out.println(rom);
	System.out.println(color);
}
}
