package globomart.domain;

import java.util.Date;
import java.util.Set;

/**
 * Created by rajeshkumar on 03/06/17.
 */
public class Order {

    private long id;
    private OrderStatus orderStatus;
    private Date orderDate;
    private Set<OrderItem> orderItems;
    private Customer customer;
}
