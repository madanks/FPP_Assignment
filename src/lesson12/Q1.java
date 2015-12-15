package lesson12;

public class Q1 {

	public static void main(String[] args) {
		int numer[] = { 4, 8, 16, 32, 64, 128, 256, 512 };
		int denom[] = { 2, 0, 4, 4, 0, 8 };
			for(int i=0;i<numer.length;i++)
			{
				try
				{
				 int m=numer[i]/denom[i];
				}
				catch(ArrayIndexOutOfBoundsException e)
				{
					System.out.println("Array Index Out of Bound");
				}
				catch (ArithmeticException e) {
					
					System.out.println("Arithmetic Exception");
				}
				finally
				{
					System.out.println("finally block");
				}
			}
	}

}

/*Output

finally block
Arithmetic Exception
finally block
finally block
finally block
Arithmetic Exception
finally block
finally block
Array Index Out of Bound
finally block
Array Index Out of Bound
finally block*/
