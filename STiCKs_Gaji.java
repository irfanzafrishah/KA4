import java.util.Scanner;
 class STiCKs_Gaji {
   public static void main (String args[]){
    Scanner a = new Scanner (System.in);
    System.out.print("Masukkan nama anda : ");
    String nama = a.next();   
    
    System.out.print("Masukkan bilangan jam anda berkerja sehari : ");
    int bil_jam = a.nextInt();
    
    if (bil_jam>9)
    {
        System.out.print("Bilangan jam berkerja sehari tidak boleh melebihi 9 jam, sila masukkan bilangan yang betul : ");
        bil_jam = a.nextInt();
    }
    
        System.out.print("Masukkan bilangan hari anda berkerja : ");
        int bil_hari = a.nextInt();
        
    if (bil_hari>30)
    {
        System.out.print("Bilangan hari berkerja tidak boleh melebihi 30 hari, sila masukkan bilangan hari yang betul : ");
        bil_hari = a.nextInt();
    }
    
    
        System.out.print("Bilangan jam kerja lebih masa : ");
        int bil_ot = a.nextInt();
            System.out.println("\n");
    if(bil_ot>50)
    {
        System.out.print("Bilangan jam kerja lebih masa tidak boleh melebihi 50 jam, sila masukkan jam yang betul : ");
        bil_ot= a.nextInt();
        System.out.println("\n");
        
    }
    
    
        int gaji = (bil_jam*bil_hari*20)+(bil_ot*15);
    System.out.println("Rumusan gaji bulanan "+nama+" : ");
    System.out.println("Jumlah jam berkerja : "+bil_jam+" Jam");
    System.out.println("Jumlah hari nerkerja : "+bil_hari+" Hari");
    System.out.println("Jumlah jam lebih masa : "+bil_ot+" Jam\n");
    System.out.println("JUMLAH GAJI : RM"+gaji);
        }       
}
