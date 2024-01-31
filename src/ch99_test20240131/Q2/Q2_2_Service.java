package ch99_test20240131.Q2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q2_2_Service {
	
	List<String> list = new ArrayList<String>();
	
	list.add("class"); list.add("interface"); list.add("inheritance");
	System.out.println(list);
	
	List<String> fruitList = Arrays.asList(new String[] {"james", "maria"});
	System.out.println(fruitList);

	}
}
