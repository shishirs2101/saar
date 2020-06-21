<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
                    </tr>
                    <tr></tr>
                </table>
            </form>
        </body>
        </html>