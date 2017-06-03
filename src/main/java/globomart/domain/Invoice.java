package globomart.domain;

import java.util.Date;
import java.util.Set;

/**
 * Created by rajeshkumar on 03/06/17.
 */
public class Invoice {
    private long id;
    private Set<Order> orders;
    private InvoiceStatus invoiceStatus;
    private Date date;
}
