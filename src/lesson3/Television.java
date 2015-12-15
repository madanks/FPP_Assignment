package lesson3;

public class Television {
	private final String MANUFACTURER;
	private final int SCREEN_SIZE;
	private boolean powerOn;
	private int channel = 1;
	private int volume = 0;

	public Television(String mANUFACTURER, int sCREEN_SIZE) {
		MANUFACTURER = mANUFACTURER;
		SCREEN_SIZE = sCREEN_SIZE;
	}

	public void powerOn() {
		powerOn = true;
		System.out.println("Turned on");
	}

	public void setChannel() {
		channel++;
	}

	public void getChannel() {
		System.out.println("Your are in channel: " + channel);
	}

	public void IncreaseVolume() {
		if (volume < 100)
			volume++;
		else
			System.out.println("your volume is already 0");
	}

	public void decreaseVolume() {
		if (volume > 0)
			volume--;
		else
			System.out.println("your volume is already 100");
	}

	public void getVolume() {
		System.out.println("Volume : " + volume);
	}

	public void getManufacturer() {
		System.out.println("Manufacturer: " + MANUFACTURER);
	}

	public void getSize() {
		System.out.println("Screen Size : " + SCREEN_SIZE);
	}

	public static void main(String[] args) {
		Television tel = new Television("Samsung", 17);
		tel.powerOn();
		tel.IncreaseVolume();
		tel.IncreaseVolume();
		tel.decreaseVolume();
		tel.getVolume();
		tel.setChannel();
		tel.getChannel();
		tel.getManufacturer();
		tel.getSize();

	}

}
/*Output*/
/*Turned on
Volume : 1
Your are in channel: 2
Manufacturer: Samsung
Screen Size : 17*/
