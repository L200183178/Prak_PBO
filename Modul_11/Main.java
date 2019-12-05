package sarangan.latihan;


public class Main {
    public static void main(String[]args){
        NestedClass nested1 = new NestedClass();
        nested1.printNama();
        NestedClass.InnerClass inner1 = nested1.new InnerClass();
        System.out.println(inner1.getJurusan());
    }
    
}
