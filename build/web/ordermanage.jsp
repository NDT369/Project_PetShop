<%-- 
    Document   : ordermanage
    Created on : Mar 14, 2022, 9:34:35 AM
    Author     : DUC THINH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Petshop</title>
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <style>
            h1{
                text-align: center;
            }

            a{

                text-decoration: none;
            }

            table, th, td {  
                border: 1px solid black;  
                border-collapse: collapse;  
            } 

            th, td {  
                padding: 10px;
                text-align: center;
            }  

        </style>
        <script type="text/javascript">
                function doDelete(id) {
                    if (confirm("Are you sure to delete pet with id = " + id + "?")) {
                        window.location="deleteorder?id=" + id;
                    }
                }
        </script>
    </head>
    <body>
        <div class="row">

            <nav class="navbar navbar-inverse bg-primary" role="navigation">
                <div class="container-fluid">
                    <!-- Brand and toggle get grouped for better mobile display -->
                    <div class="navbar-header">
                        <button type="button" class="navbar-toggle" data-toggle="collapse"
                                data-target="#bs-example-navbar-collapse-1">
                            <span class="sr-only">Toggle navigation</span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>

                    </div>

                    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                        <ul class="nav navbar-nav">

                            <li> <a href="home">Home</a></li>

                            <li><a href="manage">Manage</a></li>
                        </ul>
                    </div>
                </div>
            </nav>

        </div>
        <h1>List Order</h1>
        <table border="1px" width="100%">
            <tr>
                <th>Order_id</th>
                <th>Customer_id</th>
                <th>Order_date</th>
                <th>Total Money</th>
                <th>Edit<th>
            </tr>
            <c:forEach items="${requestScope.orderlist}" var="o">
                <tr>
                    <td>${o.order_id}</td>
                    <td>${o.cus_id}</td>
                    <td>${o.order_date}</td>
                    <td>${o.totalMoney}</td>
                    <td><a href="" onclick="doDelete('${o.order_id}')">Delete</a></td>
                </tr>               
            </c:forEach> 
        </table>
    </body>
</html>
