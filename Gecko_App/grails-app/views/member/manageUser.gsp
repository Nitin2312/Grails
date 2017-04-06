<!DOCTYPE html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <meta name="layout" content="main"/>
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
</head>
<body>

<h1>Manage Members</h1>
<g:form controller="member" action="save">
            <label>Member Name: </label>
            <g:textField name="name"/><br/>
            <label>Email: </label>
            <g:textField name="email"/><br/>
            <label>Birth Date: </label>
            <g:textField name="birth_Date"/><br/>
            <g:actionSubmit value="Save"/>
 </g:form>







</body>

</html>