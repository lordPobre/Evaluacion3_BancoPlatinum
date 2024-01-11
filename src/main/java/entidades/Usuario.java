package entidades;

public class Usuario {
	private String id;
	private String nombreUsuario;
	private String password;

	public String getId() {
		return id;
	}

	public void setId(String string) {
		this.id = string;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "EntidadUsuario [id=" + id + ", nombreUsuario=" + nombreUsuario + ", password=" + password + "]";
	}
}