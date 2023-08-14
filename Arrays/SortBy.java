package Arrays;
import java.util.Comparator;
//it is a part of part of java;e
public class SortBy implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {
		Comparator1 m1 = (Comparator1)o1;
		Comparator1 m2 = (Comparator1)o2;
		return (int) (m2.price - m1.price);
	}
}
