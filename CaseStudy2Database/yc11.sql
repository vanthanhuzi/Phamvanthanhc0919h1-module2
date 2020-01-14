select  distinct dichvudikem.donVi, dichvudikem.giaTien, dichvudikem.idDichVuDiKem, dichvudikem.tenDichVuDikem,
 dichvudikem.trangThaiKhaDung, khachhang.diaChi from hopdong
 inner join hopdongchitiet on hopdongchitiet.idHopDong = hopdong.idHopDong
 inner join dichvudikem on hopdongchitiet.idDichVuDiKem = dichvudikem.idDichVuDiKem
 inner join khachhang on khachhang.idKhachHang = hopdong.idKhachHang
 inner join loaikhach on khachhang.IdloaiKhachHang = loaikhach.IdLoaiKhachHang
where loaikhach.TenLoaiKhach = "diamond" and khachhang.diaChi = "Quảng Ngãi" or khachhang.diaChi = "vinh" 
group by tenDichVuDikem

