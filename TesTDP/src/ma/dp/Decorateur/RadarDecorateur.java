package ma.dp.Decorateur;

public class RadarDecorateur extends VoitureDecorateur {

	public RadarDecorateur(Voiture v) {
		this.voiture = v;
		this.setDesc(this.voiture.getDesc()+ " Radar ");
		this.setPrix(this.voiture.getPrix() + 1500);
	}

}
