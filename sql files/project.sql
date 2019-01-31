--CREATE database IF NOT EXISTS PROJECT;
--use PROJECT;


CREATE TABLE admins (
  admin_id int(2) auto_increment,
  firstname varchar(250) not null,
  lastname varchar(250) not null,
  username varchar(250) not null unique,
  password varchar(255) not null,
  PRIMARY KEY (admin_id)
);

CREATE TABLE line_assign (
  line_assign_id int(2) auto_increment,
  machine_id varchar(250) not null ,
  line_id int(2) not null,
  PRIMARY KEY (line_assign_id)
  
);
CREATE TABLE machine (
  serial_num int(2) auto_increment,
  machine_id varchar(250) not null ,
  start_time TIME not null,
  stitches int(10) not null,
  stop_time TIME not null,
  run_time int(10) not null,
  speed int(10) not null,
  PRIMARY KEY (serial_num)
  
);



CREATE TABLE quality (
  machine_id varchar(250) not null ,
  total_product int(10) not null,
  good_product int(10) not null,
  PRIMARY KEY (machine_id)
);

create view machine_summary as
select line_id,machine_id,(sum(run_time)/300) as availability, (good_product/total_product) as quality, round(sum(stitches/((EXTRACT(SECOND FROM TIMEDIFF(stop_time,start_time)))+ EXTRACT(MINUTE FROM TIMEDIFF(stop_time,start_time))*60)),4) as performance   from (machine join line_assign using(machine_id)) join quality using(machine_id)  group by machine_id;


INSERT INTO `line_assign` (`line_assign_id`, `machine_id`, `line_id`) VALUES ('1',  '1_db', '1');
INSERT INTO `line_assign` ( `machine_id`, `line_id`) VALUES (  '2_db', '1');
INSERT INTO `line_assign` ( `machine_id`, `line_id`) VALUES (  '3_db', '2');
INSERT INTO `line_assign` ( `machine_id`, `line_id`) VALUES (  '4_db', '2');
INSERT INTO `line_assign` ( `machine_id`, `line_id`) VALUES (  '5_db', '3');
INSERT INTO `line_assign` ( `machine_id`, `line_id`) VALUES (  '6_db', '3');

INSERT INTO `admins` (`admin_id`, `firstname`, `lastname`, `username`, `password`) VALUES (NULL, 'test', 'test', 'admin', 'password');
INSERT INTO `quality` (`machine_id`, `total_product`, `good_product`) VALUES ('1_db', ' 30', '28');
INSERT INTO `quality` (`machine_id`, `total_product`, `good_product`) VALUES ('2_db', ' 60', '56');
INSERT INTO `quality` (`machine_id`, `total_product`, `good_product`) VALUES ('3_db', ' 52', '51');
INSERT INTO `quality` (`machine_id`, `total_product`, `good_product`) VALUES ('4_db', ' 48', '43');
INSERT INTO `quality` (`machine_id`, `total_product`, `good_product`) VALUES ('5_db', ' 56', '54');
INSERT INTO `quality` (`machine_id`, `total_product`, `good_product`) VALUES ('6_db', ' 71', '70');

INSERT INTO `machine` (`serial_num`, `machine_id`, `start_time`, `stitches`, `stop_time`, `run_time`, `speed`) VALUES ('1', '1_db', '10:05:46', '6492', '10:10:15', '269', '1448');
INSERT INTO `machine` ( `machine_id`, `start_time`, `stitches`, `stop_time`, `run_time`, `speed`) VALUES ( '1_db', '10:11:23', '2613', '10:12:58', '95', '1650');
INSERT INTO `machine` ( `machine_id`, `start_time`, `stitches`, `stop_time`, `run_time`, `speed`) VALUES ( '1_db', '10:13:04', '3507', '10:17:02', '238', '884');
INSERT INTO `machine` ( `machine_id`, `start_time`, `stitches`, `stop_time`, `run_time`, `speed`) VALUES ( '1_db', '10:25:06', '3802', '10:28:19', '193', '1182');
INSERT INTO `machine` ( `machine_id`, `start_time`, `stitches`, `stop_time`, `run_time`, `speed`) VALUES ( '1_db', '10:45:23', '4012', '10:48:34', '191', '1260');
INSERT INTO `machine` ( `machine_id`, `start_time`, `stitches`, `stop_time`, `run_time`, `speed`) VALUES ( '1_db', '10:49:14', '7743', '10:56:34', '420', '1106');
INSERT INTO `machine` ( `machine_id`, `start_time`, `stitches`, `stop_time`, `run_time`, `speed`) VALUES ( '2_db', '10:05:36', '6300', '10:12:12', '399', '1560');
INSERT INTO `machine` ( `machine_id`, `start_time`, `stitches`, `stop_time`, `run_time`, `speed`) VALUES ( '2_db', '10:13:23', '2123', '10:15:58', '102', '1723');
INSERT INTO `machine` ( `machine_id`, `start_time`, `stitches`, `stop_time`, `run_time`, `speed`) VALUES ( '2_db', '10:16:04', '3507', '10:20:03', '240', '920');
INSERT INTO `machine` ( `machine_id`, `start_time`, `stitches`, `stop_time`, `run_time`, `speed`) VALUES ( '2_db', '10:25:56', '3903', '10:29:20', '201', '1182');
INSERT INTO `machine` ( `machine_id`, `start_time`, `stitches`, `stop_time`, `run_time`, `speed`) VALUES ( '2_db', '10:45:23', '4011', '10:52:34', '436', '1230');
INSERT INTO `machine` ( `machine_id`, `start_time`, `stitches`, `stop_time`, `run_time`, `speed`) VALUES ( '2_db', '10:54:24', '7835', '11:03:02', '543', '1057');
INSERT INTO `machine` ( `machine_id`, `start_time`, `stitches`, `stop_time`, `run_time`, `speed`) VALUES ( '3_db', '10:00:00', '6492', '10:08:09', '532', '1230');
INSERT INTO `machine` ( `machine_id`, `start_time`, `stitches`, `stop_time`, `run_time`, `speed`) VALUES ( '3_db', '10:09:23', '2613', '10:12:14', '104', '1982');
INSERT INTO `machine` ( `machine_id`, `start_time`, `stitches`, `stop_time`, `run_time`, `speed`) VALUES ( '3_db', '10:13:04', '3507', '10:16:02', '159', '725');
INSERT INTO `machine` ( `machine_id`, `start_time`, `stitches`, `stop_time`, `run_time`, `speed`) VALUES ( '3_db', '10:24:03', '3802', '10:29:03', '330', '1760');
INSERT INTO `machine` ( `machine_id`, `start_time`, `stitches`, `stop_time`, `run_time`, `speed`) VALUES ( '3_db', '10:46:02', '4012', '10:49:02', '162', '1720');
INSERT INTO `machine` ( `machine_id`, `start_time`, `stitches`, `stop_time`, `run_time`, `speed`) VALUES ( '3_db', '10:49:14', '7743', '10:59:03', '661', '1789');
INSERT INTO `machine` ( `machine_id`, `start_time`, `stitches`, `stop_time`, `run_time`, `speed`) VALUES ( '4_db', '10:02:11', '6492', '10:05:23', '230', '1463');
INSERT INTO `machine` ( `machine_id`, `start_time`, `stitches`, `stop_time`, `run_time`, `speed`) VALUES ( '4_db', '10:06:23', '2613', '10:13:14', '142', '1765');
INSERT INTO `machine` ( `machine_id`, `start_time`, `stitches`, `stop_time`, `run_time`, `speed`) VALUES ( '4_db', '10:14:02', '3507', '10:15:01', '230', '200');
INSERT INTO `machine` ( `machine_id`, `start_time`, `stitches`, `stop_time`, `run_time`, `speed`) VALUES ( '4_db', '10:15:59', '3802', '10:22:31', '400', '985');
INSERT INTO `machine` ( `machine_id`, `start_time`, `stitches`, `stop_time`, `run_time`, `speed`) VALUES ( '4_db', '10:30:04', '4012', '10:48:02', '1200', '1765');
INSERT INTO `machine` ( `machine_id`, `start_time`, `stitches`, `stop_time`, `run_time`, `speed`) VALUES ( '4_db', '10:51:00', '7743', '10:59:25', '604', '1890');
INSERT INTO `machine` ( `machine_id`, `start_time`, `stitches`, `stop_time`, `run_time`, `speed`) VALUES ( '5_db', '10:01:23', '6492', '10:06:10', '276', '963');
INSERT INTO `machine` ( `machine_id`, `start_time`, `stitches`, `stop_time`, `run_time`, `speed`) VALUES ( '5_db', '10:06:12', '2613', '10:12:13', '411', '1650');
INSERT INTO `machine` ( `machine_id`, `start_time`, `stitches`, `stop_time`, `run_time`, `speed`) VALUES ( '5_db', '10:13:04', '3507', '10:15:21', '114', '1278');
INSERT INTO `machine` ( `machine_id`, `start_time`, `stitches`, `stop_time`, `run_time`, `speed`) VALUES ( '5_db', '10:23:01', '3802', '10:31:02', '582', '1790');
INSERT INTO `machine` ( `machine_id`, `start_time`, `stitches`, `stop_time`, `run_time`, `speed`) VALUES ( '5_db', '10:32:02', '4012', '10:35:46', '201', '1563');
INSERT INTO `machine` ( `machine_id`, `start_time`, `stitches`, `stop_time`, `run_time`, `speed`) VALUES ( '5_db', '10:41:14', '7743', '10:42:03', '52', '1297');
INSERT INTO `machine` ( `machine_id`, `start_time`, `stitches`, `stop_time`, `run_time`, `speed`) VALUES ( '6_db', '10:00:01', '6492', '10:06:10', '399', '1204');
INSERT INTO `machine` ( `machine_id`, `start_time`, `stitches`, `stop_time`, `run_time`, `speed`) VALUES ( '6_db', '10:06:58', '2613', '10:14:25', '432', '1950');
INSERT INTO `machine` ( `machine_id`, `start_time`, `stitches`, `stop_time`, `run_time`, `speed`) VALUES ( '6_db', '10:15:23', '3507', '10:17:28', '179', '932');
INSERT INTO `machine` ( `machine_id`, `start_time`, `stitches`, `stop_time`, `run_time`, `speed`) VALUES ( '6_db', '10:22:01', '3802', '10:32:01', '1120', '1450');
INSERT INTO `machine` ( `machine_id`, `start_time`, `stitches`, `stop_time`, `run_time`, `speed`) VALUES ( '6_db', '10:32:02', '4012', '10:35:46', '212', '2017');
INSERT INTO `machine` ( `machine_id`, `start_time`, `stitches`, `stop_time`, `run_time`, `speed`) VALUES ( '6_db', '10:38:04', '7743', '10:51:05', '1260', '1263');
