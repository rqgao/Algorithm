package com.gaoruiqi.test;

import java.math.BigInteger;
import java.util.Scanner;

public class Inversions {

	private static BigInteger[][] count;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    int k = in.nextInt();
	    count = new BigInteger[n+1][k+1];
	    for (int i = 0; i <= n; i++)
            for (int j = 0; j <= k; j++)
            	count[i][j] = new BigInteger("-1");
	    System.out.println(solve(n, k));
	}

	private static BigInteger solve(int n, int k) {
		
		if (!count[n][k].equals(new BigInteger("-1"))) return count[n][k];
	    if (k == 0) return count[n][k] = new BigInteger("1");
	    if (n == 0) return count[n][k] = new BigInteger("0");
	    BigInteger val = new BigInteger("0");
	    for (int j = 0; j < n && k-j >= 0; j++)
	    	val = val.add(new BigInteger(solve(n-1, k-j).toString()));
	    return count[n][k] = val;
	}

}
