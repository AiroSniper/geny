package ma.dp.Observateur;

import java.util.Observable;
import java.util.Observer;

public class Journal implements Observer{

	@Override
	public void update(Observable o, Object arg) {
		
		if(o instanceof MinistreSante) {
			
			System.out.println("Journal: Notification recu MinistreSante");
			
			System.out.println("Journal: Nbr Covid19 "+((MinistreSante)o).getNbrConvid19());
		}
		
		
	}

}
