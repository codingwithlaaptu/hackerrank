package ctci;

import static org.junit.Assert.*;

import org.junit.Test;

public class RansomNotesTest {

	public static String strip0 = "give me one grand today night";
	public static String ransomeNote0 = "give one grand today";
	public static boolean op0 = true;

	public static String strip1 = "give me night";
	public static String ransomeNote1 = "give one grand today";
	public static boolean op1 = false;

	public static String strip2 = "give";
	public static String ransomeNote2 = "give";
	public static boolean op2 = false;

	public static String strip3 = "wi z ne we ebixk yvrd qrd ojckw q xe e bcco xb ieqym dwuu w dnapw achkt xqdhs nstms zmqu csqxi rim tvic arq fvjqx x su ty zl zmah y tv rkjq hpvpx ujj f i u fl iv n mnrvx tho diz k tidi gr ptkq z tho su diz yvrd dwuu dnapw xb arq xb mnrvx xe bcco qrd y ptkq rim fvjqx bcco q q wi i tidi gr mnrvx hpvpx tv f y mnrvx we fvjqx tv f wi ptkq ujj rim ebixk tho ptkq rkjq yvrd dwuu zl ujj zl qrd e ieqym";
	public static String ransomeNote3 = "dwuu tvic y dnapw ujj tidi nstms x xe achkt x su zmqu iv zmqu xb ojckw we fvjqx tvic tv ne rkjq diz tvic we rkjq nstms zmah ieqym zmah fl xb wi tho x z ty u i gr ptkq q su tho rim tv iv iv yvrd xe qrd y dnapw q zmah arq we ieqym su zl q xb arq rkjq q e xb zl ty fvjqx ptkq ieqym qrd y wi wi nstms diz dnapw zmah q ebixk su e xb q i mnrvx wi x x tidi w ojckw bcco e tv rkjq tho";
	public static boolean op3 = false;

	@Test
	public void test() {
		assertTrue(RansomNotes.canRansomNoteBeMade(strip0, ransomeNote0));
		assertFalse(RansomNotes.canRansomNoteBeMade(strip1, ransomeNote1));
		assertTrue(RansomNotes.canRansomNoteBeMade(strip2, ransomeNote2));
		assertFalse(RansomNotes.canRansomNoteBeMade(strip3, ransomeNote3));
	}

}
