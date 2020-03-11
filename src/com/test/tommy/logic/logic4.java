package com.test.tommy.logic;

import java.util.Scanner;

public class logic4 {
	
	public static void main(String [] args) {
		int num1 = 0, num2 = 0;
		System.out.print("Enter N digit number: ");
		Scanner s = new Scanner(System.in);
		int inputNumb = s.nextInt();
		int initNumb,mLength;
		if(inputNumb==1) {
			initNumb=1;mLength=9;
		}else if(inputNumb==2) {
			initNumb=10;mLength=99;
		}else if(inputNumb==3) {
			initNumb=100;mLength=999;
		}else{
			initNumb=1000;mLength=9999;
		}
		for(int i=initNumb; i<=mLength; i++){
		    for(int j=initNumb; j<=mLength; j++){
		        String mul = String.valueOf(i*j);
		        if(isPalindrome(mul)){
		            num1 = i;
		            num2 = j;
		        }
		    }
		}
		System.out.println(num1*num2);
	}
	
	static boolean isPalindrome(String str) {
	    String strRev = new StringBuilder(str).reverse().toString();
	    return str.equals(strRev);
	}

}
