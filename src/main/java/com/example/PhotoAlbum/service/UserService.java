package com.example.PhotoAlbum.service;

import com.example.PhotoAlbum.model.User;
import com.example.PhotoAlbum.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
        @Autowired
        private UserRepository userRepository;
        public User getUser()
    {
            return userRepository.getUser();
        }

    public User saveUser(User user)
    {
        return userRepository.saveUser(user);
    }

    public List<User> getallUsers()
    {
        return userRepository.getallUsers();
    }

    public User getUserbyID(int userID) {
            return userRepository.getUserbyID(userID);
    }

    public User updateUser(int userID, User user) {
            return userRepository.updateUser(userID, user);
    }

    public User deleteUser(int userID)
    {
        return userRepository.deleteUser(userID);
    }
}

