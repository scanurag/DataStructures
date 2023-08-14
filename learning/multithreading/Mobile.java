package learning.multithreading;

public class Mobile extends Thread 
{
Table tbl;
int number;
public Mobile(String name,Table tbl,int number)
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
