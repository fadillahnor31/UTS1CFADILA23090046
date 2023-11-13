public class jawabanno3 {

    private String fadillah;
    public jawabanno3() {
    }
}
public class ValidasiPlatNomor {
    public static void main(String[] args) {

        System.out.print("Masukkan plat nomor (5 digit): ");
        String platNomor = null;

        String statusValiditas = cekValiditasPlat(platNomor);
        System.out.println("Status validitas plat nomor: " + statusValiditas);
    }

    static String cekValiditasPlat(String platNomor) {
        // Memeriksa panjang plat nomor
        if (platNomor.length() != 5) {
            return "Invalid";
        }

        // Memeriksa setiap digit plat nomor
        for (int i = 0; i < platNomor.length(); i++) {
            char digit = platNomor.charAt(i);

            // Memeriksa apakah digit adalah angka
            if (!Character.isDigit(digit)) {
                return "Invalid";
            }

            // Memeriksa apakah digit adalah genap atau ganjil
            int nilaiDigit = Character.getNumericValue(digit);
            if (nilaiDigit % 2 != 0) {
                return "Invalid";
            }
        }

        // Jika semua kondisi terpenuhi, plat nomor dianggap valid
        return "Valid";
    }
}





