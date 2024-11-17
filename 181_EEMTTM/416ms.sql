SELECT
    B.name AS Employee
FROM 
    Employee A LEFT JOIN Employee B
        ON A.id = B.managerId
WHERE
    B.salary > A.salary
