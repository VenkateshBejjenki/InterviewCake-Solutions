
# * ----------------------------------------------------------------------------------
# * <p> Title: Product.py </p>
# *
# * <p> Description: A program to calculate the Products of all ints except at index</p>
# *
# * <p> Copyright: Venkatesh Bejjenki © 2017 </p>
# *
# * @author Venkatesh Bejjenki
# * ----------------------------------------------------------------------------------


import math
a=[10,5,3,4]
#Test-cases
#a=[-1,5,34,6]
#a=[1,0,4]
#a=[2,0,6,7,0]
#a=[1,7,3,4]
x=0
temp=1
zero_count=0
negative_count=0
for i in a:
    if(i!=0):
        if(i<0):
            negative_count+=1
            i=i*(-1)
        x=x+math.log(i)
    else: zero_count=zero_count+1

b=[]

for i in a:
    if(zero_count==0):
        if(i<0):
            temp=i*(-1)
        else:
            temp=i
        y = x-math.log(temp)
        z=int(round(math.exp(y)))

        if((negative_count%2==0 and i<0) or (negative_count%2==1 and i>0)) :
            z=z*(-1)

        b.append(z)


    if((zero_count>1) or (zero_count==1 and i!=0)):
        b.append(0)
    if(zero_count==1 and i==0):
        z=int(round(math.exp(x)))
        if(negative_count%2==1):
            z=z*(-1)

        b.append(z)
print b
