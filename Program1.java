// Accept the value from user and return devision of two number 

import java.util.*;

class Arithematic 
{
    public int ino1;

    public int ino2;


    public Arithematic(int A , int B )
    {
        this.ino1  = A;
        this.ino2  = B;
    }

    public float Division()
    {
        float Ans = 0.0f;
    
        Ans  = (float)this.ino1 / (float)this.ino2;

        return Ans;
    }
}
class Program1
{
    public static void main(String a[])
    {           
        Scanner sobj = new Scanner(System.in);


        System.out.println("Enter the first number ");

        int iValue1 = sobj.nextInt();

        if (iValue1 < 0)
        {
            iValue1 = -iValue1;
        }

        System.out.println("Enter the second number :");

        int iValue2 = sobj.nextInt();

        if (iValue2 < 0)
        {
            iValue2 = -iValue2;
        }
        Arithematic aobj = new Arithematic(iValue1, iValue2);
        float  fRet = aobj.Division();
        System.out.println("Division is : "+fRet);        
    }
}