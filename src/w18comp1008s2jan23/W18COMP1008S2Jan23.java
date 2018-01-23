
package w18comp1008s2jan23;

/**
 *
 * @author JWright
 */
public class W18COMP1008S2Jan23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int counter=100; counter>=1; counter -= 5)
            System.out.println(counter);
        
        //challenge 2 & 3
        for (int counter=0; counter<=100; counter += 10)
            System.out.printf("%d %s%n",counter, counter%20==0?"Java":"");
        
        System.out.printf("with 31 cm we can ski: %b%n", timeToSki(31));
        System.out.printf("with 29 cm we can ski: %b%n", timeToSki(29));
        
    }
    
    public static boolean timeToSki(int snowDepth)
    {
        return snowDepth > 30;
    }
    
}
