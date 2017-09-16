<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>


<link rel="stylesheet" href="<c:url value="/resources/css/main.css" />">




   </head>
<body>

<img src="https://nfunds.herokuapp.com/cagr">

<img src="https://nfunds.herokuapp.com/chart_cagr">



<script type="text/javascript" src="<c:url value="resources/js/jquery-1.7.2.min.js" />"> </script>
<script type="text/javascript" src="<c:url value="resources/js/jquery.popupWindow.js" />"> </script>

 <script type="text/javascript">
     $(function () {
         $('.RiskPopup').popupWindow({
             width: 860,
             height: 800,
             centerScreen: 1,
             scrollbars: 1,
             resizable: 1
         });
     });
            </script>




<h1>1. Test CSS</h1>

<h2>2. Test JS</h2>
<div id="msg"></div>

</body>
</html>