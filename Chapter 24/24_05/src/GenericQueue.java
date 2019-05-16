/*Shannon Vogelesang
 * 05-16-2019
 * Description: (Implement GenericQueue using inheritance) In Section 24.5, Stacks, and Queues, GenericQueue is implemented using 
 * composition. Define a new queue class that extends java.util.LinkedList
 * */
public class GenericQueue<E> extends java.util.LinkedList {
	public void enqueue(E e) {
		addLast(e);
	}
	public E dequeue() {
		return (E) removeFirst();
	}
	public int getSize() {
		return size();
	}
	@Override
	public String toString() {
		return "Queue: " + super.toString();
	}
}