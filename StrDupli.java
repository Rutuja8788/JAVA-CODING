import java.util.*;

class StrDupli
{
    public static void main(String s[])
    {
        Scanner sn=new Scanner(System.in);
        String str=sn.nextLine();

        char[] a = str.toCharArray();

        for (int i = 0; i < a.length; i++)
        {
            boolean Duplicate = false;
            for (int j = 0; j < i; j++)
            {
                if (a[i] == a[j])
                {
                    Duplicate = true;
                    break;
                }
            }
            if (!Duplicate) {
                System.out.print(a[i]);
            }
        }
    }
}

