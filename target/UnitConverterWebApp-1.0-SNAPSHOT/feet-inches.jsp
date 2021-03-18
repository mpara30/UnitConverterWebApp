<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Feet -> Meter</title>
    <link rel="stylesheet" href="index.css" />
</head>
<body>
<div class="center">
    <div class="content">
        <div class="message">
            <p>${error}</p>
        </div>
        <p>Feet->Inches</p>

        <form class="label-maker" action="/calculatedInches" method="post">

            <label for="feet">Feet value:</label>
            <input id="feet" type="double" name="feet" value=${feet}>

            <button class="button" type="submit">Calculate</button>

            <p>Result: ${result} in</p>

        </form>
    </div>
</div>
</body>
</html>
