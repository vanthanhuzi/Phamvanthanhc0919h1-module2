select khachhang.IdKhachHang , khachhang.Hoten, loaikhach.TenLoaikhach, hopdong.idHopDong, dichvu.tenDichVu,
hopdong.ngayLamHopDong, hopdong.ngayKetThuc,  sum(dichvu.chiPhiThue + dichvudikem.giaTien*hopdongchitiet.soLuong) as tong_tien
from khachhang
left join hopdong on hopdong.idKhachHang = khachhang.idKhachHang
left join loaikhach on loaikhach.IdLoaiKhachHang = khachhang.IdloaiKhachHang
left join hopdongchitiet on hopdongchitiet.idHopDong = hopdong.idHopDong
left join dichvudikem on dichvudikem.idDichVuDiKem = hopdongchitiet.idDichVuDiKem
left join dichvu on hopdong.idDichVu = dichvu.idDichVu
group by khachhang.idKhachHang;