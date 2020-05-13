package ma.dp.adpater;

public class TestMain {

	public static void main(String[] args) {

		VideoPrejecteur vp = new VideoPrejecteur();

		vp.setVga(new AdapterHdmiToVga());
		
		vp.presentation();
	}

}
