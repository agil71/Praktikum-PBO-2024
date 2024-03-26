package Produk;

public class Akun extends Stok{
    private String IdAkun;
    private String RankAkun;
    public Akun(String Nama, int Harga,String idAkun, String rankAkun){
        super(Nama,Harga);
        this.IdAkun = idAkun;
        this.RankAkun = rankAkun;
    }
    public String getIdAkun() {
        return IdAkun;
    }
    public String getRankAkun() {
        return RankAkun;
    }
    public void setIdAkun(String idAkun) {
        IdAkun = idAkun;
    }
    public void setRankAkun(String rankAkun) {
        RankAkun = rankAkun;
    }
}
