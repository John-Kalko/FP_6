package ua.fp.domain;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: Ievgen_Kalko
 * Date: 6/20/13
 * Time: 2:36 PM
 * To change this template use File | Settings | File Templates.
 */
public class JournalNodeEntityTest {

    @Test
    public void testEquals_EqualsVerifier_Passed() {
        EqualsVerifier.forClass(JournalNodeEntity.class).verify();
    }
}
