create temporary table bang_tam
select dichvudikem.idDichVuDiKem as id, count(dichvudikem.idDichVuDiKem) as so_lan_su_dung  
from hopdongchitiet 
inner join dichvudikem on dichvudikem.idDichVuDiKem = hopdongchitiet.idDichVuDiKem
inner join hopdong on hopdong.idHopDong = hopdongchitiet.idHopDong
group by dichvudikem.idDichVuDiKem;
select * from bang_tam;
drop temporary table bang_tam;
create temporary table max_count
select max(so_lan_su_dung) as max_count_id
from bang_tam;
drop temporary table max_count;
create temporary table min_count
select min(so_lan_su_dung) as min_count_id
from bang_tam;

select  dichvudikem.idDichVuDiKem, dichvudikem.tenDichVuDikem, bang_tam.so_lan_su_dung
from bang_tam 
inner join dichvudikem on dichvudikem.idDichVuDiKem = bang_tam.id
having bang_tam.so_lan_su_dung = (select max_count.max_count_id  from max_count)


 




