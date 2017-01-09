def fib(f_0, f_1):
    if (f_1 > 4000000):
        return 0
    elif (not f_1%2):
        return fib(f_1, f_1 + f_0) + f_1
    else:
        return fib(f_1, f_1 + f_0)

print(fib(0,1))
