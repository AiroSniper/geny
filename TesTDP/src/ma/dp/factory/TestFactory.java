package ma.dp.factory;

public class TestFactory {
	
	Factory  fa1=new FactoryA1();
	
	Factory  fa2=new FactoryA2();
	
	A a1=fa1.CreateA();
	A a2=fa2.CreateA();

}
