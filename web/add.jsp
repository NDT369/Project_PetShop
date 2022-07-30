<%-- 
    Document   : add
    Created on : Feb 28, 2022, 3:57:15 PM
    Author     : DUC THINH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Petshop</title>
    </head>
    <body>
        <h1>ADD New Pet</h1>
        <h3 style="color: red">${error}</h3>
        <form action="add" method="post">
            <table>
                <tbody>
                    <tr>
                        <td>PetID:</td>
                        <td><input type="text" name="pet_id"></td>
                    </tr>
                    <tr>
                        <td>PetName:</td> 
                        <td><input type="text" name="pet_name"></td>
                    </tr>
                    <tr>
                        <td>PetColor:</td>
                        <td><input type="text" name="pet_color"></td>
                    </tr>
                    <tr>
                        <td>PetSex:</td>
                        <td><input type="text" name="pet_sex"></td>
                    </tr>
                    <tr>
                        <td>PetAge:</td>
                        <td><input type="text" name="pet_age"></td>
                    </tr>
                    <tr>
                        <td>PetPrice:</td>
                        <td><input type="text" name="pet_price"></td>
                    </tr>
                    <tr>
                        <td>PetImg:</td>
                        <td><input type="text" name="pet_img"></td>
                    </tr>
                    <tr>
                        <td>Quantity:</td>
                        <td><input type="text" name="quantity"></td>
                    </tr>
                    <tr>
                        <td>PetCateID:</td>
                        <td>
                            <select name="category">
                                <c:forEach items="${sessionScope.category}" var="c" >
                                    <option value="${c.cateID}">${c.cateID}-${c.cateName}</option>
                                </c:forEach>
                            </select>
                        </td>
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
