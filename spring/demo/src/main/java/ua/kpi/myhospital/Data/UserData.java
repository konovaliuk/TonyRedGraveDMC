package ua.kpi.myhospital.Data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ua.kpi.myhospital.DAO.UserDAO;
import ua.kpi.myhospital.Entities.User;
import ua.kpi.myhospital.Repo.UserRepository;

import java.util.List;
@Repository("UserRepository")
public class UserData implements UserDAO {
   @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return (List<User>) userRepository.findAll();
    }

    @Override
    public User findById(Integer idUser) {
        return userRepository.findById(idUser).get();
    }

    @Override
    public List<User> findByName(String name) {
        return userRepository.findByName(name);
    }

    @Override
    public void deleteById(Integer idUser) {
        userRepository.deleteById(idUser);
    }

    @Override
    public void save(User user) {
        userRepository.save(user);
    }

    @Override
    public void update(User user, Integer id) {
        userRepository.save(user);
    }
}
