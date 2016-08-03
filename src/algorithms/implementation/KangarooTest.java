package algorithms.implementation;

import static org.junit.Assert.assertThat;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

public class KangarooTest {

	@Test
	public void test() {
		assertThat(Kangaroo.doTheyMeet(0, 3, 4, 2), CoreMatchers.is("YES"));
		assertThat(Kangaroo.doTheyMeet(0, 2, 5, 3), CoreMatchers.is("NO"));
		assertThat(Kangaroo.doTheyMeet(14, 4, 98, 2), CoreMatchers.is("YES"));
		assertThat(Kangaroo.doTheyMeet(42, 3, 94, 2), CoreMatchers.is("YES"));
	}

}
