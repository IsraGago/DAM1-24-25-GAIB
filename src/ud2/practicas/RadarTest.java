package ud2.practicas;

public class RadarTest {
    public static void main(String[] args) {

        System.out.println(Radar.multaInfraccion(20, 0)); // 0
        System.out.println(Radar.multaInfraccion(20, 15)); // 100
        System.out.println(Radar.multaInfraccion(30, 21)); // 300
        System.out.println(Radar.multaInfraccion(40, 31)); // 400
        System.out.println(Radar.multaInfraccion(50, 50)); // 500
        System.out.println(Radar.multaInfraccion(50, 51)); // 600
        System.out.println();
        System.out.println(Radar.multaInfraccion(60, 0)); // 0
        System.out.println(Radar.multaInfraccion(70, 30)); // 100
        System.out.println(Radar.multaInfraccion(80, 31)); // 300
        System.out.println(Radar.multaInfraccion(90, 51)); // 400
        System.out.println(Radar.multaInfraccion(100, 61)); // 500
        System.out.println(Radar.multaInfraccion(110, 71)); // 600
        System.out.println(Radar.multaInfraccion(120, 1)); // 100

    }
}
