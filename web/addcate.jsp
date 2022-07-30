<%-- 
    Document   : addcate
    Created on : Mar 22, 2022, 1:24:52 PM
    Author     : DUC THINH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>ADD New Category</h1>
        <h3 style="color: red">${error}</h3>
        <form action="add" method="post">
            <table>
                <tbody>
                    <tr>
                        <td>CateID:</td>
                        <td><input type="text" name="cateid"></td>
                    </tr>
                    <tr>
                        <td>CateName:</td> 
                        <td><input type="text" name="catename"></td>
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
