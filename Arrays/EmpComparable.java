package Arrays;
 public class EmpComparable implements Comparable {
	String name;
	double sal;
    EmpComparable(String n,double s) {
		name=n;
		sal=s;
	}

	@Override
	public int compareTo(Object o) {
		EmpComparable e=(EmpComparable)o;
		if(sal>e.sal) return 1;
		if(sal<e.sal) return -1;
		return 0;
	}

	@Override
	public String toString() {
		return "EmpComparable [name=" + name + ", sal=" + sal + "]";
	}
	
}
