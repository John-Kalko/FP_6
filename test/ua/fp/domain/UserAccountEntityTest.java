package ua.fp.domain;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.Before;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import static org.junit.Assert.*;

/**
 * Created with IntelliJ IDEA.
 * User: Ievgen_Kalko
 * Date: 6/19/13
 * Time: 12:07 PM
 * To change this template use File | Settings | File Templates.
 */
public class UserAccountEntityTest {

    private static final String PERSISTENCE_UNIT_NAME = "FPBaseMain";
    private UserAccountEntity src;

    @Before
    public void setUp() throws Exception {
        src = new UserAccountEntity();
    }

    public void initEntity() {
        this.src.setEmail("qqq@qqq.qqq");
        this.src.setLanguage("UA");
        this.src.setPassword(12345);
    }

    @Test
    public void testEquals_BothTransient_True() {
        initEntity();

        UserAccountEntity t = new UserAccountEntity();
        t.setLanguage("UA");
        t.setPassword(12345);
        t.setEmail("qqq@qqq.qqq");

        boolean real = this.src.equals(t);

        assertTrue(real);
    }

    @Test
    public void testEquals_EmailNotInitialized_False() {
        initEntity();

        UserAccountEntity t = new UserAccountEntity();

        t.setPassword(123456);
        t.setLanguage("EN");

        assertTrue(!t.equals(this.src));
    }

    @Test
    public void testEquals_PassNotInitialized_False() {
        initEntity();

        UserAccountEntity t = new UserAccountEntity();

        t.setEmail("qqq@qqq.qqq");
        t.setLanguage("EN");

        assertTrue(!t.equals(this.src));
    }

    @Test
    public void testEquals_LanguageNotInitialized_False() {
        initEntity();

        UserAccountEntity t = new UserAccountEntity();

        t.setEmail("qqq@qqq.qqq");
        t.setPassword(123);

        assertTrue(!t.equals(this.src));
    }

    @Test
    public void testEquals_AllFieldsNotInitialized_False() {
        initEntity();

        UserAccountEntity t = new UserAccountEntity();

        assertTrue(!t.equals(this.src));
    }

    @Test
    public void testHashcode_TransientObjects_True() {
        initEntity();

        UserAccountEntity t = new UserAccountEntity();
        t.setLanguage("UA");
        t.setPassword(12345);
        t.setEmail("qqq@qqq.qqq");

        boolean real = this.src.hashCode() == t.hashCode();

        assertTrue(real);
    }

    @Test
    public void testHashcode_TransientObjects_False() {
        initEntity();

        UserAccountEntity t = new UserAccountEntity();
        t.setLanguage("UA");
        t.setPassword(1234);
        t.setEmail("qqq@qqq.qqq");

        boolean real = this.src.hashCode() == t.hashCode();

        assertTrue(!real);
    }

    @Test
    public void testEquals_Reflexivity_True() {

        initEntity();

        assertTrue(this.src.equals(this.src));
    }

    @Test
    public void testEquals_Symmetry_True() {

        initEntity();

        assertTrue(this.src.equals(this.src));
    }

    @Test
    public void testEquals_EqualsVerifier_Passed() {
        EqualsVerifier.forClass(UserAccountEntity.class).verify();
    }
}
