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
		
//		for(int i=1;i<=4;i++) {
//			
//			for(int j=i;j<=4 - i;j++) {
//				System.out.print("  ");
//			}
//														error
//			for(int j=1;j<=i;j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
	}
}

