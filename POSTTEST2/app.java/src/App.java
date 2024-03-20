import java.util.ArrayList;
import Produk.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class App {
    public static void main(String[] args) throws IOException {
        ArrayList<Akun> Akn = new ArrayList<>();
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        while (true) {
            System.out.println("=============================================");
            System.out.println(" ~~~~~~~~~~~ Welcome To AJ SHOP ~~~~~~~~~~~~");
            System.out.println("=============================================");
            System.out.println("|           1. Lihat Stok Akun              |");
            System.out.println("|           2. Tambah Stok Akun             |");
            System.out.println("|           3. Ubah Stok Akun               |");
            System.out.println("|           4. Hapus Stok Akun              |");
            System.out.println("|           5. Keluar                       |");
            System.out.println("=============================================");
            System.out.print("Pilih Menu : ");

            int menu = Integer.parseInt(br.readLine());
            switch (menu) {
                case 1:
                    System.out.println("============== Stok Akun AJ SHOP ==============");
                    for (int i = 0; i < Akn.size(); i++) {
                        Akun Acc = Akn.get(i);
                        String Idakun = Acc.getIdAkun();
                        String NamaGame = Acc.getNamaGame();
                        String RankAkun = Acc.getRankAkun(); 
                        String PlatformAkun = Acc.getPlatformAkun(); 
                        int Harga = Acc.getHarga();

                        System.out.println("Id Akun      : " + Idakun);
                        System.out.println("Nama Game    : " + NamaGame);
                        System.out.println("Rank Akun    : " + RankAkun);
                        System.out.println("Platform     : " + PlatformAkun);
                        System.out.println("Harga Akun   : Rp. " + Harga);
                        System.out.println("=====================");
                    }
                    break;

                case 2:
                    String id = "AKN 0" + (Akn.size() + 1);
                    System.out.println("============ Tambah Stok Akun ============");
                    System.out.print("Masukkan Nama Game    : ");
                    String Nama = br.readLine();
                    System.out.print("Masukkan Rank Akun    : ");
                    String Rank = br.readLine();
                    System.out.print("Jenis Platform Akun   : ");
                    String Platform = br.readLine();
                    System.out.print("Harga Akun (Rp)       : ");
                    int harga = Integer.parseInt(br.readLine());
                    Akun Acc = new Akun(id, Nama, Rank, Platform, harga);
                    Akn.add(Acc);
                    System.out.println("Stok Akun berhasil ditambahkan!");
                    break;

                case 3:
                    System.out.println("=============== Ubah Data Akun ===============");
                    System.out.print("Cari Index untuk diubah: ");
                    int cari = Integer.parseInt(br.readLine());
                    for (int i = 0; i < Akn.size(); i++) {
                        if (cari == i) {
                            Akun Aknnew = Akn.get(i);
                            System.out.print("Masukkan Nama Game Baru    : ");
                            String NewNama = br.readLine();
                            Aknnew.setNamaGame(NewNama);
                            System.out.print("Masukkan Rank Akun Baru    : ");
                            String NewRank = br.readLine();
                            Aknnew.setRankAkun(NewRank); // Mengubah rankAkun
                            System.out.print("Jenis Platform Akun Baru   : ");
                            String NewPlatform = br.readLine();
                            Aknnew.setPlatformAkun(NewPlatform); // Mengubah platformAkun
                            System.out.print("Harga Akun Baru (Rp)       : ");
                            int newharga = Integer.parseInt(br.readLine());
                            Aknnew.setHarga(newharga);
                            System.out.println("Data Akun berhasil diubah!");
                        }
                    }
                    break;

                case 4:
                    System.out.println("=============== Hapus Data Akun ===============");
                    System.out.print("Cari Index untuk dihapus: ");
                    int Cari = Integer.parseInt(br.readLine());
                    Akn.remove(Cari);
                    System.out.println("Data Akun berhasil dihapus!");
                    break;

                case 5:
                    System.out.println("Terima Kasihh!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Menu tidak valid. Silakan pilih 1-5.");
                    break;
            }
        }
    }
}
