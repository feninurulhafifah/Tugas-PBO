public class BankBCA extends Bank{
    public void sukuBunga(){
        System.out.println("Suku Bunga dari BCA adalah 4.5%");
    }
    public void transferUang(int jumlah, String rekeningTujuan, String bankTujuan){
    bankTujuan="BCA";
    System.out.println("Transfer sebesar Rp. "+jumlah+" ke rekening " + rekeningTujuan +" bank tujuan "+ bankTujuan);
    }
    public int adminTF(String bankTujuan){
        if (!bankTujuan.equalsIgnoreCase("BCA")) {
            return 5000; 
        }
        return 0;
    }
    
}
