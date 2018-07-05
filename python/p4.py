def isPalindrome(num):
     l = len(str(num))
     x = 10**(l-1)
     y = 1
     for i in range(l//2):
         if (int(num/x)%10 != int(num/y)%10):
             return False
         x = x/10
         y = y*10
     return True

def largest_palindrome_product():
    largest = 0
    for i in range(100, 999):
        for j in range(100, 999):
            if isPalindrome(j*i) and j*i > largest:
                largest = j*i
    return largest

print (largest_palindrome_product())
