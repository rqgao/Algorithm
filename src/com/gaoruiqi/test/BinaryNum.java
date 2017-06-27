package com.gaoruiqi.test;

/**
 * ����������һ���ֽڣ�8 bit���ı����������������1�ĸ���
 * @author Administrator
 * @date 2017-05-04
 */
public class BinaryNum {

	public static void main(String[] args) {
		int a = -10;
		System.out.println("����Ķ���������"+Integer.toBinaryString(Math.abs(a)));
		int num1 = getNum1(a);
		System.out.println("����һ������Ķ���������1�ĸ���"+num1);
		int num2 = getNum2(a);
		System.out.println("������������Ķ���������1�ĸ���"+num2);
		int num3 = getNum3(a);
		System.out.println("������������Ķ���������1�ĸ���"+num3);
		
		//����m��n��ͬ��λ��
		int m = 12;
		int n = 14;
		System.out.println("����Ķ���������"+Integer.toBinaryString(Math.abs(m)));
		System.out.println("����Ķ���������"+Integer.toBinaryString(Math.abs(n)));
		int c = m^n;
		System.out.println("����m��n��ͬ��λ��:"+getNum3(c));
		
		//����i��j
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
	 * ����һ������2����
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
	 * ������������λ����
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
	 * ����������λ����
	 */
	public static int getNum3(int a){
		
		int num = 0;
		a = Math.abs(a);
		while(a != 0){
			a &= a-1;//�����λ��һ��Ϊ0
			num++;
		}
		
		return num;
	}
}
