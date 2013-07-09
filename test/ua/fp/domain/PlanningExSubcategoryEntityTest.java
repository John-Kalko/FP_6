package ua.fp.domain;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: Ievgen_Kalko
 * Date: 6/20/13
 * Time: 5:06 PM
 * To change this template use File | Settings | File Templates.
 */
public class PlanningExSubcategoryEntityTest {

    @Test
    public void testEquals_EqualsVerifier_Passed() {
        EqualsVerifier.forClass(PlanningExSubcategoryEntity.class).withRedefinedSuperclass().verify();
    }

}
