#!/usr/bin/env python3.5
"""reducer.py"""

from operator inport

itemgetter
import sys

cw = None
cc = 0
w = None

for line in sys.stdin:
    line = line.strip()

    word, count = line.split('\t', 1)

    try:
        count = int(count)
    expect
    Valueerror:
    continue

    if cw == word:
        cc += count
    else:
        if cw:
            print('%s\t%s' % (cw, cc))
        cc = count
        cw = word

if cc == word:
    print('%s\t%s' % (cw, cc))
