
class Node<T>{
	private T data;
	Node<T> nextNode;
	public Node()
	{
		nextNode=null;
		data=null;
	}
	public void setData(T data) {
		this.data=data;
	}
	
	public T getData() {
		return this.data;
	}
	public Node<T> getNode() {
		return this;
	}
	public void setNextNode(Node<T> nextNode)
	{
		this.nextNode=nextNode;
	}
	
	/**Overridden toString() that returns the data as a string.*/
	@Override
	public String toString() {
		return data.toString();
	}
	
	
}