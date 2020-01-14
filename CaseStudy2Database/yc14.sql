-- yc14: 
select hopdong.idHopDong, loaidichvu.tenLoaiDichVu , dichvudikem.tenDichVuDikem , count(dichvudikem.idDichVuDiKem) as so_lan_su_dung
from hopdong 
inner join dichvu on hopdong.idDichVu = dichvu.idDichVu
inner join loaidichvu on loaidichvu.idLoaiDichVu = dichvu.idLoaiDichVu
inner join hopdongchitiet on hopdong.idHopDong = hopdongchitiet.idHopDong
inner join dichvudikem on hopdongchitiet.idDichVuDiKem = dichvudikem.idDichVuDiKem
group by dichvudikem.tenDichVuDikem
having so_lan_su_dung = 1
