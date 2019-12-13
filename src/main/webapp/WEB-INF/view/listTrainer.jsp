<%-- 
    Document   : listCustomer
    Created on : Dec 9, 2019, 3:49:25 PM
    Author     : datura
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Trainer List</title>
        <style>
            body{
                background-color: gray;
            }
        </style>
    </head>
    <body>
        <div align="center">
            <h1>List of Trainers</h1>

            <form:form action="${pageContext.request.contextPath}/trainer/search" 
                       method="GET"> 
                <table border="1">
                    <tr>
                        <td>
                            <input type='submit' value='Search'>
                        </td>
                        <td>
                            <input type='text' name='searchName' size='20' placeholder="search trainer..">
                        </td>


                    </form:form>
                    <form:form action="${pageContext.request.contextPath}/trainer/create" 
                               method="GET">
                        <td>
                            <input type="submit" value="Create">
                        </td>
                    </form:form>
                </tr>
            </table>
            <br/>
            <table border = "1">
                <tr>
                    <th>ID</th>
                    <th>FirstName</th>
                    <th>LastName</th>
                    <th>Subject</th>
                    <th colspan=2"">Actions</th>
                </tr>
                <c:forEach items="${listOfTrainer}" var="t">
                    <c:url var="updateLink" value="/trainer/update">
                        <c:param name="trainerId" value="${t.id}" />
                    </c:url>
                    <c:url var="deleteLink" value="/trainer/delete">
                        <c:param name="trainerId" value="${t.id}" />
                    </c:url>
                    <tr>
                        <td>${t.id}</td>
                        <td>${t.fname}</td>
                        <td>${t.lname}</td>
                        <td>${t.subject}</td>
                        <td><a href="${updateLink}">Update</a></td>
                        <td>
                            <a href="${deleteLink}"
                               onclick="if (!(confirm('Are you sure you want to delete trainer with name: ${c.cname} ?')))
                                           return false" >Delete</a>
                        </td>
                    </tr>
                </c:forEach>
            </table>
            <a href="${pageContext.request.contextPath}">Back to main menu</a>
        </div>

    </body>
</html>
