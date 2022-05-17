package com.example.PhotoAlbum.resource;

import com.example.PhotoAlbum.model.User;
import com.example.PhotoAlbum.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserResource
{
    @Autowired
    private UserService userService;

    @PostMapping
    private User saveUser(@RequestBody User user)
    {
        return userService.saveUser(user);
    }

    @GetMapping
    public List<User> getallUsers()
    {
        return userService.getallUsers();
    }

    @PutMapping
    public User updateUser(@RequestBody User user)
    {
        return userService.updateUser(user);
    }

    @DeleteMapping
    public void deleteUser(@RequestParam(name = "userID") String userID)
    {
        userService.deleteUser(userID);
    }

    @GetMapping
    public List<User> getByAddress(@RequestParam(name = "address") String address)
    {
        return userService.getByAddress(address);
    }


    /*
    @GetMapping("/user")
    public User getUser()
    {
        return userService.getUser();
    }

    @GetMapping
    public List<User> getallUsers()
    {
        return userService.getallUsers();
    }
    @GetMapping("/user/{userID}")
    public User getUserbyID(@PathVariable("userID") int userID, @RequestBody User user)
    {
        return userService.getUserbyID(userID);
    }
    @PutMapping("/user/{userID}")
    public User updateUser(@PathVariable("userID") int userID,@RequestBody User user)
    {
        return userService.updateUser(userID, user);
    }
    @DeleteMapping("/user")
    public User deleteUser(@RequestParam(name = "userID") int userID)
    {
        return userService.deleteUser(userID);
    }
    */

}
