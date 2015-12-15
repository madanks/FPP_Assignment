package lesson_5_Question2;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		Computer comp1 = new Computer("DELL", "mmmm", 13, 13, 13.63);
		Computer comp2 = new Computer("DELL", "mmmm", 13, 13, 13.63);
		NoteBook nb = new NoteBook("Samsung", "I7 Processor", 2, 1, 2.8, 3, 4, 2.7, comp1);
		NoteBook nb1 = new NoteBook("Samsung", "I7 Processor", 2, 1, 2.8, 3, 4, 2.7, comp2);

		System.out.println("Speed of processor: " + nb.getProcessorSpeed());
		System.out.println("Power: " + nb.ComputePower());
		System.out.println(nb.hashCode());
		NoteBook nbc = (NoteBook) nb.clone();
		System.out.println(nb1.hashCode());
		System.out.println(nb.equals(nb1));
	}

}
/*
  output:
Speed of processor: 2.8
Power: 5.6
5
5
true
 */