import java.util.Stack;

class MinStack {
	Stack<Integer> stack=new Stack<Integer>();
	int min=Integer.MAX_VALUE;
	
	public MinStack() {
	}
        
	public void push(int x) {
		if(this.min>=x) {
			stack.push(min);
			this.min=x;
			stack.push(x);
		}
		else stack.push(x);
	}
        
	public void pop() {
		if(stack.peek()==min) {
			this.stack.pop();
			min=this.stack.pop();
		}
        else stack.pop();
	}
        
	public int top() {
		return stack.peek();
	}
        
	public int getMin() {
		return min;
	}
}

/*
155. Min Stack
https://leetcode.com/problems/min-stack/

Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
getMin() -- Retrieve the minimum element in the stack.


Key Point!
when min value is changed, push previous min value
if min value is popped, do pop operation(second min). this is new min value
*/