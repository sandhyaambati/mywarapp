<!DOCTYPE html>
<html lang="en" xml:lang="en">
<head>
    <title>Home Page</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            text-align: center;
            background-color: #fafafa;
            margin-top: 100px;
        }
        button {
            padding: 15px 30px;
            font-size: 18px;
            border-radius: 8px;
            border: none;
            background-color: #2e8b57;
            color: white;
            cursor: pointer;
        }
        button:hover {
            background-color: #3cb371;
        }
    </style>
</head>
<body>
    <h1>Welcome to My Web App</h1>
    <p>Click the button below to see our flower gallery:</p>
    <form action="flowers.jsp" method="get">
        <button type="submit">View Flowers</button>
    </form>
</body>
</html>




