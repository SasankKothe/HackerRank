
def fibonacci(N):
    numbers = []
    numbers = [0, 1]
    for i in range(2, int(N)):
        numbers.append(numbers[i-1]+numbers[i-2])
    sarr = [str(a) for a in numbers]
    print (", ".join(sarr))

N = input()
fibonacci(N)