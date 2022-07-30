<%-- 
    Document   : updatecate
    Created on : Mar 22, 2022, 1:54:08 PM
    Author     : DUC THINH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:set value="${cate}" var="c"/>
    <form action="updatecate" method="post">
            <table>
                <tbody>
                    <tr>
                        <td>CateID:</td>
                        <td><input type="text" name="cateid" value="${c.cateID}"></td>
                    </tr>
                    <tr>
                        <td>CateName:</td> 
                        <td><input type="text" name="catename"  value=${c.cateName}></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="Save"></td>
                        <td></td>
                    </tr>
                </tbody>
            </table>
        </form>
    </body>
</html>
