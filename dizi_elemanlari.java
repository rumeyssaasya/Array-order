import java.util.Scanner;
public class dizi_elemanlari {
    public static void main(String[] args) {
        Scanner inpi= new Scanner(System.in);
        System.out.print("Dizi boyutunu giriniz: ");
        int n=inpi.nextInt();  //Dizi boyutu belirlenir.
        int[] series=new int[n];
        for(int i=0; i<n; i++){
            System.out.print((i+1)+". Elemanı giriniz: ");
            int element= inpi.nextInt();
            series[i]=element;
        }

        int temporal;
        for (int j=0;j<series.length;j++){  // Dizinin elemanlarını sıralar.
            for (int x=j+1; x<series.length; x++){
                if (series[x]<series[j]){
                    temporal=series[j];
                    series[j]=series[x];
                    series[x]=temporal;
                }
            }
        }
        System.out.print("Dizinin sıralanmış hali: ");
        for (int j=0; j<series.length;j++)    //Diziyi sıralı halde yazdırır.
            System.out.print(" "+series[j]+",");
    }
}
