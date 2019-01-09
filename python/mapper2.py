#!/usr/bin/env python3.5
"""mapper.py"""

import sys


def is_prime(n):
    if n <= 1:
        return False
    elif n <= 3:
        return True
    elif n % 2 == 0 or n % 3 == 0:
        return False
    i = 5
    while i * i <= n:
        if n % i == 0 or n % (i + 2) == 0:
            return False
        i = i + 6
    return True


# input comes from stdin
for line in sys.stdin:
    a, b = line.split()
    a = int(a)
    b = int(b)

    for n in range(a, b):
        if (is_prime(n)):
            print('True\t1')
        else:
            print('False\t1')
