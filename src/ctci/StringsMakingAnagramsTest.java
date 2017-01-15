package ctci;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StringsMakingAnagramsTest {

	public static String str0 = "fcrxzwscanmligyxyvym";
	public static String str00 = "jxwtrhvujlmrpdoqbisbwhmgpmeoke";
	public static int op0 = 30;

	@Test
	public void test() {
		assertTrue(StringsMakingAnagrams.hashSimplified(str0, str00) == op0);
	}

}
