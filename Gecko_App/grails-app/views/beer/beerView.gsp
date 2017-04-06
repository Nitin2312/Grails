<!DOCTYPE html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <meta name="layout" content="main"/>
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
</head>
<body>

<h1>Manage Members</h1>
<g:form controller="beer" action="save">
            <label>Member Giver: </label>
            <g:textField name="giver"/><br/>
            <label>Member Provider: </label>
            <g:textField name="reciever"/><br/>
            <label>Number of Beers: </label>
            <g:textField name="amount"/><br/>
            <g:actionSubmit value="Save"/>
 </g:form>







</body>

</html>