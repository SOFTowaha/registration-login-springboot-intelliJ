package com.deloitte.repository;

import com.deloitte.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by barsingh on 7/19/2016.
 */
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);
}
