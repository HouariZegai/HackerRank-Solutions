"""

Exercise: 
	Name: Print Function. [Easy]
	Link: https://www.hackerrank.com/challenges/python-print/problem

"""

from __future__ import print_function
if __name__ == '__main__':
    n = int(raw_input())
    
    for i in range(n):
        print(i+1, end='')