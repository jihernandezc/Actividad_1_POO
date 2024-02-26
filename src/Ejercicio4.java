public class Ejercicio4 {
    public static void main(String[] args) {
        int edadJuan = 9;
        int edadAlberto = 2 * edadJuan / 3 ;
        int edadAna = 4 * edadJuan / 3 ;
        int edadMama = edadJuan + edadAlberto + edadAna;
        System.out.println("Las edades son:");
        System.out.println("Juan = " + edadJuan);
        System.out.println("Alberto = " + edadAlberto);
        System.out.println("Ana = " + edadAna);
        System.out.println("Mamá = " + edadMama);
    }
}