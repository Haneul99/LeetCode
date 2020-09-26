class Solution {
    public int titleToNumber(String s) {
        int result=0;
    	int num=0;
    	int mux=1;
        for(int i=s.length()-1;i>=0;i--) {
        	num=(int)(s.charAt(i)-'A')+1;
        	result+=mux*num;
        	mux*=26;
        }
        return result;
    }
}

/*
171. Excel Sheet Column Number
https://leetcode.com/problems/excel-sheet-column-number/

Given a column title as appear in an Excel sheet, return its corresponding column number.

ex)AAA= 26*26*1 + 26*1 + 1
*/