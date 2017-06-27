package com.gaoruiqi.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LongestSubString {
	
	public int lengthOfLongestSubstring(String s) {
        int length = 0;
        List<Character> list = new LinkedList<Character>();
        for(int i=0;i<=s.length()-1;i++){
        	int temp = 0;
        	Character index = s.charAt(i);
        	while(list.contains(index)){
        		list.remove(0);
        		temp++;
        	}
        	if(temp > length||(list.size()+1)>length)
        		length = (list.size()+1)>temp?(list.size()+1):temp;
        	list.add(index);
        }
        return length;
    }
	//Time Limit Exceeded
	public String longestPalindrome1(String s) {
        int length = 0;
        int start = s.length()-1;
        int end = s.length();
        if(s.length()==1){
            return s;
        }
        for(int i=0;i<=s.length()-1;i++){
            for(int j=i+1;j<=s.length()-1;j++){
                if(s.charAt(i) == s.charAt(j)&&(j-i)>=length){
                    StringBuffer str = new StringBuffer(s.substring(i,j+1));
                    String reStr = str.reverse().toString();
                    if(s.substring(i,j+1).equals(reStr)){
                        start = i;
                        end = j+1;
                        length = j-i+1;
                    }
                }
            }
        }
        return s.substring(start,end);
    }
	
	public String convert(String s, int numRows) {
        if(numRows == 1||s.length()==1){
            return s;
        }
        List<String>[] rows = new List[numRows];
        for(int i=0;i<=rows.length-1;i++){
            rows[i] = new ArrayList<String>();
        }
        for(int j=0;j<=s.length()-1;j+=(2*numRows-2)){
            int m=j;
            int n=0;
            int flag=0;
            while(m<=j+(2*numRows-3)&&m<=s.length()-1){
                rows[n].add(String.valueOf(s.charAt(m)));
                m++;
                if(n<numRows-1&&flag==0){
                    n++;
                }else{
                    flag=1;
                    n--;
                }
            }
        }
        StringBuilder result = new StringBuilder();
        for(int i=0;i<=rows.length-1;i++){
            for(String str :rows[i]){
                result.append(str);
            }
        }
        return result.toString();
    }
	public static void main(String[] args) {
		String s = "ABC";
		System.out.print(new LongestSubString().convert(s,2));
	}
}
