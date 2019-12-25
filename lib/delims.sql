CREATE DATABASE delims;
USE delims;

CREATE TABLE delisample(
id int Primary key Auto_increment,
name VARCHAR (255) NOT NULL,
address VARCHAR (255) NOT NULL);

INSERT INTO delisample(name, address)
VALUES ("RICO","MAKATI"),
("JAO","CAVITE"),
("BITAY","CAVITE"),
("MIO","MANILA"),
("BRYAN","MANILA"),
("STANLEY","MANILA"),
("QWE","MANILA"),
("JAMES","BATANGAS");

DELIMITER \\
create procedure get1information()
Begin
	
    SELECT * FROM delisample;
        
END \\

DELIMITER ;

call get1information();

drop procedure getcount1;

DELIMITER \\
create procedure getcount()
Begin
	
    declare i varchar(255) default '0';
    set i ="makati";
    select * from delisample
    WHERE address = i;
		
END \\
DELIMITER ;


DELIMITER \\
create procedure InsertData(in f1 varchar(255),in f2 varchar(255))
Begin
	
   insert into delisample(name,address)                                                                 
   values (f1,f2);
		
END \\
DELIMITER ;

select *  from delisample;


call InsertData('neil','cav');
SELECT * FROM delisample;

DELIMITER \\
create procedure getdelete1()
Begin
	
    declare i int default '0';
    set i =1;
    delete from delisample
    WHERE id = i;
		
END \\
DELIMITER ;

call getdelete1();



