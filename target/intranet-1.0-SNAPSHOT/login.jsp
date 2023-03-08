<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>

<div align="center">
    <h1>Login</h1>

    <form action="login" method="post">
        <table>
            <tr>
                <td>Login:</td>
                <td><label>
                    <input type="text" name="login"  placeholder="Username"/>
                </label></td>
            </tr>
            <tr>
                <td>Password:</td>
                <td><label>
                    <input type="password" name="password"  placeholder= "Password"/>
                </label></td>
            </tr>
        </table>
        <button type="submit">Log ind</button>

    </form>

</div>
<a href="index.jsp">Tilbage til forsiden</a>
</body>
</html>
