import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] dizi = {10, 20, 20, 10, 10, 20, 5, 20, 96};
        int[] tekrarEden = new int[dizi.length];

        System.out.println("Dizi : " + Arrays.toString(dizi));
        System.out.println("\n**************************************");

        for (int i = 0; i < dizi.length; i++)
        {
            tekrarEden[i] = 1;

            for (int j = 0; j < dizi.length; j++)
            {
                if (i != j && dizi[i] == dizi[j])
                {
                    tekrarEden[i]++;
                }
            }
        }

        for (int i = 0; i < dizi.length; i++)
        {
            for (int j = i + 1; j < dizi.length; j++)
            {
                if (dizi[i] == dizi[j])
                {
                    dizi[j] = 0;
                }
            }
        }

        for (int i = 0; i < dizi.length; i++)
        {
            if (tekrarEden[i] > 1)
            {
               if (dizi[i] != 0)
               {
                   System.out.println(dizi[i] + " sayisi " + tekrarEden[i] + " kere tekrar edildi.");
               }
            }
            else if (tekrarEden[i] == 1)
            {
                if (dizi[i] != 0)
                {
                    System.out.println(dizi[i] + " sayisi " + tekrarEden[i] + " kere tekrar edildi.");
                }
            }
        }

    }
}
