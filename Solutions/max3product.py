
# * ----------------------------------------------------------------------------------
# * <p> Title: Max3product.py </p>
# *
# * <p> Description: A program to calculate the highest products of any three integers in an given list
# *
# * <p> Copyright: Venkatesh Bejjenki © 2017 </p>
# *
# * @author Venkatesh Bejjenki
# * ----------------------------------------------------------------------------------




a=[1,-6,-3,2,-5,10,4]
a.sort()
print a
postive3=a[len(a)-1]*a[len(a)-2]*a[len(a)-3]
if(a[0]>=0 or a[0]<0 and a[1]>=0):
    z= postive3
else:
    if(a[0]<0 and a[1]<0):
        negative2_positive1=a[0]*a[1]*a[len(a)-1]
        if(negative2_positive1<postive3):
            z=postive3
        else:z=negative2_positive1
print z
