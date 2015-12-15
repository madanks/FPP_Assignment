
public class Cube extends Squar {
	int height;

	public void getdata(int x, int y, int z) {
		Set(x, y);
		height = z;
	}

	int volume() {
		return (getLength() * getBreadth() * height);
	}

}
