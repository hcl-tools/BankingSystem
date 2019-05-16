<%--
  Created by IntelliJ IDEA.
  User: mnade
  Date: 15/05/2019
  Time: 11:09 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="index.jsp" %>
<hr/>

<h3>Login Form</h3>
<br/>
<form action="controller" method="post">
    Email:<input type="text" name="email"/><br/><br/>
    Password:<input type="password" name="password"/><br/><br/>
    <input type="submit" value="Submit"/>
</form>