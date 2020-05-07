package ma.dp.Decorateur;

public class TestDecorateur {

	public static void main(String[] args) {
	
		
		 Voiture captur=new SUV();
		 
		 System.out.println(captur.getDesc());
		 System.out.println(captur.getPrix()+" DH");
		 
		 
		 Voiture capturOption =new CameraDecorateur(new RadarDecorateur(new SUV()));

		 System.out.println("---------------------");
		 
		 System.out.println(capturOption.getDesc());
		 System.out.println(capturOption.getPrix()+" DH");
		 
		 
		 
		 
		 
	}

}
