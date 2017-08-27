package datastructure;

import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {

		 //* Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 //* Use For Each loop and while loop with Iterator to retrieve data.
		Queue<String> queue = new LinkedList<>();
		queue.add("shukanta good in math ");
		queue.add("he always busy");
		queue.remove();
		for(String n: queue){
			System.out.println(n);
		}


	}

}
