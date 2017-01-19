public class DLList {

	/** The first Node of the list. */
	private Node front;

	/** The last Node of the list. */
	private Node rear;

	/** The position of the last element of the list. */
	private int lastPosition = -1;

	public boolean isEmpty() {
		return front == null;
	}

	public void display() {
		Node it = front;

		while (it != null) {
			System.out.print(it + ", ");
			it = it.getNextNode();
		}

		System.out.println();
	}

	public int size() {
		return lastPosition + 1;
	}

	public void add(String content) {
		// create Node
		Node newNode = new Node(content);

		// case 1: List is empty
		if (front == null) {
			front = newNode;
			rear = newNode;
		}
		// case 2: List is not empty
		else {
			rear.setNextNode(newNode);
			newNode.setPreviousNode(rear);
			rear = newNode;
		}

		// increase counter
		++lastPosition;
	}

	public void add(int pos, String content) {
		// Node is to be added at the last position (reuse code)
		if (pos >= size()) {
			add(content);
		} else {
			Node newNode = new Node(content);

			// special case: Node to be added at the front
			if (pos == 0) {
				newNode.setNextNode(front);
				front.setPreviousNode(newNode);
				front = newNode;
			}
			// default case: node is somewhere in the middle
			else {
				// the Node, after which the new Node is to be inserted
				Node pred = front;
				for (int i = 1; i < pos; ++i) {
					pred = pred.getNextNode();
				}

				// set the pointers
				newNode.setNextNode(pred.getNextNode());
				newNode.setPreviousNode(pred);

				pred.setNextNode(newNode);
				newNode.getNextNode().setPreviousNode(newNode);
			}

			++lastPosition;
		}
	}
	
	public String getFirst() {
		if (front != null) {
			return front.getValue();
		}
		else {
			return null;
		}
	}
	
	public String getLast() {
		if (rear != null) {
		 return rear.getValue();
		}
		else {
			return null;
		}
	}
	
	public String get(int pos) {
		Node it = front;
		int counter = 0;
		while ((it != null) && (counter < pos)) {
				it = it.getNextNode();
				++counter;
			}
		if (it != null) {
			return it.getValue();
		} else {
			return null;
		}
		
	}
	
	public int find(String content) {
		Node it = front;
		int counter = 0;
		while ((it != null) && (!it.getValue().equals(content))) {
			it = it.getNextNode();
			++counter;
		}
		if (it != null) {
			return counter;
		}
		return -1;
		
	}
	
	public boolean contains(String content) {
		if (find(content) >= 0) {
			return true;
		}
		return false;
	}
	
	public void clear() {
		front = null;
		rear = null;
		lastPosition = -1;
	}
	
	public void removeFirst() {
		if (front != null) {
			if (front == rear) {
				clear();
			} else {
				Node it = front.getNextNode();
				it.setPreviousNode(null);
				front = it;
			}
			--lastPosition;
		}
	}
	
	public void removeLast() {
		if (front != null) {
			if (front == rear) {
				clear();
			} else {
				Node it = rear.getPreviousNode();
				it.setNextNode(null);
				rear = it;
			}
			--lastPosition;
		}
	}
	
	public void remove(String content) {
		if (front != null) {
			// special case: content in first element 
			if (front.getValue().equals(content)) {
				removeFirst();
			} else {
				Node it = front;
				while ((it.getNextNode() != null) && (it.getNextNode().getValue() != content)) {
					it = it.getNextNode();
				}
				if (it.getNextNode() != null) {
					it.setNextNode(it.getNextNode().getNextNode());
					it.getNextNode().setPreviousNode(it);
					--lastPosition;
				}
			}
			
		}
	}
	
	public void concat(DLList list) {
		if (isEmpty()) {
			front = list.front;
			rear = list.rear;
			lastPosition = list.lastPosition;
		} else {
			this.lastPosition += list.lastPosition;
			rear.setNextNode(list.front);
			list.front.setPreviousNode(rear);
			rear = list.rear;
		}
	}
}