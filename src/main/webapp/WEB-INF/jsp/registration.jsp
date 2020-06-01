<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
        <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
            <title>Registration</title>
            <style>
                .error{color:red}
            </style>
        </head>
        <body>
            <form:form id="regForm" modelAttribute="userDetail" action="saveUserDetails" method="post">
                <table align="center">
                    <tr>
                        <td>
                            <form:label path="name">FullName</form:label>
                        </td>
                        <td>
                            <form:input path="name"/>
                            <form:errors path="name" cssClass="error" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <form:label path="emailId">Email Id</form:label>
                        </td>
                        <td>
                            <form:input path="emailId" name="emailId" id="emailId" />
                            <form:errors path="emailId" cssClass="error" />

                        </td>
                    </tr>
                    <tr>
                        <td>
                            <form:label path="pri_contact_no">Primary Contact NO</form:label>
                        </td>
                        <td>
                            <form:input path="pri_contact_no" name="pri_contact_no" id="pri_contact_no" />
                            <form:errors path="pri_contact_no" cssClass="error" />

                        </td>
                    </tr>
                    <tr>
                        <td>
                            <form:label path="sec_contact_no">Secondry Contact no</form:label>
                        </td>
                        <td>
                            <form:input path="sec_contact_no" name="sec_contact_no" id="sec_contact_no" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <form:label path="address">Address</form:label>
                        </td>
                        <td>
                            <form:input path="address" name="address" id="address" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <form:label path="dob">DOB</form:label>
                        </td>
                        <td>
                            <form:input path="dob" name="dob" id="dob" />
                            <form:errors path="dob" cssClass="error" />
                        </td>
                    </tr>
                    <tr>
                        <td></td>
                        <td>
                            <form:button id="register" name="register">Register</form:button>
                        </td>
                    </tr>
                    <tr></tr>
                </table>
            </form:form>
        </body>
        </html>