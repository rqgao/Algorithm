package com.gaoruiqi.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class StackSort {
	
	private static int anwser = 0;
	
	public static int move(List<Integer> from,List<Integer> to,Stack<Integer> stack){
		Stack<Integer> stackBack = (Stack<Integer>) stack.clone();
		if(to.size() == 7){
			return anwser++;
		}
		if(from.size() > 0 && stack.size() < 4){
			stack.add(from.remove(0));
			return move(from, to, stack);
		}
		if(stackBack.size()>0){
			to.add(stackBack.remove(stackBack.size()-1));
			return move(from, to, stackBack);
		}
		return anwser;
	}

	public static void main(String[] args) {
		List<Integer> from = new ArrayList<Integer>();
		for(int i=1;i<=7;i++){
			from.add(new Integer(i));
		}
		List<Integer> to = new ArrayList<Integer>();
		Stack<Integer> stack = new Stack<Integer>();
		System.out.println(move(from,to,stack));

	}

}
