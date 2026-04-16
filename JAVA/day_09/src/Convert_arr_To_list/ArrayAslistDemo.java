package Convert_arr_To_list;
import java.util.Arrays;
import java.util.List;
public class ArrayAslistDemo {
	public static void main(String[] args) {
		Character ch[] = {'a','A','b','B','c','C'};
		List list = Arrays.asList(ch);
		
		list.set(1,'S');
		list.forEach(x -> {System.out.println(x);});
		
//		list.add("N");
//		System.out.println(list);
		
//		list.set(0,"MNO");
//		System.out.println(list);  //this create eror becuse we create character list and passing siting on 0index this is noit accepted in list 
									//but we can acchive this through Arraylist.
	}
}
