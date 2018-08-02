package com.Deloitte;

public class GreaterBO {
	public Integer[] greater(int a, int b) {
		Integer arr[]=new Integer[2];
		if(a>b) {
			arr[0]=a;
			arr[1]=b;
		}
		else {
			arr[0]=b;
			arr[1]=a;
		}
		return arr;
	}
}
