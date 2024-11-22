
SELECT id, 
	sum(CASE WHEN month = 'jan' THEN revenue ELSE NULL end) AS Jan_Revenue,
	sum(CASE WHEN month = 'feb' THEN revenue ELSE NULL end) AS Feb_Revenue,
	sum(CASE WHEN month = 'mar' THEN revenue ELSE NULL end) AS Mar_Revenue,
	sum(CASE WHEN month = 'apr' THEN revenue ELSE NULL end) AS Apr_Revenue,
	sum(CASE WHEN month = 'may' THEN revenue ELSE NULL end) AS May_Revenue,
	sum(CASE WHEN month = 'jun' THEN revenue ELSE NULL end) AS Jun_Revenue,
	sum(CASE WHEN month = 'jul' THEN revenue ELSE NULL end) AS Jul_Revenue,
	sum(CASE WHEN month = 'aug' THEN revenue ELSE NULL end) AS Aug_Revenue,
	sum(CASE WHEN month = 'sep' THEN revenue ELSE NULL end) AS Sep_Revenue,
	sum(CASE WHEN month = 'oct' THEN revenue ELSE NULL end) AS Oct_Revenue,
	sum(CASE WHEN month = 'nov' THEN revenue ELSE NULL end) AS Nov_Revenue,
	sum(CASE WHEN month = 'dec' THEN revenue ELSE NULL end) AS Dec_Revenue
FROM department
GROUP BY id
ORDER BY id
