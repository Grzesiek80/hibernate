package com.example.demo.Repositories;

import com.example.demo.Entities.Doctors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@Repository
@Transactional
public class DoctorRepository {
    @Autowired
    EntityManager em;

    public Doctors save(Doctors doctors) {
        if (doctors.getId() == null) {
            em.persist(doctors);
        } else {
            em.merge(doctors);
        }
        return doctors;
    }

    public Doctors findById(Long id) {
        return em.find(Doctors.class, id);
    }

    public Doctors findBySpeciality(String speciality) {
        return em.find(Doctors.class, speciality);
    }


    public void deleteById(Long id) {
        Doctors doctors = findById(id);
        em.remove(doctors);
    }

}
