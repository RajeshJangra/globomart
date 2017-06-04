package globomart.domain;

/**
 * Created by rajeshkumar on 03/06/17.
 */
public class PaymentMethod {
    private long id;
    private String type;

    public long getId() {
        return id;
    }

    public void setId(final long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }
}
