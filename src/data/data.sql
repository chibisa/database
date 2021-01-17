create schema if not exists store_cms_plusplus default character set utf8mb4;
use store_cms_plusplus;
create table laptop (
id int not null auto_increment primary key,
name varchar(255) null,
url varchar(255) null,
maker varchar(45) null,
type varchar(45) null,
ram varchar(45) null,
cpu varchar(45) null,
ssd varchar(45) null,
hdd varchar(45) null,
 price float null,
 card varchar(45) null,
 screen_resolution varchar(45) ,
screen_size float null,
 sold int null,
 create_timestamp Timestamp(6) not null default CURRENT_TIMESTAMP(6),
last_update_timestamp timestamp(6) not null default current_timestamp(6));
INSERT INTO `laptop` VALUES (1,'Laptop ASUS VivoBook X407MA-BV169T (14\" HD/N5000/4GB/1TB HDD/UHD 605/Win10/1.7 kg)','https://phongvu.vn/may-tinh-xach-tay-laptop-asus-x407ma-bv169t-n5000-s19010084.html','ASUS','VivoBook','4GB','Intel Pentium Silver N5000',NULL,'1TB',7290000,'Intel UHD Graphics 605','1366x768',14,20,'2020-07-01 04:29:25.934113','2020-07-01 04:29:25.934113'),(2,'Laptop Apple MacBook Air 13\" 2019 MVFL2SA/A (Core i5/8GB/256GB SSD/UHD 617/macOS/1.3 kg)','https://phongvu.vn/may-tinh-xach-tay-laptop-macbook-air-2019-mvfl2saa-bac-s190800125.html','APPLE','MacBook Air','8GB','Intel Core i5','256GB',NULL,36990000,'Intel UHD Graphics 617','2560x1600',13.3,50,'2020-07-01 04:31:40.663343','2020-07-01 04:31:40.663343'),(3,'Laptop Acer Nitro 5 AN515-54-51X1 (NH.Q5ASV.011) (15\" FHD/i5-9300H/8GB/256GB SSD/GTX 1050/Win10/2.3 kg)','https://phongvu.vn/may-tinh-xach-tay-laptop-acer-nitro-5-an5155451x1-nhq5asv011-i59300h-den-s190800378.html','ACER','Nitro 5','8GB','Intel Core i5 9300H','256GB',NULL,18890000,'NVIDIA GeForce GTX 1050 3GB GDDR5','1920x1080',15.6,26,'2020-07-01 04:39:53.956475','2020-07-01 04:39:53.956475'),(4,'Laptop HP 14s-dk0097AU 7VH92PA (14\" HD/AMD Ryzen 3 3200U/4GB/1TB HDD/Windows 10 Home 64-bit/1.5kg)','https://phongvu.vn/may-tinh-xach-tay-laptop-hp-14sdk0097au-7vh92pa-amd-ryzen-3-3200u-bac-s190800176.html','HP',NULL,'4GB','AMD Ryzen 3 3200U',NULL,'1TB',8990000,'AMD Radeon Vega 3 Graphics','1366x768',14,36,'2020-07-01 04:41:39.031139','2020-07-01 04:41:39.031139');
select * from store_cms_plusplus.laptop;
INSERT INTO `laptop` VALUES (5,'Laptop ASUS VivoBook X407MA-BV169T (14\" HD/N5000/4GB/1TB HDD/UHD 605/Win10/1.7 kg)','https://phongvu.vn/may-tinh-xach-tay-laptop-asus-x407ma-bv169t-n5000-s19010084.html','ASUS','VivoBook','4GB','Intel Pentium Silver N5000',NULL,'1TB',7290000,'Intel UHD Graphics 605','1366x768',14,20, current_timestamp,current_timestamp());