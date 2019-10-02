
package package2;

/**
 *
 * @author Eza
 */

public class Tester5 {
    public static void main(String[] args) {
        PublicModifier publicmodifier = new PublicModifier();
        publicmodifier.kali();
        publicmodifier.tambah();
        publicmodifier.kurang();
        publicmodifier.bagi();
        publicmodifier.rata();
    }   
}

/* method " kali() " dapat diakses karena type data public dapat diakses pada semua class yang menggunakan class yang berisi variabel tersebut, meskipun berada pada package yang berbeda 
*/