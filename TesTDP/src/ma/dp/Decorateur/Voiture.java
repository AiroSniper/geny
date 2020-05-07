package ma.dp.Decorateur;

import java.io.Serializable;

public class Voiture implements Serializable{
	
		
	private static final long serialVersionUID = 102244477L;
		
	
	private String desc;
	private double prix;
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}

}
