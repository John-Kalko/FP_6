package ua.fp.domain;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * User: Ievgen_Kalko
 * Date: 6/14/13
 * Time: 5:40 PM
 * To change this template use File | Settings | File Templates.
 */
@javax.persistence.Table(name = "PREDEFINED_TITLES", schema = "FP", catalog = "")
@Entity
public class PredefinedTitlesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Predef_gen")
    @SequenceGenerator(name = "Predef_gen", sequenceName = "S_PREDEFINED_TITLES", allocationSize = 1)
    @Column(name = "PREDEF_IN_CAT_ID")
    private int predefId;

    @Column(name = "TITLE")
    @Basic(optional = false)
    private String title;

    @Column(name = "TYPE")
    @Enumerated(EnumType.STRING)
    @Basic(optional = false)
    private PredefinedTitleType type;

    public int getPredefInCatId() {
        return predefId;
    }

    public PredefinedTitleType getType() {
        return type;
    }

    public void setType(PredefinedTitleType type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PredefinedTitlesEntity)) return false;

        PredefinedTitlesEntity that = (PredefinedTitlesEntity) o;

        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (type != that.type) return false;

        return true;
    }

    @Override
    public final int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }

    public static enum PredefinedTitleType {
        EX_CAT,
        IN_CAT,
        EX_SUBCAT,
        IN_SUBCAT;
    }
}
