public class Ejercicio17 {
    public static void main(String[] args) {
        double radio, area, perimetro;
        radio = 15;
        area = Math.PI * Math.pow(radio, 2);
        perimetro = 2 * Math.PI * radio;
        System.out.println("El área del círculo de radio " + radio + " es: " + area);
        System.out.println("El perímetro del círculo de radio " + radio + " es: " + perimetro);
    }
}
