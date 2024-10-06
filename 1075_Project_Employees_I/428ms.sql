SELECT
    A.project_id as project_id,
    ROUND(AVG(experience_years), 2) as average_years
FROM
    Project A LEFT JOIN Employee B
        ON A.employee_id = B.employee_id
GROUP BY
    A.project_id
