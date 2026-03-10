package latihan.latihan3;

public class BangunRuang{
    //encapsulasi
    private double sisi;
    private double panjang;
    private double lebar;
    protected double tinggi;
    public int alas;

    
    public void setSisi(double sisi){
        this.sisi = sisi;
    }

    public double getSisi(){
        return sisi;
    }
    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }
        public double getPanjang(){
        return panjang;
        
    }

}