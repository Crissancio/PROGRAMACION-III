package aaa;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class main{
    public static void main(String[] args) {
        System.out.println("-------------------PILA-------------------");
		Stack< Integer > pila = new Stack<Integer>();
		pila.push(1);
		pila.push(4);
		pila.push(6);
		pila.push(5);
		pila.push(2);
		pila.push(10);
		System.out.println("pila: "+pila);
		System.out.println("peek(): "+pila.peek());
		System.out.println("pop(): "+pila.pop());
		System.out.println("pila: "+pila);
		System.out.println("isEmpty(): "+pila.isEmpty());
		
		System.out.println("-------------------COLA-------------------");
		Queue<Integer> cola = new LinkedList<Integer>();
		cola.offer(20);
		cola.offer(5);
		cola.offer(9);
		cola.offer(2);
		cola.offer(10);
		cola.offer(30);
		System.out.println("cola: "+cola);
		System.out.println("peek(): "+cola.peek());
		System.out.println("poll(): "+cola.poll());
		System.out.println("cola: "+cola);
		System.out.println("isEmpty(): "+cola.isEmpty());
		
		System.out.println("-------------------BI-COLA-------------------");
		Deque<Integer> bicola = new LinkedList<Integer>();
		bicola.offerFirst(5);
		bicola.offerFirst(4);
		bicola.offerFirst(3);
		bicola.offerLast(2);
		bicola.offerLast(1);
		bicola.offerLast(0);
		
		System.out.println("bicola: "+bicola);
		System.out.println("peekFirst(): "+bicola.peekFirst());
		System.out.println("peekLast(): "+bicola.peekLast());
		System.out.println("pollFirst(): "+ bicola.pollFirst());
		System.out.println("pollLast(): "+bicola.pollLast());
		System.out.println("bicola: "+bicola);
		System.out.println("isEmpty(): "+bicola.isEmpty());
    }
    /*
    Grupos
     * utlizar inteligencia artificail, redes neuronales
     * no usar librerias, puede ser en python o con java
     * programacion dinamica
     * grafos 
     * REALIZAR ALGO EN KOTLIN
     * 
     * */
}