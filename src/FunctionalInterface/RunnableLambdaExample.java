package FunctionalInterface;

public class RunnableLambdaExample {
	public static void main(String[] args) {
		// Before java 8

		Runnable t1 = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Thread -1");
			}
		};
		new Thread(t1).start();
		// after java 8
		Runnable t2 = () -> System.out.println("Thread -2");

		new Thread(t2).start();

		// Example 2

		// before java 8
		new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Thread -3");
			}
		}).start();

		// after java 8

		new Thread(() -> {
			System.out.println("Thread -4");
			System.out.println("Thread -5");
		}).start();
	}
}
