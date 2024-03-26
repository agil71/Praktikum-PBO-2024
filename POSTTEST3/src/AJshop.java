import Produk.Akun;

public class AJshop extends Akun{
    public AJshop(String Nama, int Harga, String idAkun, String rankAkun) {
        super(Nama, Harga, idAkun, rankAkun);
    }

    public void cekclass(){
        System.out.println("Ini Adalah Class AJshop");
    }
}
