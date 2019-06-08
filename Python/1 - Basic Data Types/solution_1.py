"""

Exercise: 
	Name: List Comprehensions. [Easy]
	Link: https://www.hackerrank.com/challenges/list-comprehensions/problem

"""

if __name__ == '__main__':
    x = int(input())
    y = int(input())
    z = int(input())
    n = int(input())
    l = []

    for i in range(x + 1):
        for j in range(y + 1):
            for k in range(z + 1):
                if (i + j + k) != n:
                    l.append([i, j, k])
    
    print(l)