select khachhang.Hoten , count(hopdong.idHopDong) as tong_hop_dong  from 
khachhang inner join hopdong on khachhang.idKhachHang = hopdong.idKhachHang inner join loaikhach on 
loaikhach.IdLoaiKhachHang = khachhang.IdloaiKhachHang
where loaikhach.TenLoaiKhach = 'Diamond'
group by khachhang.idKhachHang
order by tong_hop_dong