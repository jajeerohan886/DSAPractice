public class DoublyLinkedList {
  public Node head;
  public Node tail;

  public DoublyLinkedList() {
    this.head = null;
    this.tail = null;
  }

  public void addToHead(String data) {
    Node newHead = new Node(data);
    Node currentHead = this.head;
    if (currentHead != null) {
      currentHead.setPreviousNode(newHead);
      newHead.setNextNode(currentHead);
    }
    this.head = newHead;
    if (this.tail == null) {
      this.tail = newHead;
    }
  }

  public String removeHead() {
    // Write your code here
    if(head == null) {
      return null;
    }

    Node removedNode = head;
    head = removedNode.getNextNode();
    head.setPreviousNode(null);
    return removedNode.data;
  }

  public static void main(String[] args) {
	  DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
	  doublyLinkedList.addToHead("10");
	  doublyLinkedList.addToHead("20");
	  doublyLinkedList.addToHead("30");
	  doublyLinkedList.addToHead("40");
	  
	  System.out.println(doublyLinkedList.removeHead());
	  
  }

}

class Node {
  public String data;
  private Node next;
  private Node previous;

  public Node(String data) {
    this.data = data;
    this.next = null;
    this.previous = null;
  }

  public void setNextNode(Node node) {
    this.next = node;
  }

  public void setPreviousNode(Node node) {
    this.previous = node;
  }

  public Node getNextNode() {
    return this.next;
  }

  public Node getPreviousNode() {
    return this.previous;
  }

}
