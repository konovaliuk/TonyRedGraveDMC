package ua.kpi.myhospital.Repo;

import org.springframework.data.repository.CrudRepository;
import ua.kpi.myhospital.Entities.Prescription;

public interface PrescriptionRepository extends CrudRepository<Prescription, Integer> {

}
