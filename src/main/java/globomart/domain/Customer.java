package globomart.domain;

import java.util.Date;
import java.util.Set;

/**
 * Created by rajeshkumar on 03/06/17.
 */
public class Customer {
    private int id;
    private Gender gender;
    private String firstName;
    private String lastName;
    private String email;
    private Date dateOfBirth;

    private String loginId;
    private String loginPassword;
    private boolean loginEnabled;

    private Set<Address> addresses;
}
