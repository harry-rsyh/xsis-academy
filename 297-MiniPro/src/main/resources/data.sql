INSERT INTO m_education_level(name, created_by, created_on)
VALUES 
    ('SD', 1, now()),
    ('SMP', 1, now()),
    ('SMA', 1, now());

INSERT INTO m_education_level(name, created_by, created_on, deleted_by, deleted_on, is_delete)
VALUES 
    ('SMK', 1, now(), 1, now(), true);

INSERT INTO m_Biodata (fullname, created_by, created_on)
VALUES 
      ('Akbal Firdaus', 1, now()),
      ('Bona Fita', 1, now()),
      ('Catherin Wilson', 1, now()),
      ('Doni Salmanan', 1, now()),
      ('Eko Kurniawan', 1, now()),
      ('Factur Rohman', 1, now());

INSERT INTO m_doctor(biodata_id, created_by, created_on)
VALUES
      (1, 1, now()),
      (2, 1, now()),
      (3, 1, now()),
      (4, 1, now());

INSERT INTO m_specialization(name, created_by, created_on)
VALUES
      ('Dokter Umum', 1, now()),
      ('Penyakit Dalam', 1, now()),
      ('Kebidanan dan Kandungan', 1, now()),
      ('Gigi dan Mulut', 1, now());

INSERT INTO t_current_doctor_specialization(doctor_id, specialization_id, created_by, created_on)
VALUES
      (2, 2, 1, now()),
      (3, 3, 1, now()),
      (1, 1, 1, now()),
      (4, 4, 1, now());