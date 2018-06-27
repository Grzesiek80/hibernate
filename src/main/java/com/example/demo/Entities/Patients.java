package com.example.demo.Entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Patients {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String name;

    @ManyToOne //wielu pacjentów może mieć jednego lekarza
    private Doctors doctors;
//tu wstawione
    @ManyToMany
    @JoinTable(
            name = "PATIENTS_DISEASES",
            joinColumns = @JoinColumn(name = "PATIENTS_ID"),
            inverseJoinColumns = @JoinColumn(name = "DISEASES_ID")
    )
    private List<Diseases> disease = new ArrayList<>();

    public List<Diseases> getDisease() {
        return disease;
    }

    public void addDoctors(Diseases diseases) { disease.add(diseases);
    }
//
    public Doctors getDoctors() {
        return doctors;
    }

    public void setDoctors(Doctors doctors) {
        this.doctors = doctors;
    }

    protected Patients() {}

    public Patients(String name) {
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
        return "Patients{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
