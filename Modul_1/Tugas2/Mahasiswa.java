
/**
 *
 * @author Eza
 */
public class Mahasiswa {
    String nama;
    int semester;
    String nim;
    String alamat;

    void nama(String namaMahasiswa){
        nama = namaMahasiswa;
    }
    void semester(int semesterMahasiswa){
        semester = semesterMahasiswa;
    }
    void nim(String Pendidikan){
        nim = Pendidikan;
    }
    void Alamat(String alamatRumah){
        alamat = alamatRumah;
    }
    void Print(){
        System.out.println(
                "Nama Mahasiswa :"+nama+"\n"+
                "Semester :"+semester+"\n"+
                "NIM :"+nim+"\n"+
                "Alamat Rumah Mahasiswa :"+alamat+"\n"
        );
    }
    
    
    public static void main(String[] args) {

        Mahasiswa mahasiswa = new Mahasiswa();
        
        mahasiswa.nama("Eza Ammar");
        mahasiswa.semester(3);
        mahasiswa.nim("L200183178");
        mahasiswa.Alamat("Kartopuran 106");
        mahasiswa.Print();
        
    
    }
    
}
