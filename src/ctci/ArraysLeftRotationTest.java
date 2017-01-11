package ctci;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import utils.GeneralUtils;

public class ArraysLeftRotationTest {

	static String input0 = "1 2 3 4 5";
	static String output0 = "5 1 2 3 4";
	static int shift0 = 4;
	static String input1 = "41 73 89 7 10 1 59 58 84 77 77 97 58 1 86 58 26 10 86 51";
	static String output1 = "77 97 58 1 86 58 26 10 86 51 41 73 89 7 10 1 59 58 84 77";
	static int shift1 = 10;
	static String input2 = "431 397 149 275 556 362 852 789 601 357 516 575 670 507 127 888 284 405 806 27 495 879 976 467 342 356 908 750 769 947 425 643 754 396 653 595 108 75 347 394 935 252 683 966 553 724 629 567 93 494 693 965 328 187 728 389 70 288 509 252 449";
	static int shift2 = 48;
	static String output2 = "93 494 693 965 328 187 728 389 70 288 509 252 449 431 397 149 275 556 362 852 789 601 357 516 575 670 507 127 888 284 405 806 27 495 879 976 467 342 356 908 750 769 947 425 643 754 396 653 595 108 75 347 394 935 252 683 966 553 724 629 567";

	@Test
	public void test() {
		assertTrue(getLeftRotatedArray(input0, shift0,output0));
		assertTrue(getLeftRotatedArray(input1, shift1,output1));
		assertTrue(getLeftRotatedArray(input2, shift2,output2));
	}

	public boolean getLeftRotatedArray(String input, int leftShift, String expectedOutput) {
		int[] arr = GeneralUtils.getIntArrFromString(input);
		String generatedOutput = GeneralUtils
				.getStringFromInt(ArraysLeftRotation.arrayLeftRotation(arr, arr.length, leftShift));
		return generatedOutput.equals(expectedOutput);
	}

}
