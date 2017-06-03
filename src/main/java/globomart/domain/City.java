package globomart.domain;

/**
 * Created by rajeshkumar on 03/06/17.
 */
public class City {
    private long id;
    private String name;
    private State stateId;

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

    public State getStateId() {
        return stateId;
    }

    public void setStateId(final State stateId) {
        this.stateId = stateId;
    }
}
