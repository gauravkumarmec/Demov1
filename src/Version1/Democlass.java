package Version1;

public class Democlass {

	public static void main (String[] args) {
		String s= "#$%&Abscd123654";
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
	}
}
