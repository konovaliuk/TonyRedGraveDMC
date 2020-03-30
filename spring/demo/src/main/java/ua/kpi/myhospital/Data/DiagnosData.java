package ua.kpi.myhospital.Data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ua.kpi.myhospital.DAO.DiagnosDAO;
import ua.kpi.myhospital.Entities.Diagnos;
import ua.kpi.myhospital.Repo.DiagnosRepository;

import java.util.List;

@Repository("DiagnosRepository")
public class DiagnosData implements DiagnosDAO {

    @Autowired
    private DiagnosRepository diagnosRepository;

    @Override
    public List<Diagnos> findAll() {
       return (List<Diagnos>)diagnosRepository.findAll();
    }

    @Override
    public Diagnos findById(Integer idDiagnos) {
        return diagnosRepository.findById(idDiagnos).get();
    }

    @Override
    public void deleteById(Integer idDiagnos) {
        diagnosRepository.deleteById(idDiagnos);
    }

    @Override
    public void save(Diagnos diagnos) {
        diagnosRepository.save(diagnos);
    }
}
