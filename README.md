# Spring_security_form

Simple authentification Spring security form.
Add your database in MyConfig.java

or use this database

CREATE TABLE users (
  username varchar(15),
  password varchar(100),
  enabled boolean,
  PRIMARY KEY (username)
) ;

CREATE TABLE authorities (
  username varchar(15),
  authority varchar(25),
  FOREIGN KEY (username) references users(username)
) ;

INSERT INTO users (username, password, enabled)
VALUES
	('ekaterina', '{noop}ekaterina', TRUE),
	('maria', '{noop}maria', TRUE),
	('kendrick', '{noop}kendrick', TRUE);
    
INSERT INTO authorities (username, authority)
VALUES
	('ekaterina', 'ROLE_EMPLOYEE'),
	('maria', 'ROLE_HR'),
  ('kendrick', 'ROLE_HR'),
	('kendrick', 'ROLE_MANAGER');
    
    
