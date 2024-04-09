package preubas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Biblioteca {
	private HashMap<String, Libro> librosPorTitulo;
	private HashMap<String, List<Libro>> librosPorAutor;

	public Biblioteca() {
		librosPorTitulo = new HashMap<>();
		librosPorAutor = new HashMap<>();
	}

	public void añadelibro(Libro libro) {
		librosPorTitulo.put(libro.getTitulo(), libro);

		if (librosPorAutor.containsKey(libro.getAutor())) {
			librosPorAutor.get(libro.getAutor()).add(libro);
		} else {
			List<Libro> listaNueva = new ArrayList<>();
			listaNueva.add(libro);
			librosPorAutor.put(libro.getAutor(), listaNueva);
		}
	}

	public void borralibro(String titulo) {
		Libro libroAEliminar = librosPorTitulo.get(titulo);

		if (libroAEliminar != null) {
			librosPorTitulo.remove(titulo);

			String autor = libroAEliminar.getAutor();
			List<Libro> librosDelAutor = librosPorAutor.get(autor);
			librosDelAutor.remove(libroAEliminar);

			if (librosDelAutor.isEmpty()) {
				librosPorAutor.remove(autor);
			}
		}
	}

	public List<Libro> buscalibro(String autor) {
		return librosPorAutor.get(autor);
	}

	public List<Libro> buscaportitulo(String titulo) {
		List<Libro> libros = new ArrayList<>();

		for (Libro libro : librosPorTitulo.values()) {
			if (libro.getTitulo().equals(titulo)) {
				libros.add(libro);
			}
		}

		return libros;
	}

	public int numerolibros() {
		return librosPorTitulo.size();
	}
}
