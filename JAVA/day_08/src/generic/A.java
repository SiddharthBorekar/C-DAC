package generic;

public class A <T>{
	T t;
	public void add(T t) {		//this 'T' is can take any datatype as any input.
		this.t = t;
	}
	public T getT() {
		return t;
	}
	public static void main(String[] args) {
		A<Integer> a = new A<Integer>();
		A<Object> a1 = new A<Object>();
		A<String> a2 = new A<String>();
		a2.add("sidd");
		a.add(12);
		a1.add(a);
		
		System.out.println(a.getT());
		System.out.println(a1.getT());
		System.out.println(a.getT());
	}
}
