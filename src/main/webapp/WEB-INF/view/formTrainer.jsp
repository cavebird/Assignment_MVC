<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Customer Form</title>
        <style>
            .error{
                color:red
            }

            body{
                background-color: gray;
            }
        </style>
    </head>
    <body>
        <div align="center">
            <c:choose>
                <c:when test="${trainer.id != 0}">
                    <h1>Update Trainer</h1>
                </c:when>
                <c:otherwise>
                    <h1>Create Trainer</h1>
                </c:otherwise>
            </c:choose>



            <form:form 
                action="${pageContext.request.contextPath}/trainer/create" 
                method="POST"
                modelAttribute="trainer">
                <form:hidden path="id"/>
                First Name: <span class='error'>*</span> <form:input path="fname"/> 
                <form:errors path="fname" cssClass="error"/><br/>
                Last Name: <span class='error'>*</span> <form:input path="lname"/> 
                <form:errors path="lname" cssClass="error"/><br/>
                Subject: <form:input path="subject"/> <br/>
                <small>Fields with <span class='error'>*</span> are required</small>
                <br/>
                <input type="submit" value="Submit">
            </form:form>
            <br/>
            <a href="${pageContext.request.contextPath}/trainer/list" >Back to list</a>
        </div>
    </body>
</html>
