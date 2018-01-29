import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexAlphaNumeric {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();

		names.add("VIshe09");
		names.add("VIshe09-*");
		names.add("09vishesh");
		String regex = "^[a-zA-Z0-9]+$";

		Pattern pattern = Pattern.compile(regex);

		for (String name : names) {
			Matcher matcher = pattern.matcher(name);
			System.out.println(matcher.matches());
		}

	}

}
