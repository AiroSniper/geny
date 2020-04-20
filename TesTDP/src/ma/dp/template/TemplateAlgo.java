package ma.dp.template;

public abstract class TemplateAlgo {

	public int calcule(int a, int b) {

		int c = 0;
		if (a > b)
			c = algoStep1();
		c = c + algoStep2();

		return c;

	}

	protected abstract int algoStep2();

	protected abstract int algoStep1();

}
