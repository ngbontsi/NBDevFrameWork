package com.bontsi.dev.framework;

import com.bontsi.dev.framework.dao.HibernateUtil;
import com.bontsi.dev.framework.dao.UserDAOImpl;

import com.bontsi.dev.framework.model.User;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.List;

public class HibernateTest {

    private UserDAOImpl userDAOImpl;

    @Before
    public void before() {
        userDAOImpl = new UserDAOImpl();

    }


    @Ignore
    public void testCRUD() {
        User user = new User();
        user.setName("ndira");
        user.setSurname("Bontsi");
        user.setAddress("123 address");

        User user1 = new User();
        user1.setName("ndira");
        user1.setSurname("Bontsi");
        user1.setAddress("123 address");

        User user2 = new User();
        user2.setName("ndira");
        user2.setSurname("Bontsi");
        user2.setAddress("123 address");

        User user3 = new User();
        user3.setName("ndira");
        user3.setSurname("Bontsi");
        user3.setAddress("123 address");

        System.out.println("All users been set ready for testing CRUD functions");
        System.out.println("attempting to create records");
        userDAOImpl.save(user);
        userDAOImpl.save(user2);
        userDAOImpl.save(user3);


        System.out.println("records created");
        System.out.println("attempting to read records");
        List<User> list = userDAOImpl.findAll();


        System.out.println("read records");
        System.out.println("attempting to delete records");
        list.forEach(data -> {
            if (data.getId() > 1)
                userDAOImpl.delete(data);
        });
        System.out.println("deleted records");
    }

    @Test
    public void testDelete() {
        List<User> list = userDAOImpl.findAll();
        for (User user : list) {
            if(user.getId()>1){
                userDAOImpl.delete(user);
            }

        }
    }

    @After
    public void after() {
        userDAOImpl.closeConnection();
    }
}
