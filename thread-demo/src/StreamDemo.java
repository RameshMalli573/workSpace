import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamDemo {
	public static void main(String[] args) {
		List <Integer> list = new ArrayList<Integer>();
		list.add(-2);
		list.add(20);
		list.add(3);
		list.add(-6);
		list.add(5);
		
		Stream<Integer> s1 = list.stream();
		Stream<Integer> filtered = s1.filter((Integer arg) -> arg > 0);
		Optional <Integer> reducedSum = filtered.reduce((Integer arg1,Integer arg2) -> arg1 + arg2);
		
		System.out.println(reducedSum.get());
		
	}
}
