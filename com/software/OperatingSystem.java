package com.software;
import com.os.Windows;
public class OperatingSystem {
	void showOs()
	{
	Windows w=new Windows();
	 w.show_Features();
	// System.out.println(w.version);//cannot access
	 //outside from the package
	}

}
