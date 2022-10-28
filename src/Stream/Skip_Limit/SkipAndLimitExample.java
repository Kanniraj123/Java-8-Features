package Stream.Skip_Limit;

import java.util.Arrays;
import java.util.List;

public class SkipAndLimitExample {

	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("apple","orange","banana","mango","pinepple");
		
		//fruits.stream().limit(3).forEach(System.out :: println);
		fruits.stream().skip(3).forEach(System.out :: println);
		
		List<Integer> num = Arrays.asList(1,2,3,4,5);
		
//		int sum = num.stream().limit(3).reduce(0, (x,y) -> x+y);
		int sum = num.stream().skip(3).reduce(0, (x,y) -> x+y);
		System.out.println(sum);
		
		
	}

}
