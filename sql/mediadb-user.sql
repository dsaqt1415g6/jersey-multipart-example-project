drop user 'media'@'localhost';
create user 'media'@'localhost' identified by 'media';
grant all privileges on mediadb.* to 'media'@'localhost';
flush privileges;