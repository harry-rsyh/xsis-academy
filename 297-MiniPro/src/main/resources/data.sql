-- Education Level
-- Master
-- M1
INSERT INTO m_education_level(name, created_by, created_on)
VALUES 
    ('SD', 1, now()),
    ('SMP', 1, now()),
    ('SMA', 1, now());

-- M2
INSERT INTO m_education_level(name, created_by, created_on, deleted_by, deleted_on, is_delete)
VALUES 
    ('SMK', 1, now(), 1, now(), true);

-- End Education Level

-- Cari Dokter
-- Master
-- M1
INSERT INTO m_biodata(fullname, mobile_phone, image_path,created_by, created_on)
VALUES
      ('Dalima Pertiwi', '026666474300', '1-Dalima-Pertiwi.jpg', 1, now()),
      ('Salwa Anggraini', '626877938379', '2-Salwa-Anggraini.jpg', 1, now()),
      ('Hilda Susanti', '02284712581', '3-Hilda-Susanti.jpg', 1, now()),
      ('Jaeman Wacana', '6292264540072', '4-Jaeman-Wacana.jpg', 1, now()),
      ('Intan Prastuti', '6224891875367', '5-Intan-Prastuti.jpg', 1, now()),
      ('Laras Wulandari', '07737592442', '6-Laras-Wulandari.jpg', 1, now()),
      ('Kasim Prasetya', '02149154608', '7-Kasim-Prasetya.jpg', 1, now()),
      ('Cakrabuana Nashiruddin', '08123456890', '8-Cakrabuana-Nashiruddin.jpg', 1, now()),
      ('Elma Mardhiyah', '04854864347', '9-Elma-Mardhiyah.jpg', 1, now()),
      ('Dwi Haryanto', '6222280905376', '10-Dwi-Haryanto.jpg', 1, now()),
      ('Irma Usada', '063532142354', '11-Irma-Usada.jpg', 1, now()),
      ('Olivia Melani', '0825319632', '12-Olivia-Melani.jpg', 1, now()),
      ('Cinta Mardhiyah', '625320791284', '13-Cinta-Mardhiyah.jpg', 1, now()),
      ('Septi Riyanti', '099886518533', '14-Septi-Riyanti.jpg', 1, now()),
      ('Hasim Dabukke', '051695720216', '15-Hasim-Dabukke.jpg', 1, now());

-- M2
INSERT INTO m_doctor(biodata_id, created_by, created_on)
VALUES
      (1, 1, now()),
      (2, 1, now()),
      (3, 1, now()),
      (4, 1, now()),
      (5, 1, now()),
      (6, 1, now()),
      (7, 1, now()),
      (8, 1, now()),
      (9, 1, now()),
      (10, 1, now()),
      (11, 1, now()),
      (12, 1, now()),
      (13, 1, now()),
      (14, 1, now()),
      (15, 1, now());

-- M3
INSERT INTO m_location_level(name, abbreviation, created_by, created_on)
VALUES
      ('Provinsi', 'Prov', 1, now()),
      ('Kabupaten', 'Kab', 1, now()),
      ('Kota', 'Kota', 1, now()),
      ('Kecamatan', 'Kec', 1, now());

-- M4
INSERT INTO m_location(name, parent_id, location_level_id, created_by, created_on)
VALUES
      ('Semarang', null, 3, 1, now()),
      ('Gayamsari', 1, 4, 1, now()),
      ('Semarang Tengah', 1, 4, 1, now()),
      ('Tembalang', 1, 4, 1, now()),
      ('Jakarta Selatan', null, 3, 1, now()),
      ('Pasar Minggu', 5, 4, 1, now()),
      ('Tebet', 5, 4, 1, now());

-- M5
INSERT INTO m_specialization(name, created_by, created_on)
VALUES
      ('Dokter Umum', 1, now()),
      ('Dokter Kandungan', 1, now()),
      ('Dokter Mata', 1, now());

INSERT INTO m_specialization(name, created_by, created_on, is_delete, deleted_by, deleted_on)
VALUES
      ('Dokter THT', 1, now(), true, 1, now());

-- M6
INSERT INTO m_medical_facility(name, full_address , location_id, created_by, created_on)
VALUES
      ('RS Bhayangkara Semarang', 'Jl. Majapahit No.140, Gayamsari, Kec. Gayamsari, Kota Semarang, Jawa Tengah 50248', 2, 1, now()),
      ('RS Hermina Pandanaran', 'Jl. Pandanaran Kel No.24, Pekunden, Kec. Semarang Tengah, Kota Semarang, Jawa Tengah 50134', 3, 1, now()),
      ('RS Nasional Diponegoro','Jl. Prof. H. Soedarto S.H No.1, Tembalang, Kec. Tembalang, Kota Semarang, Jawa Tengah 50275', 4, 1, now()),
      ('RSUD Pasar Minggu','Jl. TB Simatupang No.1, Ragunan, Kec. Pasar Minggu, Kota Jakarta Selatan, DKI Jakarta 12550', 6, 1, now()),
      ('RSUD Tebet','Jl. Prof. DR. Soepomo SH No.54, Tebet Barat, Kec. Tebet, Kota Jakarta Selatan, DKI Jakarta 12810', 7, 1, now());

-- Transaction
-- T1
INSERT INTO t_doctor_current_specialization(doctor_id, specialization_id, created_by, created_on)
VALUES
      (1, 1, 1, now()),
      (2, 1, 1, now()),
      (3, 1, 1, now()),
      (4, 1, 1, now()),
      (5, 1, 1, now()),
      (6, 2, 1, now()),
      (7, 2, 1, now()),
      (8, 2, 1, now()),
      (9, 2, 1, now()),
      (10, 2, 1, now()),
      (11, 3, 1, now()),
      (12, 3, 1, now()),
      (13, 3, 1, now()),
      (14, 3, 1, now()),
      (15, 3, 1, now());

-- T2
INSERT INTO t_doctor_office(doctor_id, medical_facility_id, specialization, created_by, created_on)
VALUES
      (1, 1, 'Dokter Umum', 1, now()),
      (1, 2, 'Dokter Umum', 1, now()),
      (2, 2, 'Dokter Umum', 1, now()),
      (2, 3, 'Dokter Umum', 1, now()),
      (3, 3, 'Dokter Umum', 1, now()),
      (3, 1, 'Dokter Umum', 1, now()),
      (4, 4, 'Dokter Umum', 1, now()),
      (4, 5, 'Dokter Umum', 1, now()),
      (5, 5, 'Dokter Umum', 1, now()),

      (6, 1, 'Dokter Kandungan', 2, now()),
      (6, 3, 'Dokter Kandungan', 2, now()),
      (7, 2, 'Dokter Kandungan', 2, now()),
      (7, 3, 'Dokter Kandungan', 2, now()),
      (8, 1, 'Dokter Kandungan', 2, now()),
      (8, 2, 'Dokter Kandungan', 2, now()),
      (9, 4, 'Dokter Kandungan', 2, now()),
      (10, 5, 'Dokter Kandungan', 2, now()),

      (11, 1, 'Dokter Mata', 2, now()),
      (12, 1, 'Dokter Mata', 2, now()),
      (12, 2, 'Dokter Mata', 2, now()),
      (13, 3, 'Dokter Mata', 2, now()),
      (14, 4, 'Dokter Mata', 2, now()),
      (14, 5, 'Dokter Mata', 2, now()),
      (15, 4, 'Dokter Mata', 2, now());

-- T3
INSERT INTO t_doctor_treatment(doctor_id, name, created_by, created_on)
VALUES 
      (1, 'Konsultasi Kesehatan Umum', 1, now()),
      (1, 'Medical Check up', 1, now()),
      (1, 'Perawatan Luka', 1, now()),

      (2, 'Konsultasi Kesehatan Umum', 1, now()),
      (2, 'Medical Check up', 1, now()),
      (2, 'Perawatan Luka', 1, now()),
      
      (3, 'Konsultasi Kesehatan Umum', 1, now()),
      (3, 'Medical Check up', 1, now()),
      (3, 'Perawatan Luka', 1, now()),
      
      (4, 'Konsultasi Kesehatan Umum', 1, now()),
      (4, 'Medical Check up', 1, now()),
      (4, 'Perawatan Luka', 1, now()),

      (5, 'Konsultasi Kesehatan Umum', 1, now()),
      (5, 'Medical Check up', 1, now()),
      (5, 'Perawatan Luka', 1, now()),

      (6, 'Konsultasi Kehamilan', 1, now()),
      (6, 'Persalinan', 1, now()),
      (6, 'Suntik KB', 1, now()),

      (7, 'Konsultasi Kehamilan', 1, now()),
      (7, 'Persalinan', 1, now()),
      (7, 'Suntik KB', 1, now()),

      (8, 'Konsultasi Kehamilan', 1, now()),
      (8, 'Persalinan', 1, now()),
      (8, 'Suntik KB', 1, now()),

      (9, 'Konsultasi Kehamilan', 1, now()),
      (9, 'Persalinan', 1, now()),
      (9, 'Suntik KB', 1, now()),
      
      (10, 'Konsultasi Kehamilan', 1, now()),
      (10, 'Persalinan', 1, now()),
      (10, 'Suntik KB', 1, now()),

      (11, 'Pemeriksaan dan Konsultasi Mata', 1, now()),
      (11, 'Operasi Mata', 1, now()),
      (11, 'Pemeriksaan Visus Mata', 1, now()),

      (12, 'Pemeriksaan dan Konsultasi Mata', 1, now()),
      (12, 'Operasi Mata', 1, now()),
      (12, 'Pemeriksaan Visus Mata', 1, now()),

      (13, 'Pemeriksaan dan Konsultasi Mata', 1, now()),
      (13, 'Operasi Mata', 1, now()),
      (13, 'Pemeriksaan Visus Mata', 1, now()),
      
      (14, 'Pemeriksaan dan Konsultasi Mata', 1, now()),
      (14, 'Operasi Mata', 1, now()),
      (14, 'Pemeriksaan Visus Mata', 1, now()),
      
      (15, 'Pemeriksaan dan Konsultasi Mata', 1, now()),
      (15, 'Operasi Mata', 1, now()),
      (15, 'Pemeriksaan Visus Mata', 1, now());



-- End Cari Dokter
