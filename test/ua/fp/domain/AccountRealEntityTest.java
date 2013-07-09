package ua.fp.domain;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.Before;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.assertTrue;

/**
 * Created with IntelliJ IDEA.
 * User: Ievgen_Kalko
 * Date: 6/20/13
 * Time: 2:04 PM
 * To change this template use File | Settings | File Templates.
 */
public class AccountRealEntityTest {

    private static final String PERSISTENCE_UNIT_NAME = "FPBaseMain";
    private AccountRealEntity src;

    @Before
    public void setUp() throws Exception {
        src = new AccountRealEntity();
    }

    @Test
    public void testEquals_EqualsVerifier_Passed() throws Exception {
        EqualsVerifier.forClass(AccountRealEntity.class).verify();
    }
}
