package org.cloud.activiti.service;

import java.util.List;
import java.util.Set;

import org.cloud.activiti.entity.User;

public interface IUserService {
    
    List<User> getAllUsers();

    List<User> getPagedUsers(int pageNum, int pageSize);

    User getUserById(int id);
    
    User getUserByName(String userName);
    
    void deleteUser(int uid);

    void addUser(User user, String[] roleNames);

    void addUser(User user);

    void updateUser(int uid, User user, String[] roleNames);
    
    int getUidByUserName(String userName);

    Set<String> getRolesByUserName(String username);

    Set<String> getPermissionsByUserName(String username);
}
