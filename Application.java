/**
    A class to implement and test a waiting queue.
    @author Brian Johnston
    @version 1.0
*/

public class Application {

	public static void main(String[] args) {
		
		Queue<String> testQ = new Queue<String>();
		
		Node<String> n1 = new Node<String>();
		Node<String> n2 = new Node<String>();
		Node<String> n3 = new Node<String>();
		Node<String> n4 = new Node<String>();
		Node<String> n5 = new Node<String>();
		Node<String> n6 = new Node<String>();
		
		n1.setData("Bill");
		n2.setData("Alice");
		n3.setData("Bob");
		n4.setData("Jane");
		n5.setData("Hamad");
		n6.setData("Jim");
		
		enQ(testQ,n1);
		enQ(testQ,n2);
		enQ(testQ,n3);//initial scenario setup completed
		
		deQ(testQ);//A customer is served.
		
		enQ(testQ,n4);//Jane arrives.
		
		enQ(testQ,n5);//Hamad arrives.
		
		deQ(testQ);
		deQ(testQ);//Two customers are served.
		
		enQ(testQ,n6);//Jim arrives.
		
		deQ(testQ);//Another customer arrives.
		
		deQ(testQ);//Another customer arrives.
		
	}
	
	/**Method to dequeue, print the person being served, and then print the current queue.
	 * @param q  the queue to dequeue from.*/
	public static void deQ(Queue<String> q) {
		System.out.print(q.getFront().toString() + " has been served, and ");
		q.dequeue();
		if (q.isEmpty()==true) {
			System.out.println("the queue is now empty.");
		}
		else {
			System.out.print("the queue now is: ");
			Node<String> phold = q.getFront();
			
			System.out.print(phold.toString());
			for (int i = 0; i < q.size();i++) {
				phold = phold.nextNode;
				System.out.print(", " + phold.toString());
			}
			System.out.println("\n");
		}
	}
	
	/**Method to enqueue a specified Node into the queue, noting the data of the node and listing the current queue after.
	 * @param q  current queue
	 * @param n  node to enqueue*/
	public static void enQ(Queue<String> q,Node<String> n) {
		q.enqueue(n);
		System.out.print(n.toString() + " has arrived, making ");
		System.out.print("the current queue: ");
		
		Node<String> phold = q.getFront();
		
		System.out.print(phold.toString());
		for (int i = 0; i < q.size();i++) {
			phold = phold.nextNode;
			System.out.print(", " + phold.toString());
		}
		System.out.println("\n");
	}

}
