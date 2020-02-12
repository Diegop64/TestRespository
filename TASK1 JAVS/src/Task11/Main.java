package Task11;


public class Main {

	public static void main(String[] args) {
		int m[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16},{17,18,19,20},{21,22,23,24},{25,26,27,28}};
		
		//new ClassRunnable(m, 0, "Odd", 2, 0);
		//new ClassRunnable(m, 1, "Even",2, 0);
		/*
		ClassThread one = new ClassThread(m, 0, "Odd", 2, 0);
		ClassThread two = new ClassThread(m, 1, "Even",8, 0);
		one.start();
		two.start();
		*/
		printRowClass prc = new printRowClass();
		
		ClassRunnableSum one = new ClassRunnableSum(m, 0, "Odd", 2, 0,prc);
		ClassRunnableSum two = new ClassRunnableSum(m, 1, "Even", 2, 0,prc);
		try {
			one.T.join();
			two.T.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
