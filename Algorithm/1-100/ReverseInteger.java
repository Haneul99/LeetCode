class ReverseInteger {
    public int reverse(int x) {
        String str;
        char c;
        if(x>=0){
            str=Integer.toString(x);
            StringBuilder builder = new StringBuilder(str);
            for(int i=0;i<=str.length()/2-1;i++){
                c=str.charAt(i);
                builder.setCharAt(i,str.charAt(str.length()-1-i));
                builder.setCharAt(str.length()-1-i, c);
                str=builder.toString();
            }
        }//양수인경우
        else{
            str=Integer.toString(x);
            StringBuilder builder = new StringBuilder(str);
            for(int i=1;i<=str.length()/2;i++){
                c=str.charAt(i);
                builder.setCharAt(i,str.charAt(str.length()-i));
                builder.setCharAt(str.length()-i, c);
                str=builder.toString();
            }
        }//음수인경우
    
        try {
        	x=Integer.parseInt(str);
        	return x;
		}
		catch(Exception e) {
			System.out.println("Overflow");
            return 0;
		}
}
/*
String 변환하면 안되는 문제였음... 변환하지 말기
기본적인 골조
일단 양수인지 음수인지 파악하기.
그리고 String으로 변환.
-인 경우) 1번째 index부터(i와 .length, i+1과 .length-1 ...)
+인 경우) 0번째 index부터
하고 다시 INTEGER로 변환.
*/
}
