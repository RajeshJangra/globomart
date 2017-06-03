package globomart.domain;

/**
 * Created by rajeshkumar on 03/06/17.
 */
public class Category {
    private long id;
    private String name;
    private String descriptiond;

    public long getId() {
        return id;
    }

    public void setId(final long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getDescriptiond() {
        return descriptiond;
    }

    public void setDescriptiond(final String descriptiond) {
        this.descriptiond = descriptiond;
    }
}
