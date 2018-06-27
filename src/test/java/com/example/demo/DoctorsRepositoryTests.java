package com.example.demo;

import com.example.demo.Repositories.DoctorRepository;
import com.example.demo.Repositories.PatientsRepository;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
@Transactional
public class DoctorsRepositoryTests {
    @Autowired
    EntityManager em;
    @Autowired
    DoctorRepository doctorRepository;

    Logger logger = LoggerFactory.getLogger(this.getClass());
}
