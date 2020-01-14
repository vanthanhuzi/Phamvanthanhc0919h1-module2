select dichvu.idDichVu, dichvu.tenDichVu , dichvu.dienTich, dichvu.soNguoiToiDa, dichvu.chiPhiThue, loaidichvu.tenLoaiDichVu 
from dichvu
inner join loaidichvu on dichvu.idLoaiDichVu = loaidichvu.idLoaiDichVu
where exists( select hopdong.idHopDong from hopdong where year(hopdong.ngayLamHopDong) = '2018'
 and hopdong.idDichVu = dichvu.idDichVu) and not exists
 (select hopdong.idHopDong  from hopdong where year(hopdong.ngayLamHopDong) = '2019' and hopdong.idDichVu = dichvu.idDichVu)