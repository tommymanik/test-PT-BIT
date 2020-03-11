package com.test.tommy.logic;

import java.util.Scanner;

public class logic3 {
	
	public static void main(String [] args) {
		String [] dict = {"pro","gram", "merit", "program", "it", "programmer"};
		
		Scanner scanner = new Scanner(System. in);
        String inputString = scanner. nextLine(); 
        
        for (String string : dict) {
			if(inputString.indexOf(string) !=-1) {
				System.out.println(string);
			}
		}
	}

}
