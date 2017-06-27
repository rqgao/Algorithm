package com.gaoruiqi.test;

/**
 * 描述：N!末尾0的个数，N！二进制表示最低位1的位置
 * @author Administrator
 * @date 2017-05-04
 */
public class FactorialNum {

	public static void main(String[] args) {
		int n = 10;
		int factorial = FactorialResult(n);
		System.out.println("N的阶乘为："+factorial);
		System.out.println("N的阶乘为："+Integer.toBinaryString(factorial));
		int num1 = getNum1(n);
		System.out.println("0的个数为："+num1);
		int num2 = getNum2(n);
		System.out.println("0的个数为："+num2);

		int num3 = getNum3(n);
		System.out.println("最低位1的位置为："+num3);
		int num4 = getNum4(n);
		System.out.println("最低位1的位置为："+num4);
		int num5 = getNum5(n);
		System.out.println("最低位1的位置为："+num5);
		
		int i = 16;
		System.out.println(i+"是否为2的次幂："+isPower(i));
	}
	
	public static boolean isPower(int i) {
		return (i>0)&&((i&i-1)==0);
	}
	
	/**
	 * 方法三（问题2）：对N做质因数分解后2的次幂+1
	 * @param n
	 * @return
	 */
	public static int getNum5(int n) {
		int num = 0;
		while(n != 0){
			n >>= 1;
			num += n;
		}
		return num+1;
	}
	
	/**
	 * 方法二（问题2）：对N做质因数分解后2的次幂+1
	 * @param n
	 * @return
	 */
	public static int getNum4(int n) {
		int num = n - BinaryNum.getNum3(n);
		return num+1;
	}
	
	/**
	 * 方法一（问题2）：对N做质因数分解后2的次幂+1
	 * @param n
	 * @return
	 */
	public static int getNum3(int n) {
		int num = 0;
		while(n/2 != 0){
			num += n/2;
			n /= 2;
		}
		return num+1;
	}
	
	/**
	 * 方法二（问题1）：对N做质因数分解后5的次幂
	 * @param n
	 * @return
	 */
	public static int getNum2(int n) {
		int num = 0;
		while(n/5 != 0){
			num += n/5;
			n /= 5;
		}
		return num;
	}
	
	/**
	 * 方法一（问题1）：对N做质因数分解后5的次幂
	 * @param n
	 * @return
	 */
	public static int getNum1(int n) {
		int num = 0;
		for(int i=1;i<=n;i++){
			int j=i;
			while(j%5 == 0){
				num++;
				j /= 5;
			}
		}
		return num;
	}

	/**
	 * 求解n的阶乘
	 * @param n
	 * @return
	 */
	private static int FactorialResult(int n) {
		
		int result;
		if(n == 0)
			result = 1;
		else
			result = n * FactorialResult(n-1);
		return result;
	}
}
