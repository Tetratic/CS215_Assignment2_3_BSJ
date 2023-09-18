

/**
 * @author njohnson3
 *
 */
public class LinkedList<T> {
	
	Node <T> head;
	int length;
	Node<T> tail;
	public LinkedList()
	{
		head=null;
		length=0;
		tail=head;
	}
	public boolean isEmpty()
	{
		if (head==null) { return true;}
		else return false;
	}
	public Node <T> getList()
	{
		return head;
	}
	public void addNode(Node <T> aNode)
	{
		if (isEmpty() ) {
			head = aNode;
			tail=head;
			return;
		}
		tail.nextNode=aNode;
		tail=tail.nextNode;
		tail.nextNode=null;
		length++;
		
	}
	
	

	@Override
	public String toString() {
		Node<T> n=this.head; 
		String s=this.head.toString();
		for (int i=0;i<this.length;i++) {
			n=n.nextNode;
			s= s + n.toString();
		}
		return s;
		//return "LinkedList [head=" + head + ", length=" + length + ", tail=" + tail + "]";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> myList=new LinkedList<>();
		
		Node<Integer> aNode=new Node<>();
		aNode.setData(1);
		myList.addNode(aNode);
		aNode = new Node<Integer>();
		aNode.setData(2);
		myList.addNode(aNode);
		
		Node<Integer> tempnode=myList.getList();
			do 
		{
			System.out.println(tempnode.getData());
			tempnode=tempnode.nextNode;
		} while (tempnode!=null);
			
		
		

	}

}