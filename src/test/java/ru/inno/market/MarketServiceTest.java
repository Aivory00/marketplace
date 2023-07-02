package ru.inno.market;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import ru.inno.market.core.Catalog;
import ru.inno.market.core.MarketService;
import ru.inno.market.model.*;

import static org.junit.Assert.*;

public class MarketServiceTest {

    private MarketService marketService;
    private Catalog catalog;

    @Before
    public void setUp() {
        marketService = new MarketService();
        catalog = new Catalog();
    }

    @Test
    public void testCreateOrderFor() {

        Client client = new Client(1, "Dima");
        int orderId = marketService.createOrderFor(client);

        assertEquals(0, orderId);
    }
