class PalindromeNumber {
	public boolean isPalindrome(int x) {
        boolean check=true;
        if(x<0) check=false;
        else if(x==0);
        else{
            int j=1;
            int count=1;
            while(x/j>0 && x/j>9){
                j*=10;
                count++;
            }
            int div=10;
            for(int i=0;i<=count/2-1;i++){
                if(x/j%10!=x%div/(div/10)){
                    check=false;
                    break;
                }
                else if(x/j%10==x%div/(div/10)) {
                    j/=10;
                    div*=10;
                }
            }
        }
        return check;
}
/*
우선, integer가 몇자리인가?
1 - 첫째자리%자릿수
2 - 둘째자리%자릿수-1
.
.
.
중간
*/
//다른 아이디어. 배열을 사용한다면 어땠을까? 더 간단할 것 같음.
}
