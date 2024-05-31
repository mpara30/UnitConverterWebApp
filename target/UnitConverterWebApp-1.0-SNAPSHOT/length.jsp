<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Length Conversion</title>
    <link rel="stylesheet" href="index.css">
</head>
<body>
<div class="center">
    <form action="index.jsp" method="get">
        <button class="button" type="submit" formaction="index.jsp"><-Select Unit</button>
    </form>

    <div class="content">
        <p>Length conversion</p>

        <form class="label-maker" action="/calculatedLength" method="post">

            <label for="feet">Feet:</label>
            <input id="feet" type="number" name="feet" value=${feet}>

            <label for="meters">Meters:</label>
            <input id="meters" type="number" name="meters" value=${meters}>

            <label for="inches">Inches:</label>
            <input id="inches" type="number" name="inches" value=${inches}>

            <label for="centimeters">Centimeters:</label>
            <input id="centimeters" type="number" name="centimeters" value=${centimeters}>

            <label for="yards">Yards:</label>
            <input id="yards" type="number" name="yards" value=${yards}>

            <label for="kilometers">Kilometers:</label>
            <input id="kilometers" type="number" name="kilometers" value=${kilometers}>

            <label for="miles">Miles:</label>
            <input id="miles" type="number" name="miles" value=${miles}>

            <button class="button" type="submit">Calculate</button>

            <button class="button" onclick="window.location.reload();">Reset</button>

        </form>
    </div>
</div>

</body>
</html>
