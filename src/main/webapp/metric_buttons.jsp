<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Length Selector</title>
    <link rel="stylesheet" href="index.css" />
</head>
<body>
<div class="center">
    <div class="content">
        <p>Length Conversions</p>

        <div class="grid-container">

            <form action="feet-meter.jsp" method="get">
                <button class="button" type="submit"  formaction="feet-meter.jsp">Feet -> Meter</button>
            </form>

            <form action="feet-inches.jsp" method="get">
                <button class="button" type="submit"  formaction="feet-inches.jsp">Feet -> Inches</button>
            </form>

            <form action="feet-cm.jsp" method="get">
                <button class="button" type="submit"  formaction="feet-cm.jsp">Feet -> Centimeters</button>
            </form>

            <form action="feet-yards.jsp" method="get">
                <button class="button" type="submit"  formaction="feet-yards.jsp">Feet -> Yards</button>
            </form>

            <form action="feet-kilometers.jsp" method="get">
                <button class="button" type="submit"  formaction="feet-kilometers.jsp">Feet -> Kilometers</button>
            </form>

            <form action="feet-miles.jsp" method="get">
                <button class="button" type="submit"  formaction="feet-miles.jsp">Feet -> Miles</button>
            </form>

        </div>
    </div>
</div>
</body>
</html>
