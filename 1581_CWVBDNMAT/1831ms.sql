SELECT
    A.customer_id as customer_id,
    Count(A.visit_id) as count_no_trans
FROM
    Visits A LEFT JOIN Transactions B
        ON A.visit_id = B.visit_id
WHERE
    B.transaction_id IS NULL
GROUP BY
    A.customer_id
