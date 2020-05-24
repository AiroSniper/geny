package ma.dp.AbstractFactory;

public class Factory1 implements Factory {

	// 1
	private static Factory1 f = null;

	// 2
	private Factory1() {

	}

	// 3

	public static Factory1 getInstance() {

		if (f == null)
			f = new Factory1();

		return f;
	}

	@Override
	public A CreateA() {
		// TODO Auto-generated method stub
		return new A1();
	}

	@Override
	public B CreateB() {
		// TODO Auto-generated method stub
		return new B1();
	}

}
