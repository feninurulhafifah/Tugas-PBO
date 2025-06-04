public class Bank{
    public void transferUang(int jumlah, String rekeningTujuan){
        System.out.println("Transfer sebesar Rp. "+jumlah+" ke rekening "+rekeningTujuan);
    }
    public void transferUang(int jumlah, String rekeningTujuan, String bankTujuan){
        System.out.println("Transfer sebesar Rp. "+jumlah+" ke rekening " + rekeningTujuan +" bank tujuan "+ bankTujuan);
    }
    public void transferUang(int jumlah, String rekeningTujuan, String bankTujuan, String berita){
        System.out.println("Transfer sebesar Rp. "+jumlah+" ke rekening " + rekeningTujuan +" bank tujuan "+ bankTujuan + " dengan sebuah berita: "+berita );
    }
    public void sukuBunga(){
        System.out.println("Suku Bunga Strandar adalah 3%");
    }
    public int adminTF(String bankTujuan){
        return 5000;
    }
}