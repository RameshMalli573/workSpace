package functional;

interface functionalInterface{
	void function();
}
class impl implements functionalInterface{
	public void function() {
		System.out.println("Sample INterface Called");
	}
}
public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		functionalInterface imp = () -> System.out.println("Sample Interface");
		imp.function();
	}

}
