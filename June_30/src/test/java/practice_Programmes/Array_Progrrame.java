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
	@Test(priority=2)
	public void Remove_duplicates_from_sorted_array_using_index() {
		System.out.println("*******************New Programme Start*************************");
		int [] arr= {2,6,7,4,2,7};
		Arrays.sort(arr);
		
		System.out.println("Before : "+Arrays.toString(arr));
		int index=1;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]!=arr[i-1]) {
				arr[index]=arr[i];
				index++;
			}
		}
		int[] resarr=Arrays.copyOfRange(arr, 0, index);
		System.out.println("After : "+ Arrays.toString(resarr));
	}
}
