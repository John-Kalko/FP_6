package ua.fp.domain.superclasses;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Calendar;

/**
 * Created with IntelliJ IDEA.
 * User: Ievgen_Kalko
 * Date: 6/17/13
 * Time: 4:42 PM
 * To change this template use File | Settings | File Templates.
 */
@MappedSuperclass
public abstract class Subcategory {

    @Column(name = "CATEGORY_TITLE")
    @Basic(optional = false)
    private String title;

    @Column(name = "AMOUNT")
    @Basic(optional = false)
    private BigDecimal amount;

    @Column(name = "PER_DATE")
    @Basic(optional = true)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar perDate;

    @Column(name = "SH_DESCRIPTION")
    @Basic(optional = true)
    private String shDescription;

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Calendar getPerDate() {
        return perDate;
    }

    public void setPerDate(Calendar perDate) {
        this.perDate = perDate;
    }

    public String getShDescription() {
        return shDescription;
    }

    public void setShDescription(String shDescription) {
        this.shDescription = shDescription;
    }

    public boolean canEqual(Object other) {
        return (other instanceof Subcategory);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Subcategory)) return false;

        Subcategory that = (Subcategory) o;

        if(!that.canEqual(this)) return false;
        if (amount != null ? !amount.equals(that.amount) : that.amount != null) return false;
        if (perDate != null ? !perDate.equals(that.perDate) : that.perDate != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        result = 31 * result + (perDate != null ? perDate.hashCode() : 0);
        return result;
    }
}
