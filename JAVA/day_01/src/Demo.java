public class Demo{
	public static void main(String[] args) {
		byte b = 127; //256
		int n = 128;
		b = (byte) n;  	//Explict casting
		System.out.println(b);
		n = b; 			//implict casting

		byte b1 = 10;
		byte b2 = 20;
		int i = b1 * b2;
		System.out.println(i);

		float f = 10.252f;
		float avg = (float) 5/2;
		System.out.println("Avg = "+avg);
		
//		n = n+1;
//		n++;
//		n += 1;X

//		System.out.println(10/0);   	//Infinity
		System.out.println(0.0/0.0);	//NAN
		
		int a = 0b101;
		System.out.println(a);
		
		
		int c = 11;
		int d = ++c;
		System.out.println(c+ " " +d);
		
		double no = 1_00_000;
		System.out.println(no);
	}
}