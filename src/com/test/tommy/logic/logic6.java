package com.test.tommy.logic;

import java.util.Arrays;
import java.util.Scanner;

public class logic6 {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter four digit number: ");
        System.out.print("nilai konstanta : "+KaprekarsKonstanta(s.nextInt()));
		
    }
 
    public static int KaprekarsKonstanta(int num) {
        int diff = 0, count = 0;
        while (diff != 6174) {
            String s1 = String.valueOf(num);

            char[] ch1 = new char[s1.length()];
            for (int i = 0; i < ch1.length; i++) {
                ch1[i] = s1.charAt(i);
            }
            Arrays.sort(ch1);
            String s2 = new String(ch1);

            String s3 = "";
            for (int j = s2.length() - 1; j >= 0; j--) {
                s3 += s2.charAt(j);
            }

            int a = Integer.parseInt(s2);
            int b = Integer.parseInt(s3);
            if (a > b) {
                diff = a - b;
            } else if (b > a) {
                diff = b - a;
            } else {
                System.out.println("goal cant be reached");
                break;

            }
            System.out.println(String.format("%d - %d = %d", a, b, diff));
            count++;
            num = diff;

        }
        return count;

    }

}
