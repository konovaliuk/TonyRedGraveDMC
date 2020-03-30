package ua.kpi.myhospital.Data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ua.kpi.myhospital.DAO.PrescriptionDAO;
import ua.kpi.myhospital.Entities.Prescription;
import ua.kpi.myhospital.Repo.PrescriptionRepository;

import java.util.List;
@Repository("PrescriptionRepository")
public class PrescriptionData implements PrescriptionDAO {
    @Autowired
    private PrescriptionRepository prescriptionRepository;

    @Override
    public List<Prescription> findAll() {
        return (List<Prescription>) prescriptionRepository.findAll();
    }

    @Override
    public Prescription findById(Integer idPrescription) {
        return prescriptionRepository.findById(idPrescription).get();
    }

    @Override
    public void deleteById(Integer idPrescription) {
        prescriptionRepository.deleteById(idPrescription);
    }

    @Override
    public void save(Prescription prescription) {
        prescriptionRepository.save(prescription);
    }

    @Override
    public void update(Prescription prescription, Integer idPrescription) {
        prescriptionRepository.save(prescription);
    }
}
