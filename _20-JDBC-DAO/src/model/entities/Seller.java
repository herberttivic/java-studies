package model.entities;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

public class Seller implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String name;
    private String email;
    private Date BirthDate;
    private Integer baseSalary;

    private Department department;

    public Seller(){

    }
    public Seller( Integer id, String name, String email, Integer baseSalary, Date birthDate, Department department) {
        this.department = department;
        this.baseSalary = baseSalary;
        BirthDate = birthDate;
        this.email = email;
        this.name = name;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(Date birthDate) {
        BirthDate = birthDate;
    }

    public Integer getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Integer baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Department seller = (Department) o;
        return getId().equals(seller.getId());
    }

    @Override
    public int hashCode() {
        return getId().hashCode();
    }

    @Override
    public String toString() {
        return "Seller{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", BirthDate=" + BirthDate +
                ", baseSalary=" + baseSalary +
                ", department=" + department +
                '}';
    }
}