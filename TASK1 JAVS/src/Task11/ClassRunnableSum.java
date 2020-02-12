package Task11;

public class ClassRunnableSum implements Runnable{

		 private int [][] m; // {{1,1,1,1},{2,2,2,2},{3,3,3,3},{4,4,4,4},{5,5,5,5},{6,6,6,6},{7,7,7,7}};
		 private int startRow;
		 private int delay;
		 private String name;
		 private printRowClass prc;
		 Thread T;
		 
		 
		 public ClassRunnableSum(int [][] nM, int nRow , String nName, int nPriority, int nDelay,printRowClass nPrc) {
			 
			 m = nM;
			 name = nName;
			 startRow = nRow;
			 delay = nDelay;
			 prc = nPrc;
			 T= new Thread(this);
			 T.setPriority(nPriority);
			 T.start();
		 }
		 
		 @SuppressWarnings("static-access")
		  public void run() {
			 for(int i=startRow; i<m.length ; i = i+2) {
					 synchronized(prc) {
						 prc.printRow(i, m);
					 };
				 }
				
			 }

    /* synchronized public void callprintrow(int i,int nM[][]) {
		prc.printRow(i, nM);
	}*/
		 
	}

