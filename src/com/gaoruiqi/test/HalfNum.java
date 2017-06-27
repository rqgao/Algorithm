package com.gaoruiqi.test;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.Map.Entry;

/**
 * 描述：寻找超过半数的ID
 * @author Administrator
 * @date 2017-05-10
 */
public class HalfNum {
	
	public static void main(String[] args) {
		int[] array = new int[]{1,3,1,4,1,1,2,1,2,1};
		int id = findID(array);
		System.out.println(id);
		
		int id1 = findID1(array);
		System.out.println(id1);
		
		int id2 = findID2(array);
		System.out.println(id2);
	}
	//出现次数超过1/2的ID
	private static int findID2(int[] array) {

		int candidate=0;
		int nTimes, i;  
	    for(i = nTimes = 0; i < array.length; i++)  
	    {  
	        if(nTimes == 0)  
	        {  
	             candidate = array[i];
	             nTimes = 1;  
	        }  
	        else  
	        {  
	            if(candidate == array[i])  
	                nTimes++;  
	            else  
	                nTimes--;  
	  
	        }  
	  
	    }  
	    return candidate; 
	}
	//排序(出现次数超过1/2的ID)
	private static int findID1(int[] array) {
		Arrays.sort(array);
		return array[array.length/2];
	}
	//集合(出现次数最多的ID)
	private static int findID(int[] array) {
		Hashtable<Integer, Integer> arr = new Hashtable<Integer, Integer>();
		int id = 0;
		int temp = 0;
		for(int i=0;i<=array.length-1;i++){
			if(!arr.containsKey(array[i])){
				arr.put(array[i], 1);
			}else{
				arr.put(array[i], arr.get(array[i])+1);
			}
		}
		for(Entry<Integer, Integer> entry:arr.entrySet()){
			if((int)entry.getValue()>temp){
				temp = (int)entry.getValue();
				id = (int)entry.getKey();
			}
		}
		return id;
	}
	
}
