
/**
 *
 * @author Eza
 */
public class Dosen {
    String nama;
    int Nomor;
    String Edu;
    String tanggal;

    void Name(String namaDosen){
        nama = namaDosen;
    }
    void Nomor(int nikDosen){
        Nomor = nikDosen;
    }
    void Belajar(String Pendidikan){
        Edu = Pendidikan;
    }
    void Lahir(String tanggalLahir){
        tanggal = tanggalLahir;
    }
    void Print(){
        System.out.println(
                "Nama Dosen :"+nama+"\n"+
                "NIK:"+Nomor+"\n"+
                "Pendidikan :"+Edu+"\n"+
                "Tanggal Lahir Dosen :"+tanggal+"\n"
        );
    }
    
    
    public static void main(String[] args) {

        Dosen dosen = new Dosen();
        
        dosen.Name("Mr.Baik Hati, PHD");
        dosen.Nomor(200183178);
        dosen.Belajar("USA");
        dosen.Lahir("30 Mei 2000");
        dosen.Print();
        
    
    }
    
}
