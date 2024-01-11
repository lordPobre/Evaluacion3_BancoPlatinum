package utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import entidades.Persona;

public class Autenticar {

	public static final Persona iniciarSesion(String nombreUsuario, String password) {
		Persona persona = new Persona();
		;
		Connection cn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;

		try {
			cn = Conexion.getConexion();
			String sql = "SELECT U.Username as user, U.Password as password, U.Persona as rut FROM Usuarios U WHERE U.Username  = ? AND U.Password = ?";
			pstm = cn.prepareStatement(sql);
			pstm.setString(1, nombreUsuario);
			pstm.setString(2, password);
			rs = pstm.executeQuery();
			while (rs.next()) {
				
				String rutUsuarioValidado = rs.getString("rut");
				cn.close();
				String sqlP = "SELECT P.Rut as rut, P.Nombre as nombre, P.Apellido as apellido ,  P.Telefono as telefono,  P.FechaIngreso as fecha_ingreso  FROM  Personas P WHERE P.Rut = ?"
;				Connection cn2 = Conexion.getConexion();
				PreparedStatement pstm2 = null;
				ResultSet rs2 = null;
				pstm2 = cn2.prepareStatement(sqlP);
				pstm2.setString(1, rutUsuarioValidado);
				rs2 = pstm2.executeQuery();
				rs2.next();
				
				persona.setRut(rutUsuarioValidado);
				persona.setNombre(rs2.getString("nombre"));
				persona.setApellido(rs2.getString("apellido"));
				persona.setTelefono(rs2.getString("telefono"));
				persona.setFechaIngreso(rs2.getString("fecha_ingreso"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}

				if (pstm != null) {
					pstm.close();
				}

				if (cn != null) {
					cn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

		return persona;
	}
}
