<%-- 
    Document   : update
    Created on : Feb 28, 2022, 5:45:40 PM
    Author     : DUC THINH
--%>
<%@page import="model.Pet"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Petshop</title>
    </head>
    <body>
        <h1>Update Pet</h1>
        <%
            Pet p = (Pet) request.getAttribute("pet");
        %>
        <form action="update" method="post">
            <table>
                <tbody>
                    <tr>
                        <td>PetID:</td>
                        <td><input type="text" name="pet_id" readonly value="<%= p.getPet_id()%>"></td>
                    </tr>
                    <tr>
                        <td>PetName:</td>
                        <td><input type="text" name="pet_name" value="<%= p.getPet_name()%>"></td>
                    </tr>
                    <tr>
                        <td>PetColor:</td>
                        <td><input type="text" name="pet_color" value="<%= p.getPet_color()%>"></td>
                    </tr>
                    <tr>
                        <td>PetSex:</td>
                        <td><input type="text" name="pet_sex" value="<%= p.getPet_sex()%>"></td>
                    </tr>
                    <tr>
                        <td>PetAge:</td>
                        <td><input type="text" name="pet_age" value="<%= p.getPet_age()%>"></td>
                    </tr>
                    <tr>
                        <td>PetPrice:</td>
                        <td><input type="text" name="pet_price" value="<%= p.getPet_price()%>"></td>
                    </tr>
                    <tr>
                        <td>PetImg:</td>
                        <td><input type="text" name="pet_img" value="<%= p.getPet_img()%>"></td>
                    </tr>
                    <tr>
                        <td>Quantity:</td>
                        <td><input type="text" name="quantity" value="<%= p.getQuantity()%>"></td>
                    </tr>
                    <tr>
                        <td>PetCateID:</td>
                        <td><input type="text" name="cateID" value="<%= p.getCate().getCateID()%>"></td>
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
