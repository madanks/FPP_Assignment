package lesson11;

import java.util.Arrays;
import java.util.HashMap;

class Course {

	private String CourseName;
	private String[] faculty;

	public Course(String courseName, String[] faculty) {
		CourseName = courseName;
		this.faculty = faculty;
	}

	public String getCourseName() {
		return CourseName;
	}

	public void setCourseName(String courseName) {
		CourseName = courseName;
	}

	public String[] getFaculty() {
		return faculty;
	}

	public void setFaculty(String[] faculty) {
		this.faculty = faculty;
	}

	@Override
	public String toString() {
		return "Course [CourseName=" + CourseName + ", faculty=" + Arrays.toString(faculty) + "]";
	}

}

class Question1 {
	public static void main(String[] args) {
		String[] faculty1 = { "Madan", "Govinda", "Haftom", "Prabhat", "Gunjan" };
		Course c1 = new Course("FPP", faculty1);
		String[] faculty2 = { "Rajiv", "Mulu", "Keshav", "prabin", "Bikram" };
		Course c2 = new Course("MPP", faculty2);
		HashMap<String, Course> courseMap = new HashMap<String, Course>();
		courseMap.put("CS390", c1);
		courseMap.put("CS380", c2);
		System.out.println(courseMap.get("CS390").toString());
		System.out.println(courseMap.get("CS380").toString());
		System.out.println(courseMap.containsKey("CS390"));
		System.out.println(courseMap.keySet().toString());
		for (String s : courseMap.keySet()) {
			System.out.println(courseMap.get(s).toString());
		}

		System.out.println(courseMap.toString());
		System.out.println(courseMap.size());
	}

}
/*
 * Output
 * 
 * Course [CourseName=FPP, faculty=[Madan, Govinda, Haftom, Prabhat, Gunjan]]
 * Course [CourseName=MPP, faculty=[Rajiv, Mulu, Keshav, prabin, Bikram]] true
 * [CS390, CS380] Course [CourseName=FPP, faculty=[Madan, Govinda, Haftom,
 * Prabhat, Gunjan]] Course [CourseName=MPP, faculty=[Rajiv, Mulu, Keshav,
 * prabin, Bikram]] {CS390=Course [CourseName=FPP, faculty=[Madan, Govinda,
 * Haftom, Prabhat, Gunjan]], CS380=Course [CourseName=MPP, faculty=[Rajiv,
 * Mulu, Keshav, prabin, Bikram]]} 2
 */
