<%-- 
    Document   : statisticalmanage
    Created on : Mar 13, 2022, 9:25:55 PM
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
        <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/3.7.1/chart.min.js" integrity="sha512-QSkVNOCYLtj73J4hbmVoOV6KVZuMluZlioC+trLpewV8qMjsWqlIQvkn1KGX2StWvPMdWGBqim1xlC8krl1EKQ==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/3.7.1/chart.esm.js" integrity="sha512-jUlTTDoq6IvZiinGFQetLcklithBTp8sVUkkUBEYQvYd3hwMuCTd59kAzVpJwvRTmZ2palO++nX+vKC+cK9lqg==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/3.7.1/chart.esm.min.js" integrity="sha512-ESlgC6ZyzTZdmD7XoDrXJNOqoIugH+FNKg8nAk8sa3cZfFALiV+lo5xoia649oyygwnkKsdUdPAJ+puqGbOs+g==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/3.7.1/chart.js" integrity="sha512-Lii3WMtgA0C0qmmkdCpsG0Gjr6M0ajRyQRQSbTF6BsrVh/nhZdHpVZ76iMIPvQwz1eoXC3DmAg9K51qT5/dEVg==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/3.7.1/helpers.esm.js" integrity="sha512-DfyVRytIoS7LXOzmxSD4//oV81uwh1xV/EuK/xeh5gVJycOdBj+XTl7jeM6bcy7jiBIabR/9S2uyRL3oKKustw==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/3.7.1/helpers.esm.min.js" integrity="sha512-urWBnIv+F027G24xDNigjxvIuwnWlWy94W2yx77VkISKLzKSohOKOubMDhtEF6LZcEH7gctmNSpxDqIW/zMmUg==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
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

            /*            th{
                            width: 40%;
                        }
            
                        td{
                            width: 60%;
                        }*/

            th, td {  
                padding: 10px;
                text-align: center;
            }  
        </style>

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
        <h1>Một số thống kê cơ bản</h1>

        <h2>Pet mua nhiều nhất</h2>
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
            </tr>
            <c:set var="p" value="${requestScope.mostpet}"/>
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
            </tr>               
        </table>

        <h2>Pet chưa ai mua</h2>
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
            </tr>
            <c:forEach items="${requestScope.noonebuy}" var="pet">
                <tr>
                    <td>${pet.pet_id}</td>
                    <td>${pet.pet_name}</td>
                    <td>${pet.pet_color}</td>
                    <td>${pet.pet_sex}</td>
                    <td>${pet.pet_age}</td>
                    <td>${pet.pet_price}</td>
                    <td><img width="30px" height="50px" src="${pet.pet_img}"/></td>
                    <td>${pet.quantity}</td>
                    <td>${pet.cate.cateName}</td>
                </tr>               
            </c:forEach> 
        </table>

        <h2>Thống kê tiền thu được mỗi ngày</h2>
        <table border="1px" width="100%">
            <tr>
                <th>Date</th>
                <th>Money</th>
            </tr>
            <c:forEach items="${requestScope.summoney}" var="o">
                <tr>
                    <td>${o.order_date}</td>
                    <td>${o.totalMoney}</td>              
                </c:forEach> 
        </table>

        <h2>Biểu đồ Thống kê tiền thu được mỗi tháng</h2>
         <div style="width: 50%;height: 50%">
            <canvas id="myChart" width="600" height="500"></canvas>
            <script>
                const ctx = document.getElementById('myChart');
                const myChart = new Chart(ctx, {
                    type: 'bar',
                    data: {
                        labels: ['January', 'February', 'March', 'April', 'May', 'June', 'July', 'May', 'September', 'October', 'November', 'December'],
                        datasets: [{
                                label: 'Total Money on month',
                                data: ${totalbymonth},
                                backgroundColor: [
                                    'rgba(255, 99, 132, 0.6)',
                                ],
                            }]
                    },
                    options: {
                        scales: {
                            y: {
                                beginAtZero: true
                            }
                        }
                    }
                });
            </script>
        </div>

    </body>
</html>
