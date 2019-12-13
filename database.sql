
CREATE DATABASE IF NOT EXISTS assignment_mvc;

USE assignment_mvc;

CREATE TABLE IF NOT EXISTS trainers (
  id INT(11) NOT NULL AUTO_INCREMENT,
  fname VARCHAR(30) NOT NULL,
  lname VARCHAR(30) NOT NULL,
  subject VARCHAR(40) NOT NULL,
  PRIMARY KEY (id));

INSERT INTO trainers VALUES 
  (1, 'O-Ren', 'Ishi', 'Java'),
  (2, 'Beatrix', 'Kiddo', 'Katana'),
  (3, 'Hatori', 'Hanzo', 'Sushi'),
  (4, 'Elle', 'Driver', 'Poison');
  
