package ua.fp.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Ievgen_Kalko
 * Date: 6/14/13
 * Time: 5:40 PM
 * To change this template use File | Settings | File Templates.
 */
@javax.persistence.Table(name = "USER_ACCOUNT", schema = "FP", catalog = "")
@Entity
public class UserAccountEntity implements Serializable {

    public UserAccountEntity() { }

    public UserAccountEntity(String email, int password, String language) {
        this.email = email;
        this.password = password;
        this.language = language;
    }

    @Id
    @Column(name = "USER_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "User_gen")
    @SequenceGenerator(name = "User_gen", sequenceName = "S_USER_ACCOUNT", allocationSize = 1)
    private int userId;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "PASSWORD")
    private int password;

    @Column(name = "LANGUAGE")
    private String language;

    @OneToMany(mappedBy = "userId")
    private List<AccountEntity> accountsByUserId;

    public int getUserId() {
        return userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public List<AccountEntity> getAccountsByUserId() {
        return accountsByUserId;
    }

    public void setAccountsByUserId(List<AccountEntity> accountsByUserId) {
        this.accountsByUserId = accountsByUserId;
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserAccountEntity)) return false;

        UserAccountEntity that = (UserAccountEntity) o;

        if (password != that.password) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (language != null ? !language.equals(that.language) : that.language != null) return false;

        return true;
    }

    @Override
    public final int hashCode() {
        int result = email != null ? email.hashCode() : 0;
        result = 31 * result + password;
        result = 31 * result + (language != null ? language.hashCode() : 0);
        return result;
    }
}
