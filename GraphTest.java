import org.junit.Test;
import static org.junit.Assert.*;

public class GraphTest {

    @Test
    public void addTest() {
        Graph grafo = new Graph(5);
        grafo.add(1, 1);

        int Actual = grafo.get(1, 1);

        int resultado = 1;

        assertEquals(resultado, Actual);
    }

    @Test
    public void put() {
        Graph grafo = new Graph(5);
        grafo.add(1, 1);
        grafo.remove(1, 1);

        int Actual = grafo.get(1, 1);

        int resultado = 0;

        assertEquals(resultado, Actual);
    }
}