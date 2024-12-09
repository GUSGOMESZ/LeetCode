SELECT 
    A.product_name, SUM(unit) AS unit
FROM
    Products A LEFT JOIN Orders B
ON 
    A.product_id = B.product_id
WHERE
    YEAR(order_date) = 2020 AND MONTH(order_date) = 2
GROUP BY
    A.product_id
HAVING 
    SUM(unit) >= 100
