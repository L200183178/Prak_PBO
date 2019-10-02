
package package2;

/**
 *
 * @author Eza
 */
import Package1.DefaultModifier;

public class Tester2 {
    public static void main(String[] args) {
        DefaultModifier defaultmodifier = new DefaultModifier();
        defaultmodifier.jml();
    }
}
/* method jml() tidak bisa diakses karena defaultmodifier hanya dapat diakses oleh class package yang sama 
*/