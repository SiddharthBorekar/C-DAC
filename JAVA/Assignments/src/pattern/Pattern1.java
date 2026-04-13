package pattern;

public class Pattern1 {
	public static void main(String[] args) {
		
	//solid pattern
//		for(int i=1;i<=4;i++) {				//outer loop Row
//			for(int j=1;j<=5;j++) {			//inner loop column
//				System.out.print(" *");
//			}
//			System.out.println();
//		}
		
	//Hollow pattern
//		for(int i=1;i<=4;i++) {
//			for(int j=1;j<=5;j++) {
//				if(i==1 || i==4 || j==1 || j==5) {
//					System.out.print(" *");
//				}else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
		
		//half pyramid
//		for(int i=1;i<=4;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(" *");
//			}
//			System.out.println("  ");
//		}
		
		//inverted Half pyramid 
		
//		for(int i=4;i>=1;i--) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(" *");
//			}
//			System.out.println( );
//		}
		
		//que5
		//				*
		//			*	*
		//		*	*	*
		//	*	*	*	*
		
		for(int i=1;i<=4;i++) {
			
			for(int j=i;j<=4-i;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		//1
		//12
		//123
		//1234
		//12345
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}

//		for(int i=5;i>=1;i--) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
			
		//floyd's Trangle
		//1 
		//2 3 
		//4 5 6 
		//7 8 9 10 
		//11 12 13 14 15 
		
//		int count = 0;
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=i;j++) {
//				count ++;
//				System.out.print(count+" ");
//			}
//			System.out.println();
//		}
		
		
		//1
		//01
		//101
		//0101
		//10101
		
//		for(int i=1;i<=5;i++){
//			for(int j=1;j<=i;j++){
//				int sum = i+j;
//				if(sum % 2 == 0) {
//					System.out.print("1");
//				}else {
//					System.out.print("0");
//				}
//			}
//			System.out.println();
//		}
		
	}
}

