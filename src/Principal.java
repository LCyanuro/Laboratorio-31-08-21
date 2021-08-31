import java.util.Arrays;

public class Principal
{
    public static void main(String args[])
    {
        //Estudiante pancho = new Estudiante(CapturaEntrada.capturarCadena("Inserte su Nombre: "),CapturaEntrada.capturarEntero("Inserte su Matricula: "),CapturaEntrada.capturarCadena("Inserte su Materia: "),CapturaEntrada.capturarFlotante("Inserte su Calificacion: "));
        //Impresora.Impresora(pancho);

        Estudiante el_salon[] = new Estudiante[5]; //Inicalizacion del arreglo

        //Los 5 elegidos para ser los defaults
        el_salon[0] = new Estudiante("Juan Carlos Bodoque",1272300,"POO",80.1f);
        el_salon[1] = new Estudiante("Patana",1282301,"Programación Estructurada",59.1f);
        el_salon[2] = new Estudiante("Juanín juan Harry",1295689,"Métodos Numéricos",49.1f);
        el_salon[3] = new Estudiante("Tulio Triviño",1373211,"Metodología de la programación",69.78f);
        el_salon[4] = new Estudiante("Policarpo Avendaño",1363691,"Informatica para Oficinas",95.33f);



        int i = 0;
        for(i=0;i<2;i++)//Ciclo del menu principal. No me gustan los whiles
        {
            System.out.println("");
            System.out.println("");
            System.out.println("== MENU PRINCIPAL ==");
            System.out.println("1.- Capturar Alumnos");
            System.out.println("2.- Mostrar Alumnos");
            System.out.println("3.- Cambiar la calificacion");
            System.out.println("4.- Salir");
            int seleccion = CapturaEntrada.capturarEntero("Inserte Seleccion: ");
            System.out.println("");
            System.out.println("");
            if (seleccion == 1)
            {
                el_salon = Arrays.copyOf(el_salon, el_salon.length + 1);
                el_salon[el_salon.length - 1] = new Estudiante(CapturaEntrada.capturarCadena("Inserte su Nombre: "),CapturaEntrada.capturarEntero("Inserte su Matricula"),CapturaEntrada.capturarCadena("Inserte su Materia"),CapturaEntrada.capturarFlotante("Inserte su Calificacion"));
                i = 0;
            }
            else if (seleccion == 2)
            {
                System.out.println("========================================================================");
                int k = 0;
                for(k = 0;k<(el_salon.length);k++)
                {
                    Impresora.Impresora(el_salon[k]);
                }
                System.out.println("========================================================================");
                i = 0;
            }
            else if (seleccion == 3)
            {
                int l = 0;
                for(l = 0;l<2;l++)
                {
                    System.out.println("");
                    int cambiador = CapturaEntrada.capturarEntero("Índice del alumno a cambiarle la calificación");
                    System.out.println("");

                    if(l <= el_salon.length-1)
                    {
                        l = 2;
                        i=0;
                        float nueva_cal = CapturaEntrada.capturarEntero("Nueva calificación");
                        el_salon[cambiador].CambiarCalificacion(nueva_cal);
                    }
                    else
                    {
                        System.out.println("PROBLEMA DE VERIFICACION, INTENTALO DENUEVO.");
                        l = 0;
                    }
                }
            }
            else
            {
                System.out.println("HASTA PRONTO");
                break;
            }
        }
    }
}