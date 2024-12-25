# Write your MySQL query statement below
select e.name, b.bonus from Employee as e
left join Bonus b on e.empId = b.empId
where bonus is null or b.bonus < 1000 