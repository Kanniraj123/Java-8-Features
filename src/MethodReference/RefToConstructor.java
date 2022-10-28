package MethodReference;

public class RefToConstructor {

	public static void main(String[] args) {
		iUser user = User :: new;
		User user1 = user.getName("Java 8");
		System.out.println(user1.getName());
	}

}
@FunctionalInterface
interface iUser{
	User getName(String name);
}
class User {
	String name;

	public User(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
