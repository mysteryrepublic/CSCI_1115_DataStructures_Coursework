
public class GenericQueue_TestClass {
	public static void main(String args[]) {
		GenericQueue queue = new GenericQueue<>();
		queue.enqueue("Durga");
		System.out.println( queue);
		queue.enqueue("Freya");
		System.out.println(queue);
		queue.enqueue("Anat");
		queue.enqueue("Nike");
		System.out.println(queue);
		System.out.println("Dequeue: " +queue.dequeue());
		System.out.println("Dequeue: " +queue.dequeue());
		System.out.println(queue);
	}
}
