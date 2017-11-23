/**
 * Created by USER on 2017-11-18.
 */
public class Main {
    public static void main(String[] args) {
        final int n=8;
        Punkt [] p = new Punkt[n];
        for (int i = 0; i <n ; i++) {
            p[i]=new Punkt(i,n-i);
            System.out.println(p[i]);
        }
        Distance[]d = new Distance[n*(n-1)/2];

        System.out.println(d);
        int k=0;
        for (int i = 0; i <n-1 ; i++) {
            for (int j = i+1; j <n ; j++) {
                d[k]= new Distance(p[i],p[j]);
                System.out.println(d[k++]);
            }

        }
    }
}
