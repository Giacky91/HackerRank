select distinct(city)
from station
where substr(city,1,1) <> 'A'
and substr(city,1,1) <> 'E'
and substr(city,1,1) <> 'I'
and substr(city,1,1) <> 'O'
and substr(city,1,1) <> 'U';