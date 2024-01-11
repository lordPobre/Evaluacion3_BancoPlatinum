<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Banco Platinum Login</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bulma@0.9.3/css/bulma.min.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta2/css/all.min.css"
	 />

</head>
<body>
	<section class="hero is-primary is-fullheight">
		<div class="hero-body">
			<div class="container">
				<div class="columns is-centered">
					<div class="column is-5-tablet is-4-desktop is-3-widescreen">
						<form action="usuario" method="POST" class="box">
							<div class="field">
								<label for="" class="label">Usuario</label>
								<div class="control has-icons-left">
									<input id="username" name="username" type="text"
										placeholder="Nombre usuario" class="input"> <span
										class="icon is-small is-left"> <i
										class="fa fa-envelope"></i>
									</span>
								</div>
							</div>
							<div class="field">
								<label for="" class="label">Password</label>
								<div class="control has-icons-left">
									<input id="password" name="password" type="password"
										placeholder="*******" class="input"> <span
										class="icon is-small is-left"> <i class="fa fa-lock"></i>
									</span>
								</div>
							</div>
							<div class="field">
								<label for="" class="checkbox"> <input type="checkbox">
									Recordarme
								</label>
							</div>
							<div class="field">
								<button type="submit"  class="button is-success">Iniciar Sesión</button>
							</div>
						</form>
					
						 <c:set var="mensaje" value="${requestScope.mensaje}" />
						<c:if test="${not empty mensaje}">
							<div class='notification is-danger'>
						    	${mensaje}
							</div>
						</c:if>
					</div>
				</div>
			</div>
		</div>
	</section>
</body>
</html>


