<html>

<head>

<link href="css/stylesheetperf.css" rel="stylesheet" /> 


<style>




</style>



</head>

<body>

<div id="getTable">





<p> ${symbolList} </p>



</div>

<h2>Create Table from JSON String</h2>
<p id="json"></p>

<div id="getTable" class="tester"></div>





<script>




   data = {
  "tennis": [{
    "Price": 379.99,
    "Description": "Insert description here.",
    "ProductName": "Babolat Play Pure Drive",
  }, {
    "Description": "Insert description here.",
    "Price": 199.99,
    "ProductName": "Yonex AI 98 Tennis Racquet",
  }],
  "basketball": [{
    "Description": "Insert description here.",
    "Price": 64.99,
    "ProductName": "Wilson NCAA Solution Official Game Basketball",
  }, {
    "Description": "Insert description here.",
    "Price": 59.99,
    "ProductName": "Spalding NBA NeverFlat Size 7 Composite Leather Basketball",
  },{
    "Description": "Insert description here.",
    "Price": 59.99,
    "ProductName": "Charlie1",
  },{
    "Description": "Insert description here.",
    "Price": 59.99,
    "ProductName": "Charlie2",
    }],
  "film": [{
    "Horror": "Jane Doe",
    "SciFi": "Matrix",
    "Mystery": "Descent",
  }]
  
  
  
  
}
      
   </script>

   
   
   
   <script>
   
   alert("Section");
   
   var table = document.createElement('table');
   table.setAttribute('class','StdDataGrid');
   table.setAttribute('id','tablejson');
   table.setAttribute('style','border-collapse:collapse');
   table.setAttribute('border','1');
   var a = document.createElement('a');
 //  var ahref = document.createElement('a');
   var r;
   var c;
   var rowcnt=0;
   var colcnt=0;
   var cnt=0;

   
   function factoryTable(jsonarray,skey,shref) { 
   
  
		for(var key in jsonarray) {
		
		
			if(key == skey ){
   
  
				for(var i=0; i < data[key].length;i++ ){
				
				
				
					
					var cntjson=0;
					var rows = data[key].length;
					var cntcols=0;
					var bool = true;
					
					alert("Total Records "+rows);
					
						for(var i=0; i < rows; i++){
     
	 
	                     	var col = data[key][i];
								
								
							if(bool){
								for(var calc in col){
								
								cntcols++
								}
								bool = false;
								}
														
							r = document.createElement('tr');	
						
						for(var j in col){
								colcnt++;
							    var colval = data[key][i][j];
								var hdr = j;
								
								alert(hdr+" : " +colval);
														
								c = document.createElement('td');
								c.setAttribute("colspan","20");
								
															
							    var header = document.createElement('th');
								header.setAttribute("class","center");
								header.setAttribute("scope","col");
								header.setAttribute("colspan","8");
								header.width = "450px";
								
								var colname = "";
															
								var txthdr = document.createTextNode(hdr);
								header.appendChild(txthdr);
								
						
								var coltext;
								var txtref;
								var ahref = document.createElement('a');
								if(colcnt == 1){
								
								ahref.href = "https://nfunds.herokuapp.com/spring/rest/findbyfunds.aspx?symid="+colval;
												
								txtref = document.createTextNode(colval);
								ahref.appendChild(txtref);
								ahref.title = "URL";
						
								 
								}else{
								
								coltext = document.createTextNode(colval);
								
							  	}
		    
								if( cnt < cntcols){ c.appendChild(header); alert("header " + hdr); }
									
									if (colcnt == 1){c.appendChild(ahref);}else{ c.appendChild(coltext);   }
									
								
									r.appendChild(c);
										cnt++;
									
						}
					
						colcnt=0;
						rowcnt++;									
						alert("next record");
						table.appendChild(r);
			
				}
   
			}
		
		
		 }
   
   }
   
      
 //  document.body.appendChild(table);
 //  document.body.append(a);
 
 var _div = document.getElementById("getTable");
 _div.appendChild(table);
   
   
   }
   
   factoryTable(data,"basketball","ProductName");
    
   
   </script>
   
   
   
   
   
   
   
   
   
   
   
   
   



</body>
</html>