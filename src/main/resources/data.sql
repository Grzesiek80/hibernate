insert into doctors(id, name, speciality) values(22, 'Dr.Uncle', 'cardiologist');
insert into doctors(id, name, speciality) values(33, 'Dr.Ben', 'laryngologist');
insert into doctors(id, name, speciality) values(44, 'Dr.Agent', 'surgeon');


insert into patients(id, name,doctors_id) values(10,'Jan', 22);
insert into patients(id, name,doctors_id) values(11, 'Zenek',22);
insert into patients(id, name,doctors_id) values(12, 'Fanek',22);
insert into patients(id, name,doctors_id) values(13, 'Ilona',33);
insert into patients(id, name,doctors_id) values(14, 'Ala',44);

insert into diseases(id, name, doctors_id) values(222, 'hear_tache', 22);
insert into diseases(id, name, doctors_id) values(333, 'ear_ache', 33);
insert into diseases(id, name, doctors_id) values(444, 'break_arm', 44);


insert into patients_diseases(patients_id, diseases_id) VALUES (10, 222);
insert into patients_diseases(patients_id, diseases_id) VALUES (10, 333);
insert into patients_diseases(patients_id, diseases_id) VALUES (10, 444);
insert into patients_diseases(patients_id, diseases_id) VALUES (11, 222);
insert into patients_diseases(patients_id, diseases_id) VALUES (11, 444);
insert into patients_diseases(patients_id, diseases_id) VALUES (12, 222);

