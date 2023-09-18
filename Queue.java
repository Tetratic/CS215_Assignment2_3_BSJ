/**
    A class to create and manipulate a waiting queue.
    @author Brian Johnston
    @version 1.0
*/
public class Queue<T> {

	public LinkedList<T> q;
	
	public Queue() {
		this.q = new LinkedList<T>();
	}
	
	/**Adds a new element to the back of the queue
	 * @param t  The node of the correct parameterized type to add to the queue.*/
	public void enqueue(Node<T> t) {
		this.q.addNode(t);

	}
	
	/**removes the first element of the queue and shifts all remaining elements towards the front by one.*/
	public void dequeue() {
		LinkedList<T> phold = new LinkedList<T>();
		Node<T> n = this.q.head;

		for (int i = this.q.length; i > 1; i--) {
			n = n.nextNode;//moves node to the next node in the queue.
			phold.addNode(n);//adds next node into the placeholder queue.
		}
		phold.addNode(q.tail);//adds final
		this.q.length--;
		this.q = phold; //stores new queue in q, essentially removing the head of the queue.
	}
	
	/**Gets the element in the first position of the queue
	 * @return  returns the Node in the first position*/
	public Node<T> getFront(){
		return this.q.head; 
	}
	
	/**Determines whether the queue is empty.
	 * @return  true if the first position is null, false otherwise.*/
	public boolean isEmpty() {
		return q.isEmpty();
	}
	
	/**Gets the size of the queue.
	 * @return  the integer size of the queue.*/
	public int size() {
		return q.length;
	}

	@Override
	public String toString() {
		return "Queue [q=" + q + "]";
	}
	
	
}
