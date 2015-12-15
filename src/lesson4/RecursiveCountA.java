package lesson4;

public class RecursiveCountA {

	public static void main(String[] args) {
		String str = "My name is Khan and i am not a terrorist";
		System.out.println(CounterRec(str));

	}

	public static int CounterRec(String str) {
		
		if ( str.length() ==0) {
			return 0;
		} 
		else if  (str.charAt(0) == 'a') 
		{
				return 1+CounterRec(str.substring(1));
				
		}
		else {
				 return CounterRec(str.substring(1));
			}
		}

}
