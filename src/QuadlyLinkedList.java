/**
 * The quadly linked list or two-dimensional linked list
 */

public class QuadlyLinkedList<T> {

    // declares the entry point
    private Node<T> head;

    private int row;

    private int column;

    // the default constructor
    public QuadlyLinkedList() {
        head = new Node<T>();
    }

    // the constructor with the number of rows and columns
    public QuadlyLinkedList(int row, int column) {
        // checks if the number of rows and columns are valid
        if (row < 0 || column < 0)  {
            throw new IllegalArgumentException();
        }

        head = initializeList(row, column);
    }

    // initializes the quadly linked list
    private Node initializeList(int row, int column) {
        Node<T> newHead = new Node<T>();
        Node<T> pointer = newHead;

        for (int r = 0; r < row; r++) {
            for (int c = 0; c < column; c++) {
                pointer.setRight(new Node<T>());
                pointer = pointer.getRight();
            }

            pointer = newHead;
            pointer.setDown(new Node<T>());
            pointer = pointer.getDown();
        }

        return newHead;
    }

    // gets the number of nodes in the linked list
    public int getSize() {
        return row * column;
    }

    // gets the requested node from the linked list
    public Node<T> getNode(int rowN, int columnN) {
        Node<T> pointer = head;

        for (int i = 0; i < rowN; i++) {
            pointer = pointer.getDown();

            for (int j = 0 ; j < columnN; j++) {
                pointer = pointer.getRight();
            }
        }

        return pointer;
    }

    // sets the data of the requested node from the linked list
    public void setNodeData(T data, int rowN, int columnN) {
        Node<T> newNode = getNode(rowN, columnN);
        newNode.setData(data);
    }
}
