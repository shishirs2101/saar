<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

    <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
        <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
            <title>Registration</title>
        </head>
        <body>
            <form id="login" action="/v1/userAuthenticate" method="POST">
                <table align="center">
                <tr>
                <td>
                <c:if test="${param.error!=null}">
                <i>Invalid username or password !!!</i>
                </c:if>
                </td>
                </tr>
                    <tr>
                        <td>
                            <label path="username">UserName</label>
                        </td>
                        <td>
                             <input type="text" placeholder="Enter Username" name="username" required>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <label path="password">Password</label>
                        </td>
                        <td>
                           <input type="text" placeholder="Enter password" name="password" required>
                        </td>
                    </tr>
                    <tr>
                        <td></td>
                        <td>
                           <button type="submit">Login</button>
                        </td>
                        <td>
                            <a href="/logout">logout</a>
                        </td>
                    </tr>
                    <tr></tr>
                </table>
            </form>
        </body>
        </html>