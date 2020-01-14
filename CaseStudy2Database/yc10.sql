select hopdong.idHopDong, hopdong.ngayLamHopDong, hopdong.ngayKetThuc, hopdong.tienDatCoc,
 count(hopdongchitiet.idDichVuDiKem) as so_luong_dich_vu_di_kem
 from hopdong inner join hopdongchitiet on hopdong.idHopDong = hopdongchitiet.idHopDong group by hopdong.idHopDong
 
