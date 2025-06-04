public class BankBNI extends Bank {
    public void sukuBunga(){
        System.out.println("Suku Bunga dari BNI adalah 4%");
    }

    public void transferUang(int jumlah ,String rekeningTujuan, String bankTujuan){
        bankTujuan="BNI";
        System.out.println("Transfer sebesar Rp. "+jumlah+" ke rekening " + rekeningTujuan +" bank tujuan "+ bankTujuan);
    }
    public int adminTF (String bankTujuan){
        if (!bankTujuan.equalsIgnoreCase("BNI")){
            return 5000;
        }
        return 0;
    }
}
