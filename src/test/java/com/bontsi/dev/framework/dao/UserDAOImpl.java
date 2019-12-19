package com.bontsi.dev.framework.dao;

import com.bontsi.dev.framework.model.User;

import java.util.List;

public class UserDAOImpl extends GenericHibernateDAO<User,Long> implements UserDAO {
    @Override
    public List<User> findByExample(User exampleInstance) {
        return null;
    }
}
