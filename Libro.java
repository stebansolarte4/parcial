public class Libro {
    private String titulo;
    private String autor;
    private int numeroLibro;
    private int numeroLibroPrestado;
    private int cantidadPrestamo;
    private int cantidadEjemplares;
    

    public Libro (String titulo, String autor, int numeroLibro, int numeroLibroPrestado){
        this.titulo = titulo;
        this.autor = autor;
        this.numeroLibro = numeroLibro;
        this.numeroLibroPrestado = numeroLibroPrestado;
        this.cantidadPrestamo = 0;
        

    }

    public Libro (){

    }

    public String getTitulo (){
        return titulo;
    }
    public void setTitulo (String titulo){
        this.titulo = titulo;
    }
    public String getAutor (){
        return autor;
    }
    public void setAutor (String autor){
        this.autor = autor;
    }
    public int getNumeroLibro (){
        return numeroLibro;
    }
    public void setNumeroLibro (int numeroLibro){
        this.numeroLibro = numeroLibro;
    }
    public int getNumeroLibroPrestado (){
        return numeroLibroPrestado;
    }
    public void setNumeroLibroPrestado (int numeroLibroPrestado){
        this.numeroLibroPrestado = numeroLibroPrestado;
    }

    public boolean prestamo () {
        if (cantidadPrestamo < cantidadEjemplares) {
            cantidadPrestamo++;
            return true;
            
        } else {
            return false;
            
        }

    }
    public int getCantidadPrestamo (){
        return cantidadPrestamo;
    }
    public int getCantidadEjemplares (){
        return cantidadEjemplares;
    }

    public boolean devolucion () {
        if (cantidadPrestamo > 0 ) {
            cantidadPrestamo --;
            return true;
            
        } else {
            return false;
            
        }
         }

   public String toString () {
        return "Libro{" +
                "Título='" + titulo + '\'' +
                ", Autor='" + autor + '\'' +
                ", Ejemplares=" + cantidadEjemplares +
                ", Prestados=" + cantidadPrestamo +
                '}';
    }
    





   
}
