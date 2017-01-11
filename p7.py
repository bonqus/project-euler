def isPrime(num):
    if (num < 2): return False
    if (num == 2): return True
    if (num % 2 == 0): return False
    i = 3
    while (i * i <= num):
        if (num % i == 0): return False
        i+=2
    return True

i = 1
k = 0
while k < 10001:
    i+=1
    if isPrime(i):
        k+=1
print (i)
