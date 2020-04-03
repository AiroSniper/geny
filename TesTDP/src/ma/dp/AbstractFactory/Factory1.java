package ma.dp.AbstractFactory;

public class Factory1 implements Factory {

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
