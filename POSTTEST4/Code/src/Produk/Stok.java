package Produk;

public class Stok {
    protected String Nama;
    protected int Harga;

    public Stok(String NamaGame,int Harga){
        this.Nama = NamaGame;
        this.Harga = Harga;
    }
    public int getHarga() {
        return Harga;
    }
    public String getNama() {
        return Nama;
    }
   
    public void setNamaGame(String nama) {
        Nama = nama;
    }
    public void setHarga(int harga) {
        Harga = harga;
    }
    protected void PrintAkun(){
        System.out.println("Testtt");
    }
    public void rankInfo() {
        // System.out.println("info produk :");
    }
}
