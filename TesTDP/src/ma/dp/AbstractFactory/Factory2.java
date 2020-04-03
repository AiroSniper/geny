package ma.dp.AbstractFactory;

public class Factory2 implements Factory {

	@Override
	public A CreateA() {
		// TODO Auto-generated method stub
		return new A2();
	}

	@Override
	public B CreateB() {
		// TODO Auto-generated method stub
		return new B2();
	}

}
