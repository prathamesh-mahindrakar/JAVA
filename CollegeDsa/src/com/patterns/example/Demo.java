package com.patterns.example;

public class Demo {
	public static void main(String[] args) {
		
		for(int i=4;i>=0;i--) {
			for(int j = 4;j>=i;j--) {
				System.out.print("*");			
			}
		}
		System.out.println();
	}
}
