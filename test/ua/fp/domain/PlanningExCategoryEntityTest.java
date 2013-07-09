package ua.fp.domain;

import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: Ievgen_Kalko
 * Date: 6/20/13
 * Time: 2:37 PM
 * To change this template use File | Settings | File Templates.
 */
public class PlanningExCategoryEntityTest {

    @Test
    public void testEquals_EqualsVerifier_Passed() {
        EqualsVerifier.forClass(PlanningExCategoryEntity.class).withRedefinedSuperclass().verify();
    }
}
