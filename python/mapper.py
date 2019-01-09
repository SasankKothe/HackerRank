import sys
from is_prime import is_prime

line_string = ""

filepath = '/Users/sasank/Desktop/Hackerrank/python/text.txt'
with open(filepath) as fp:
    new_line = fp.readline()
    while new_line:
        line_string = line_string + new_line
        new_line = fp.readline()
# input comes from STDIN (standard input)
line_string = line_string.replace('\n', ' ')

##for line in line_string:
# split the line into words
words = line_string.split(' ')
# increase counters
for word in words:
    # write the results to STDOUT (standard output);
    # what we output here will be the input for the
    # Reduce step, i.e, the input for reducer.py
    #
    # tab-deliminated; the trivial word count is 1
    print('{}\t{}'.format(is_prime(int(word)), word))
        #print('{}\t{}'.format(is_prime(int(word)), 1))
