package ma.dp.Observateur;

import java.util.Observable;

public class MinistreSante extends Observable{
	
	private int nbrConvid19;

	public int getNbrConvid19() {
		return nbrConvid19;
	}

	public void setNbrConvid19(int nbrConvid19) {
		this.nbrConvid19 = nbrConvid19;
		this.setChanged();
		this.notifyObservers();
	}
	
	

}
