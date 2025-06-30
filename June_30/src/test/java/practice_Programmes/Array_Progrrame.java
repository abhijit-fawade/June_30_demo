package practice_Programmes;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.testng.annotations.Test;

public class Array_Progrrame {
	@Test(priority=1)
	public  void Remove_duplicates_from_array_using_HashSet() {
		System.out.println("*******************New Programme Start*************************");
		int [] arr= {2,6,7,4,2,7};
		Set<Integer> uniele=new HashSet<>();
		for(int num:arr) {
			uniele.add(num);
		}
		System.out.println(uniele);
		int[]  resarr=new int[uniele.size()];
		int index=0;
		for(int num:uniele) {
			resarr[index++]=num;
		}
		System.out.println(Arrays.toString(resarr));
	}	
}
