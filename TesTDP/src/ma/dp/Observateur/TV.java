package ma.dp.Observateur;

import java.util.Observable;
import java.util.Observer;

public class TV  implements Observer{

	@Override
	public void update(Observable o, Object arg) {
	if(o instanceof MinistreSante) {
			
			System.out.println("TV: Notification recu MinistreSante");
			
			System.out.println("TV: Nbr Covid19 "+((MinistreSante)o).getNbrConvid19());
		}
	}

}
