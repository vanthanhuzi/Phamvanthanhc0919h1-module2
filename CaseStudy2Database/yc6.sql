select dichvu.idDichVu, dichvu.tenDichVu, dichvu.dienTich, dichvu.chiPhiThue, loaidichvu.tenLoaiDichVu
from dichvu inner join loaidichvu on dichvu.idLoaiDichVu = loaidichvu.idLoaiDichVu
where not exists ( select * from hopdong where hopdong.idDichVu = dichvu.idDichVu and ( 
hopdong.ngayKetThuc between '2018/01/01' and '2018/03/31'));
