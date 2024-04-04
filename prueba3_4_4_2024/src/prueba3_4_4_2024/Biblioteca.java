package prueba3_4_4_2024;

import java.util.ArrayList;
import java.util.Collection;

public class Biblioteca {
	
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
