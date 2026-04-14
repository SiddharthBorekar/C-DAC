package lambda;

public class HelloWorldLambda {
	public static void main(String[] args) {
		HelloWorldInterface h = () -> "HelloWorld";
		System.out.println(h.sayhello());
	}
}
