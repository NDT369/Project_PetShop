<%-- 
    Document   : manage
    Created on : Mar 1, 2022, 9:02:45 PM
    Author     : DUC THINH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Petshop</title>
        <link href="css/bootstrap.min.css" rel="stylesheet">
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
        
        <c:if test="${sessionScope.account!=null}">
            <h1>Hello ${sessionScope.account.username}!!!</h1>
        </c:if>
        <h2>Quản lý</h2>
        <a href="listpet">Danh sách sản phẩm</a><br/>
        <a href="listcategory">Các loại sản phẩm</a><br/>
        <a href="ordermanage">Danh sách đặt hàng</a>
        
        <h2>Thống kê</h2>
        <a href="statisticalmanage">Danh sách thống kê</a>
    </body>
</html>
