package ma.dp.AbstractFactory;

public class TestFactory {
	
	Factory  fa1=Factory1.getInstance();
	
	Factory  fa2=new Factory2();
	
	A a1=fa1.CreateA();
	A a2=fa2.CreateA();

}
