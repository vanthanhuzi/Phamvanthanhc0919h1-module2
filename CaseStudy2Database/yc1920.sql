-- yc 19 : 
update dichvudikem inner join( select dichvudikem.tenDichVuDikem as ten_dich_vu_di_kem from 
hopdongchitiet inner join dichvudikem on hopdongchitiet.idDichVuDiKem = dichvudikem.idDichVuDiKem
group by dichvudikem.idDichVuDiKem
having count( hopdongchitiet.idDichVuDiKem) > 3 ) as temp set dichvudikem.giaTien = dichvudikem.giaTien*2 
where dichvudikem.tenDichVuDikem = temp.ten_dich_vu_di_kem;
-- yc 20:
(select nhanvien.idNhanVien as ID, nhanvien.HoTenNhanVien, nhanvien.Diachi, nhanvien.Email, nhanvien.Sdt, 'nhanvien' as FromTable 
from
nhanvien) union all
 (select khachhang.IdKhachHang as ID, khachhang.Hoten, khachhang.diaChi, khachhang.email, khachhang.Sdt,
 'khachhang' as FromTable from khachhang);