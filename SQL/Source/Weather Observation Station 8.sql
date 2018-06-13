select city
from station
where (substr(city,1,1) = 'A'
or substr(city,1,1) = 'E'
or substr(city,1,1) = 'I'
or substr(city,1,1) = 'O'
or substr(city,1,1) = 'U') 
and (substr(city,-1,1) = 'a'
or substr(city,-1,1) = 'e'
or substr(city,-1,1) = 'i'
or substr(city,-1,1) = 'o'
or substr(city,-1,1) = 'u');