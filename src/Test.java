import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;

public class Test {

	public static void main(String[] args) {
		/*
		 * Cube C = new Cube(); C.getdata(10, 20, 30);
		 * 
		 * int b1 = C.area(); System.out.println("Area of Square: " + b1);
		 * 
		 * int b2 = C.volume(); System.out.println("Volume of Cube: " + b2);
		 */
/*		Queue<String> queue = new LinkedList<String>();
		queue.offer("Java");
		queue.offer("DotNet");
		queue.offer("PHP");
		queue.offer("HTML");
		Iterator i = queue.iterator();
		//System.out.println(i);
		i.next();
		i.next();
		i.remove();
		System.out.println(i.next());*/
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		System.out.println(a.get(0));
		System.out.println(java.util.Collections.binarySearch(a,2));
		System.out.println(a.get(0));
		

	}

}
