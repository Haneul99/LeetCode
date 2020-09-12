import java.util.Stack;

class ValidParentheses {
    public boolean isValid(String s) {
        boolean check=true;
    	Stack<Character> stack = new Stack<>();
    	int length=s.length();
    	for(int i=0;i<length;i++) {
    		if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[') stack.push(s.charAt(i));
    		else {
    			char c;
    			if(!stack.isEmpty()) {
    				c= stack.pop();
    				switch(c) {
    				case '[' :
    				if(s.charAt(i)==']') break;
    				else check=false;
    				case '{' :
    				if(s.charAt(i)=='}') break;
    				else check=false;
    				case '(' :
    				if(s.charAt(i)==')') break;
    				else check=false;
    				default : check=false;
    				}
    			}
    			else check=false;
    		}
    		if(check==false) break;
    	}
    	if(!stack.isEmpty()) check=false;
    	
        return check;
    }
}
/*
문자열의 length를 측정
length만큼 for문 돌리기, 돌리다 false면 break
stack 이용해서
여는 괄호 나오면 push
닫는 괄호 나오면 pop
둘이 불일치하면 false

length만큼 다 돌았는데 stack이 비어있지 않다 -> false
*/