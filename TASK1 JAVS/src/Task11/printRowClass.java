package Task11;

public class printRowClass {
	
	
	
	 public void printRow(int nRow, int nM[][]) {
		System.out.println("");
		System.out.print("Row: " + nRow + ". Elements: ");
		 for(int i=0;i<nM[nRow].length;i++) {
			 System.out.print(nM[nRow][i]+" ");
		 }
	
		 
	 }

}
