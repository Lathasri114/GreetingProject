<%@page import="org.example.SavingsAccount"%>
<%
SavingsAccount acc1 = new SavingsAccount(5000);
%>

<h2> The balance is <%=acc1.getBalance() %></h2>