package ua.kpi.myhospital.DAO;

import ua.kpi.myhospital.Entities.Diagnos;

import java.util.List;

public interface DiagnosDAO {

    List<Diagnos> findAll();
    Diagnos findById(Integer id);

    void deleteById(Integer id);
    void save(Diagnos diagnos);

}
