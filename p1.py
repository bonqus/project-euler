def multiples_of_3_and_5():
  S = 0
  for n in range(1000):
    if (n%3 == 0 or n%5 == 0):
      S+=n
  return S

print (multiples_of_3_and_5())
