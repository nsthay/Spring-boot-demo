<html>
<head>
	<title>Demo Web Application</title>
</head>
<body>
    <font color="red">${errorMessage}</font>
    <form method="post">
        Name: <input type="text" name="name"></input> <br>
        Pass: <input type="password" name="password"></input> <br>
        <input type="submit" value="Log in"></input>
    </form>
    <button onclick="myFunction()">Hint</button>
    
    <div id="hint" style="display:none">Password is "pass", name is whatever you want.</div>
    
    <script> 
    function myFunction() {
    	var hinttext = document.getElementById('hint');
    	if (hinttext.style.display === 'none') {
        	hinttext.style.display = 'block';
    	} else {
        	hinttext.style.display = 'none';
    	}
	}
    </script>
</body>
</html>