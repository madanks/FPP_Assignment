package lesson9;

public class Q1 {

	public static void main(String[] args) {
		PriorityQueue pq = new PriorityQueue();
		pq.add(3);
		pq.add(9);
		pq.add(5);
		System.out.println(pq.peek());
		System.out.println(pq.remove());
		System.out.println(pq);

	}

}

class Node {
	int num;
	Node next;

	public Node(int num, Node next) {
		this.num = num;
		this.next = next;

	}

	public String toString() {
		return "Number:" + num;
	}

}

class PriorityQueue {
	Node header;

	public PriorityQueue() {
		header = null;

	}

	public void add(int x) {
		Node n;
		boolean flag = false;
		if (header == null) {
			n = new Node(x, null);
			header = n;
		} else {
			Node previous = null;
			Node head = header;
			while (head != null) {
				if (head.num > x) {
					flag = true;
					n = new Node(x, head);
					if (header.num > x) {
						header = n;
					}
				}
				previous = head;
				head = head.next;
			}
			if (!flag) {
				n = new Node(x, null);
				previous.next = n;
			}
		}

	}

	public Node remove() {
		if (!isEmpty()) {
			Node nn = header.next;
			Node temp = header;
			header.next = null;
			header = nn;
			return temp;

		}
		return null;

	}

	boolean isEmpty() {
		if (header == null)

		{
			return true;
		}
		return false;
	}

	int size() {
		Node temp = header;
		int count = 0;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}

	public Node peek() {
		if (!isEmpty()) {
			return header;

		}
		return null;

	}

	public String toString() {
		Node temp = header;
		String str = "";
		while (temp != null) {
			str = str + "" + temp.toString();
			temp = temp.next;
		}
		return str;
	}

}

/*Output

Number:3
Number:3
Number:9*/