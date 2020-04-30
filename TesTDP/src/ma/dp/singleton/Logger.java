package ma.dp.singleton;

public class Logger {

	private int a;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	private static Logger lg = null;

	private Logger() {
	}

	public static Logger getInstance() {

		if (lg == null)
			lg = new Logger();
		return lg;

	}

	public void showmsg(String msg) {
		System.out.println(msg);
	}

}
