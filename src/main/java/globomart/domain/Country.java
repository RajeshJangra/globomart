package globomart.domain;

import java.util.Set;

/**
 * Created by rajeshkumar on 03/06/17.
 */
public class Country {
    private long id;
    private String name;
    private Set<State> states;

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

    public Set<State> getStates() {
        return states;
    }

    public void setStates(final Set<State> states) {
        this.states = states;
    }
}
