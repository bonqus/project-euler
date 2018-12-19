def isPrime(num):
    if (num < 2):
        return False
    if (num == 2):
        return True
    if (num % 2 == 0):
        return False
    i = 3
    while (i * i <= num):
        if (num % i == 0):
            return False
        i += 2
    return True


number = 600851475143
x = int(number**0.5)
i = 3

while (i < x):
    if (number % i == 0 and isPrime(i)):
        print(i)
    i += 2
