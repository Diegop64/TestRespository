package Task11;

public class ClassThread extends Thread {

	 private int [][] m; // {{1,1,1,1},{2,2,2,2},{3,3,3,3},{4,4,4,4},{5,5,5,5},{6,6,6,6},{7,7,7,7}};
	 private int startRow;
	 private int delay;
	 private String name;
	 
	 public ClassThread(int [][] nM, int nRow , String nName, int nPriority, int nDelay) {
		 m = nM;
		 name = nName;
		 startRow = nRow;
		 delay = nDelay;
		 this.setPriority(nPriority);
	 }
	 @SuppressWarnings("static-access")
	public void run() {
		 int cumSum;
		 for(int i=startRow; i<7 ; i = i+2) {
			 cumSum=0;
			 for(int h=0 ; h<4;h++) {
				 cumSum=cumSum+m[i][h];
			 }
			 System.out.println("Thread["+name+","+this.getPriority()+"]. Row: "+i+", Sum: "+cumSum);
		 }
		 try {
			this.sleep(delay);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
	 }
}
