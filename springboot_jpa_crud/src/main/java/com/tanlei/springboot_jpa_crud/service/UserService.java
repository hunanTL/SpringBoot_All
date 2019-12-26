package com.tanlei.springboot_jpa_crud.service;

import com.tanlei.springboot_jpa_crud.pojo.User;

import java.util.List;

/**
 * @author <a href="mailto:lei.tan@vtradex.net">谭磊/a>
 * @since 2019-12-25 09:30
 */
public interface UserService {

    List<User> getUserList();

    User findUserById(long id);

    void save(User user);

    void edit(User user);

    void delete(long id);
}
