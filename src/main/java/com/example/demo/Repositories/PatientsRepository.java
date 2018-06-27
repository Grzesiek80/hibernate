package com.example.demo.Repositories;

import com.example.demo.Entities.Patients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@Repository
@Transactional
public class PatientsRepository {

    @Autowired
    EntityManager em;

    public Patients save(Patients patients) {
        if (patients.getId() == null) {
            em.persist(patients);
        } else {
            em.merge(patients);
        }
        return patients;
    }

    public Patients findById(Long id) {
        return em.find(Patients.class, id);
    }

    public void deleteById(Long id) {
        Patients patients = findById(id);
        em.remove(patients);
    }

}