package ua.kpi.myhospital.DAO;

import ua.kpi.myhospital.Entities.Prescription;


import java.util.List;

public interface PrescriptionDAO {

    List<Prescription> findAll();
    Prescription findById(Integer idPrescription);

    void deleteById(Integer idPrescription);
    void save(Prescription prescription);
    void update(Prescription prescription, Integer idPrescription);

}
