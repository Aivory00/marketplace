import org.junit.Before;
import org.junit.Test;
import ru.inno.market.model.Category;
import ru.inno.market.model.Client;
import ru.inno.market.model.Item;
import ru.inno.market.model.Order;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class OrderTest {

    private Order order;
    private Client client;
    private Item item;

    @Before
    public void setUp() {

        client = new Client(1, "Dima");
        item = new Item(1, "Apple iPhone SE", Category.SMARTPHONES, 97990);
        order = new Order(1, client);
    }

    @Test
    public void testAddItem() {

        int initialCartSize = order.getCart().size();

        order.addItem(item);

        assertEquals(initialCartSize + 1, order.getCart().size());
        assertEquals(1, (int) order.getCart().get(item));
    }
