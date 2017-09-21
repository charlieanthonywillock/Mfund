<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html >

<html >
<head><title>

</title>


<link rel="stylesheet" href="<c:url value="/resources/css/stylesheetperf.css" />">




</head>
<body>


<div>

	
</div>
    <div id="FundContainer">
        <div id="Header">
            <div style="float:right">
              
            </div>
        </div>

        
    <script type="text/javascript">

       </script>

    <div id="FundMainContent">
	
        <div class="FundStatsMain">
            

<div id="StatsHeader">
    <div>
        <div style="float:left;">(As of 7/31/2017)</div>

        <div  style="float:right;">
            
        </div>
    </div>

    <div style="clear:both;">
        <h1 class="StatsHeader" style="float:left;">${p_symid}</h1>
        <div style="float:right;padding-top:5px;">
            
        </div>
        <div style="clear:both;padding-bottom:5px;">${p_fullName}</div>
    </div>

    <div id="MutualfundHeader" style="float:left;">
		
        <img id="MutualfundImg" src="/resources/images/charlieone.png" align="bottom" style="border-width:0px;" />
    
	</div>

    
</div>






            <div>
                <table style="width: 100%;" cellpadding="0" border="0" cellspacing="0">
                    <tr>
                        <td>
                            <table style="width: 80%;" cellpadding="0">
                                <tr>
                                    <td class="StatsPerfHorizLbl1" style="height: 30px; vertical-align: top;">
                                        Inception Return<br />
                                        <span id="PerformanceStartDate" class="InceptionDate">( ${p_inceptdate})</span>
                                    </td>
                                    <td class="StatsPerfHorizRES1" style="height: 30px; vertical-align: top; white-space: nowrap;">
                                        <span id="InceptionReturn"> %</span>
                                    </td>
                                </tr>
                                <tr>
                                    <td class="StatsPerfHorizLbl1" style="height: 30px; vertical-align: middle;">
                                        YTD Return
                                    </td>
                                    <td class="StatsPerfHorizRES1" style="height: 30px; vertical-align: middle; white-space: nowrap;">
                                        <span id="YTDReturn">${p_yield} %</span>
                                    </td>
                                </tr>
                            </table>
                        </td>
                        <td style="text-align: right;">
                            <table style="width: 80%;" cellpadding="0">
                                <tr>
                                    <td class="StatsPerfHorizLbl1" style="height: 30px; vertical-align: top;">
                                        NAVPS<br />
                                        <span id="NavpsDate" class="InceptionDate"></span>
                                    </td>
                                    <td class="StatsPerfHorizRES1" style="height: 30px; vertical-align: top;">
                                        <span id="ctl00_MainContent_txtNavps">${p_navps}</span>
                                    </td>
                                </tr>
                                <tr>
                                    <td class="StatsPerfHorizLbl1" style="height: 30px; vertical-align: middle;">
                                        Change
                                    </td>
                                    <td class="StatsPerfHorizRES1" style="height: 30px; vertical-align: middle;">
                                        <img id="GainArrow" src="images/IconLossLg.gif" style="border-width:0px;" />
                                        <span id="NavpsChange">($0.00) / -0.00 %</span>
                                    </td>
                                </tr>
                            </table>
                        </td>
                    </tr>
                </table>
                <table border="0" cellpadding="0" cellspacing="0" width="100%">
                    <tr>
                        <td valign="top" style="width: 480px;">
                            <div class="FundStatsCat">
                                Growth of $10,000
                                <span style="font-size: 9px; font-weight: normal;">
                                    <span id="lblPerformanceDate1">(As of&nbsp;July 31, 2017)</span></span></div>
                            <div>
                                <img src="https://nfunds.herokuapp.com/chart_cagr">
                                
                            </div>
                        </td>
                        <td valign="top" style="padding-top: 40px; padding-left: 10px;">
                            <table cellpadding="0" cellspacing="0" class="TablePerf" style="width: 100%;">
                                <tr>
                                    <td class="StatsPerfHorizLbl2" style="width: 160px;">
                                        MER
                                    </td>
                                    <td class="StatsPerfHorizRES2">
                                        <span id="txtMER">${p_mer} %</span>
                                    </td>
                                </tr>
                                <tr>
                                    <td class="StatsPerfHorizLbl2">
                                        Assets ($mil)
                                    </td>
                                    <td class="StatsPerfHorizRES2">
                                        <span id="txtAssets">$ ${p_assets}</span>
                                    </td>
                                </tr>
                                <tr>
                                    <td class="StatsPerfHorizLbl2">
                                        Rank (1Yr)
                                    </td>
                                    <td class="StatsPerfHorizRES2">
                                        <span id="txtRank">${p_rank}</span>
                                    </td>
                                </tr>
                                <tr>
                                    <td class="StatsPerfHorizLbl2">
                                        Std Dev (3Yr)
                                    </td>
                                    <td class="StatsPerfHorizRES2">
                                        <span id="txtStdDev">${p_stddev} %</span>
                                    </td>
                                </tr>
                                <tr>
                                    <td class="StatsPerfHorizLbl2">
                                        Volatility Ranking (3Yr)
                                    </td>
                                    <td class="StatsPerfHorizRES2">
                                        <span id="txtVolatilityRank">10/10</span>
                                    </td>
                                </tr>
                                <tr>
                                    <td class="StatsPerfHorizLbl2">
                                        RRSP Eligibility
                                    </td>
                                    <td class="StatsPerfHorizRES2">
                                        <span id="txtRRSP">${p_rrspel}</span>
                                    </td>
                                </tr>
                                <tr>
                                    <td class="StatsPerfHorizLbl2">
                                        Load
                                    </td>
                                    <td class="StatsPerfHorizRES2">
                                        <span id="txtLoad">${p_load}</span>
                                    </td>
                                </tr>
                                <tr>
                                    <td class="StatsPerfHorizLbl2">
                                        Max Front End
                                    </td>
                                    <td class="StatsPerfHorizRES2">
                                        <span id="txtFeesFront">${p_maxfrontend}</span>
                                    </td>
                                </tr>
                                <tr>
                                    <td class="StatsPerfHorizLbl2">
                                        Max Back End
                                    </td>
                                    <td class="StatsPerfHorizRES2">
                                        <span id="txtFeesBack">${p_maxbackend}</span>
                                    </td>
                                </tr>
                                <tr>
                                    <td class="StatsPerfHorizLbl2">
                                        Sales Status
                                    </td>
                                    <td class="StatsPerfHorizRES2">
                                        <span id="txtSalesStatus">${p_salesopen}</span>
                                    </td>
                                </tr>
                            </table>
                        </td>
                    </tr>
                </table>
                <div>
                    <div class="PageSeperator">
                        &nbsp;</div>
                    <table cellpadding="0" cellspacing="0">
                        <tr>
                            <td valign="top" style="width: 480px; padding-right: 10px;">
                                <div class="FundStatsCat">
                                    Objective</div>
                                <div style="font-size: 12px; line-height: 20px;">
                                    <span id="txtObjective">The Fund's objective...</span></div>
                            </td>
                            <td valign="top">
                                <div class="FundStatsCat">
                                    Management&nbsp;Co.</div>
                                <div>
                                    <span id="txtManagementCo">${company} Inc.</span></div>
                                <div class="FundStatsCat">
                                    Managers</div>
                                <div>
                                    <span id="txtManagers">${managers}, </span></div>
                            </td>
                        </tr>
                    </table>
                </div>
            </div>
            <!--general information end -->
            <div class="PageSeperator">
                &nbsp;</div>

            <!--Allocations start--->
            
            <table>
            
            <tr>
            
           <td style="width: 270px; text-align: center;">
           
            <div class="FundStatsCat">  Asset </div>
            
            <div style="border-right: 1px solid #cacce7;"> <img src="https://nfunds.herokuapp.com/chartAssetAlloc"> </div>
           
           
           
                   
            </td>
            
            
            
            
            
            <td style="width: 265px; text-align: center;">
            
             <div class="FundStatsCat"> Sector </div>
             
              <div style="border-right: 1px solid #cacce7;"> <img src="https://nfunds.herokuapp.com/chartAssetAlloc"> </div>
            
            
            
            
            </td>
            
            
            
            
            <td style="text-align: center;">
            
             <div class="FundStatsCat"> Geographic    </div>
            
            <div>
            
            
            </div> <img src="https://nfunds.herokuapp.com/chartAssetAlloc">      <div>
            
            
            
            
            
            
            </td>
           </tr>
            
            
            
            </table>
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            

           
	
            <!--Top ten holdings start--->
            <div class="FundStatsCat">
                Top 10 Holdings
                <span>
                    <span id="lblTopTenHolding"></span></span></div>
            <div class="FundTopTen">
                <div>
		<div id="getTableHoldings" class="tester"></div>
		
		
		
	</div>
                
                <input type="hidden" name="FundID" id="FundID" value="" />
            </div>
            <!--Top ten holdings end--->
            <br />
            <!--Performance Info start -->
            <div class="FundStatsCat">
                Performance Data
                <span id="lblPerformanceDate2" class="InceptionDate">(As of&nbsp;July 31, 2017)</span></div>
            <div>
                <div>
                   	<div id="getTableAnnualRet" class="tester"></div>
                </div>
                <br />
                <div>
                    	<div id="getTableCalPerf" class="tester"></div>
                </div>
            </div>
        </div>
        <!--Performance Info end -->
        

<div style="text-align: right; padding: 10px 0px; font-size: 11px">
    
</div>

    
</div>

    
   


   



        <table style="width: 100%;">
            <tr>
                <td valign="top" style="padding: 20px; font-size: 12px;">
                    

<p><a href="https://spring.io" id="Logo"><img src="Logo.png" id="logo" /></a></p>
                    <p style="font-size: 10px; padding-top: 10px; text-align: justify;">
                        
            Website powered by <a href="https://spring.io" >
                                    &copy; Spring Inc.
                               </a>
            <br />
            Mutual Fund Data provided by Charlie1. | <a href="http://www.charlie1/TermsOfUse.aspx">
                                                        View Terms and Conditions of Use
                                                    </a>.
            <br />
            Charlie1 Indices used with permission.
            <br />
            © 2017 Charlie1 Inc. All rights reserved. | 
                <a href="http://www.charlie1/PrivacyPolicy.aspx">
                    View Privacy Policy
                </a> | 
                <a href="http://www.charlie1/contact.aspx">
                    Contact Us
                </a>.
        
                    </p>
                    <p style="font-size: 10px; padding-top: 10px; text-align: justify;">
                        
                    </p>
                </td>
                <td style="text-align:center;">
                    
                </td>
            </tr>
        </table>
    </div>
</form>



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
   var h;
   var hc;

   
   function factoryTable(jsonarray,skey,shref) { 
   
  
		for(var key in jsonarray) {
		
		
			if(key == skey ){
   
 
  
				for(var i=0; i < jsonarray[key].length;i++ ){
				
				
				
					
					var cntjson=0;
					var rows = jsonarray[key].length;
					var cntcols=0;
					var bool = true;
					
					alert("Total Records "+rows);
					
						for(var i=0; i < rows; i++){
     
	 
	                     	var col = jsonarray[key][i];
								
								
							if(bool){
								for(var calc in col){
								
								cntcols++
								}
								bool = false;
								}
														
							r = document.createElement('tr');
                            h =	document.createElement('tr');						
						
						for(var j in col){
								colcnt++;
							    var colval = jsonarray[key][i][j];
								var hdr = j;
								
								alert(hdr+" : " +colval);
														
								c = document.createElement('td');
								hc = document.createElement('td');
								c.setAttribute("colspan","20");
								hc.setAttribute("colspan","20");
															
							    var header = document.createElement('th');
								header.setAttribute("class","center");
								header.setAttribute("scope","col");
								header.setAttribute("colspan","8");
								
								header.width = "800px";
								
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
		    
								if( cnt < cntcols){ hc.appendChild(header); h.appendChild(hc); alert("header " + hdr);  }
									
									if (colcnt == 1){c.appendChild(ahref);}else{ c.appendChild(coltext);   }
									
								
									r.appendChild(c);
									
										cnt++;
										
										if(cnt == (cntcols)){
										
										alert("create Row");
										
										
										table.appendChild(h);
												
												
										
										
										}
										
										
										
									
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
 
 var _div = document.getElementById("getTableHoldings");
 _div.appendChild(table);
 
 
 var _divCalpef = document.getElementById("getTableCalPerf");
 _divCalpef.appendChild(table); 
 
 
 var _divAnnulRet = document.getElementById("getTableAnnualRet");
 _divAnnulRet.appendChild(table); 
   
   }
   
   
   var choldings = ${jsonHoldings}
   var ccalper = ${jsonCalPerf}
   var cannualreturns = ${jsonAnnualReturns}
   
   factoryTable(choldings,"Holdings","ProductName");
   factoryTable(cannualreturns,"Returns","ProductName");
   factoryTable(ccalper,"PerformanceCalander","ProductName");
   
   
 //  factoryTable(data,"basketball","ProductName");
    
   
   </script>

















</body>
</html>

