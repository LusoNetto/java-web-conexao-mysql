<jsp:useBean id="cliente"  scope="page" class="classe.Cliente"></jsp:useBean> 

<%
	cliente.codigo = request.getParameter("codigo");
	cliente.nome = request.getParameter("nome");
	cliente.genero = request.getParameter("genero");
	cliente.dataNascimento = request.getParameter("dataNascimento");
	cliente.cpf = request.getParameter("cpf");
	cliente.telefone = request.getParameter("telefone");
	cliente.email = request.getParameter("email");
	cliente.senha = request.getParameter("senha");
	cliente.enderecoResidencial = request.getParameter("enderecoResidencial");
	cliente.salvar();
	out.print("Cliente " + cliente.nome + " foi salvo.");
%>