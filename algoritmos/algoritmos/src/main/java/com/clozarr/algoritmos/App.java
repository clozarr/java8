package com.clozarr.algoritmos;

import com.clozarr.algoritmos.queue.Queue;
import com.clozarr.algotirmos.stack.Stack;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	System.out.println("...:::: QUEUE ::::...");
        Queue<Integer> queue = new Queue<Integer>();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.pop();
        queue.printQueue();
        queue.push(4);
        queue.printQueue();
        System.out.println(".. .:::: STACK ::::...");
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.pop();
        stack.printStack();
        stack.push(40);
        stack.printStack();
    }
}
