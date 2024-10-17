SELECT
    A.firstName as firstName,
    A.lastName as lastName,
    B.city as city, 
    B.state as state
FROM
    Person A LEFT JOIN Address B
        ON A.personId = B.personId
