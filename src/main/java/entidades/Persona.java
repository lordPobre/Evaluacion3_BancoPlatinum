package entidades;

public class Persona {
	String Rut, Nombre, Apellido, Telefono, FechaIngreso;

	public String getRut() {
		return Rut;
	}

	public void setRut(String rut) {
		Rut = rut;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public String getTelefono() {
		return Telefono;
	}

	public void setTelefono(String telefono) {
		Telefono = telefono;
	}

	public String getFechaIngreso() {
		return FechaIngreso;
	}

	public void setFechaIngreso(String fechaIngreso) {
		FechaIngreso = fechaIngreso;
	}

	@Override
	public String toString() {
		return "Persona [Rut=" + Rut + ", Nombre=" + Nombre + ", Apellido=" + Apellido + ", Telefono=" + Telefono
				+ ", FechaIngreso=" + FechaIngreso + "]";
	}

}
