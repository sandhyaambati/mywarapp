<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Flower Gallery</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f8ff;
            text-align: center;
        }
        h1 {
            color: #2e8b57;
        }
        .gallery {
            display: flex;
            flex-wrap: wrap;
            justify-content: center;
            margin-top: 20px;
        }
        .flower {
            margin: 15px;
            border: 2px solid #ccc;
            border-radius: 10px;
            padding: 10px;
            width: 200px;
            box-shadow: 2px 2px 10px rgba(0,0,0,0.2);
        }
        .flower img {
            width: 100%;
            border-radius: 8px;
        }
        .flower p {
            margin-top: 10px;
            font-weight: bold;
        }
    </style>
</head>
<body>
    <h1>Flower Gallery</h1>
    <div class="gallery">
        <div class="flower">
            <img src="https://upload.wikimedia.org/wikipedia/commons/d/d1/%27Plant-Freesia-Fresia-02.jpg" alt="Fresia" width="320">
            <p>Fresia</p>
        </div>
        <div class="flower">
            <img src="https://upload.wikimedia.org/wikipedia/commons/5/55/A_flower_in_shadows.tif" alt="Tulip" width="320">
            <p>Tulip</p>
        </div>
        </div>
    </div>
</body>
</html>
