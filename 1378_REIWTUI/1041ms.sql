SELECT
  A.unique_id as unique_id,
  B.name as name
FROM
  EmployeeUNI A RIGHT JOIN Employees B
    ON A.id = B.id
