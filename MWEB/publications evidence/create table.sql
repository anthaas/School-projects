 CREATE TABLE PUBLICATIONS (   id int(11) NOT NULL auto_increment,   Author varchar(255) NOT NULL default '',   Title varchar(255) NOT NULL default '',   Edition varchar(255),   Year int(11),   Location varchar(255),   Publisher varchar(255),   Pagetotal int(11), Type varchar(255),  PRIMARY KEY  (id) );

INSERT INTO PUBLICATIONS VALUES (NULL, 'me', 'my awesome title', 'first edition', 2016, 'Olomouc', 'self', 1024, 'book');
