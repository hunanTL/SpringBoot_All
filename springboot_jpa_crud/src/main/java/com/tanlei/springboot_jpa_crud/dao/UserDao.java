package com.tanlei.springboot_jpa_crud.dao;

import com.tanlei.springboot_jpa_crud.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author <a href="mailto:lei.tan@vtradex.net">谭磊/a>
 * @since 2019-12-25 09:25
 */
public interface UserDao extends JpaRepository<User,Long> {
    User findById(long id);
    long deleteById(long id);
}
