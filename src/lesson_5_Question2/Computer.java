package lesson_5_Question2;

public class Computer {
	private String manufacturer;
	private String processor;
	private int ramSize;
	private int diskSize;
	private double processorSpeed;

	public Computer(String manufacturer, String processor, int ramSize, int diskSize, double processorSpeed) {
		this.manufacturer = manufacturer;
		this.processor = processor;
		this.ramSize = ramSize;
		this.diskSize = diskSize;
		this.processorSpeed = processorSpeed;
	}

	public int getRamSize() {
		return ramSize;
	}

	public int getDiskSize() {
		return diskSize;
	}

	public double getProcessorSpeed() {
		return processorSpeed;
	}

	public double ComputePower() {
		return ramSize * processorSpeed;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;

		}
		if (!(obj instanceof Computer)) {
			return false;
		}
		Computer comp = (Computer) obj;

		boolean bool = this.manufacturer.equals(comp.manufacturer) && this.processor.equals(comp.processor)
				&& this.ramSize == comp.ramSize && this.diskSize == comp.diskSize
				&& this.processorSpeed == comp.processorSpeed;
		return bool;
	}

	@Override
	public int hashCode() {
		int prime = 5;
		int result = 3;
		result = (result * prime) +manufacturer.hashCode() + processor.hashCode()
				+ new Double(processorSpeed).hashCode() + new Integer(ramSize).hashCode()
				+ new Integer(diskSize).hashCode();
		return prime;

	}

}