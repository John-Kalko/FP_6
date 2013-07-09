package ua.fp.domain;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Ievgen_Kalko
 * Date: 6/14/13
 * Time: 5:40 PM
 * To change this template use File | Settings | File Templates.
 */
@javax.persistence.Table(name = "ACCOUNT", schema = "FP", catalog = "")
@Entity
public class AccountEntity {

    public AccountEntity() { }

    public AccountEntity(String typeTitle, BigDecimal balance, UserAccountEntity userId) {
        this.typeTitle = typeTitle;
        this.balance = balance;
        this.userId = userId;
    }

    @Id
    @Column(name = "ACCOUNT_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Acc_gen")
    @SequenceGenerator(name = "Acc_gen", sequenceName = "S_ACCOUNT", allocationSize = 1)
    private int accountId;

    @Column(name = "TYPE_TITLE")
    private String typeTitle;

    @Column(name = "BALANCE")
    private BigDecimal balance;

    @OneToMany(mappedBy = "accountByAccountId")
    private List<PlanningExCategoryEntity> planningExCategoriesByAccountId;

    @OneToMany(mappedBy = "accountByAccountId")
    private List<PlanningInCategoryEntity> planningInCategoriesByAccountId;

    @ManyToOne
    @JoinColumn(name = "USER_ID", referencedColumnName = "USER_ID", nullable = false)
    private UserAccountEntity userId;

    public void setUserId(UserAccountEntity userId) {
        this.userId = userId;
    }

    public UserAccountEntity getUserId() {

        return userId;
    }

    public int getAccountId() {
        return accountId;
    }

    public String getTypeTitle() {
        return typeTitle;
    }

    public void setTypeTitle(String typeTitle) {
        this.typeTitle = typeTitle;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public List<PlanningExCategoryEntity> getPlanningExCategoriesByAccountId() {
        return planningExCategoriesByAccountId;
    }

    public void setPlanningExCategoriesByAccountId(List<PlanningExCategoryEntity> planningExCategoriesByAccountId) {
        this.planningExCategoriesByAccountId = planningExCategoriesByAccountId;
    }

    public List<PlanningInCategoryEntity> getPlanningInCategoriesByAccountId() {
        return planningInCategoriesByAccountId;
    }

    public void setPlanningInCategoriesByAccountId(List<PlanningInCategoryEntity> planningInCategoriesByAccountId) {
        this.planningInCategoriesByAccountId = planningInCategoriesByAccountId;
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AccountEntity)) return false;

        AccountEntity that = (AccountEntity) o;

        if (balance != null ? !balance.equals(that.balance) : that.balance != null) return false;
        if (typeTitle != null ? !typeTitle.equals(that.typeTitle) : that.typeTitle != null) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;

        return true;
    }

    @Override
    public final int hashCode() {
        int result = typeTitle != null ? typeTitle.hashCode() : 0;
        result = 31 * result + (balance != null ? balance.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        return result;
    }
}
