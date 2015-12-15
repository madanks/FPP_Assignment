
public class Student {
	private int id;
	private String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {

		String s = "{" + this.name + "," + this.id + "}";
		return s;
	}
	

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}


	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (!(obj instanceof Student))
			return false;
		Student s = (Student) obj;
		if (this.getId() == (s.getId()) && this.getName().equals(s.getName())) {
			return true;
		}
		return false;
	}

}
