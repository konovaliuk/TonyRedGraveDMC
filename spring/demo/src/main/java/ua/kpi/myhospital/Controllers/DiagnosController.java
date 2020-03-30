package ua.kpi.myhospital.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.kpi.myhospital.Entities.Diagnos;
import ua.kpi.myhospital.Entities.User;
import ua.kpi.myhospital.Service.DiagnosService;

import java.util.List;

@RestController
public class DiagnosController {
    @Autowired
    private DiagnosService diagnosService;

    @RequestMapping("/diagnoses")
    public List<Diagnos> getAllDiagnoses(){
        return diagnosService.getAllDiagnoses();
    }

    @RequestMapping("/diagnoses/{idDiagnos}")
    public Diagnos getDiagnos(@PathVariable Integer idDiagnos){
        return diagnosService.getDiagnos(idDiagnos);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/diagnoses" )
    public void addDiagnos(@RequestBody Diagnos diagnos){
        diagnosService.saveDiagnos(diagnos);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/diagnoses/{idDiagnos}")
    public void updateDiagnos(@RequestBody Diagnos diagnos, @PathVariable Integer idDiagnos){
        diagnosService.saveDiagnos(diagnos);
    }

    @RequestMapping(method = RequestMethod.DELETE ,value = "/diagnoses/{idDiagnos}")
    public void deleteDiagnos(@PathVariable Integer idDiagnos){
        diagnosService.deleteDiagnos(idDiagnos);
    }
}
