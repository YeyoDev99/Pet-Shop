package logica;

public class Perro implements Animal {
	// defino los atributos privados:

	private String nombre;
	private int edad;
	private String id = "Perro";
	
	// defino el constructor:

	public Perro(String nombre, int edad){
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public void sonido() {
		System.out.print("Guau!");
	}
	public void dormir() {
		System.out.print(getNombre());
	}
	public void comer() {
		System.out.print("Que delicia de comida");
	}
	// defino getters y setters

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
}
