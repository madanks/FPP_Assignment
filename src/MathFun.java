import java.util.Arrays;

public class MathFun {
	

		public static void main(String[] args) {
			int[] array = { 1, 4, 5, 6, 2, 5, 7, 8 };
			double s = sum(array);
			System.out.println("Sum of the integer of the array is:" + s);
			double m = s / array.length;
			System.out.println("Mean of the array is:" + m);
			int[] arr= arrayShort(array);
			String newString = Arrays.toString(arr);
			System.out.println("After Sorting the array:" +newString);
			System.out.println("Higest number :"+ arr[arr.length-1]);
			System.out.println("Smallest number: "+arr[0]);
			float area=findArea(5f);
			System.out.printf("Area of Circle :%.2f",area);
			

		}

		private static float findArea(float d) {
			return (float) (d*d*Math.PI);
		}

		private static int[] arrayShort(int[] array) {
			
			int[] arr= array;
			for(int i=0;i<array.length;i++)
			{
				for(int j=0;j<array.length;j++)
				{
					if(array[i]<array[j])
					{
						int temp=array[i];
						array[i]=array[j];
						array[j]=temp;
					}
					
				}
			}
			return arr;
		}

		private static int sum(int[] array) {
			int sum = 0;
			for (int i = 0; i < array.length; i++) {
				sum += array[i];
			}
			return sum;
		}

		

	}

