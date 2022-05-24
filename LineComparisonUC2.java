import java.util.Scanner;

    public class LineComparisonUC2 {
        public static void main(String[] args) {
            int x1,x2,y1,y2;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter First Line Input");
            x1=sc.nextInt();
            x2=sc.nextInt();
            y1=sc.nextInt();
            y2=sc.nextInt();
            double length1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
            System.out.println("Length of Line1: " + length1);

            System.out.println("Enter Second Line Input");
            x1=sc.nextInt();
            x2=sc.nextInt();
            y1=sc.nextInt();
            y2=sc.nextInt();
            double length2 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
            System.out.println("Length of Line1: " + length2);
            if(length1==length2)
                System.out.println("Line1 and Line2 are equal");
            else
                System.out.println("Line1 and Line2 are not equal");
        }
    }

