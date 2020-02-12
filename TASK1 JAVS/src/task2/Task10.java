package task2;

import java.util.HashMap;
import java.util.Iterator;

public class Task10 {
	
	public static void check1(Object [] O) {
		int V=0, A=0, B=0, H=0, U=0;
		
		for (Object ojt : O) {
			if (ojt instanceof Human) {
				H++;
			}
			else if (ojt instanceof Auto) {
				A++;
			}
			else if (ojt instanceof Bus) {
				B++;
			}
			else if (ojt instanceof Vehicle) {
				V++;
			}
			else {
				U++;
			}
		}
		
		System.out.println("Instance of ...\n" +  "Vehicle:" +V+" Auto:"+A+" Bus:"+B+" Human:"+H+" Unknown:" + U+"\n");
	}
	
	public static void check2(Object [] O) {
		int V=0, A=0, B=0, H=0, U=0;
		
		for(Object ojt : O) {
			if (Human.class.isInstance(ojt)) {
				H++;
			}
			else if (Auto.class.isInstance(ojt)) {
				A++;
			}
			else if (Bus.class.isInstance(ojt)) {
				B++;
			}
			else if (Vehicle.class.isInstance(ojt)) {
				V++;
			}
			else {
				U++;
			}
		}
		System.out.println("Instanceof ...\n" +  "Vehicle:" +V+" Auto:"+A+" Bus:"+B+" Human:"+H+" Unknown:" + U+"\n");
	
	}
	
	public static void check3(Object [] O ) {
		HashMap<String,Integer> Result = new HashMap<String, Integer>();
		String name;
		for (Object ojt : O) {
			name = ojt.getClass().getName();
			
			if (!Result.containsKey(name)) {
				Result.put(name, 1);
			} else {
				Result.put(name, Result.get(name)+1);
			}
		}
		System.out.println("With HashMap and getClass:\n");
		for (String key : Result.keySet()) {
			System.out.println(" " + key +":"+ Result.get(key));
		}
	}
	
}
