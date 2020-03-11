package com.test.tommy.logic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class logic1 {
	public static ArrayList<Integer> perfect_two(final List<Integer> a, int b) {
        
        HashMap<Integer, Integer> my_map = new HashMap<Integer, Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        result.add(0);
        result.add(1);
        for(int i = 0; i < a.size(); i++){
            if(my_map.containsKey(a.get(i))){
                int index = my_map.get(a.get(i));
                result.set(0, index );
                result.set(1, i );
                break;
            }
            else{
                my_map.put(b - a.get(i), i);
            }
        }
        
        return result;
    }
	
	public static void main(String[] args){
        ArrayList<Integer> nilaiArray = new ArrayList<Integer>();
        nilaiArray.add(2);
        nilaiArray.add(7);
        nilaiArray.add(11);
        nilaiArray.add(15);
		
        System.out.println("enter a target :");
        Scanner s = new Scanner(System.in);
		int target = s.nextInt();
        ArrayList<Integer> result = perfect_two(nilaiArray, target);
        for(int i : result)
            System.out.print("Index: "+i + " ");
    }

}
