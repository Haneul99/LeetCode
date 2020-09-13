import java.util.*;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
    	List<List<Integer>> list = new ArrayList<List<Integer>>();
    	for(int i=0;i<numRows;i++) {
        	ArrayList<Integer> row = new ArrayList<Integer>();
    		for(int j=0;j<=i;j++) {
    			if(i==0 || i==1 || j==0 || j==i) row.add(1);
    			else {
    				row.add(list.get(i-1).get(j-1) + list.get(i-1).get(j));
    			}
    		}
    		list.add(row);
    	}
        return list;
    }
}

/*
118. Pascal's Triangle
https://leetcode.com/problems/pascals-triangle/

Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.

(a,b) = (a-1,b-1) + (a-1,b)
*/