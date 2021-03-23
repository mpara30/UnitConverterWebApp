<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Unit Converter</title>
    <link rel="stylesheet" href="index.css" />
</head>
<body>
<h1 align="center">Welcome to Java Web Application "UNIT CONVERTER"</h1>
<div class="center">
    <div class="content">
        <p>Select Unit</p>

        <div class="grid-container">
            <form action="metric_buttons.jsp" method="get">
                <button class="button" type="submit"  formaction="metric_buttons.jsp">Length</button>
            </form>

            <form action="temperature.jsp" method="get">
                <button class="button" type="submit"  formaction="temperature.jsp">Temperature</button>
            </form>

            <form action="weight.jsp" method="get">
                <button class="button" type="submit"  formaction="weight.jsp">Weight</button>
            </form>

            <form action="speed.jsp" method="get">
                <button class="button" type="submit"  formaction="speed.jsp">Speed</button>
            </form>
        </div>
    </div>
</div>
</body>
</html>