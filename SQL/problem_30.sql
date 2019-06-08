/*
	SQL Exercise:
		Name: Japan Population. [Easy]
		Link: https://www.hackerrank.com/challenges/japan-population/problem
*/

SELECT SUM(POPULATION) 
	FROM CITY 
	WHERE COUNTRYCODE='JPN';