package LearningInheritance;
class ProgrammingLanguage{
	String type, inventor;
	
	public ProgrammingLanguage(String type, String inventor) {
		this.type=type;
		this.inventor=inventor;
		
	}
	void getLanguageDetails()
	{
		System.out.println("Language type is " +type);
		System.out.println("Inventor name is " +inventor);
	}
	
	
}//class closed

class JavaLanguage extends ProgrammingLanguage
{
String version;

 JavaLanguage(String type,String inventor,String version)
{
	super(type,inventor);//calling imediate super class parameterised constructor
	//it must be very first line in the constructor
	this.version=version;
}

void getLanguage()
{
	super.getLanguageDetails();
	System.out.println("current version is "+version);
}



}//class close

class PythonLanguage extends ProgrammingLanguage
{
	String frameworks,ides;
	PythonLanguage(String type,String inventor,String frameworks,String ides)
	{
		super(type,inventor);
		this.frameworks=frameworks;
		this.ides=ides;
	}
	void getLanguage()
	{
		super.getLanguageDetails();
		System.out.println("framework of pythons are "+frameworks);
		System.out.println("IDES used by python are"+ides);
	}

}





public class Super_Constructor {
	public static void main(String[] args) {
		
		JavaLanguage java=new JavaLanguage("object oriented", "JamesGosling","17");
		java.getLanguageDetails();
		
		
		PythonLanguage py=new PythonLanguage("Procedural and object oriented", "Guido Van Rossum","Django,Flask","Vscode,Atom");
		py.getLanguageDetails();
	}

}





























