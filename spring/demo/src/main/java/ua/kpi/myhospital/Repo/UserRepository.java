package ua.kpi.myhospital.Repo;

import org.springframework.data.repository.CrudRepository;
import ua.kpi.myhospital.Entities.User;

import java.util.List;

public interface UserRepository extends CrudRepository<User,Integer> {

    public List<User> findByName(String name);

}
