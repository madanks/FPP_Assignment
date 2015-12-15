package lesson11;

import java.io.IOException;
import java.util.Scanner;

class PersonItem { // (could have more data)
	private String email; // data item (key)
	private String name;

	// --------------------------------------------------------------
	public PersonItem(String ii, String v) // constructor
	{
		email = ii;
		name = v;
	}

	// --------------------------------------------------------------
	public String getKey() {
		return email;
	}

	public String getValue() {
		return name;
	}
	// --------------------------------------------------------------
} // end class DataItem
	////////////////////////////////////////////////////////////////

class HashTable {
	private PersonItem[] hashArray; // array holds hash table
	private int arraySize;
	private PersonItem nonItem; // for deleted items
	// -------------------------------------------------------------

	public HashTable(int size) // constructor
	{
		arraySize = size;
		hashArray = new PersonItem[arraySize];
		nonItem = null; // deleted item key is -1
	}

	// -------------------------------------------------------------
	public void displayTable() {
		System.out.println("Table: ");
		for (int j = 0; j < arraySize; j++) {
			if (hashArray[j] != null)
				System.out.println("Index : " + j + " " + hashArray[j].getKey() + " " + hashArray[j].getValue());
			else
				System.out.println("Index : " + j + " " + "**");
		}
		System.out.println("");
	}

	// -------------------------------------------------------------
	public int hashFunc(String key) {
		
		int has=key.hashCode();
		return key.hashCode() % arraySize; // hash function
	}

	// -------------------------------------------------------------
	public void insert(String key, String v) // insert a DataItem
	// (assumes table not full)
	{
		// extract key
		int hashVal = hashFunc(key); // hash the key
										// until empty cell
		// an index have some data and not match with existing key, it find next
		// vacant position
		while (hashArray[hashVal] != null && hashArray[hashVal].getKey() != key) {
			++hashVal; // go to next cell
			hashVal %= arraySize; // wraparound if necessary
		}
		PersonItem obj = new PersonItem(key, v);
		hashArray[hashVal] = obj; // insert item
	} // end insert()
		// -------------------------------------------------------------

	public PersonItem delete(String key) // delete a DataItem
	{
		int hashVal = hashFunc(key); // hash the key

		while (hashArray[hashVal] != null) // until empty cell,
		{ // found the key?
			if (hashArray[hashVal].getKey().equals(key)) {
				PersonItem temp = hashArray[hashVal]; // save item
				hashArray[hashVal] = nonItem; // delete item
				return temp; // return item
			}
			++hashVal; // go to next cell
			hashVal %= arraySize; // wraparound if necessary
		}
		return null; // can't find item
	} // end delete()
		// -------------------------------------------------------------

	public boolean find(String key) // find item with key
	{
		int hashVal = hashFunc(key); // hash the key

		while (hashArray[hashVal] != null) // until empty cell,
		{ // found the key?
			if (hashArray[hashVal].getKey().equals(key))
				return true; // yes, return item
			++hashVal; // go to next cell
			hashVal %= arraySize; // wraparound if necessary
		}
		return false; // can't find item
	}
	// -------------------------------------------------------------
} // end class HashTable
	////////////////////////////////////////////////////////////////

public class Question2 {

	public static void main(String[] args) throws IOException {
		String aKey;
		String value;

		Scanner in = new Scanner(System.in);
		System.out.print("Enter size of hash table: ");
		int size = in.nextInt();

		HashTable theHashTable = new HashTable(size);

		theHashTable.insert("1", "FPP");
		theHashTable.insert("2", "Java");
		theHashTable.insert("3", "SE");
		theHashTable.insert("4", "C#");

		while (true) // interact with user
		{
			System.out.print("Enter first letter of ");
			System.out.print("show, insert, delete, or find: ");
			char choice = in.next().charAt(0); // Read a Char from the console
			switch (choice) {
			case 's':
				theHashTable.displayTable();
				break;
			case 'i':
				System.out.print("Enter key and value to insert: ");
				aKey = in.next();
				value = in.next();
				theHashTable.insert(aKey, value);
				break;
			case 'd':
				System.out.print("Enter key value to delete: ");
				aKey = in.next();
				theHashTable.delete(aKey);
				break;
			case 'f':
				System.out.print("Enter key value to find: ");
				aKey = in.next();
				System.out.println("Key Found status" + theHashTable.find(aKey));
				break;
			default:
				System.out.print("Invalid entry\n");
			} // end switch
		} // end while
	} // end main()

}

/*Enter size of hash table: 7
Enter first letter of show, insert, delete, or find: s
Table: 
Index : 0 1 FPP
Index : 1 2 Java
Index : 2 3 SE
Index : 3 4 C#
Index : 4 **
Index : 5 **
Index : 6 **

Enter first letter of show, insert, delete, or find: i
Enter key and value to insert: 5
spring
Enter first letter of show, insert, delete, or find: s
Table: 
Index : 0 1 FPP
Index : 1 2 Java
Index : 2 3 SE
Index : 3 4 C#
Index : 4 5 spring
Index : 5 **
Index : 6 **

Enter first letter of show, insert, delete, or find: d
Enter key value to delete: 5
Enter first letter of show, insert, delete, or find: s
Table: 
Index : 0 1 FPP
Index : 1 2 Java
Index : 2 3 SE
Index : 3 4 C#
Index : 4 **
Index : 5 **
Index : 6 **

Enter first letter of show, insert, delete, or find: f
Enter key value to find: 4
Key Found statustrue
Enter first letter of show, insert, delete, or find:*/
