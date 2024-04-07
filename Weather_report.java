import java.util.*;

class WeatherReport
{
    int day_of_month,hightemp,lowtemp,amtrain,amtsnow;

    void getData()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day");
        day_of_month=sc.nextInt();
        System.out.println("Enter highest temperature");
        hightemp=sc.nextInt();
        System.out.println("Enter lowest temperature");
        lowtemp=sc.nextInt();
        System.out.println("Enter amount of rain");
        amtrain=sc.nextInt();
        System.out.println("Enter amount of snow");
        amtsnow=sc.nextInt();

    }

    static int averageH(WeatherReport[] arr , int n )
    {
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i].hightemp;
        }
        return sum/n;
    }
    static int averageL(WeatherReport[] arr , int n )
    {
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i].lowtemp;
        }
        return sum/n;
    }
    static int averageR(WeatherReport[] arr , int n )
    {
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i].amtrain;
        }
        return sum/n;
    }
    static int averageS(WeatherReport[] arr , int n )
    {
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i].amtsnow;
        }
        return sum/n;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of days: ");
        int n=sc.nextInt();
        WeatherReport[] arr = new WeatherReport[n];

        for(int i=0;i<n;i++)
        {
            arr[i] = new WeatherReport();
            arr[i].getData();
        }

        System.out.println("Average of highest temp: " + averageH(arr,n));
        System.out.println("Average of lowest temp: " + averageL(arr,n));
        System.out.println("Average of amount of rain: " + averageR(arr,n));
        System.out.println("Average of amount of snow: " + averageS(arr,n));

    }
}
