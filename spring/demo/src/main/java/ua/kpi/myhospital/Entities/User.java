package ua.kpi.myhospital.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.List;


@Entity
@Data
@Table(name = "user",schema = "myhospital")
public class User {
  @Id
  private Integer id_user;
  private String name;
  private String surName;
  private String role;


  public User() {
  }

  public User(Integer id_user, String name, String surName, String role) {
    this.id_user = id_user;
    this.name = name;
    this.surName = surName;
    this.role = role;
  }

  @ManyToMany(mappedBy = "user_prescription")
  @JsonIgnore
  private List<Prescription> prescriptions;


  public Integer getId_user() {
    return id_user;
  }

  public void setId_user(Integer id_user) {
    this.id_user = id_user;
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
