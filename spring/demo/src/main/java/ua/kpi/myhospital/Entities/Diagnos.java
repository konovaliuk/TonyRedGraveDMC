package ua.kpi.myhospital.Entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Diagnos {
  @Id
  private Integer idDiagnos;
  private long  idPrescription;
  private String currentDiagnos;
  private String healthStatus;
  private String kind;

  public Diagnos(){}

  public Diagnos( Integer idDiagnos, long idPrescription,String kind, String currentDiagnos, String healthStatus){
    this.idDiagnos = idDiagnos;
    this.idPrescription = idPrescription;
    this.currentDiagnos = currentDiagnos;
    this.kind = kind;
    this.healthStatus = healthStatus;
  }


  public Integer getIdDiagnos() {
    return idDiagnos;
  }
  public void setIdDiagnos(Integer idDiagnos) {
    this.idDiagnos = idDiagnos;
  }
  public long getIdPrescription() {
    return idPrescription;
  }
  public void setIdPrescription(Integer idPrescription) {
    this.idPrescription = idPrescription;
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
  public String getKind() {
    return kind;
  }
  public void setKind(String kind) {
    this.kind = kind;
  }


}
