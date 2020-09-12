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
���ڿ��� length�� ����
length��ŭ for�� ������, ������ false�� break
stack �̿��ؼ�
���� ��ȣ ������ push
�ݴ� ��ȣ ������ pop
���� ����ġ�ϸ� false

length��ŭ �� ���Ҵµ� stack�� ������� �ʴ� -> false
*/