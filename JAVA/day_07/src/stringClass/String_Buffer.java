package stringClass;

public class String_Buffer {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("hello");
		System.out.println(sb.capacity());
		System.out.println(sb);
		sb.append(" world");
		System.out.println(sb);
//		sb.reverse();
//		System.out.println(sb);
		sb.replace(6, 11, "java17");  //first parameter is starting index 2nd last index "which world we have to replace"
		System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		sb.append("Hello Infoway technologies"+"Kothrud pune Maharashtra");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
	}
}
