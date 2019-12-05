package sarangan.latihan;

public class NestedClass {
    String nama="Ezaza";
    String nim="3178";
    
    public void printNama(){
        System.out.println(nama+" : "+nim);
    }
    static class StaticNestedClass{
        static String jurusan="informatika";
    }
    class InnerClass{
        public String getJurusan(){
            return StaticNestedClass.jurusan;
        }
    }
}
