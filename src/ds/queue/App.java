package ds.queue;

public class App {
	public static void main(String[] args) {
		Queue queue = new Queue(5);
		
		for(int i = 0; i < 10; ++i) {
			queue.insert(i);
		}
		
		for(int i = 0; i < 10; ++i) {
			System.out.println(queue.remove());
		}
 	}
}
