package Day08;

public class _04_Question {
    public static void main(String[] args) {
        // 2022(dahil) yılına kadar geçen gun miktarınız bulunuz.
        // 0 dan 2022 yılına
        // 1 yılda 365 gün
        // 4 yılda 1 -> 1 gün extra ekleniyor


        int gecenGunMiktari= 2024 * 365 + (2024/4);
        System.out.println("gecenGunMiktari = " + gecenGunMiktari);
    }
}
