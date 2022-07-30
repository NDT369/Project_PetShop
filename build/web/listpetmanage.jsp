<%-- 
    Document   : listpetmanage
    Created on : Mar 1, 2022, 9:14:13 PM
    Author     : DUC THINH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
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

            .add{
                margin-top: 3%
            }             
            .pagination a {
                color: black;
                font-size: 15px;          
                padding: 4px 8px;
                text-decoration: none;
            }
            .pagination a.active {
                background-color: black;
                color: white;
            }
            .pagination a:hover:not(.active) {
                background-color: #FFC0CB;
                .pt{
                    margin-top: 200px;
                }
            </style>

            <script type="text/javascript">
                function doDelete(id) {
                    if (confirm("Are you sure to delete pet with id = " + id + "?")) {
                        window.location="delete?id=" + id;
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
            <h1>List Pet</h1>
<!--Add new pet-->
            <div class="add">
                <button>
                    <a href="add">ADD NEW</a>
                </button>
            </div>
            <table border="1px" width="100%">
                <tr>
                    <th>pet_id</th>
                    <th>pet_name</th>
                    <th>pet_color</th>
                    <th>pet_sex</th>
                    <th>pet_age</th>
                    <th>pet_price</th>
                    <th>pet_img</th>
                    <th>Quantity</th>
                    <th>Category</th>
                    <th>Action</th>
                </tr>
                <c:forEach items="${requestScope.data}" var="p">
                    <tr>
                        <td>${p.pet_id}</td>
                        <td>${p.pet_name}</td>
                        <td>${p.pet_color}</td>
                        <td>${p.pet_sex}</td>
                        <td>${p.pet_age}</td>
                        <td>${p.pet_price}</td>
                        <td><img width="30px" height="50px" src="${p.pet_img}"/></td>
                        <td>${p.quantity}</td>
                        <td>${p.cate.cateName}</td>
                        <td>
                            <a href="update?id=${p.pet_id}">Update</a>
                            <a href="" onclick="doDelete('${p.pet_id}')">Delete</a>
                        </td>
                    </tr>               
                </c:forEach> 
            </table>

            <!-- Phân trang -->
            <div class="col-12 pb-1">
                <nav aria-label="Page navigation">
                    <ul class="pagination justify-content-center mb-3">
                        <!-- Phân trang list ban đầu -->
                        <c:set var="page" value="${requestScope.page}"/>
                        <div class="pagination"> </div>
                        <c:forEach begin="${1}" end="${requestScope.num}" var="i"> 
                            <a class="${i==page?"active":""}" href="listpet?page=${i}">${i}</a>
                        </c:forEach>
                    </ul>
                </nav>
            </div>
        </body>
    </html>
