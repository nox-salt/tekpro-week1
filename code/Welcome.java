/** Program ini dibuat berdasarkan tugas
    Nama    : Radhitya Maulana Arrafi
    Kelas   : 1A D4 Teknik Informatika
    NIM     : 241524025                    **/

public class Welcome{
    public static void main(String[] args){
        String greeting = "Welcome to Core Java!";
        System.out.println(greeting);
        for (int i=0; i<greeting.length(); i++)
            System.out.print("=");
        System.out.println();
    }
}