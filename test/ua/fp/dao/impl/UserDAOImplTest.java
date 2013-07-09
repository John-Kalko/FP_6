package ua.fp.dao.impl;

import org.junit.Before;
import org.junit.Test;
import ua.fp.domain.UserAccountEntity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: Ievgen_Kalko
 * Date: 6/21/13
 * Time: 5:30 PM
 * To change this template use File | Settings | File Templates.
 */
public class UserDAOImplTest {

    private UserDAOImpl src;

    @Before
    public void setUp() {
        this.src = new UserDAOImpl();
    }

//    @Test
//    public void testGetUserByLogin() throws Exception {
//        UserAccountEntity t = new UserAccountEntity("real2@email.com", 12, "EN");
//
//        this.src.create(t);
//
//        UserAccountEntity t2 = this.src.getUserByLogin(t.getEmail());
//
//        this.src.delete(t.getUserId());
//
//        assertEquals(t, t2);
//    }
//
//    @Test
//    public void testCreate() throws Exception {
//        UserAccountEntity t = new UserAccountEntity("qqq@aaa.bbb", 12, "EN");
//
//        this.src.create(t);
//
//        UserAccountEntity t2 = this.src.find(t.getUserId());
//
//        this.src.delete(t2.getUserId());
//
//        assertEquals(t, t2);
//    }
//
//
//    @Test
//    public void testUpdate() throws Exception {
//
//        UserAccountEntity t = new UserAccountEntity("qqq@aaa.bbb", 123, "EN");
//
//        this.src.create(t);
//
//        int id = t.getUserId();
//        t.setLanguage("RU");
//
//        this.src.update(t);
//
//        String expected = "RU";
//        String real = this.src.find(t.getUserId()).getLanguage();
//
//        this.src.delete(t.getUserId());
//
//        assertEquals(expected, real);
//    }
//
//
//    @Test
//    public void testFindAll() throws Exception {
//
//        UserAccountEntity t = new UserAccountEntity("qqq@aaa.bbb", 123, "AT");
//        UserAccountEntity t2 = new UserAccountEntity("ccc@aaa.bbb", 1234, "AT");
//
//        this.src.create(t);
//        this.src.create(t2);
//
//        Map<String, String> map = new HashMap<String, String>();
//        map.put("Language", "AT");
//
//        List<UserAccountEntity> result = this.src.findAll(map);
//
//        int expected = 2;
//        int real = result.size();
//
//        this.src.delete(t.getUserId());
//        this.src.delete(t2.getUserId());
//
//        assertEquals(expected, real);
//    }
}
