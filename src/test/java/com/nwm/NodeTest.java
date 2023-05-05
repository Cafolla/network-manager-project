import static org.junit.jupiter.api.Assertions.*;

import com.nwm.Node;
import org.junit.jupiter.api.Test;

class NodeTest {

    Node node;



    @Test
    void testGetName() {
        Node node = new Node();
        node.setName("Node1");
        assertEquals("Node1", node.getName());
    }

    @Test
    void testSetName() {
        Node node = new Node();
        node.setName("Node1");
        assertEquals("Node1", node.getName());
        node.setName("Node2");
        assertEquals("Node2", node.getName());
    }

    @Test
    void testGetLocation() {
        Node node = new Node();
        node.setLocation("Location1");
        assertEquals("Location1", node.getLocation());
    }

    @Test
    void testSetLocation() {
        Node node = new Node();
        node.setLocation("Location1");
        assertEquals("Location1", node.getLocation());
        node.setLocation("Location2");
        assertEquals("Location2", node.getLocation());
    }

    @Test
    void testGetLatitude() {
        Node node = new Node();
        node.setLatitude(40.7128F);
        assertEquals(40.7128F, node.getLatitude());
    }

    @Test
    void testSetLatitude() {
        Node node = new Node();
        node.setLatitude(40.7128F);
        assertEquals(40.7128F, node.getLatitude());
        node.setLatitude(37.7749F);
        assertEquals(37.7749F, node.getLatitude());
    }

    @Test
    void testGetLongitude() {
        Node node = new Node();
        node.setLongitude(-74.0060F);
        assertEquals(-74.0060F, node.getLongitude());
    }

    @Test
    void testSetLongitude() {
        Node node = new Node();
        node.setLongitude(-74.0060F);
        assertEquals(-74.0060F, node.getLongitude());
        node.setLongitude(-122.4194F);
        assertEquals(-122.4194F, node.getLongitude());
    }
}