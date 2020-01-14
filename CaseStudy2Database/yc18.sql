-- yc 18: 
SET SQL_SAFE_UPDATES = 0;
delete  khachhang, hopdong, hopdongchitiet from
khachhang inner join hopdong on khachhang.idKhachHang = hopdong.idKhachHang
inner join hopdongchitiet on hopdong.idHopDong = hopdongchitiet.idHopDong
 where  exists ( select hopdong.idHopDong from hopdong where year(hopdong.ngayLamHopDong) < '2016'
 and  hopdong.idKhachHang = khachhang.idKhachHang );