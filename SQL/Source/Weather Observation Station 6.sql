select distinct(city)
from station
where SUBSTR(city,1,1) = 'A' 
or SUBSTR(city,1,1) = 'E' 
or SUBSTR(city,1,1) = 'I' 
or SUBSTR(city,1,1) = 'O' 
or SUBSTR(city,1,1) = 'U';