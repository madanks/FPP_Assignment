import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;


public class Function {
	

		public void StringToChracter(String a)
		{
			char[] c = null;
			
			for(int i=0;i<a.length();i++)
			{
				c[i]=a.charAt(i);
			}
		}
		public void subString(String a,int beginindex)
		{
			System.out.println(a.substring(beginindex));
		}
		
		public void copyString(String a,String b)
		{
		
			a=b;
			System.out.println("a is cpied to b and a is now  "+a);	
		}
		public void concat(String a,String b)
		{
			System.out.println("sum is"+(a+b));
		}
		public void Stringlength(String a)
		{
			System.out.println(a.length());
		}

}
