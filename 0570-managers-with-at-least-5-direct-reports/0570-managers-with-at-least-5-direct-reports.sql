# Write your MySQL query statement below
select e1.name
from Employee e1
join (
    select managerId, count(*) as dr
    from Employee
    group by managerId
    having count(*) >= 5
) e2 on e1.id = e2.managerId;