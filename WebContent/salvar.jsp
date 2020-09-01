<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="org.libertas.Pessoa" %>    
<%@ page import="org.libertas.PessoaDao" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
</head>
<body>
	<%
		Pessoa p = new Pessoa();
		p.setIdpessoa(Integer.parseInt(request.getParameter("idpessoa")));
		p.setNome( request.getParameter("nome") );
		p.setAltura( Double.parseDouble(request.getParameter("altura")) );
		p.setPeso(Double.parseDouble(request.getParameter("peso")));
		
		PessoaDao pdao = new PessoaDao();
		if (p.getIdpessoa()>0) {
			pdao.alterar(p);
		} else {
			pdao.inserir(p);
		}
		
		response.sendRedirect("listar.jsp");
	%>
	<h3>Pessoa Salva com Sucesso</h3>
	<a href="listar.jsp">listar</a>
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
</body>
</html>