use database1;
create table pincodes(pincode bigint primary key, location varchar(100), state_id varchar(2), country_id varchar(2));
insert into pincodes (pincode,location,state_id,country_id)values
(560083,"Gottigere", "KN","IN"),
(560100,"Electronic city","KN","IN"),
(827013,"Bokharo","JH","IN"),
(577228,"Tarikere","KN","IN"),
(576101,"Udupi","KN","IN"),
(576227,"Shankar Narayana","KN","IN");
select * from pincodes;
select * from pincodes where pincode=560083;