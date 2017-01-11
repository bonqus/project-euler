def smallest_multiple(num):
    for i in range(11,21):
        if (num%i != 0):
            return False
    return True

i = 1000

while (not smallest_multiple(i)): i+=20
print (i)
