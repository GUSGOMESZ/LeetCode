SELECT
    B.id
FROM
    Weather A CROSS JOIN Weather B
WHERE
    DATEDIFF(B.recordDate, A.recordDate) = 1 AND B.temperature > A.temperature
