import java.util.*;


class Program4
{
    
    public boolean CheckDivisible(int ino)
    {
        if(ino % 5 == 0)
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.print("Eneter the  number ");

        int iValue = sobj.nextInt();

        Program4 obj = new Program4();
        boolean bret = obj.CheckDivisible(iValue);

        if(bret == true)
        {
            System.out.println("Given number is Divisible by 5 ");
        }
        else
        {
            System.out.println("Given number is not Divisible by 5");
        }


    }
}