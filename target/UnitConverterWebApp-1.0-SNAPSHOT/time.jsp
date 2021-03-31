<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Time Conversion</title>
    <link rel="stylesheet" href="index.css">
</head>
<body>

<div class="center">
    <form action="index.jsp" method="get">
        <button class="button" type="submit" formaction="index.jsp"><-Select Unit</button>
    </form>

    <div class="content">
        <p>Time conversion</p>

        <form class="label-maker" action="/calculatedTime" method="post">

            <label for="seconds">Seconds:</label>
            <input id="seconds" type="number" name="seconds" value=${seconds}>

            <label for="minutes">Minutes:</label>
            <input id="minutes" type="number" name="minutes" value=${minutes}>

            <label for="hours">Hours:</label>
            <input id="hours" type="number" name="hours" value=${hours}>

            <label for="days">Days:</label>
            <input id="days" type="number" name="days" value=${days}>

            <button class="button" type="submit">Calculate</button>

            <button class="button" onclick="window.location.reload();">Reset</button>

        </form>

    </div>
</div>

</body>
</html>
