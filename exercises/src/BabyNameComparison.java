/**
 * Created by jc321687 on 30/08/16.
 */
import java.util.*;
public class BabyNameComparison
{
    public static void main(String[] args)
    {
        String str1, str2, str3;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter name 1 >> ");
        str1 = in.nextLine();
        System.out.print("Enter name 2 >> ");
        str2 = in.nextLine();
        System.out.print("Enter name 3 >> ");
        str3 = in.nextLine();

        System.out.println(str1 + " " + str2);
        System.out.println(str1 + " " + str3);
        System.out.println(str2 + " " + str1);
        System.out.println(str2 + " " + str3);
        System.out.println(str3 + " " + str1);
        System.out.println(str3 + " " + str2);

    }
}
