package com.devsuperior.bds01.dto;

import com.devsuperior.bds01.entities.Department;
import java.io.Serializable;
import java.util.Objects;

public class DepartmentDTO implements Serializable {

  private static final long serialVersionUID = -23887269L;

  private Long id;
  private String name;

  public DepartmentDTO() {}

  public DepartmentDTO(Long id, String name) {
    this.id = id;
    this.name = name;
  }

  public DepartmentDTO(Department entity) {
    this.id = entity.getId();
    this.name = entity.getName();
  }

  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DepartmentDTO id(Long id) {
    setId(id);
    return this;
  }

  public DepartmentDTO name(String name) {
    setName(name);
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) return true;
    if (!(o instanceof DepartmentDTO)) {
      return false;
    }
    DepartmentDTO departmentDTO = (DepartmentDTO) o;
    return (
      Objects.equals(id, departmentDTO.id) &&
      Objects.equals(name, departmentDTO.name)
    );
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }
}
