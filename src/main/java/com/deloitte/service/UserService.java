package com.deloitte.service;

import com.deloitte.model.User;

/**
 * Created by barsingh on 7/20/2016.
 */
public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
