package com.example.PhotoAlbum.repository;

import com.example.PhotoAlbum.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    List<User> userList =new ArrayList();
    public User getUser()
    {
        User user = new User("Rahul", "abc", "MyPC");
        return user;
    }

    public User saveUser(User user)
    {
        user.setUserID(userList.size() + 1);
        userList.add(user);
        return user;
    }

    public List<User> getallUsers()
    {
        return userList;
    }

    public User getUserbyID(int userID)
    {
        for (User user : userList)
        {
            if(user.getUserID() == userID)
            {
                return user;
            }
        }
        return null;
    }

    public User updateUser(int userID, User user) {
        for (User u:userList)
        {
            if(u.getUserID() == userID)
            {
                u.setName(user.getName());
                u.setEmail(user.getEmail());
                u.setProfilePhotoURL(user.getProfilePhotoURL());
                return u;
            }
        }
        return null;
    }

    public User deleteUser(int userID) {
        User deletedUser = null;
        for(User u:userList)
        {
            if(u.getUserID() == userID)
            {
                deletedUser = u;
                userList.remove(u);
            }
        }
        return deletedUser;

    }
}
