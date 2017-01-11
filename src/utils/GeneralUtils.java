package utils;

public class GeneralUtils {

	public static int[] getIntArrFromString(String value) {
		if (value == null || value.length() == 0)
			return null;
		String[] valString = value.split("\\s");
		int n = valString.length;
		int[] intValues = new int[n];
		for (int i = 0; i < n; ++i)
			intValues[i] = Integer.valueOf(valString[i]);
		return intValues;
	}

	public static String getStringFromInt(int[] value) {
		if (value == null || value.length == 0)
			return "";
		int n = value.length;
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < n; ++i)
			stringBuilder.append(value[i] + " ");
		return stringBuilder.toString().trim();
	}

}
