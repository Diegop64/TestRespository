package task2;

public class Main {

	public static void main(String[] args) {
		
		/*
		Employee Pedro = new Employee("Pedro", "garcia", 2000.0);
		Employee Diego = new Employee("Diego", "Olmos", 8000.0);
		Employee Juan = new Employee("Juan", "Petrovs", 1000.0);
		
		Firm firm1 = new Firm("VEF",3);
		
		firm1.add(Pedro);
		firm1.add(Juan);
		firm1.add(Diego);
		System.out.println("Max salary =" + firm1.getMaxSalary());
		System.out.println(firm1.toString());
		firm1.sortSalariesAsc();
		System.out.println(firm1.toString());
		firm1.sortSalariesDesc();
		System.out.println(firm1.toString());
		*/
		Bus bus1 = new Bus();
		Bus bus2 = new Bus();
		Auto auto = new Auto();
		Vehicle veh = new Vehicle();
		Human h1 = new Human();
		Human h2 = new Human();
		Human h3 = new Human();
		
		Object [] O = {bus1,bus2,h1,auto,veh,"",h2,h3};
		
		Task10.check1(O);
		Task10.check2(O);
		Task10.check3(O);

	}

}
