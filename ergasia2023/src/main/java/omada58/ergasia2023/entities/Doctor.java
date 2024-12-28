package omada58.ergasia2023.entities;

import jakarta.persistence.*;
import org.hibernate.type.descriptor.jdbc.JdbcTypeFamilyInformation;

import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "doctor")
public class Doctor {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer doctorid;
    @Column
    private String doctorFName;
    @Column
    private String doctorLName;
    @Column
    private String doctorUserame;
    @Column
    private String doctorPassword;
    @Column
    private String doctorArea;

    @OneToMany(mappedBy = "doctor", cascade = CascadeType.ALL)
    private List<Family> families;


    public void addFamily(Family family) {
        families.add(family);
        family.setDoctor(this);
    }

    // constructor γιατρού ως user
    public Doctor(String doctorFName, String doctorLName, String doctorUserame, String doctorPassword, String doctorArea) {
        this.doctorFName = doctorFName;
        this.doctorLName = doctorLName;
        this.doctorUserame = doctorUserame;
        this.doctorPassword = doctorPassword;
        this.doctorArea = doctorArea;
    }

    // setters and getters
    public Integer getId() {
        return doctorid;
    }

    public void setId(Integer doctorid) {
        this.doctorid = doctorid;
    }

    public String getFirstName() {
        return doctorFName;
    }

    public void setFirstName(String doctorFName) {
        this.doctorFName = doctorFName;
    }

    public String getLastName() {
        return doctorLName;
    }

    public void setLastName(String doctorLName) {
        this.doctorLName = doctorLName;
    }

    public String getUsername() {
        return doctorUserame;
    }

    public void setUsername(String doctorUserame) {
        this.doctorUserame = doctorUserame;
    }

    public String getPassword() {
        return doctorPassword;
    }

    public void setPassword(String doctorPassword) {
        this.doctorPassword = doctorPassword;
    }

    public String getArea() {
        return doctorArea;
    }

    public void setArea(String doctorArea) {
        this.doctorArea = doctorArea;
    }

    // το jpa χρειαζεται αδειο constructor(?)
    public Doctor() {
    }

    // toString για debugging
    @Override
    public String toString() {
        return "Doctor{" +
                "doctorid=" + doctorid +
                ", doctorFName='" + doctorFName + '\'' +
                ", doctorLName='" + doctorLName + '\'' +
                ", doctorUserame='" + doctorUserame + '\'' +
                ", doctorPassword='" + doctorPassword + '\'' +
                ", doctorArea='" + doctorArea + '\'' +
                '}';
    }
}
