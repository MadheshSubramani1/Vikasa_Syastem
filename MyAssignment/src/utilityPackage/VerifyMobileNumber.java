package utilityPackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VerifyMobileNumber {
	public static boolean isValid(String s) {

		Pattern p = Pattern.compile("^[7-9][0-9]{9}");

		Matcher m = p.matcher(s);
		return (m.find() && m.group().equals(s));

	}
}