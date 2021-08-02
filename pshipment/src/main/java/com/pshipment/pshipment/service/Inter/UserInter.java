package com.pshipment.pshipment.service.Inter;

import com.pshipment.pshipment.model.Role;
import com.pshipment.pshipment.model.User;

public interface UserInter {
    User add(User user);
    void addRoleToUser(int userId, int roleId);

}