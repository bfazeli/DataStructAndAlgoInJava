package ds.stack;

public class App {

	public static void main(String[] args) {
		Stack stack = new Stack(10);
		for (int i = 0; i < 15; i++) {
			stack.push(i);
		}
		
		while(!stack.isEmpty()) {
			long val = stack.pop();
			System.out.println(val);
		}
	}
}
