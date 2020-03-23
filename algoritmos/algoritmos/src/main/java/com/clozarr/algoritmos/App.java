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
        System.out.println("Peek: " + queue.peek());
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.pop();
        queue.print();
        queue.push(4);
        queue.print();
        System.out.println("Peek: " + queue.peek());
        System.out.println(".. .:::: STACK ::::...");
        Stack<Integer> stack = new Stack<>();
        System.out.println("Peek: " + stack.peek());
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.pop();
        stack.print();
        stack.push(40);
        stack.print();
        System.out.println("Peek: " + stack.peek());
    }
}
