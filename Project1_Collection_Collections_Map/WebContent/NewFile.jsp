<%@ page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta content="text/html; charset=UTF-8">
	<title>jQuery-Hello</title>

    <script src="js/jquery-3.2.1.min.js" type="text/javascript"></script>
    <script type="text/javascript">
    	$(function(){
    		//jQuery code
    		$("#hello").click(function(){
    			alert("Hello jQuery World!");
    		});
    	});
    </script>
</head>
<body>
	<button id="hello">Hello jQuery</button>
</body>
</html>