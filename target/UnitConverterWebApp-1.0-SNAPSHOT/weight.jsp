<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Weight Conversion</title>
    <link rel="stylesheet" href="index.css" />
</head>
<body>

<div class="center">

    <form action="index.jsp" method="get">
        <button class="button" type="submit" formaction="index.jsp"><-Select Unit</button>
    </form>

    <div class="content">
        <p>Weight Conversion</p>

        <form class="label-maker" action="/calculatedWeights" method="post">

            <label for="milligram">Milligrams:</label>
            <input id="milligram" type="number" name="milligram" value=${milligram}>

            <label for="gram">Grams:</label>
            <input id="gram" type="number" name="gram" value=${gram}>

            <label for="kilogram">Kilograms:</label>
            <input id="kilogram" type="number" name="kilogram" value=${kilogram}>

            <label for="ton">Tons:</label>
            <input id="ton" type="number" name="ton" value=${ton}>

            <label for="ounce">Ounces:</label>
            <input id="ounce" type="number" name="ounce" value=${ounce}>

            <label for="pound">Pounds:</label>
            <input id="pound" type="number" name="pound" value=${pound}>

            <button class="button" type="submit">Calculate</button>

            <button class="button" onclick="window.location.reload();">Reset</button>
        </form>
    </div>

</div>

</body>
</html>
