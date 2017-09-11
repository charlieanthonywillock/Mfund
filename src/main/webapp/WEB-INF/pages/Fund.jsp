<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Mutual Funds</title>



</head>
<body>


<h1>Spring MVC Mutual Funds</h1>

	
<div>

  




<div id="Snapshot">
    <div>
        <div style="float:left;">(As of 7/31/2017)</div>

        <div  style="float:right;">
            
        </div>
    </div>

    <div style="clear:both;">
        <h1 class="temp1" style="float:left;">JP Poormans Funds Series X</h1>
        <div style="float:right;padding-top:5px;">
            
        </div>
        <div style="clear:both;padding-bottom:5px;">(Financial Services Equity)</div>
    </div>

    <div id="2" style="float:left;">
		
        <img id="1" src="images/FundgradeD.gif" align="bottom" style="border-width:0px;" />
    
	</div>

    
</div>


<table style="width: 100%;" cellpadding="0" border="0" cellspacing="0">

<tr>

<td>

 <table style="width: 80%;" cellpadding="0">
  <tr>

<td style="height:30px; vertical-align:top;"> Inception Return<br /> </td>

<td style="height: 30px; vertical-align: top; white-space: nowrap;">
<p>  ${inceptdate} </p>

 </td>
 </tr>



<tr>
<td style="height:30px; vertical-align:middle;"> YTD </td>

<td style="height: 30px; vertical-align: moddle; white-space: nowrap;"> 
<span id="2"> 2.52  </span></td>

</tr>

</table>

</td>

<td>
<table style="width: 80%;" cellpadding="0">
<tr>



<td style="height:30px; vertical-align:top;"> Nav Ps<br /> </td>

<td style="height: 30px; vertical-align: top; white-space: nowrap;">
<span > ${navps} </span>

 </td>
</tr>




<tr>
<td style="height:30px; vertical-align:middle;"> Change </td>

<td style="height: 30px; vertical-align: moddle; white-space: nowrap;"> 
<span id="2"> 0.0  </span></td>

</tr>

</table>

</td>

</table>

<table  border="0" cellpadding="0" cellspacing="0" width="100%">

<tr>
<td>

<div class="temp2">
             Growth of $10,000 <span id="demo"></span>
                   <span style="font-size: 9px; font-weight: normal;">
                    <span id="Stemp2">(As of&nbsp;July 31, 2017)</span></span></div>
                            
                            
                            <div>
                                <img id="imagtemp" src="/MutualFunds/" alt="" style="border-width:0px;" />
</div>


</td>
<td>

 <td valign="top" style="padding-top: 40px; padding-left: 10px;">
                            <table cellpadding="0" cellspacing="0" class="Table1" style="width: 100%;">
                                <tr>
                                    <td class="Fund" style="width: 160px;">
                                        MER
                                    </td>
                                    <td class="Fund">
                                        <span id="txtMER">${mer}</span>
                                    </td>
                                </tr>
                                <tr>
                                    <td class="Fund">
                                        Assets ($mil)
                                    </td>
                                    <td >
                                        <span id="1">${assets}</span>
                                    </td>
                                </tr>
                                <tr>
                                    <td >
                                        Rank (1Yr)
                                    </td>
                                    <td >
                                        <span>${rank}</span>
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                        Std Dev (3Yr)
                                    </td>
                                    <td class="Fund">
                                        <span>${stddev} %</span>
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                        Volatility Ranking (3Yr)
                                    </td>
                                    <td>
                                        <span>10/10</span>
                                    </td>
                                </tr>
                                <tr>
                                    <td class="Fund">
                                        RRSP Eligibility
                                    </td>
                                    <td class="Fund">
                                        <span> ${rrspel}</span>
                                    </td>
                                </tr>
                                <tr>
                                    <td class="Fund">
                                        Load
                                    </td>
                                    <td class="Fund">
                                        <span id="txtLoad">No Load</span>
                                    </td>
                                </tr>
                                <tr>
                                    <td class="Fund">
                                        Max Front End
                                    </td>
                                    <td class="Fund">
                                        <span id="txtFeesFront">-</span>
                                    </td>
                                </tr>
                                <tr>
                                    <td class="Fund">
                                        Max Back End
                                    </td>
                                    <td class="Fund">
                                        <span id="txtFeesBack">-</span>
                                    </td>
                                </tr>
                                <tr>
                                    <td class="Fund">
                                        Sales Status
                                    </td>
                                    <td class="Fund">
                                        <span id="txtSalesStatus">Open</span>
                                    </td>
                                </tr>
                            </table>

</td>
</tr>
</table>
<div>
                    <div class="TempFundP3">
                        &nbsp;</div>
                    <table cellpadding="0" cellspacing="0">
                        <tr>
                            <td valign="top" style="width: 480px; padding-right: 10px;">
                                <div class="FundCategories">
                                    Objective</div>
                                <div style="font-size: 12px; line-height: 20px;">
                                    <span id="txtObjective">The Fund's objective is to provide positive long-term total returns by investing primarily in a portfolio of global bank equities.</span></div>
                            </td>
                            <td valign="top">
                                <div class="Categories">
                                    Management&nbsp;Co.</div>
                                <div>
                                    <span id="txtManagementCo">JP Poormans</span></div>
                                <div class="Categories">
                                    Managers</div>
                                <div>
                                    <span id="txtManagers">Charlie1 </span></div>
                            </td>
                        </tr>
                    </table>
                </div>
            </div>
<div>

<table>
<tr>
<td>

<span id="Chart1">Asset Allocation Chart 1  </span>

</td>
<td>
<span id="Chart1">Sector Allocation Chart 2  </span>


</td>


<td>
<span id="Chart1">Geographic Chart 3  </span>

</td>
</tr>
</table>
</div>

<div>
 <!--Top ten holdings end--->
            <br />
            <!--Performance Info start -->
            <div class="FundSnapShotCategories">
                Performance Data
                <span id="PerformanceDate2" class="InceptionDate">(As of&nbsp;July 31, 2017)</span></div>
            <div>
                <div>
                    <table class="StandardDataGrid" border="0" cellspacing="0" cellpadding="0">
                        <tr>
                            <th>
                                &nbsp;
                            </th>
                            <th colspan="4" class="center">
                                Return (%)
                            </th>
                            <th colspan="4" class="center">
                                Annualized Return (%)
                            </th>
                        </tr>
                        <tr>
                            <th style>
                                Return
                            </th>
                            <th class="center">
                                1
                                Mth
                            </th>
                            <th class="center">
                                3
                                Mth
                            </th>
                            <th class="center">
                                6
                                Mth
                            </th>
                            <th class="center">
                                YTD
                            </th>
                            <th class="center">
                                1
                                Yr
                            </th>
                            <th class="center">
                                3
                                Yr
                            </th>
                            <th class="center">
                                5
                                Yr
                            </th>
                            <th class="center">
                                10
                                Yr
                            </th>
                        </tr>
                        <tr>
                            <td style="width: 18%;text-align: left;">  
                                Fund
                            </td>
                            <td style="width: 10.25%; text-align: right; padding:2px 25px 2px 2px;" nowrap> 
                                <span id="1mthRtn">-0.85</span>
                            </td>
                            <td style="width: 10.25%; text-align: right; padding:2px 25px 2px 2px;" nowrap>
                                <span id="3mthRtn">-0.93</span>
                            </td>
                            <td style="width: 10.25%; text-align: right; padding:2px 25px 2px 2px;" nowrap>
                                <span id="6mthRtn">5.94</span>
                            </td>
                            <td style="width: 10.25%; text-align: right; padding:2px 25px 2px 2px;" nowrap>
                                <span id="ytdRtn">2.52</span>
                            </td>
                            <td style="width: 10.25%; text-align: right; padding:2px 25px 2px 2px;" nowrap>
                                <span id="1yrRtn">40.03</span>
                            </td>
                            <td style="width: 10.25%; text-align: right; padding:2px 25px 2px 2px;" nowrap>
                                <span id="3yrRtn">10.07</span>
                            </td>
                            <td style="width: 10.25%; text-align: right; padding:2px 25px 2px 2px;" nowrap>
                                <span id="5yrRtn">-&nbsp;&nbsp;&nbsp;</span>
                            </td>
                            <td style="width: 10.25%; text-align: right; padding:2px 25px 2px 2px;" nowrap>
                                <span id="10yrRtn">-&nbsp;&nbsp;&nbsp;</span>
                            </td>
                        </tr>
                        <tr>
                            <td nowrap>
                                Benchmark
                            </td>
                            <td style="text-align: right; padding:2px 25px 2px 2px;" nowrap>
                                <span id="1mthRtn">-0.31</span>
                            </td>
                            <td style="text-align: right; padding:2px 25px 2px 2px;" nowrap>
                                <span id="3mthRtn">-1.77</span>
                            </td>
                            <td style="text-align: right; padding:2px 25px 2px 2px;" nowrap>
                                <span id="6mthRtn">7.55</span>
                            </td>
                            <td style="text-align: right; padding:2px 25px 2px 2px;" nowrap>
                                <span id="ytdRtn">6.68</span>
                            </td>
                            <td style="text-align: right; padding:2px 25px 2px 2px;" nowrap>
                                <span id="1yrRtn">21.44</span>
                            </td>
                            <td style="text-align: right; padding:2px 25px 2px 2px;" nowrap>
                                <span id="3yrRtn">11.53</span>
                            </td>
                            <td style="text-align: right; padding:2px 25px 2px 2px;" nowrap>
                                <span id="5yrRtn">17.57</span>
                            </td>
                            <td style="text-align: right; padding:2px 25px 2px 2px;" nowrap>
                                <span id="10yrRtn">2.23</span>
                            </td>
                        </tr>
                        <tr>
                            <td nowrap>
                                Quartile Ranking
                            </td>
                            <td style="text-align: center;">
                                <span id="1mthqrank">-</span>
                            </td>
                            <td style="text-align: center;">
                                <span id="3mthqrank">-</span>
                            </td>
                            <td style="text-align: center;">
                                <span id="6mthqrank">-</span>
                            </td>
                            <td style="text-align: center;">
                                <span id="ytdrank">-</span>
                            </td>
                            <td style="text-align: center;">
                                <span id="1yrqrank">-</span>
                            </td>
                            <td style="text-align: center;">
                                <span id="3yrqrank">-</span>
                            </td>
                            <td style="text-align: center;">
                                <span id="5yrqrank">-</span>
                            </td>
                            <td style="text-align: center;">
                                <span id="10yrqrank">-</span>
                            </td>
                        </tr>
                    </table>
                </div>
                <br />
                <div>
                    <table class="StandardDataGrid" border="0" cellspacing="0" cellpadding="0">
                        <tr>
                            <th>
                                Calendar Return (%)
                            </th>
                            <th class="center">
                                <span id="Calyr1">2016</span>
                            </th>
                            <th class="center">
                                <span id="Calyr2">2015</span>
                            </th>
                            <th class="center">
                                <span id="Calyr3">2014</span>
                            </th>
                            <th class="center">
                                <span id="Calyr4">2013</span>
                            </th>
                            <th class="center">
                                <span id="Calyr5">2012</span>
                            </th>
                            <th class="center">
                                <span id="Calyr6">2011</span>
                            </th>
                            <th class="center">
                                <span id="Calyr7">2010</span>
                            </th>
                            <th class="center">
                                <span id="Calyr8">2009</span>
                            </th>
                            <th class="center">
                                <span id="Calyr9">2008</span>
                            </th>
                            <th class="center">
                                <span id="Calyr10">2007</span>
                            </th>
                        </tr>
                        <tr>
                            <td style="width: 18%;">
                                Fund
                            </td>
                            <td style="width: 8.2%; text-align: right; padding:2px 12px 2px 2px;">
                                <span id="CalRtnyr1">9.70</span>
                            </td>
                            <td style="width: 8.2%; text-align: right; padding:2px 12px 2px 2px;">
                                <span id="CalRtnyr2">9.74</span>
                            </td>
                            <td style="width: 8.2%; text-align: right; padding:2px 12px 2px 2px;">
                                <span id="CalRtnyr3">7.51</span>
                            </td>
                            <td style="width: 8.2%; text-align: right; padding:2px 12px 2px 2px;">
                                <span id="CalRtnyr4">-&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>
                            </td>
                            <td style="width: 8.2%; text-align: right; padding:2px 12px 2px 2px;">
                                <span id="CalRtnyr5">-&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>
                            </td>
                            <td style="width: 8.2%; text-align: right; padding:2px 12px 2px 2px;">
                                <span id="CalRtnyr6">-&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>
                            </td>
                            <td style="width: 8.2%; text-align: right; padding:2px 12px 2px 2px;">
                                <span id="CalRtnyr7">-&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>
                            </td>
                            <td style="width: 8.2%; text-align: right; padding:2px 12px 2px 2px;">
                                <span id="CalRtnyr8">-&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>
                            </td>
                            <td style="width: 8.2%; text-align: right; padding:2px 12px 2px 2px;">
                                <span id="CalRtnyr9">-&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>
                            </td>
                            <td style="width: 8.2%; text-align: right; padding:2px 12px 2px 2px;">
                                <span id="CalRtnyr10">-&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>
                            </td>
                        </tr>
                        <tr>
                            <td nowrap>
                                Benchmark
                            </td>
                            <td style="text-align: right; padding:2px 12px 2px 2px;">
                                <span id="BCalRtnyr1">6.34</span>
                            </td>
                            <td style="text-align: right; padding:2px 12px 2px 2px;">
                                <span id="BCalRtnyr2">14.20</span>
                            </td>
                            <td style="text-align: right; padding:2px 12px 2px 2px;">
                                <span id="BCalRtnyr3">14.35</span>
                            </td>
                            <td style="text-align: right; padding:2px 12px 2px 2px;">
                                <span id="BCalRtnyr4">31.84</span>
                            </td>
                            <td style="text-align: right; padding:2px 12px 2px 2px;">
                                <span id="BCalRtnyr5">25.13</span>
                            </td>
                            <td style="text-align: right; padding:2px 12px 2px 2px;">
                                <span id="BCalRtnyr6">-15.98</span>
                            </td>
                            <td style="text-align: right; padding:2px 12px 2px 2px;">
                                <span id="BCalRtnyr7">1.36</span>
                            </td>
                            <td style="text-align: right; padding:2px 12px 2px 2px;">
                                <span id="BCalRtnyr8">17.31</span>
                            </td>
                            <td style="text-align: right; padding:2px 12px 2px 2px;">
                                <span id="BCalRtnyr9">-41.85</span>
                            </td>
                            <td style="text-align: right; padding:2px 12px 2px 2px;">
                                <span id="BCalRtnyr10">-19.47</span>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                Quartile Ranking
                            </td>
                            <td style="text-align: center;">
                                <span id="QCalrtnyr1">-</span>
                            </td>
                            <td style="text-align: center;">
                                <span id="QCalrtnyr2">-</span>
                            </td>
                            <td style="text-align: center;">
                                <span id="QCalrtnyr3">-</span>
                            </td>
                            <td style="text-align: center;">
                                <span id="QCalrtnyr4">-</span>
                            </td>
                            <td style="text-align: center;">
                                <span id="QCalrtnyr5">-</span>
                            </td>
                            <td style="text-align: center;">
                                <span id="QCalrtnyr6">-</span>
                            </td>
                            <td style="text-align: center;">
                                <span id="QCalrtnyr7">-</span>
                            </td>
                            <td style="text-align: center;">
                                <span id="QCalrtnyr8">-</span>
                            </td>
                            <td style="text-align: center;">
                                <span id="QCalrtnyr9">-</span>
                            </td>
                            <td style="text-align: center;">
                                <span id="QCalrtnyr10">-</span>
                            </td>
                        </tr>
                    </table>
                </div>
            </div>
        </div>
        <!--Performance Info end -->

<div style="text-align: right; padding: 10px 0px; font-size: 11px">
    
     <table style="width: 100%;">
            <tr>
                <td valign="top" style="padding: 20px; font-size: 12px;">
                    

<p><a href="http://www.charlie1.com" id="logo"><img src="" id="Logo" /></a></p>
                    <p style="font-size: 10px; padding-top: 10px; text-align: justify;">
                        
            Website powered by <a href="http://www.charlie1data.com" >
                                    &copy; Charlie1.
                               </a>
            <br />
            Mutual Fund Data provided by Charlie1. | <a href="http://www.charlie1.com/TermsOfUse.aspx">
                                                        View Terms and Conditions of Use
                                                    </a>.
            <br />
            Charlie1 Data Indexes used with permission.
            <br />
            © 2017 Charlie1 Data. All rights reserved. | 
                <a href="http://www.charlie1data.com/PrivacyPolicy.aspx">
                    View Privacy Policy
                </a> | 
                <a href="http://www.charlie1data.com/contact.aspx">
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
    
    
    
    
<p>${perfJSON}</p>
    




<p>${myObj}</p>
    
    
    
    
    
    
    
    
    
    
</div>

<script>


var myObj =  '{"risk":[' +
   '{"Return":[{"firstName":"John","lastName":"Black" },{"firstName":"Charlie","lastName":"One"}]},{"Holdings":[{"Chart":"Brown"}]}      ]}'


   
var test = '${perfJSON}';

   
   
obj2 = JSON.parse(myObj);
obj3 = JSON.parse(test);



<!--document.getElementById("demo").innerHTML =  ctrjson; -->


var x="";
var str = JSON.stringify(obj2.risk[1].Holdings[0].Chart);

for (i in str) {
    x += str[i] ;
}




document.getElementById("json").innerHTML = x;
document.getElementById("demo").innerHTML = obj3;
//document.getElementById("demo").innerHTML = obj3.Performance[0].fees







</script>







</body>
</html>