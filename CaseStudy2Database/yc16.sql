-- yc16 : 
delete from nhanvien where not exists (select* from hopdong where hopdong.idNhanVien = nhanvien.idNhanVien 
and hopdong.idHopDong = hopdongchitiet.idHopDong
and (year(hopdong.ngayLamHopDong) between '2017' and '2019'));
 
 