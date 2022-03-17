import java.util.Scanner;

public class zuoye {

    public static void main(String[] args) {

        String str;

        Scanner sc=new Scanner(System.in);

        str=sc.next();

        int num[]=new int[str.length()];

        System.out.println(str);

        char a[]=str.toCharArray();

        for (int i = 0; i < str.length(); i++) {

            if(a[i]!='\0'){

                num[i]=1;

                for (int i1 = i+1; i1 < str.length(); i1++) {

                    if(a[i]==a[i1]) {num[i]++;a[i1]='\0';

                    }
                }
                System.out.println("this   "+a[i]+" count  "+num[i]);
            }
        }
    }
}
