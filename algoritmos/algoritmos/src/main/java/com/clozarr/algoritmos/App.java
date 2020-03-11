package com.clozarr.algoritmos;

import com.clozarr.algoritmos.queue.Queue;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Queue<Integer> queue = new Queue<Integer>();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.pop();
        queue.printQueue();
        queue.push(4);
        queue.printQueue();
    }
}
