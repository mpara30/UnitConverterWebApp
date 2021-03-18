<%--
  Created by IntelliJ IDEA.
  User: param
  Date: 3/18/2021
  Time: 5:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Feet -> Yards</title>
    <link rel="stylesheet" href="index.css" />
</head>
<body>
<div class="center">
    <div class="content">
        <div class="message">
            <p>${error}</p>
        </div>
        <p>Feet->Yards</p>

        <form class="label-maker" action="/calculatedYards" method="post">

            <label for="feet">Feet value:</label>
            <input id="feet" type="double" name="feet" value=${feet}>

            <button class="button" type="submit">Calculate</button>

            <p>Result: ${result} yards</p>

        </form>
    </div>
</div>
</body>
</html>
