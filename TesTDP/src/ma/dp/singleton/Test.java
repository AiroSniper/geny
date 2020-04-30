package ma.dp.singleton;

public class Test {

	public static void main(String[] args) {

		Logger l =Logger.getInstance();

		System.out.println(l.toString());

		Logger l2 =Logger.getInstance();

		
		
		l2.setA(15);
		System.out.println(l2.toString());

	}

}
