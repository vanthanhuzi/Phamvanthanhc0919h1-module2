select hopdong.idHopDong, nhanvien.HoTenNhanVien, khachhang.Hoten, 
khachhang.Sdt, dichvu.tenDichVu, count(hopdongchitiet.idDichVuDiKem) as tong_dich_vu, hopdong.tienDatCoc
from hopdong
inner join nhanvien on hopdong.idNhanVien = nhanvien.idNhanVien
inner join khachhang on hopdong.idKhachHang = khachhang.idKhachHang
inner join dichvu on hopdong.idDichVu = dichvu.idDichVu
inner join hopdongchitiet on hopdongchitiet.idHopDong = hopdong.idHopDong
inner join dichvudikem on dichvudikem.idDichVuDiKem = hopdongchitiet.idDichVuDiKem
where exists(select hopdong.idHopDong from hopdong where (hopdong.ngayLamHopDong between '2019/01/10' and '2019/12/31'))
and not exists(select  hopdong.idHopDong from hopdong where (hopdong.ngayLamHopDong between '2019/01/01' and '2019/06/30'))
group by hopdong.idHopDong;
