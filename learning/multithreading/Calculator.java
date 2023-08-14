package learning.multithreading;

public class Calculator extends Thread 
{
Table tbl;
int number;
public Calculator(String name,Table tbl,int number)
{
	setName(name);
	this.tbl=tbl;
	this.number=number;
	start();
}
public void run()
{
	tbl.printTable(number);
}
}
