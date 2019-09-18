
/**
 *
 * @author Eza
 */
public class Hewan {
    String Name;
    int kaki;
    String makan;
    String tipe;

    void Nama(String NameHewan){
        Name = NameHewan;
    }
    void Kaki(int kakiHewan){
        kaki = kakiHewan;
    }
    void Mam(String makanan){
        makan = makanan;
    }
    void Tipe(String tipeHewan){
        tipe = tipeHewan;
    }
    void Print(){
        System.out.println(
                "Nama Hewan :"+Name+"\n"+
                "Jumlah Kaki:"+kaki+"\n"+
                "Makanan :"+makan+"\n"+
                "Type Hewan :"+tipe+"\n"
        );
    }
    
    
    public static void main(String[] args) {
    
        Hewan hewan = new Hewan();
        
        hewan.Nama("Harimau");
        hewan.Kaki(4);
        hewan.Mam("Daging");
        hewan.Tipe("Karnivora");
        hewan.Print();
        
        hewan.Nama("Kerbau");
        hewan.Kaki(4);
        hewan.Mam("Rumput");
        hewan.Tipe("Herbivora");
        hewan.Print();
    
    }   
}
