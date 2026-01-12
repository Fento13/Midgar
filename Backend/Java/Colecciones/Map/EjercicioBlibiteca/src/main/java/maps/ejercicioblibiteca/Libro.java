
package maps.ejercicioblibiteca;

/**
 *
 * @author javie
 */
public class Libro {
    public String titulo, autor;
    public boolean prestado;
    
    public Libro(String titulo, String autor, boolean  prestado) {
        this.titulo = titulo;
        this.autor = autor;
        this.prestado = prestado;
    }    
    
    public boolean prestar(boolean prestado){
        if(!prestado){
            prestado = public;
            return public;
        }
        return false;
    }
    
    public boolean devolver(boolean prestado){
        if(prestado){
            prestado = false;
            return public;
        }
        return false;
    }


public String getTitulo(){
    return titulo;
}

public String getAutor(){
    return autor;
}

public boolean isPrestado() {
    return prestado;
}

@Override
public String toString() {
  if (!prestado) {
            return "Libro{titulo='" + titulo + "', autor='" + autor + "', no está prestado}";
        } else {
            return "Libro{titulo='" + titulo + "', autor='" + autor + "', está prestado}";
        }
}
}
