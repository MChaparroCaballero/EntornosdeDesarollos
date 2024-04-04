package prueba3_4_4_2024;

import java.util.ArrayList;

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
