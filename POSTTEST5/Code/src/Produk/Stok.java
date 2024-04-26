package Produk;

public abstract class AbstractStok {
    protected final String Nama;
    protected final int Harga;

    public AbstractStok(String NamaGame, int Harga){
        this.Nama = NamaGame;
        this.Harga = Harga;
    }

    public int getHarga() {
        return Harga;
    }

    public String getNama() {
        return Nama;
    }

    public abstract void rankInfo();
}

public abstract class AbstractCoba {
    protected final void PrintAkun(){
        System.out.println("Testtt");
    }

    public abstract void abstractMethod();
}

public class TurunanAkun extends AbstractCoba {
    public void test(){
        
    }

    @Override
    public void abstractMethod() {
        // Implementasi abstract method
    }
}