package task2;

import java.util.ArrayList;
import java.util.Collections;

public class Firm {
	String Name;
	//Employee [] E;
	ArrayList<Employee> E = new ArrayList<Employee>();
	/**
	Firm(String nName, Employee ...employees){
		this.Name = nName;
		EmplAmount = 0;
		E = new Employee[employees.length];
		for (Employee employee : employees) {
			E[EmplAmount] =  employee;
			EmplAmount++;
		}
	}
		**/
	Firm(String nName, int maxEmployees){
		this.Name = nName;
		//E = new Employee[maxEmployees];
		//EmplAmount = 0;
	}
	
	void add (Employee nEmp){
		try {
			E.add(nEmp);
	}	catch (Exception e) {
		System.out.println("Error, coudnt add the Employee");
	}
		
	/**	
		if (EmplAmount >= E.length) {
			System.out.println("Error, coudnt add the Employee");
		}
		else {
			E[EmplAmount] = nEmp;
			EmplAmount++;
		}
		**/
	}

	@Override
	public String toString() {
		String elements = "";
		int i = 1;
		for(Object element : E) {
			elements = elements + (i+1) + ".  " +  element + "\n";
			i++;
		}
		return "Firm :" + Name + ", EmplAmount=" + E.size() + "\n" + elements;
	}
	
	public double getMaxSalary() {
		double MaxSalary = -1.0;
		for(Object element : E) {
			Employee elem = (Employee) element;
			if (elem.getSalary() > MaxSalary) {
				MaxSalary =elem.getSalary();
			}
		}
		return MaxSalary;
	}	
	
	void sortSalariesAsc() {
		Collections.sort(E);
	}
	
	void sortSalariesDesc() {
		Collections.sort(E, new CompDes());
	}
	
	
}
