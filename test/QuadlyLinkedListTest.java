import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class QuadlyLinkedListTest {

    @Test
    public void getSize() {
        QuadlyLinkedList<Integer> testLL = new QuadlyLinkedList(4, 5);
        assertEquals(testLL.getSize(), 4 * 5);
    }

    @Test
    public void getNode() {
        Node<Integer> testNode = new Node<>(20);

    }
}