package ua.kpi.myhospital.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Diagnos {
  @Id
  private Integer idDiagnos;
  private int id_prescription;
  private String currentDiagnos;
  private String healthStatus;


  public Diagnos(){}

  public Diagnos(Integer idDiagnos, int id_prescription, String currentDiagnos, String healthStatus){
    this.idDiagnos = idDiagnos;
    this.id_prescription = id_prescription;
    this.currentDiagnos = currentDiagnos;
    this.healthStatus = healthStatus;
  }


  @ManyToOne
  @JsonIgnore
  @JoinColumn(name="id_prescription", insertable = false, updatable = false)
  private Prescription prescription_diagnosis;


  public Integer getIdDiagnos() {
    return idDiagnos;
  }

  public void setIdDiagnos(Integer idDiagnos) {
    this.idDiagnos = idDiagnos;
  }

  public int getId_prescription() {
    return id_prescription;
  }

  public void setId_prescription(int id_prescription) {
    this.id_prescription = id_prescription;
  }

  public String getCurrentDiagnos() {
    return currentDiagnos;
  }

  public void setCurrentDiagnos(String currentDiagnos) {
    this.currentDiagnos = currentDiagnos;
  }

  public String getHealthStatus() {
    return healthStatus;
  }

  public void setHealthStatus(String healthStatus) {
    this.healthStatus = healthStatus;
  }
}
