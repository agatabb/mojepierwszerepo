/**
 * Created by Agata on 02.11.2017.
 */
public class Main {
    public static void main(String[] args) {
        Punkt2D punkt = new Punkt2D(4,5);
        System.out.println("współrzędna x: "+punkt.x+" współrzędna y: "+punkt.y);

        Punkt3D punkt3d = new Punkt3D();
        System.out.println("współrzędna x: "+punkt3d.x+" współrzędna y: "+punkt3d.y+" współrzędna z: "+punkt3d.z);

        punkt3d.x=4;
        punkt3d.y=7;
        punkt3d.z=8;

        System.out.println("współrzędna x: "+punkt3d.x+" współrzędna y: "+punkt3d.y+" współrzędna z: "+punkt3d.z);

    }
}
