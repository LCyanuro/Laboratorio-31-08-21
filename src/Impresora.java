public class Impresora
{
    //El unico metodo de esta clase recibe como entrada una estructura de datos de tipo estudiante
    //Y lo que hará es imprimir el conjunto de datos que lo conforman.
    public static void Impresora(Estudiante estudiante)
    {
        System.out.println("Nombre: " + estudiante.getNombre());
        System.out.println("Matricula: " + estudiante.getMatricula());
        System.out.println("Materia: " + estudiante.getMateria());
        System.out.println("Calificacion: " + estudiante.getCalificacion());
        System.out.println("Estado: " + estudiante.getEstado());
        System.out.println("");
    }
}