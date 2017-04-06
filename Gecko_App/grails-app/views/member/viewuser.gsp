<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main"/>
		<title>Members of GeckoTech</title>
	</head>
	<body>
        <g:each in="${members}" var="member" status="i">
            <h3>${i+1}. ${member.name}, ${member.email}</h3>
            <p>
                Age: ${member.birthDate}
            </p>
            <br/>
        </g:each>
	</body>
</html>