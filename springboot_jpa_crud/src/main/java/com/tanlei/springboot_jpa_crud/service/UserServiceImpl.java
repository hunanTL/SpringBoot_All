package com.tanlei.springboot_jpa_crud.service;

import com.tanlei.springboot_jpa_crud.dao.UserDao;
import com.tanlei.springboot_jpa_crud.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author <a href="mailto:lei.tan@vtradex.net">谭磊/a>
 * @since 2019-12-25 09:32
 */
@Service
public class UserServiceImpl implements  UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> getUserList() {
        return userDao.findAll();
    }

    @Override
    public User findUserById(long id) {
        return userDao.findById(id);
    }

    @Override
    public void save(User user) {
        userDao.save(user);
    }

    @Override
    public void edit(User user) {
        userDao.save(user);
    }

    @Override
    public void delete(long id) {
         userDao.deleteById(id);
    }
}
