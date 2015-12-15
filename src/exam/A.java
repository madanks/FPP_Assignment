package exam;

public interface A {
public static void main(String[] args)
{
	String s= "Madan";
	System.out.println(reverse(s));
}
public static String reverse(String str)
{
	String temp="";
	if(str.length()==0)
	{
		return "";
	}
	else{
		System.out.println(str.charAt(0));
		
		return reverse(str.substring(1))+str.charAt(0)+temp;
	}
}

}
