-- yc15: 
select nhanvien.idNhanVien, nhanvien.HoTenNhanVien, trinhdo.trinhDo , bophan.tenBoPhan , nhanvien.Diachi, nhanvien.Sdt
from hopdong 
inner join nhanvien on nhanvien.idNhanVien = hopdong.idNhanVien
inner join trinhdo on trinhdo.idTrinhDo = nhanvien.idTrinhDo
inner join bophan on bophan.idBoPhan = nhanvien.idBoPhan
where exists (select* from hopdong where year(hopdong.ngayLamHopDong) between '2018' and '2019')
group by nhanvien.HoTenNhanVien
having count(hopdong.idHopDong) <= 3 
