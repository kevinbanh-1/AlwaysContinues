

public class MyStack {
	// stack is FILO
	// first in
	// last out
	private Object[] items;
	private int top;
	
	public MyStack(int size) {
		if(size < 1) {
			// FIXME maybe there's a better way
			size = 10;
		}
		top = 0;
		items = new Object[size];
	}
	
	public boolean isEmpty() {
		return top == 0 ;
	}
	
	public boolean isFull() {
		return top == items.length;
	}
	
	public Object pop(){
		if(isEmpty()) {
			return null;
		}
		Object r = items[top-1];
		--top;
		return r;
	}
	
	public boolean push(Object o) {
		if(isFull()) {
			return false;
		}
		items[top] = o;
		++top;
		return true;
	}
	
	public void displayElements() {
		for(int i = 0; i < top; ++i) {
			System.out.println(items[top-1-i]);
		}
	}
}

