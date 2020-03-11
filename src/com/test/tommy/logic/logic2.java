package com.test.tommy.logic;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class logic2 {
	
	public static int length2(String begin, String end, Set<String> wordsDict) {
		LinkedList<String> curLevel = new LinkedList<>();
		LinkedList<String> nextLevel = new LinkedList<>();
	    curLevel.add(begin);
	 
	    wordsDict.add(end);
	 
	    String curWord;
	    int level = 1;
	 
	    while(!curLevel.isEmpty()){
	        level++;
	        while(!curLevel.isEmpty()) {
	            curWord = curLevel.poll();
	 
	            char[] arr = curWord.toCharArray();
	            for(int i=0; i< arr.length; i++){
	                for(char c='a'; c<='z'; c++){
	                    char temp = arr[i];
	                    if(arr[i]!=c){
	                        arr[i]=c;
	                    }
	 
	                    String newWord = new String(arr);
	 
	                    if(newWord.equals(end)){
	                        return level;
	                    }
	                    if(wordsDict.contains(newWord)){
	                        nextLevel.add(newWord);
	                        wordsDict.remove(newWord);
	                    }
	 
	                    arr[i]=temp;
	                }
	            }
	        }
	        curLevel = nextLevel;
	        System.out.println(curLevel.element());
	        nextLevel = new LinkedList<>();
	        
	        
	    }
	    
	    return 0;
	}
	
	public static void main(String [] args) {
		Set<String> wDict = new HashSet<String>(); 
		wDict.add("hot");
		wDict.add("dot");
		wDict.add("dog");
		wDict.add("lot");
		wDict.add("log");
		System.out.print("enter begin word :");
		Scanner sBegin = new Scanner(System.in);
		String beginWord = sBegin. nextLine();
		
		System.out.print("enter end word :");
		Scanner sEnd = new Scanner(System.in);
		String endWord = sEnd. nextLine();
		
		
		length2(beginWord, endWord, wDict);
		
	}

}
