/**
 * A node is the element of the quadly linked list
 */

public class Node<T> {

    // declares the information stored
    private T data;

    // declares the node references
    private Node up;
    private Node right;
    private Node down;
    private Node left;

    // the default constructor
    public Node() {
        setData(null);
        setUp(null);
        setRight(null);
        setDown(null);
        setLeft(null);
    }

    // the constructor with the data
    public Node(T data) {
        setData(data);
        setUp(null);
        setRight(null);
        setDown(null);
        setLeft(null);
    }

    // the constructor with the node pointers
    public Node(T data, Node up, Node right, Node down, Node left) {
        setData(data);
        setUp(up);
        setRight(right);
        setDown(down);
        setLeft(left);
    }

    // sets the data of the current node
    public void setData(T data) {
        this.data = data;
    }

    // sets the node "above" the current node
    public void setUp(Node up) {
        this.up = up;

        if (up != null) {
            up.down = this;
        }
    }

    // sets the node "to the right" the current node
    public void setRight(Node right) {
        this.right = right;

        if (right != null) {
            right.left = this;
        }
    }

    // sets the node "below" the current node
    public void setDown(Node down) {
        this.down = down;

        if (down != null) {
            down.up = this;
        }
    }

    // sets the node "to the left" the current node
    public void setLeft(Node left) {
        this.left = left;

        if (left != null) {
            left.right = this;
        }
    }

    // gets the data of the current node
    public T getData() {
        return this.data;
    }

    // gets the node "above" the current node
    public Node getUp() {
        return this.up;
    }

    // gets the node "to the right" the current node
    public Node getRight() {
        return this.right;
    }

    // gets the node "below" the current node
    public Node getDown() {
        return this.down;
    }

    // gets the node "to the left" the current node
    public Node getLeft() {
        return this.left;
    }
}
