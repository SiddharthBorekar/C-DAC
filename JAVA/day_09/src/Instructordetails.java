import java.util.List;
import java.util.Arrays;

public class Instructordetails {
	
		public static List <Instructor> getAll(){
			
		Instructor i1 = new Instructor ("Siddharth",23,"Male",false,
				Arrays.asList("C","C++",".Net"));
		
		Instructor i2 = new Instructor ("Aditya",25,"Male",false,
				Arrays.asList("Bsc","CBZ","Chemestry"));
		
		List <Instructor> list = Arrays.asList (i1,i2);
		
		return list;
		
	}		
}
 