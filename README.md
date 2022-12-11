<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<style>
    .server{
                width: 100%;
        height: 200px;
        background-image: url("./src/main/resources/screeshoot/deploy2.PNG");
        background-repeat: no-repeat;
        background-size: cover;
    }
    .wsdl{
        background-image: url("./src/main/resources/screeshoot/wsdl.PNG");
        background-size: cover;
        background-repeat: no-repeat;
    }
    table{
        margin-top: 20px;
        width: 100%;
        border-collapse: collapse;
    }
    th{
        border: 1px solid black;
    }
    td{
        border: 1px solid black;
        height: 300px;
    }
    .req1{
        background-image: url("./src/main/resources/screeshoot/convertSoapRequest.PNG");
        background-size: cover;
        background-repeat: no-repeat;

    }
    .resp1{
        background-image: url("./src/main/resources/screeshoot/convertSoapResponse.PNG");
        background-size: cover;
        background-repeat: no-repeat;
    }

    .req2{
        background-image: url("./src/main/resources/screeshoot/getCompterSoapRequest.PNG");
        background-size: cover;
        background-repeat: no-repeat;

    }
    .resp2{
        background-image: url("./src/main/resources/screeshoot/getCompterRedsponseSoap.PNG");
        background-size: cover;
        background-repeat: no-repeat;
    }

    .req3{
        background-image: url("./src/main/resources/screeshoot/sopRequestListClient.PNG");
        background-size: cover;
        background-repeat: no-repeat;

    }
    .resp3{
        background-image: url("./src/main/resources/screeshoot/responseSoapListCompter.PNG");
        background-size: cover;
        background-repeat: no-repeat;
    }

</style>
<h1>Activitè Pratique</h1>
<div class="server"></div>
<br/>
<table >
    <thead>
        <th  style="width: 10%"></th>
        <th>SopRequest</th>
        <th>SopResponse</th>

    </thead>
    <tbody>
        <tr>
            <td>Convert euro in DH</td>
            <td class ="req1"></td>
            <td class="resp1"></td>
        </tr>
        <tr>
            <td>getCompte</td>
            <td class="req2"></td>
            <td class="resp2"></td>
        </tr>
        <tr>
            <td>Liste Comptes</td>
            <td  class="req3">t</td>
            <td class="resp3"></td>
        </tr>
    </tbody>
</table>
<h2>WSDL Avec le Browser Http</h2>
<div class="wsdl">
    <img src="./src/main/resources/screeshoot/wsdl.PNG" alt="">
</div>
</body>
</html>