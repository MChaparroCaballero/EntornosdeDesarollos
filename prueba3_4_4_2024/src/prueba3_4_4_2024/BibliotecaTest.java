package prueba3_4_4_2024;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class BibliotecaTest {

	@Test
    public void crearbiblioteca() {
     Biblioteca biblioteca = new Biblioteca();
    }
 
	
	@Test
	public void testAñadelibro() {
		Libro libro = new Libro("HeartStopper", "Alice Copper");
        Biblioteca biblioteca = new Biblioteca();
		biblioteca.añadelibro(libro);
        assertEquals(1, Biblioteca.numerodelibros());
	}
 
	@Test
	public void testBorralibro() {
		
        Biblioteca.borralibro("Heartstopper");
        assertEquals(2, Biblioteca.numerodelibros());
	}
 
	
	
	@Test
	public void testBuscarlibro() {
		Libro libro1 = new Libro("Percy jackson","Rick Rordan");
		Libro libro2 = new Libro("El quijote", "Cervantes");
		
		Biblioteca.añadelibro(libro1);
		Biblioteca.añadelibro(libro2);
        List<Libro> librosEncontrados = Biblioteca.buscarlibro("Cervantes");
        assertEquals(1, librosEncontrados.size());
        assertEquals("El quijote", librosEncontrados.get(0).getTitulo());
 
	}
 
	@Test
	public void testBuscaportitulo() {
		
        List<Libro> librosEncontrados = Biblioteca.buscaportitulo("Percy jackson");
        assertEquals(0, librosEncontrados.size());
		
	}
 
	@Test
	public void testNumerodelibros() {
        assertEquals(0, Biblioteca.numerodelibros());
 
	}
 
}
 
	
	
	

