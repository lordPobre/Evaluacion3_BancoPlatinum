<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>dashboard</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bulma@0.9.3/css/bulma.min.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta2/css/all.min.css"
	/>

</head>
<body>
	<section class="hero is-link is-fullheight">
		<div class="hero-body">
			<div class="container has-text-centered">
				<div class="columns is-multiline is-centered">
					<div class="column is-12">
						<h1 class="title">Bienvenido al sistema 
							${sessionScope.persona.nombre}  ${sessionScope.persona.apellido} </h1>
					</div>
					<div class="column is-4">
						<div class="box">
							<table
								class="table is-bordered is-striped is-narrow is-hoverable is-fullwidth ">
								<tbody>
									<tr>
										<td>Rut</td>
										<td>${sessionScope.persona.rut}</td>
									</tr>
									<tr>
										<td>Nombre</td>
										<td>${sessionScope.persona.nombre}</td>
									</tr>
									<tr>
										<td>Apellido</td>
										<td>${sessionScope.persona.apellido}</td>
									</tr>
									<tr>
										<td>Telefono</td>
										<td>${sessionScope.persona.telefono}</td>
									</tr>
									<tr>
										<td>Fecha Ingreso</td>
										<td>${sessionScope.persona.fechaIngreso}</td>
									</tr>
								</tbody>
							</table>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
</body>
</html>
