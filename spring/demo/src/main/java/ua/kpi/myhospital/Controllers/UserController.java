package ua.kpi.myhospital.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.kpi.myhospital.Entities.User;
import ua.kpi.myhospital.Service.UserService;

import java.util.List;
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/users")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @RequestMapping("/users/{idUser}")
    public User getUser(@PathVariable Integer idUser){
       return userService.getUser(idUser);
    }

    @RequestMapping("/user/{name}")
    public List<User> getByName(@PathVariable String name){
        return userService.getByName(name);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/users" )
    public void addUser(@RequestBody User user){
        userService.saveUser(user);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/users/{id}")
    public void updateUser(@RequestBody User user, @PathVariable Integer id){
        userService.updateUser(user, id);
    }

    @RequestMapping(method = RequestMethod.DELETE,value = "/users/{idUser}")
    public void deleteUser(@PathVariable Integer idUser){
        userService.deleteUser(idUser);
    }




}
