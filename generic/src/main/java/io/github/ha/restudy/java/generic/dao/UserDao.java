package io.github.ha.restudy.java.generic.dao;

import io.github.ha.restudy.java.generic.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {
}
