package ua.kpi.myhospital.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Prescription {
  @Id
  private Integer id_prescription;
  private int id_doc;
  private int id_patient;
  private int id_executor;
  private String kind;
  public Prescription() {}
  public Prescription(Integer id_prescription,String kind, int id_doc, int id_patient, int id_executor) {
    this.id_prescription = id_prescription;
    this.id_doc = id_doc;
    this.id_patient = id_patient;
    this.kind = kind;
    this.id_executor = id_executor;
  }


  @OneToMany(mappedBy = "prescription_diagnosis")
  @JsonIgnore
  private List<Diagnos> diagnosList;

  @ManyToMany(fetch = FetchType.LAZY)
  @JsonIgnore
  @JoinColumns({
          @JoinColumn(name = "id_doc", referencedColumnName = "id_user", insertable = false, updatable = false),
          @JoinColumn(name = "id_executor", referencedColumnName = "id_user", insertable = false, updatable = false),
          @JoinColumn(name = "id_patient", referencedColumnName = "id_user", insertable = false, updatable = false)
  })
  private List<User> user_prescription;


  public Integer getId_prescription() {
    return id_prescription;
  }

  public void setId_prescription(Integer id_prescription) {
    this.id_prescription = id_prescription;
  }

  public int getId_doc() {
    return id_doc;
  }

  public void setId_doc(int id_doc) {
    this.id_doc = id_doc;
  }

  public int getId_patient() {
    return id_patient;
  }

  public void setId_patient(int id_patient) {
    this.id_patient = id_patient;
  }

  public int getId_executor() {
    return id_executor;
  }

  public void setId_executor(int id_executor) {
    this.id_executor = id_executor;
  }

  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }
}
