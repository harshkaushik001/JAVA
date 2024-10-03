import java.util.Scanner;
class min_conversion{
    public static void main(String[] Strings){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER MINUTES");
        double min=sc.nextDouble();
        double years=(min/525600);
        int yy=(int)(years/1);
        double months=(min%525600)/43200;
        int mm=(int)(months/1);
        double days=((min%525600)%43200)/1440;
        int dd=(int)(days/1);
        
        System.out.println("MINUTES AFTER BEING CONVERTED INTO GIVEN FORMAT WILL BE AS FOLLOWS==> ");
        System.out.println("YY-MM-DD");
        System.out.println(yy+"-"+mm+"-"+dd);
    }
}