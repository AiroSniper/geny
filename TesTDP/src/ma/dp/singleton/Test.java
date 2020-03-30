package ma.dp.singleton;

public class Test {

	public static void main(String[] args) {

		Logger l =Logger.getInstance();

		System.out.println(l.toString());

		Logger l2 =Logger.getInstance();

		System.out.println(l2.toString());

	}

}
