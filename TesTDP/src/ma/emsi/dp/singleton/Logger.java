package ma.emsi.dp.singleton;

public class Logger {
	
	  
	private static Logger lg = null;
	
	private Logger() {}
	
	
	public static Logger getInstance() {
		
		if (lg==null)
			lg=new Logger();
		return lg;
		
	}
	
	
		 public void showmsg(String msg)
	  {
		  System.out.println(msg);
	  }

}
