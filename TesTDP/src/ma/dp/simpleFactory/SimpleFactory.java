package ma.dp.simpleFactory;

public class SimpleFactory {
	
	public static A CreerA(int a) {
		if (a==1)
			return new A1();
		if(a==2)
			return new A2();
		
		return null;
		
	}

}
