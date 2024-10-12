# Write your MySQL query statement below
select p.product_name, s.year,s.price from Sales as s , Product as p  where p.product_id = s.product_id