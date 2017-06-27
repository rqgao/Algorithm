package com.gaoruiqi.test;

/**
 * ������N!ĩβ0�ĸ�����N�������Ʊ�ʾ���λ1��λ��
 * @author Administrator
 * @date 2017-05-04
 */
public class FactorialNum {

	public static void main(String[] args) {
		int n = 10;
		int factorial = FactorialResult(n);
		System.out.println("N�Ľ׳�Ϊ��"+factorial);
		System.out.println("N�Ľ׳�Ϊ��"+Integer.toBinaryString(factorial));
		int num1 = getNum1(n);
		System.out.println("0�ĸ���Ϊ��"+num1);
		int num2 = getNum2(n);
		System.out.println("0�ĸ���Ϊ��"+num2);

		int num3 = getNum3(n);
		System.out.println("���λ1��λ��Ϊ��"+num3);
		int num4 = getNum4(n);
		System.out.println("���λ1��λ��Ϊ��"+num4);
		int num5 = getNum5(n);
		System.out.println("���λ1��λ��Ϊ��"+num5);
		
		int i = 16;
		System.out.println(i+"�Ƿ�Ϊ2�Ĵ��ݣ�"+isPower(i));
	}
	
	public static boolean isPower(int i) {
		return (i>0)&&((i&i-1)==0);
	}
	
	/**
	 * ������������2������N���������ֽ��2�Ĵ���+1
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
	 * ������������2������N���������ֽ��2�Ĵ���+1
	 * @param n
	 * @return
	 */
	public static int getNum4(int n) {
		int num = n - BinaryNum.getNum3(n);
		return num+1;
	}
	
	/**
	 * ����һ������2������N���������ֽ��2�Ĵ���+1
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
	 * ������������1������N���������ֽ��5�Ĵ���
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
	 * ����һ������1������N���������ֽ��5�Ĵ���
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
	 * ���n�Ľ׳�
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
