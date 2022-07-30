<%-- 
    Document   : signup
    Created on : Mar 3, 2022, 4:36:06 PM
    Author     : DUC THINH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Petshop</title>
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <style>
            @import url(https://fonts.googleapis.com/css?family=Roboto:300);

            .login-page {
                width: 360px;
                padding: 8% 0 0;
                margin: auto;
            }
            .form {
                position: relative;
                z-index: 1;
                background: #FFFFFF;
                max-width: 360px;
                margin: 0 auto 100px;
                padding: 45px;
                text-align: center;
                box-shadow: 0 0 20px 0 rgba(0, 0, 0, 0.2), 0 5px 5px 0 rgba(0, 0, 0, 0.24);
            }
            .form input {
                font-family: "Roboto", sans-serif;
                outline: 0;
                background: #f2f2f2;
                width: 100%;
                border: 0;
                margin: 0 0 15px;
                padding: 15px;
                box-sizing: border-box;
                font-size: 14px;
            }
            .form button {
                font-family: "Roboto", sans-serif;
                text-transform: uppercase;
                outline: 0;
                background: #4CAF50;
                width: 100%;
                border: 0;
                padding: 15px;
                color: #FFFFFF;
                font-size: 14px;
                -webkit-transition: all 0.3 ease;
                transition: all 0.3 ease;
                cursor: pointer;
            }
            .form .submit {
                background: #e4b9b9;
            }
            .form .message {
                margin: 15px 0 0;
                color: #b3b3b3;
                font-size: 12px;
            }
            .form .message a {
                color: #4CAF50;
                text-decoration: none;
            }

            .container {
                position: relative;
                z-index: 1;
                max-width: 300px;
                margin: 0 auto;
            }
            .container:before, .container:after {
                content: "";
                display: block;
                clear: both;
            }
            .container .info {
                margin: 50px auto;
                text-align: center;
            }
            .container .info h1 {
                margin: 0 0 15px;
                padding: 0;
                font-size: 36px;
                font-weight: 300;
                color: #1a1a1a;
            }
            .container .info span {
                color: #4d4d4d;
                font-size: 12px;
            }
            .container .info span a {
                color: #000000;
                text-decoration: none;
            }
            .container .info span .fa {
                color: #EF3B3A;
            }
            body {
                background: #76b852;  fallback for old browsers 
                background: -webkit-linear-gradient(right, #D7ADAD, #e4b9b9);
                background: -moz-linear-gradient(right, #D7ADAD, #e4b9b9);
                background: -o-linear-gradient(right, #D7ADAD, #e4b9b9);
                background: linear-gradient(to left, #D7ADAD, #e4b9b9);
                font-family: "Roboto", sans-serif;
                -webkit-font-smoothing: antialiased;
                -moz-osx-font-smoothing: grayscale;      
            }
            h1{
                text-align: center;
            }
            h3{
                text-align: center; 
            }
        </style>
    </head>
    <body>
        <div class="row">
            <nav class="navbar navbar-inverse bg-primary" role="navigation">
                <div class="container-fluid">
                    <!-- Brand and toggle get grouped for better mobile display -->
                    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                        <ul class="nav navbar-nav">
                            <li> <a href="home">Home</a></li>
                            <li><a href="login">Login</a></li>
                        </ul>
                    </div>
                </div>
            </nav>
        </div>
        <div class="login-page">
            <div class="form">
                <form class="register-form" action="signup" method="post">
                    <input type="text" name="user" placeholder="username">
                    <input type="password" name="pass" placeholder="password">
                    <input type="password" name="repass" placeholder=" Re-password">           
                    <p class="message">Already registered?</p>
                    <input class="submit" type="submit" name="" value="Sign up"/>
                </form>
            </div>
        </div>
        <h3 style="color: red">${requestScope.error}</h3>
        <h3 style="color: green">${requestScope.mess}</h3>
    </body>
</html>
