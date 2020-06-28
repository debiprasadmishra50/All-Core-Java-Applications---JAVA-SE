package collectionFramework.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo 
{
	public static void main(String[] args) 
	{
		PriorityQueue<Integer> q = new PriorityQueue<Integer>();
		System.out.println(q.peek()); //null
		//System.out.println(q.element()); //if queue is empty throw a NoSuchElementException
		
		for(int i = 20; i <= 30; i++)
		{
			q.offer(i);
		}
		System.out.println(q); 
		System.out.println(q.poll()); //Remove 1st inserted element and return that element //20
		System.out.println(q);
		System.out.println(q.remove()); //removes the 1st element and return it
		System.out.println(q);
	}
}
