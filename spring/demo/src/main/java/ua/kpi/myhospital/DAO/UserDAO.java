package ua.kpi.myhospital.DAO;

import ua.kpi.myhospital.Entities.User;

import java.util.List;

public interface UserDAO {

     List<User> findAll();
     User findById(Integer idUser);
     List<User> findByName(String name);

     void deleteById(Integer idUser);
     void save(User user);
     void update(User user, Integer id);

}
