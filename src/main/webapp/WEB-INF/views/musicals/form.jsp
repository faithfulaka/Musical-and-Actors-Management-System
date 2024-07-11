<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<body>
<form:form action="/addMusical" modelAttribute="musical">
    ID:
    <form:input path="id"/>
    <form:errors path ="id"/>
    <br>
    Name:
    <form:input path="name"/>
    <form:errors path ="name"/>
    <br>
    Composer:
    <form:input path="composer"/>
    <form:errors path ="composer"/>
    <br>
    <input type="submit"/>
</form:form>
</body>
</html>