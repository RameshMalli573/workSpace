import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestArrayList {
	@Test
	public void testArrayAdd() {
		List<Integer> list = new ArrayList<>();
		boolean flag = list.add(1);
		assertEquals(true,flag);
	}
}
