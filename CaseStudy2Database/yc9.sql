select temp.month, count(month(hopdong.ngayLamHopDong)) as so_hop_dong_theo_thang, sum(hopdong.tongTien) as tong_tien from
(select 1 as month
union select 2 as month
union select 3 as month
union select 4 as month
union select 5 as month
union select 6 as month
union select 7 as month
union select 8 as month
union select 9 as month
union select 10 as month
union select 11 as month
union select 12 as month) as temp
left join hopdong on month(hopdong.ngayLamHopDong) = temp.month
left join khachhang on khachhang.IdKhachHang = hopdong.IdKhachHang
where year(hopdong.ngayLamHopDong) = '2019' or  year(hopdong.ngayLamHopDong) is null or month(hopdong.ngayLamHopDong) is null
group by temp.month
order by temp.month
