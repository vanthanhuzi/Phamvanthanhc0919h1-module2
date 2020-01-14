-- yc 17: 
SET SQL_SAFE_UPDATES = 0;
update khachhang , (select hopdong.IdKhachHang as ID , sum( hopdong.tongTien) as tong_tien
from hopdong where 
year(hopdong.ngayLamHopDong) = 2019
group by hopdong.idKhachHang 
having tong_tien > 10000000 ) as temp set khachhang.IdloaiKhachHang = ( select loaikhach.IdLoaiKhachHang from loaikhach
 where loaikhach.TenLoaiKhach = 'Diamond')
where khachhang.IdloaiKhachHang = ( select loaikhach.IdLoaiKhachHang from loaikhach where loaikhach.TenLoaiKhach = 'Platinium')
and temp.ID = khachhang.IdKhachHang;
