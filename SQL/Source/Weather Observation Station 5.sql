select *
from(
	select city, length(city) as len
	from station
	order by len, city)
where rownum = 1;

select *
from(
	select city, length(city) as len
	from station
	order by len desc, city)
where rownum = 1;