import java.util.*;

public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
    	ArrayList<Integer> targetRow = new ArrayList<Integer>();
    	for(int i=0;i<=rowIndex;i++) {
        	ArrayList<Integer> row = new ArrayList<Integer>();
    		for(int j=0;j<=i;j++) {
    			if(i==0 || i==1 || j==0 || j==i) row.add(1);
    			else {
    				row.add(list.get(i-1).get(j-1) + list.get(i-1).get(j));
    			}
    		}
    		list.add(row);
    		if(i==rowIndex) targetRow=row;
    	}
    	return targetRow;
    }
}

/*
119. Pascal's Triangle II
https://leetcode.com/problems/pascals-triangle-ii/

Given an integer rowIndex, return the rowIndexth row of the Pascal's triangle.

Notice that the row index starts from 0.
*/