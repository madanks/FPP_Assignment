package lesson9;

public class Q2 {
	public static void main(String ar[])
	{
	Queue queue=new Queue(4);
	queue.add(10);
	queue.add(12);
	queue.add(14);
	queue.add(16);
	System.out.println(queue);
	System.out.println(queue.remove());
	System.out.println(queue);
	System.out.println("peak elements is "+queue.peak());
	System.out.println("size of queue is :"+queue.size());
	}
}

class Queue {
	private int queue[];
	int front, rear, size, len;

	public Queue(int n) {
		front = -1;
		rear = -1;
		size = n;
		queue = new int[n];
		len = 0;
	}

	boolean isEmpty() {
		if (front == -1) {
			return true;
		}
		return false;
	}

	public void add(int n) {
		if (isEmpty()) {
			front = 0;
			queue[front] = n;
			rear = front;
			len++;
		} else {
			if (rear + 1 >= size) {
				System.out.println("index out of bound");
			} else {
				rear++;
				queue[rear] = n;
				len++;
			}
		}
	}

	int remove() {
		int a = -1;
		if (!isEmpty()) {
			
			len--;
			a=queue[front];
			if (rear == front)

			{
				rear=-1;
				front=-1;
			}
			else
			{
				front++;
			}
			
		}
		return a;

	}
	public int peak()
	{
		if(!isEmpty())
		{
			return queue[front];
		}
		return-1;
	}
	public int size()
	{
		return len;
	}
	public String toString()
	{
		if(isEmpty())
		{
			return "Empty";
		}
		else
		{
			String str="";
			for(int i=front;i<=rear;i++)
			{
				str=str+queue[i]+"\t";
			}
			return str;
		}
	}
}

/*Output

10	12	14	16	
10
12	14	16	
peak elements is 12
size of queue is :3*/