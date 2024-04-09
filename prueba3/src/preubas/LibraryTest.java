package preubas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class LibraryTest {

	 private Biblioteca biblioteca;
	    private Libro libro1;
	    private Libro libro2;
	    private Libro libro3;

	    @BeforeEach
	    public void setUp() {
	        biblioteca = new Biblioteca();

	        libro1 = new Libro("El hobbit", "J.R.R. Tolkien", "123456789");
	        libro2 = new Libro("Harry Potter y la piedra filosofal", "J.K. Rowling", "987654321");
	        libro3 = new Libro("Harry Potter y la cámara secreta", "J.K. Rowling", "987654321");

	        biblioteca.añadelibro(libro1);
	        biblioteca.añadelibro(libro2);biblioteca.añadelibro(libro3);
	    }

	    @Test
	    public void testAñadelibro() {
	        assertEquals(3, biblioteca.numerolibros());
	    }

	    @Test
	    public void testBorralibro() {
	        biblioteca.borralibro("El hobbit");
	        assertEquals(2, biblioteca.numerolibros());

	        assertNull(biblioteca.buscaportitulo("El hobbit").get(0));
	    }

	    @Test
	    public void testBuscalibro() {
	        List<Libro> libros = biblioteca.buscalibro("J.K. Rowling");
	        assertEquals(2, libros.size());
	    }

	    @Test
	    public void testBuscaportitulo() {
	        List<Libro> libros = biblioteca.buscaportitulo("Harry Potter y la piedra filosofal");
	        assertEquals(1, libros.size());
	    }

	    @Test
	    public void testNumerolibros() {
	        assertEquals(3, biblioteca.numerolibros());
	    }

}
