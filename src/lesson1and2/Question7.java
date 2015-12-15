package lesson1and2;

import java.util.Scanner;

public class Question7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.printf("Enter the weight: ");
		double weight = scan.nextDouble();
		scan = new Scanner(System.in);
		System.out.printf(
				"Enter the planet number to find weight in that planet: \n1.Venus\n2.Mars\n3.Jupiter\n4.Saturn\n5.Uranus\n6.Naptune\n");
		int opt = scan.nextInt();
		switch (opt) {
		case 1:
			System.out.println(" Your weight in Venus is :" + weight * 0.78);
			break;
		case 2:
			System.out.println(" Your weight in Mars is :" + weight * 0.39);
			break;
		case 3:
			System.out.println(" Your weight in Jupiter is :" + weight * 2.65);
			break;
		case 4:
			System.out.println(" Your weight in Saturn is :" + weight * 1.17);
			break;
		case 5:
			System.out.println(" Your weight in Uranus is :" + weight * 1.05);
			break;
		case 6:
			System.out.println(" Your weight in Naptune is :" + weight * 1.23);
			break;
		default:
			System.out.println(" Sorry Your Input is wrong please try again");

		}
	}

}
/*Output*/

/*Enter the weight: 1
Enter the planet number to find weight in that planet: 
1.Venus
2.Mars
3.Jupiter
4.Saturn
5.Uranus
6.Naptune
2
 Your weight in Mars is :0.39*/
