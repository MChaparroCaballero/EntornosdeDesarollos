package prueba3_4_4_2024;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
 
public class Biblioteca {
 
    private static List<Libro> libros;
 
    
	public Biblioteca() {
		libros = new ArrayList<>();
	}
 
	public static void añadelibro(Libro libro) {
		libros.add(libro);
	}
	
public static void borralibro(String titulo) {
	Iterator<Libro> iterator = libros.iterator()  ;
	while (iterator.hasNext()) {
		Libro libro = iterator.next();
		if (libro.getTitulo().equals(titulo)) {
			iterator.remove();
		}
		
	}
	}
 
public static List<Libro> buscarlibro(String autor) {
	List<Libro> librosEncontrados = new ArrayList<>()  ;
     for (Libro libro : libros) {
		if (libro.getAutor().equals(autor)) {
			librosEncontrados.add(libro);
		}
	}
		return librosEncontrados;
	}
 
 
public static List<Libro> buscaportitulo(String titulo) {
	List<Libro> libros = new ArrayList<>()  ;
    for (Libro libro : libros) {
		if (libro.getTitulo().equals(titulo)) {
			libros.add(libro);
		}
	}
		return libros;
	}
 
 
public static int numerodelibros() {
	return libros.size();
	
}
}
 
 
class Libro {
	String titulo;
	String autor;
	int isbn;
	
	public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
 
    public String getTitulo() {
        return titulo;
    }
 
    public String getAutor() {
        return autor;
    }
}
/*public class Biblioteca {
	
	protected static ArrayList<String> base = new ArrayList<String>();
	private static int nlibro;
	static int i =0;
	
	
	public Biblioteca(ArrayList<String> base) {
		super();
		this.base = base;
	}
	
	public void añadelibro(Libro libro) {
		
		base.add("Titulo: " + libro.getTitulo() + " Autor: " + libro.getAutor() + " ISBN: " + libro.getISBN() + i);
		
		nlibro=nlibro+1;
		i++;
	}
	public  void borrarlibro(String titulo) {
		
	}
	public  void buscalibro(String autor) {
		
	}
	public  void buscaportitulo(String titulo) {
		
	}
	public void numerolibros() {
		System.out.println("Existen " + Libro.getNlibros() + " libros en la biblioteca");
		
	}
}
public class Libro extends Biblioteca{
private static String titulo;
private static String autor;
private static String ISBN;
private static int nlibros;

public Libro(String titulo, String autor, String iSBN) {
	super(base);
	this.titulo = titulo;
	this.autor = autor;
	ISBN = iSBN;

}




public String getTitulo() {
	return titulo;
}

public void setTitulo(String titulo) {
	this.titulo = titulo;
}

public String getAutor() {
	return autor;
}

public void setAutor(String autor) {
	this.autor = autor;
}

public String getISBN() {
	return ISBN;
}

public void setISBN(String iSBN) {
	ISBN = iSBN;
}

public static int getNlibros() {
	return nlibros;
}

public static void setNlibros(int nlibros) {
	Libro.nlibros = nlibros;
}

@Override
public void añadelibro(Libro libro) {
	
	
}

@Override
public void borrarlibro(String titulo) {
	// TODO Auto-generated method stub
	
}

@Override
public void buscalibro(String autor) {
	// TODO Auto-generated method stub
	
}

@Override
public void buscaportitulo(String titulo) {
	// TODO Auto-generated method stub
	
}










}

*/