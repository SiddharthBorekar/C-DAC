package stringClass;

public class Test2 {
	public static void main(String[] args) {
		String s1 = "Java";
		System.out.println(s1);
		s1 = s1.concat(" Programming");
		System.out.println(s1);
		String s2 = new String("Infoway");
		System.out.println(s2);
		s2.concat("Technology");
		System.out.println(s2);
		
		System.out.println(s1.length());
		String s3 = "java";
		String s4 = " Java";
		String s5 = "Java";
		
		System.out.println(s1 == s3);
		System.out.println(s2 == s4);
		System.out.println(s3 == s4);
		System.out.println(s1 == s5);
		
		System.out.println(s1.compareTo(s4));
		System.out.println(s3.compareToIgnoreCase(s5));
		System.out.println(s1.compareTo(s5));  //if value is same it return  else return Ascii value
		
		s1.charAt(1);
		System.out.println(s1.charAt(1));
		System.out.println(s1.endsWith("a"));
		//s1.contains(s5);
		System.out.println(s1.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s3));
		
		//s1.ToUppercase();
		//s2.TolowerCase();
		System.out.println(s4.length());
		System.out.println(s4.trim().length());
		
		System.out.println(s1.substring(5,16));
		
}
}
