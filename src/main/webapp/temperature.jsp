<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Temperature Conversions</title>
    <link rel="stylesheet" href="index.css" />
</head>
<body>
<div class="center">
    <div class="content">

        <p>Temperature conversions</p>

        <form class="label-maker" action="/calculatedTemperatures" method="post">

            <label for="celsius">Celsius:</label>
            <input id="celsius" type="number" name="celsius" value=${celsius}>

            <label for="kelvin">Kelvin:</label>
            <input id="kelvin" type="number" name="kelvin" value=${kelvin}>

            <label for="fahrenheit">Fahrenheit:</label>
            <input id="fahrenheit" type="number" name="fahrenheit" value=${fahrenheit}>

            <button class="button" type="submit">Calculate</button>

            <button  class="button" onclick="window.location.reload();">Reset</button>

        </form>
    </div>
</div>
</body>
</html>
