package ua.kpi.myhospital.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.kpi.myhospital.DAO.DiagnosDAO;
import ua.kpi.myhospital.Entities.Diagnos;
import ua.kpi.myhospital.Entities.User;

import java.util.ArrayList;
import java.util.List;
@Service
public class DiagnosService {

    @Autowired
    private DiagnosDAO diagnosDAO;

    public List<Diagnos> getAllDiagnoses(){
        List<Diagnos> diagnoses = new ArrayList<>();
        diagnosDAO.findAll().forEach(diagnoses::add);
        return diagnoses;
    }

    public Diagnos getDiagnos(Integer idDiangos){
        return diagnosDAO.findById(idDiangos);
    }

    public void saveDiagnos(Diagnos diagnos){
        diagnosDAO.save(diagnos);
    }

    public void deleteDiagnos(Integer idDiagnos){
        diagnosDAO.deleteById(idDiagnos);
    }


}

