package ua.kpi.myhospital.Entities;

import lombok.Data;

import javax.naming.Name;
import javax.persistence.*;
import java.util.List;


@Entity
@Data
//@Table(name = "user",schema = "myhospital")
public class User {
  @Id
  private Integer idUser;
  private String name;
  private String surName;
  private String role;

  @OneToMany(mappedBy = "user_prescription", fetch = FetchType.LAZY)
  private List<Prescription> prescriptions;

  public User() {
  }

  public User(Integer idUser, String login, String password, String name, String surName, String role){
    this.idUser = idUser;
    this.name = name;
    this.surName = surName;
    this.role = role;
  }
  public long getIduser() {
    return idUser;
  }

  public void setIduser(Integer idUser) {
    this.idUser = idUser;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getSurName() {
    return surName;
  }

  public void setSurName(String surName) {
    this.surName = surName;
  }


  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

}
