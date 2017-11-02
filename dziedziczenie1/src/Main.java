/**
 * Created by Agata on 02.11.2017.
 */
public class Main {
    public static void main(String[] args) {
        FiguryForemne [] figury = new FiguryForemne[7];
        figury [0] = new Okrag(4);
        figury [1] = new TrojkatRownoboczny(5);
        figury [2] = new Okrag(2);
        figury [3] = new TrojkatRownoboczny(6);
        figury [4] = new Prostopadloscian(4,5);
        figury [5] = new Prostopadloscian(2,3);
        for (int i = 0; i < 6 ; i++) {
            System.out.println(figury[i]);
        }
    }
}
