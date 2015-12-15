
public class Point {
	

		int a;
		int b;
		public Point()
		{
			a=0;
			b=0;
		}
		public Point(int a,int b)
		{
			this.a=a;
			this.b=b;
		}
		public int geta() {
			return a;
		}
		public void seta(int a) {
			this.a = a;
		}
		public int getb() {
			return b;
		}
		public void setb(int b) {
			this.b = b;
		}
		
		public void setab(int a,int b)
		{
			this.a=a;
			this.b=b;
			
		}
		
		public String toString()
		{
			return ("("+a+","+b+")");
		}
		public int distance(int a,int b)
		{
			return Math.abs(a-b);
		}
	}

