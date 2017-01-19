
/**
 * Node of a doubly linked list.
 */
public class Node {

    private String data;

    private Node next;

    private Node previous;

    public Node(String data) {
    	this.data = data;
    	next = null;
    	previous = null;
    }

    public String toString() {
    	return "{" + data + "}";
    }

    public void setNextNode(Node next) {
    	this.next = next;
    }

    public void setPreviousNode(Node previous) {
    	this.previous = previous;
    }

    public Node getNextNode() {
    	return next;
    }

    public Node getPreviousNode() {
    	return previous;
    }

    public String getValue() {
    	return data;
    }

}