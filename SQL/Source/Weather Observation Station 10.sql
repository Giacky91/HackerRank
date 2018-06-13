select distinct(city)
from station
where substr(city,-1,1) <> 'a'
and substr(city,-1,1) <> 'e'
and substr(city,-1,1) <> 'i'
and substr(city,-1,1) <> 'o'
and substr(city,-1,1) <> 'u';