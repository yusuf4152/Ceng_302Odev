package hesapla;

public class HesapMakinesi {
    public int toplama(int sayi1, int sayi2){
        return sayi1 + sayi2;
    }
    public void bolme(int sayi1, int sayi2){
        if (sayi2 !=0){
            System.out.println(sayi1/ sayi2);
        }
        else
            System.out.println("payda 0 olamaz");
    }

}
