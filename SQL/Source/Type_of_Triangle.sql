select case 
	when dummy.id = 1 then 'Isosceles'
	when dummy.id = 2 then 'Equilateral'
	when dummy.id = 3 then 'Scalene'
	when dummy.id = 4 then 'Not A Triangle'
end result
from triangles t
left join (select 1 as id 
		   from dual 
		   union all 
		   select 2 as id 
		   from dual 
		   union all 
		   select 3 as id 
		   from dual 
		   union all 
		   select 4 as id 
		   from dual) dummy on ((dummy.id = 4 and ((t.a + t.b <= t.c) or (t.a + t.c <= t.b) or (t.c + t.b <= t.a))) 
or ( dummy.id = 2 and (t.a = t.b and t.a = t.c))
or ( dummy.id = 1 and (t.a = t.b or t.b = t.c or t.a = t.c) and not (t.a = t.b and t.a = t.c) and not ((t.a + t.b <= t.c) or (t.a + t.c <= t.b) or (t.c + t.b <= t.a)))
or ( dummy.id = 3 and (t.a <> t.b and t.b <> t.c and t.a <> t.c) and not ((t.a + t.b <= t.c) or (t.a + t.c <= t.b) or (t.c + t.b <= t.a))));