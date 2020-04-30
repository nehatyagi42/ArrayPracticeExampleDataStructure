/*Input : arr = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1}
Output : [-1, 1, 2, 3, 4, -1, 6, -1, -1, 9]

1) Iterate through elements in array
2) If arr[i] >= 0 && arr[i] != i, put arr[i] at i ( swap arr[i] with arr[arr[i]])

*/


package com.Practice.Arrays;

import java.util.Arrays;

public class RearrangeArray {
public static void main(String[] args) {
	

	int arr[]= {19, 7, 0, 3, 18, 15, 12, 6, 1, 8, 11, 10, 9, 5, 13, 16, 2, 14, 17, 4};
    for (int i = 1; i < arr.length;) {
    	if (arr[i]>=0 && arr[i]!=i) {
			int element=arr[arr[i]];
			arr[arr[i]]=arr[i];
			arr[i]=element;
		}else {
    	
    	
		i++;
		}
		
	}
	
	System.out.println(Arrays.toString(arr));
}
}
