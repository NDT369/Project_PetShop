<%-- 
    Document   : categorymanage
    Created on : Mar 22, 2022, 12:55:58 PM
    Author     : DUC THINH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <title>JSP Page</title>
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

        </style>
        <script type="text/javascript">
            function doDelete(id) {
                if (confirm("Are you sure to delete category with id = " + id + "?")) {
                    window.location = "delete?cid=" + id;
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
        <h1>Các loại Pet</h1>
        <div class="add">
            <button>
                <a href="addcate">ADD NEW</a>
            </button>
        </div>
        <table border="1px" width="100%">
            <tr>
                <th>CatID</th>
                <th>Name</th>
                <th>Action</th>
            </tr>
            <c:forEach items="${listcategory}" var="c">
                <tr>
                    <td>${c.cateID}</td>
                    <td>${c.cateName}</td>
                    <td>
                        <a href="updatecate?cid=${c.cateID}">Update</a>
                        <a href="" onclick="doDelete('${c.cateID}')">Delete</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
