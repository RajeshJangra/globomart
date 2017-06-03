package globomart.domain;

import java.util.Date;
import java.util.Set;

/**
 * Created by rajeshkumar on 03/06/17.
 */
public class Customer {
    private long id;
    private String firstName;
    private String lastName;
    private Gender gender;
    private String email;
    private Date dateOfBirth;

    private LoginUser loginUser;

    private Set<Address> addresses;
}
