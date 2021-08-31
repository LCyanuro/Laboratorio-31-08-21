class Estudiante
{
    //Datos del constructor
    String nombre;
    int matricula;
    String materia;
    float calificacion; //será float para darnos el lujo de ponerle decimales
    String estado;

    public Estudiante(String nombre, int matricula, String materia, float calificacion/*, String estado*/)
    {
        setNombre(nombre);
        setMatricula(matricula);
        setMateria(materia);
        setCalificacion(calificacion);
        AsignarEstado(calificacion);
    }

    //Setter y getters
    //SETTER
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    public void setMatricula(int matricula)
    {
        this.matricula = matricula;
    }
    public void setMateria(String materia)
    {
        this.materia = materia;
    }
    public void setCalificacion(float calificacion)
    {
        this.calificacion = calificacion;
    }
    //Tecnicamente cuenta como setter
    public void AsignarEstado(float calificacion)  //Recibe la calificacion
    {
        if(calificacion < 60)                      //Si es menor a 60
        {
            this.estado = "reprobado";
        }
        else                                       //Si es mayor o igual
        {
            this.estado = "aprobado";
        }
    }

    //GETTERS
    public String getNombre()
    {
        return nombre;
    }
    public int getMatricula(){
        return matricula;
    }
    public String getMateria()
    {
        return materia;
    }
    public float getCalificacion()
    {
        return calificacion;
    }
    public String getEstado()
    {
        return estado;
    }

    //Cambiar calificacion
    public void CambiarCalificacion(float calificacion)  //Recibe la calificacion
    {
        this.calificacion = calificacion;
    }

}

