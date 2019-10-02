
package Package1;

/**
 *
 * @author Eza
 */

public class tester3 {
    public static void main(String[] args) {
        ProtectedModifier protectedmodifier = new ProtectedModifier();
        protectedmodifier.printInfo();
        protectedmodifier.sendMessage();
    }
}
/* method " printInfo() " dan " sendMessage() " dapat diakses karena di dalam turunan dalam satu package 
*/