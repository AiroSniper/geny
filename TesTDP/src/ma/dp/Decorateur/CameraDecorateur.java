package ma.dp.Decorateur;

public class CameraDecorateur extends VoitureDecorateur {

	public CameraDecorateur(Voiture v) {
		this.voiture = v;
		this.setDesc(this.voiture.getDesc()+ " Camera ");
		this.setPrix(this.voiture.getPrix() + 2000);
	}

}
