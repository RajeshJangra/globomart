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

    public long getId() {
        return id;
    }

    public void setId(final long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(final Gender gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(final Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public LoginUser getLoginUser() {
        return loginUser;
    }

    public void setLoginUser(final LoginUser loginUser) {
        this.loginUser = loginUser;
    }

    public Set<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(final Set<Address> addresses) {
        this.addresses = addresses;
    }
}
