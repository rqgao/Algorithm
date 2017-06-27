package com.gaoruiqi.test;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public ArrayList<Integer> list = new ArrayList<Integer>();   //用于存放求取子集中的元素

	/**
	 * 计算子集中元素的和
	 * @param list
	 * @return
	 */
    public int getSum(ArrayList<Integer> list) {
        int sum = 0;
        for(int i = 0;i < list.size();i++)
            sum += list.get(i);
        return sum;
    }
    
    /**
     * 得到子集合
     * @param A
     * @param m
     * @param step
     * @return
     */
    public int getSubSet(int[] A, int m, int step) {
        while(step < A.length) {
            list.add(A[step]);   
            if(getSum(list) == m) 
                 return 1;
            step++;
            getSubSet(A, m, step);
            list.remove(list.size() - 1); 
        }
        return 0;
    }

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    int m = in.nextInt();
	    int[] array = new int[n];
	    int sum = 0;
	    int flag = 0;
	    for(int i=0; i<=n-1; i++){
	    	array[i] = in.nextInt();
	    	sum += array[i];
	    }
	    Main main = new Main();
	    int temp = 1;
	    while(m*temp<=sum){
	    	flag = main.getSubSet(array,m*temp,0);
	    	temp++;
	    }
	    
	    if(flag==1){
	    	System.out.println("Yes");
	    }else{
	    	System.out.println("No");
	    }
	    

	}

}
