package ua.kpi.myhospital.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.kpi.myhospital.DAO.PrescriptionDAO;
import ua.kpi.myhospital.Entities.Prescription;
import ua.kpi.myhospital.Repo.PrescriptionRepository;

import java.util.ArrayList;
import java.util.List;


@Service
public class PrescriptionService {
    @Autowired
    private PrescriptionDAO prescriptionDAO;


    public List<Prescription> getAllPrescriptions() {
        List<Prescription> prescriptions = new ArrayList<>();
        prescriptionDAO.findAll().forEach(prescriptions::add);
        return prescriptions;
    }

    public Prescription getPrescription(Integer idPrescription){
       return prescriptionDAO.findById(idPrescription);
    }

    public void savePrescription(Prescription prescription) {
        prescriptionDAO.save(prescription);
    }

    public void deletePrescription(Integer idPrescription){
        prescriptionDAO.deleteById(idPrescription);
    }

    public void updatePrescription(Prescription prescription, Integer idPrescription){
        prescriptionDAO.save(prescription);
    }
}
