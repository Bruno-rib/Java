package Intermediate;

import java.util.PriorityQueue;

public class queue15 {
	public static void main (String[] args) {
		
		PriorityQueue<String> q = new PriorityQueue<String>();
		
		q.offer("first");
		q.offer("second");
		q.offer("third");
		
		System.out.printf("%s ", q);
		System.out.println();
		
		System.out.printf("%s ", q.peek());
		System.out.println();
		
		q.poll();
		System.out.printf("%s ", q);
		
	}
}
