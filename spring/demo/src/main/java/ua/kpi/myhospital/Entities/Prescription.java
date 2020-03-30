package ua.kpi.myhospital.Entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "prescription",schema = "myhospital")
public class Prescription {
  @Id
  private Integer idPrescription;
  private int idDoc;
  private int idPatient;
  private int idExecutor;


//  @ManyToOne(fetch = FetchType.LAZY)
//  @JoinColumns({
//          @JoinColumn(name ="id_doc", referencedColumnName = "id_user"),
//          @JoinColumn(name="id_executor", referencedColumnName = "id_user"),
//          @JoinColumn(name="id_patient", referencedColumnName = "id_user")
//  })
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumns({
          @JoinColumn(name = "id_doc", referencedColumnName = "id_user"),
          @JoinColumn(name = "id_executor", referencedColumnName = "id_user"),
          @JoinColumn(name = "id_patient", referencedColumnName = "id_user")
  })
  private User user_prescription;


  public Prescription() {}

  public Prescription(Integer idPrescription, int idDoc, int idPatient, int idExecutor) {
    this.idPrescription = idPrescription;
    this.idDoc = idDoc;
    this.idPatient = idPatient;
    this.idExecutor = idExecutor;
  }

  public Integer getIdPrescription() {
    return idPrescription;
  }

  public void setIdPrescription(Integer idPrescription) {
    this.idPrescription = idPrescription;
  }


  public int getIdDoc() {
    return idDoc;
  }

  public void setIdDoc(int idDoc) {
    this.idDoc = idDoc;
  }


  public int getIdPatient() {
    return idPatient;
  }

  public void setIdPatient(int idPatient) {
    this.idPatient = idPatient;
  }


  public int getIdExecutor() {
    return idExecutor;
  }

  public void setIdExecutor(int idExecutor) {
    this.idExecutor = idExecutor;
  }

}
