import java.util.stream.IntStream;

public class Java7VsJava8Ex1 {

	public static void main(String[] args) {
		int total = 0;
		for(int i = 0;i <= 50;i ++) {
			total+=i;
		}
		System.out.println("Before java 8 "+ total);
		
		/*Java 8 feature*/
		int total1 = IntStream.rangeClosed(0, 50).sum();
		System.out.println("After java 8 "+total1);

	}

}
