public class HollowInverteMirroredRightAngle
{
    public static void main(String args[])
    {
        int n=5;
        for(int i=n;i>=1;i--)
        {
            for(int j=i;j<n;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                if(k==1||k==i||i==n)
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
}