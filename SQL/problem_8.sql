/*
	SQL Exercise:
		Name: Weather Observation Station 3. [Easy]
		Link: https://www.hackerrank.com/challenges/weather-observation-station-3/problem
*/

SELECT CITY 
	FROM (SELECT CITY FROM STATION WHERE ID MOD 2 = 0) AS T 
	GROUP BY CITY;