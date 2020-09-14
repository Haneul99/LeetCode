
class Solution {
    public String convertToTitle(int n) {
        int r=n%26;
        int q=n/26;
        char c;
        if(r==0) {
            c='Z';
            q-=1;
        }
        else if(r==1) c='A';
        else {
        	c=(char) ('A'+r-1);
        }
        StringBuilder SB=new StringBuilder();
        SB.insert(0,c);
        while(q>26) {
        	r=q%26;
        	q=q/26;
            if(r==0) {
                c='Z';
                q-=1;
            }
            else if(r==1) c='A';
            else {
            	c=(char) ('A'+r-1);
            }
            SB.insert(0,c);
        }
        if(q!=0) {
            if(q==1) c='A';
            else {
            	c=(char) ('A'+q-1);
            }
            SB.insert(0,c);
        }
        return SB.toString();
    }
}

/*
168. Excel Sheet Column Title
https://leetcode.com/problems/excel-sheet-column-title/

Given a positive integer, return its corresponding column title as appear in an Excel sheet.

For example:

    1 -> A
    2 -> B
    3 -> C
    ...
    26 -> Z
    27 -> AA
    28 -> AB 
    ...
    
% operation
while(q>26) / operation
*/