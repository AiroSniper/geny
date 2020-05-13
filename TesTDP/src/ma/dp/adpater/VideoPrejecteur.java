package ma.dp.adpater;

public class VideoPrejecteur {
	
	VGA  vga;
	
	void presentation() {
	   vga.ConnecttoVGA();
	   System.out.println("Start -----");
		
	}

	public VGA getVga() {
		return vga;
	}

	public void setVga(VGA vga) {
		this.vga = vga;
	}
	
	

}
