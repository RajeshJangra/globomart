package globomart.domain;

import java.util.Set;

/**
 * Created by rajeshkumar on 03/06/17.
 */
public class LoginUser {

    private String loginId;
    private String loginPassword;
    private boolean loginEnabled;
    private Set<Roles> roles;

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(final String loginId) {
        this.loginId = loginId;
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(final String loginPassword) {
        this.loginPassword = loginPassword;
    }

    public boolean isLoginEnabled() {
        return loginEnabled;
    }

    public void setLoginEnabled(final boolean loginEnabled) {
        this.loginEnabled = loginEnabled;
    }

    public Set<Roles> getRoles() {
        return roles;
    }

    public void setRoles(final Set<Roles> roles) {
        this.roles = roles;
    }
}
