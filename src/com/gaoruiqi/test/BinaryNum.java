package com.gaoruiqi.test;

/**
 * 描述：对于一个字节（8 bit）的变量，求二进制数中1的个数
 * @author Administrator
 * @date 2017-05-04
 */
public class BinaryNum {

	public static void main(String[] args) {
		int a = -10;
		System.out.println("输入的二进制数："+Integer.toBinaryString(Math.abs(a)));
		int num1 = getNum1(a);
		System.out.println("方法一：输入的二进制数中1的个数"+num1);
		int num2 = getNum2(a);
		System.out.println("方法二：输入的二进制数中1的个数"+num2);
		int num3 = getNum3(a);
		System.out.println("方法三：输入的二进制数中1的个数"+num3);
		
		//整数m与n不同的位数
		int m = 12;
		int n = 14;
		System.out.println("输入的二进制数："+Integer.toBinaryString(Math.abs(m)));
		System.out.println("输入的二进制数："+Integer.toBinaryString(Math.abs(n)));
		int c = m^n;
		System.out.println("整数m与n不同的位数:"+getNum3(c));
		
		//交换i、j
		int i = 12;
		int j = 14;
		System.out.println("i="+i+";j="+j);
		i = i+j;
		j = i-j;
		i = i-j;
//		i = i^j;
//		j = i^j;
//		i = i^j;
		System.out.println("i="+i+";j="+j);
		
	}
	
	/**
	 * 方法一：做除2运算
	 */
	public static int getNum1(int a){
		
		int num = 0;
		a = Math.abs(a);
		while(a != 0){
			if(a%2 == 1)
				num++;
			a /= 2;
		}
		
		return num;
	}
	
	/**
	 * 方法二：做移位运算
	 */
	public static int getNum2(int a){
		
		int num = 0;
		a = Math.abs(a);
		while(a != 0){
			num += a&1;
			a = a>>1;
		}
		
		return num;
	}
	
	/**
	 * 方法三：做位运算
	 */
	public static int getNum3(int a){
		
		int num = 0;
		a = Math.abs(a);
		while(a != 0){
			a &= a-1;//将最高位的一变为0
			num++;
		}
		
		return num;
	}
}
