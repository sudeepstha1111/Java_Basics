package com.java.may;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		//PriorityQueue<String> pq = new PriorityQueue<String>();  // does not FIFO order 
		Deque<String> q = new ArrayDeque<String>();  // follows  FIFO order 

		q.add("E");
		q.add("B");
		q.add("D");
		q.add("I");
		q.add("F");
		q.add("Z");
		q.add("A");


		
		for(String a : q){
			System.out.println(a);
		}
		
	}

}
