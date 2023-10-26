import java.util.Scanner;

public class UTSGenap {
    public static void main(String[] args){

        System.out.println("SOAL NOMOR 1");
        String nama = "Muhammad Fauzan Ashshidiq";

        System.out.println("Bismillahirrahmaanirrahiim, Saya yang bernama " + nama + " berjanji dan bersungguh-sungguh semaksimal mungkin mengerjakan UTS ini dengan usaha sendiri, tanpa sekalipun melihat pekerjaan teman Saya, serta mematuhi tata tertib selama ujian. Jika Saya melanggar janji ini, Saya berani menanggung resikonya." + "\n");


        Scanner input = new Scanner(System.in);

        System.out.println("TOKO KELONTONG KERONCONGAN");
        System.out.println("--------------------------");

        System.out.println("A. Susu Dancow");
        System.out.println("    1. Ukuran Kecil");
        System.out.println("    2. Ukuran Sedang");
        System.out.println("    3. Ukuran Besar");
        System.out.println("A. Susu Bendera");
        System.out.println("    1. Ukuran Kecil");
        System.out.println("    2. Ukuran Sedang");
        System.out.println("    3. Ukuran Besar");
        System.out.println("A. Susu SGM");
        System.out.println("    1. Ukuran Kecil");
        System.out.println("    2. Ukuran Sedang");
        System.out.println("    3. Ukuran Besar");

        int jumlahYangDibeli = 1;
        int hargaSatuanBarang = 0;
        int hargaHarusBayar = 0;
        String ulangJualBeli;
        String jenisUkuranKaleng;

        for (int i = 1; i <= jumlahYangDibeli; i++) {
            System.out.println("=============================");
            System.out.print("Masukkan Jenis Susu (A/B/C): ");
            String jenisSusu = input.nextLine();

            System.out.print("Masukkan Ukuran Kaleng (1/2/3): ");
            int ukuranKaleng = input.nextInt();
            input.nextLine();
            if (jenisSusu.equalsIgnoreCase("A")) {
                if (ukuranKaleng == 1) {
                    hargaSatuanBarang = 15000;
                    hargaHarusBayar += hargaSatuanBarang;
                    jenisSusu = "Dancow";
                    jenisUkuranKaleng = "Kecil";
                    System.out.println("=============================");
                    System.out.println("Jenis Susu: " + jenisSusu);
                    System.out.println("Ukuran Kaleng: " + jenisUkuranKaleng);
                    System.out.println("Harga Satuan Barang: " + hargaSatuanBarang);
                    System.out.println("Jumlah Yang Dibeli: " + i);
                    System.out.println("Harga Yang Harus Dibayar: " + hargaHarusBayar);
                    System.out.print("Transaksi jual beli diulang (Y/N): ");
                    ulangJualBeli = input.nextLine();
                    if (ulangJualBeli.equalsIgnoreCase("Y")) {
                        jumlahYangDibeli++;
                    } else if (ulangJualBeli.equalsIgnoreCase("N")){
                        break;
                    } else {System.out.println("MOHON MASUKKAN TRANSAKSI ULANG JUAL BELI DENGAN Y/N (Yes or No)");
                    }
                } else if (ukuranKaleng == 2){
                    hargaSatuanBarang = 20000;
                    hargaHarusBayar += hargaSatuanBarang;
                    jenisUkuranKaleng = "Sedang";
                    System.out.println("=============================");
                    System.out.println("Jenis Susu: " + jenisSusu);
                    System.out.println("Ukuran Kaleng: " + jenisUkuranKaleng);
                    System.out.println("Harga Satuan Barang: " + hargaSatuanBarang);
                    System.out.println("Jumlah Yang Dibeli: " + i);
                    System.out.println("Harga Yang Harus Dibayar: " + hargaHarusBayar);
                    System.out.print("Transaksi jual beli diulang (Y/N): ");
                    ulangJualBeli = input.nextLine();
                    if (ulangJualBeli.equalsIgnoreCase("Y")) {
                        jumlahYangDibeli++;
                    } else if (ulangJualBeli.equalsIgnoreCase("N")){
                        break;
                    } else {System.out.println("MOHON MASUKKAN TRANSAKSI ULANG JUAL BELI DENGAN Y/N (Yes or No)");
                    }
                } else if (ukuranKaleng == 3){
                    hargaSatuanBarang = 25000;
                    hargaHarusBayar += hargaSatuanBarang;
                    jenisUkuranKaleng = "Besar";
                    System.out.println("=============================");
                    System.out.println("Jenis Susu: " + jenisSusu);
                    System.out.println("Ukuran Kaleng: " + jenisUkuranKaleng);
                    System.out.println("Harga Satuan Barang: " + hargaSatuanBarang);
                    System.out.println("Jumlah Yang Dibeli: " + i);
                    System.out.println("Harga Yang Harus Dibayar: " + hargaHarusBayar);
                    System.out.print("Transaksi jual beli diulang (Y/N): ");
                    ulangJualBeli = input.nextLine();
                    if (ulangJualBeli.equalsIgnoreCase("Y")) {
                        jumlahYangDibeli++;
                    } else if (ulangJualBeli.equalsIgnoreCase("N")){
                        break;
                    } else {System.out.println("MOHON MASUKKAN TRANSAKSI ULANG JUAL BELI DENGAN Y/N (Yes or No)");
                    }
                } else {
                System.out.println("MOHON MASUKKAN UKURAN KALENG 1/2/3");
                }        
            } else if (jenisSusu.equalsIgnoreCase("B")) {
                if (ukuranKaleng == 1) {
                    hargaSatuanBarang = 13500;
                    hargaHarusBayar += hargaSatuanBarang;
                    jenisSusu = "Bendera"; 
                    jenisUkuranKaleng = "Kecil";
                    System.out.println("=============================");
                    System.out.println("Jenis Susu: " + jenisSusu);
                    System.out.println("Ukuran Kaleng: " + jenisUkuranKaleng);
                    System.out.println("Harga Satuan Barang: " + hargaSatuanBarang);
                    System.out.println("Jumlah Yang Dibeli: " + i);
                    System.out.println("Harga Yang Harus Dibayar: " + hargaHarusBayar);
                    System.out.print("Transaksi jual beli diulang (Y/N): ");
                    ulangJualBeli = input.nextLine();
                    if (ulangJualBeli.equalsIgnoreCase("Y")) {
                        jumlahYangDibeli++;
                    } else if (ulangJualBeli.equalsIgnoreCase("N")){
                        break;
                    } else {System.out.println("MOHON MASUKKAN TRANSAKSI ULANG JUAL BELI DENGAN Y/N (Yes or No)");
                    }
                } else if (ukuranKaleng == 2){
                    hargaSatuanBarang = 17500;
                    hargaHarusBayar += hargaSatuanBarang;
                    jenisUkuranKaleng = "Sedang";
                    System.out.println("=============================");
                    System.out.println("Jenis Susu: " + jenisSusu);
                    System.out.println("Ukuran Kaleng: " + jenisUkuranKaleng);
                    System.out.println("Harga Satuan Barang: " + hargaSatuanBarang);
                    System.out.println("Jumlah Yang Dibeli: " + i);
                    System.out.println("Harga Yang Harus Dibayar: " + hargaHarusBayar);
                    System.out.print("Transaksi jual beli diulang (Y/N): ");
                    ulangJualBeli = input.nextLine();
                    if (ulangJualBeli.equalsIgnoreCase("Y")) {
                        jumlahYangDibeli++;
                    } else if (ulangJualBeli.equalsIgnoreCase("N")){
                        break;
                    } else {System.out.println("MOHON MASUKKAN TRANSAKSI ULANG JUAL BELI DENGAN Y/N (Yes or No)");
                    }
                } else if (ukuranKaleng == 3){
                    hargaSatuanBarang = 20000;
                    hargaHarusBayar += hargaSatuanBarang;
                    jenisUkuranKaleng = "Besar";
                    System.out.println("=============================");
                    System.out.println("Jenis Susu: " + jenisSusu);
                    System.out.println("Ukuran Kaleng: " + jenisUkuranKaleng);
                    System.out.println("Harga Satuan Barang: " + hargaSatuanBarang);
                    System.out.println("Jumlah Yang Dibeli: " + i);
                    System.out.println("Harga Yang Harus Dibayar: " + hargaHarusBayar);
                    System.out.print("Transaksi jual beli diulang (Y/N): ");
                    ulangJualBeli = input.nextLine();
                    if (ulangJualBeli.equalsIgnoreCase("Y")) {
                        jumlahYangDibeli++;
                    } else if (ulangJualBeli.equalsIgnoreCase("N")){
                        break;
                    } else {System.out.println("MOHON MASUKKAN TRANSAKSI ULANG JUAL BELI DENGAN Y/N (Yes or No)");
                    }
                } else {
                System.out.println("MOHON MASUKKAN UKURAN KALENG 1/2/3");
                }
            } else if (jenisSusu.equalsIgnoreCase("C")){
                if (ukuranKaleng == 1) {
                    hargaSatuanBarang = 15000;
                    jenisSusu = "SGM"; 
                    hargaHarusBayar += hargaSatuanBarang;
                    jenisUkuranKaleng = "Kecil";
                    System.out.println("=============================");
                    System.out.println("Jenis Susu: " + jenisSusu);
                    System.out.println("Ukuran Kaleng: " + jenisUkuranKaleng);
                    System.out.println("Harga Satuan Barang: " + hargaSatuanBarang);
                    System.out.println("Jumlah Yang Dibeli: " + i);
                    System.out.println("Harga Yang Harus Dibayar: " + hargaHarusBayar);
                    System.out.print("Transaksi jual beli diulang (Y/N): ");
                    ulangJualBeli = input.nextLine();
                    if (ulangJualBeli.equalsIgnoreCase("Y")) {
                        jumlahYangDibeli++;
                    } else if (ulangJualBeli.equalsIgnoreCase("N")){
                        break;
                    } else {System.out.println("MOHON MASUKKAN TRANSAKSI ULANG JUAL BELI DENGAN Y/N (Yes or No)");
                    }
                } else if (ukuranKaleng == 2){
                    hargaSatuanBarang = 18500;
                    hargaHarusBayar += hargaSatuanBarang;
                    jenisUkuranKaleng = "Sedang";
                    System.out.println("=============================");
                    System.out.println("Jenis Susu: " + jenisSusu);
                    System.out.println("Ukuran Kaleng: " + jenisUkuranKaleng);
                    System.out.println("Harga Satuan Barang: " + hargaSatuanBarang);
                    System.out.println("Jumlah Yang Dibeli: " + i);
                    System.out.println("Harga Yang Harus Dibayar: " + hargaHarusBayar);
                    System.out.print("Transaksi jual beli diulang (Y/N): ");
                    ulangJualBeli = input.nextLine();
                    if (ulangJualBeli.equalsIgnoreCase("Y")) {
                        jumlahYangDibeli++;
                    } else if (ulangJualBeli.equalsIgnoreCase("N")){
                        break;
                    } else {System.out.println("MOHON MASUKKAN TRANSAKSI ULANG JUAL BELI DENGAN Y/N (Yes or No)");
                    }
                } else if (ukuranKaleng == 3){
                    hargaSatuanBarang = 22000;
                    hargaHarusBayar += hargaSatuanBarang;
                    jenisUkuranKaleng = "Besar";
                    System.out.println("=============================");
                    System.out.println("Jenis Susu: " + jenisSusu);
                    System.out.println("Ukuran Kaleng: " + jenisUkuranKaleng);
                    System.out.println("Harga Satuan Barang: " + hargaSatuanBarang);
                    System.out.println("Jumlah Yang Dibeli: " + i);
                    System.out.println("Harga Yang Harus Dibayar: " + hargaHarusBayar);
                    System.out.print("Transaksi jual beli diulang (Y/N): ");
                    ulangJualBeli = input.nextLine();
                    if (ulangJualBeli.equalsIgnoreCase("Y")) {
                        jumlahYangDibeli++;
                    } else if (ulangJualBeli.equalsIgnoreCase("N")){
                        break;
                    } else {System.out.println("MOHON MASUKKAN TRANSAKSI ULANG JUAL BELI DENGAN Y/N (Yes or No)");
                    }
                } else {
                System.out.println("MOHON MASUKKAN UKURAN KALENG 1/2/3");
                }
            } else {
                System.out.println("MOHON MASUKKAN JENIS SUSU SESUAI YANG TERTERA.");
            }
        }   
    }
}
