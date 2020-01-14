create temporary table tempp 
select khachhang.IdKhachHang as id_kh
from hopdong inner join khachhang on khachhang.idKhachHang = hopdong.idKhachHang
where year(hopdong.ngayLamHopDong) < 2016
group by khachhang.idKhachHang;
SET FOREIGN_KEY_CHECKS=0;
delete from khachhang
where khachhang.IdKhachHang = (select* from tempp);
delete from hopdong 
where hopdong.idKhachHang = (select tempp.id_kh from tempp);
begin {
select khachhang.Hoten from khach hang
where khachhang.idKhachHang = 1
}
end