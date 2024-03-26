import java.util.ArrayList;
import Produk.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    private static int nextAkunId = 1; 
    private static int nextDiamondId = 1; 

    public static void main(String[] args) throws IOException {
        ArrayList<Akun> Akn = new ArrayList<>();
        ArrayList<Diamond> Dmn = new ArrayList<>();
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        while(true){
            System.out.println("=============================================");
            System.out.println("          ~~~~~~~~~ AJ SHOP ~~~~~~~~~         ");
            System.out.println("=============================================");
            System.out.println("|           1. Lihat Stok Akun              |");
            System.out.println("|           2. Lihat Stok Diamond           |");
            System.out.println("|           3. Tambah Stok Akun             |");
            System.out.println("|           4. Tambah Stok Diamond          |");
            System.out.println("|           5. Ubah Stok Akun               |");
            System.out.println("|           6. Hapus Stok Akun              |");
            System.out.println("|           7. Keluar                       |");
            System.out.println("=============================================");
            System.out.print("Pilih Menu : ");  
            int menu = Integer.parseInt(br.readLine());
            switch (menu) {
                case 1:
                    System.out.println("=============================================");
                    System.out.println("|          Stok Akun AJ Shop                |");
                    System.out.println("=============================================");
                    for (int i = 0; i < Akn.size(); i++) {
                        Akun Acc = Akn.get(i);
                        System.out.println("Id          : " +  Acc.getIdAkun());
                        System.out.println("Nama Game   : " + Acc.getNama());
                        System.out.println("Rank AKun   : " + Acc.getRankAkun());
                        System.out.println("Harga       : Rp. " + Acc.getHarga());
                        System.out.println("---------------------------------------------");
                    }
                    break;
                case 2 :
                    System.out.println("=============================================");
                    System.out.println("|         Stok Diamond AJ Shop              |");
                    System.out.println("=============================================");
                    for (int i = 0; i < Dmn.size(); i++) {
                        Diamond dm = Dmn.get(i);
                        System.out.println("Id          : " +  dm.getJenisDiamond());
                        System.out.println("Nama Game   : " + dm.getNama());
                        System.out.println("Jenis Diamond : " + dm.getIdDiamond());
                        System.out.println("Harga       : Rp. " + dm.getHarga());
                        System.out.println("---------------------------------------------");
                    }
                    break;
                case 3:
                    String idakn = "AKUN 0" + nextAkunId++;
                    System.out.println("=============================================");
                    System.out.println("|          Tambah Stok Akun                  |");
                    System.out.println("=============================================");
                    System.out.println("Masukkan Nama Game");
                    String Nama = br.readLine();
                    System.out.println("Harga");
                    int harga = Integer.parseInt(br.readLine());
                    System.out.println("Masukkan Rank Akun");
                    String rankakn = br.readLine();
                    Akun akn = new Akun(Nama, harga, idakn, rankakn);
                    Akn.add(akn);
                    AJshop aj = new AJshop(Nama, harga, idakn, idakn);
                    aj.cekclass();
                    break;
                case 4:
                    String iddm = "DIAMOND 0" + nextDiamondId++;
                    System.out.println("=============================================");
                    System.out.println("|         Tambah Stok Diamond                |");
                    System.out.println("=============================================");
                    System.out.println("Masukkan Nama Game");
                    String Namagame = br.readLine();
                    System.out.println("Jenis Diamond");
                    String jenisdm = br.readLine();
                    System.out.println("Harga");
                    int Hargadm = Integer.parseInt(br.readLine());
                    Diamond Dm = new Diamond(Namagame, Hargadm, jenisdm, iddm); 
                    Dmn.add(Dm);
                    System.out.println("Stok Diamond dengan Nama Game '" + Namagame + "', Jenis '" + jenisdm + "', dan Harga Rp. " + Hargadm + " berhasil ditambahkan.");
                    break;
                case 5:
                    System.out.println("=============================================");
                    System.out.println("|           Ubah Data Akun                   |");
                    System.out.println("=============================================");
                    System.out.println("Cari index : ");
                    int cari = Integer.parseInt(br.readLine());
                    for( int i = 0; i < Akn.size(); i++){
                        if(cari == i){
                            Akun Aknnew = Akn.get(i);
                            System.out.println("Nama Game Baru : ");
                            String NewNama = br.readLine();
                            Aknnew.setNamaGame(NewNama);
                            System.out.println("Rank Akun Baru :");
                            String NewRank = br.readLine();
                            Aknnew.setRankAkun(NewRank);
                            System.out.println("Harga Baru :");
                            int NewHarga = Integer.parseInt(br.readLine());
                            Aknnew.setHarga(NewHarga);
                        }
                    }
                    break;
                case 6:
                    System.out.println("=============================================");
                    System.out.println("|          Hapus Akun                        |");
                    System.out.println("=============================================");
                    System.out.println("Cari Index : ");
                    int Cari = Integer.parseInt(br.readLine());
                    Akn.remove(Cari);
                    break;
                case 7:
                    System.out.println("Terima Kasih telah menggunakan AJ SHOP!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih 1-7.");
                    break;
            }

        }
    }
}