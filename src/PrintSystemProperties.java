import java.util.Properties;

public class PrintSystemProperties {

	public static void main(String[] args) {
		Properties pros = System.getProperties();
		pros.list(System.out);

		System.out.println(System.getProperty("java.version"));
		System.out.println("********************");
		System.setProperty("java.user.name", "Vishesh Thakur");
		System.out.println(System.getProperty("java.user.name"));
		System.out.println("********************");
		System.out.println(System.getProperty("java.home"));
		System.out.println("********************");
		System.out.println(System.getProperty("java.class.path"));
		System.out.println("********************");

	}

}
