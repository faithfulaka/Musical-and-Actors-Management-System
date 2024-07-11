<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<body>
<form:form action="/addActor" modelAttribute="actor">
    Name:
    <form:input path="name"/>
    <form:errors path ="name"/>
    <br>
    Training:
    <form:input path="training"/>
    <form:errors path ="training"/>
    <br>
    Type:
    <form:input path="type"/>
    <form:errors path ="type"/>
    <br>
    Awards:
    <form:input path="awards"/>
    <form:errors path ="awards"/>
    <br>
    <input type="submit"/>
</form:form>
</body>
</html>