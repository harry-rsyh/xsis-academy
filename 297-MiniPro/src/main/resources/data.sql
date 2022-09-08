INSERT INTO m_education_level(name, created_by, created_on)
VALUES 
    ('SD', 1, now()),
    ('SMP', 1, now()),
    ('SMA', 1, now());

INSERT INTO m_education_level(name, created_by, created_on, is_delete)
VALUES 
    ('SMK', 1, now(), true);