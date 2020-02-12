package task2;

import java.util.Comparator;

public class CompDes implements Comparator<Employee>{
	public int compare(Employee o1, Employee o2) {
		double P1 = o1.getSalary();
		double P2 = o2.getSalary();
		return (P1>P2)?-1:((P1<P2)?1:0);
	}
}
