select  *from nhanvien where    (HoTenNhanVien like 'H%' or  HoTenNhanVien like 'T%' or
HoTenNhanVien like 'K%')  and length(HoTenNhanVien)<15; 
