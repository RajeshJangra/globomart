package globomart.domain;

/**
 * Created by rajeshkumar on 03/06/17.
 */
public class OrderItem {
    private long id;
    private Product product;
    private Order order;
    private OrderItemStatus orderItemStatus;
    private long quantity;
    private double price;
}
