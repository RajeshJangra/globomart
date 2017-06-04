package globomart.domain;

import java.util.Date;

/**
 * Created by rajeshkumar on 03/06/17.
 */
public class Invoice {
    private long id;
    private Order order;
    private InvoiceStatus invoiceStatus;
    private Date invoiceDate;

    public long getId() {
        return id;
    }

    public void setId(final long id) {
        this.id = id;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(final Order order) {
        this.order = order;
    }

    public InvoiceStatus getInvoiceStatus() {
        return invoiceStatus;
    }

    public void setInvoiceStatus(final InvoiceStatus invoiceStatus) {
        this.invoiceStatus = invoiceStatus;
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(final Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }
}
