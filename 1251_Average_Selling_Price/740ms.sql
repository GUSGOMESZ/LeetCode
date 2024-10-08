SELECT 
  A.product_id,
  COALESCE(ROUND(SUM(A.price * B.units) / SUM(B.units), 2), 0) as average_price
FROM
  Prices A LEFT JOIN UnitsSold B
    ON A.product_id = B.product_id
      AND purchase_date BETWEEN start_date AND end_date
GROUP BY
  A.product_id
