select distinct(city)
from station
where substr(city,-1,1) = 'a' 
or substr(city,-1,1) = 'e' 
or substr(city,-1,1) = 'i' 
or substr(city,-1,1) = 'o' 
or substr(city,-1,1) = 'u';