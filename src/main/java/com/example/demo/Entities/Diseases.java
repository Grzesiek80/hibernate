package com.example.demo.Entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Diseases {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String name;
    @OneToOne //jeden lekarz przypisuje jedną chorobę
    private Doctors doctors;
    // tu wstawione
    @ManyToMany(mappedBy = "disease")
    private List<Patients> patient = new ArrayList<>();

    public List<Patients> getPatient(){
        return patient;
    }

    public void addPatients(Patients patients) { patient.add(patients);
    }
// tu
    public Doctors getDoctors() {
        return doctors;
    }

    public void setDoctors(Doctors doctors) {
        this.doctors = doctors;
    }

    protected Diseases() {}

    public Diseases(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Diseases{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
