package lesson7;

public class MyTable {

	private Entry[] entries;

	public MyTable() {
		entries = new Entry[26];
	}

	public String get(char c) {

		// implement
		Entry ent = entries[(c - 97)];
		if (ent == null) {
			return null;
		}
		return ent.value;

	}

	public void add(char cha, String strin) {
		// implement
		int ind = 0;
		ind = (cha - 97);
		Entry en = new Entry(strin, cha);
		entries[ind] = en;

	}

	public String toString() {
		// implement
		String output = "";
		for (Entry ent : entries) {
			if (ent == null) {

				output += "";
			} else {
				output += ent.toString() + "\n";
			}
		}
		return output.trim();

	}

	private class Entry {
		String value;
		char chr;

		Entry(String str, char ch) {
			// implement
			this.value = str;
			this.chr = ch;

		}

		public String toString() {
			if (value == null)
				return "";
			else
				return chr + "->" + value;

		}
	}

}
