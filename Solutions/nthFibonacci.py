# * ----------------------------------------------------------------------------------
# * <p> Title: nth Fibonacci No </p>
# *
# * <p> Description: A program to calculate the nth Fibonacci number </p>
# *
# * <p> Copyright: Venkatesh Bejjenki  2017 </p>
# *
# * @author Venkatesh Bejjenki
# * ----------------------------------------------------------------------------------


x=0
y=1
def nthfibo(n):
    global x,y
    if n == 0:
        return 0
    if n == 1:
        return 1

    if n >= 2 :
        for i in range(2,n+1):
            x,y = y,x+y
        return y

print nthfibo(input("Enter n value : "))

