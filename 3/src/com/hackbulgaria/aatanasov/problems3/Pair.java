package com.hackbulgaria.aatanasov.problems3;

public class Pair {
	@SuppressWarnings("unused")
	private Pair() {}
	public Pair (Object obj1, Object obj2) {
		this.obj1 = obj1;
		this.obj2 = obj2;
	}
		
	private Object obj1;
	
	private Object obj2;
	
	public Object getObj2() {
		return obj2;
	}
	
	public void setObj2(Object obj2) {
		this.obj2 = obj2;
	}
	
	public Object getObj1() {
		return obj1;
	}
	
	public void setObj1(Object obj1) {
		this.obj1 = obj1;
	}
	
	@Override
	public String toString() {
		
		return obj1.equals(obj2) ? "Equals" : "Not Equals";
	}
}
