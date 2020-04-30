package ma.dp.Observateur;

public class TestObservateur {

	public static void main(String[] args) {
		
		
		MinistreSante ministreSante2;
		
		MinistreSante ministreSante=new MinistreSante();
		
		TV med1tv=new TV();
		
		Journal SABAH=new Journal();
		
		
		ministreSante.addObserver(med1tv);
		ministreSante.addObserver(SABAH);
		
		
		ministreSante.setNbrConvid19(200);
		
		
		
	}

}
