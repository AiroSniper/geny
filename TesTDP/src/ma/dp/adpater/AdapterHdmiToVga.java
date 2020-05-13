package ma.dp.adpater;

public class AdapterHdmiToVga extends VGA {

	HDMI hdmi = new HDMI();

	public void ConnecttoVGA() {

		hdmi.ConnecttoHDMI();
	}

}
