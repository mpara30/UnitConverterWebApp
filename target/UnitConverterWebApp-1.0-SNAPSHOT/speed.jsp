<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Speed Conversion</title>
    <link rel="stylesheet" href="index.css" />
</head>
<body>

<div class="center">

    <form action="index.jsp" method="get">
        <button class="button" type="submit" formaction="index.jsp"><-Select Unit</button>
    </form>

    <div class="content">
        <p>Speed Conversion</p>

        <form class="label-maker" action="/calculatedSpeed" method="post">

            <label for="mph">Miles Per Hour (MPH):</label>
            <input id="mph" type="number" name="mph" value=${mph}>

            <label for="kph">Kilometers Per Hour (KPH):</label>
            <input id="kph" type="number" name="kph" value=${kph}>

            <label for="knots">Knots:</label>
            <input id="knots" type="number" name="knots" value=${knots}>

            <label for="mach">Mach:</label>
            <input id="mach" type="number" name="mach" value=${mach}>

            <button class="button" type="submit">Calculate</button>

            <button class="button" onclick="window.location.reload();">Reset</button>

        </form>
    </div>

</div>

</body>
</html>
