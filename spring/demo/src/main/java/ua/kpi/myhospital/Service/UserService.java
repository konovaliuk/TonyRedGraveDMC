package ua.kpi.myhospital.Service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.kpi.myhospital.DAO.UserDAO;
import ua.kpi.myhospital.Data.UserData;
import ua.kpi.myhospital.Entities.User;
import ua.kpi.myhospital.Repo.UserRepository;

import java.util.ArrayList;
import java.util.List;
@Service
public class UserService {
    @Autowired
    private UserDAO userDAO;

    public List<User> getAllUsers(){
       List<User> users = new ArrayList<>();
        userDAO.findAll().forEach(users::add);
        return users;
    }

    public User getUser(Integer idUser){
        return  userDAO.findById(idUser);
    }

    public void saveUser(User user){
        userDAO.save(user);
    }

    public void updateUser(User user, Integer id){
        userDAO.save(user);
    }

    public void deleteUser(Integer userid){
        userDAO.deleteById(userid);
    }


    public List<User> getByName(String name){
        List<User> users = new ArrayList<>();
        userDAO.findByName(name).forEach(users::add);
        return  users;
    }



}
