package globomart.domain;

import java.util.Date;
import java.util.Set;

/**
 * Created by rajeshkumar on 03/06/17.
 */
public class Shipment {
    private long id;
    private Set<Order> orders;
    private Invoice invoice;
    private Date date;

}
