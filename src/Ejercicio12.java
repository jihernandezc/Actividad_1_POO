public class Ejercicio12 {
    public static void main(String[] args) {
        int horasTrabajadas, precioHora;
        float retencion, salarioBruto, retencionSalario, salarioNeto;
        horasTrabajadas = 48;
        precioHora = 5000;
        retencion = 0.125f;
        salarioBruto = horasTrabajadas * precioHora;
        retencionSalario = salarioBruto * retencion;
        salarioNeto = salarioBruto - (salarioBruto * retencion);
        System.out.println("El salario bruto es: " + salarioBruto);
        System.out.println("La retención del salario es: " + retencionSalario);
        System.out.println("El salario neto es: " + salarioNeto);
    }
}
