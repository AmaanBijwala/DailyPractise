import java.util.*;
public class SumOfSubArray {
    public static void main(String[] args) throws Exception {
        System.out.println("The sum is "+findSubArraySum());
    }

    static int findSubArraySum() throws Exception {
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter no of rows");
    int r=sc.nextInt();
    System.out.println("Enter no of columns");
    int c=sc.nextInt();
    int a[][]=new int[r][c];
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            System.out.println("Enter values");
            a[i][j]=sc.nextInt();
        }
    }
    System.out.println("Enter p1 coordinates");
    int x1=sc.nextInt();
    int y1=sc.nextInt();
    System.out.println("Enter p2 coordinates");
    int x2=sc.nextInt();
    int y2=sc.nextInt();
    if(x1<0 || x2>=r || y1<0 || y2>=c || x1>x2  || y1>y2){
        sc.close();
        throw new Exception("Please enter value within Range");
    }
    int sum=0;
        for(int i=x1;i<=x2;i++){
            for(int j=y1;j<=y2;j++){
                sum+=a[i][j];
            }
        }
        sc.close();
        return sum;
    }

}
