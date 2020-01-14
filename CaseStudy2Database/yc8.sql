select distinct khachhang.Hoten  
from khachhang;
-- cách 2: 
select khachhang.Hoten 
from khachhang 
group by khachhang.Hoten;
-- cách 3: 
select khachhang.Hoten from khachhang union select khachhang.Hoten from khachhang;