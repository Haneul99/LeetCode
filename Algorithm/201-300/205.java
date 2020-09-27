import java.util.*;

class Solution {
	
	public static void main(String[] args) {
		String str1="ab";
		String str2="ca";
		System.out.println(isIsomorphic(str1,str2));
	}
	
    public static boolean isIsomorphic(String s, String t) {
    	boolean check=true;
    	HashMap<Character, Integer> map1=new HashMap<Character, Integer>();
    	for(int i=0;i<s.length();i++) {
    		if(map1.containsKey(s.charAt(i))) {
    			if(map1.get(s.charAt(i))!=(int)(t.charAt(i)-s.charAt(i))) {
    				check=false;
    				break;
    			}
    		}
    		else {
    			map1.put(s.charAt(i), (int)(t.charAt(i)-s.charAt(i)));
    		}
    	}
    	HashMap<Character, Integer> map2=new HashMap<Character, Integer>();
    	for(int i=0;i<t.length();i++) {
    		if(map2.containsKey(t.charAt(i))) {
    			if(map2.get(t.charAt(i))!=(int)(t.charAt(i)-s.charAt(i))) {
    				check=false;
    				break;
    			}
    		}
    		else {
    			map2.put(t.charAt(i), (int)(t.charAt(i)-s.charAt(i)));
    		}
    	}
    	return check;
    }
}

/*
205. Isomorphic Strings
https://leetcode.com/problems/isomorphic-strings/

Given two strings s and t, determine if they are isomorphic.

Two strings are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.


check distance between s and t
it should be two-way
*/