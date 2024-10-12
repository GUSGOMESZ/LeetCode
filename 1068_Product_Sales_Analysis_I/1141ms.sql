SELECT
    B.product_name as product_name,
    A.year as year,
    A.price as price
FROM
    Sales A LEFT JOIN Product B
        ON A.product_id = B.product_id
