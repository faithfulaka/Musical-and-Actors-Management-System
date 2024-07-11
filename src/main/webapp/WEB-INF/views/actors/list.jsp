<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<body>
<c:forEach items="${actors}" var="actor">
    <p>Name: ${actor.name}, Training: ${actor.training}, Type: ${actor.type}, Awards: ${actor.awards}<a href="/actors?musical=${musical.id}">Actors</a></p>
</c:forEach>
<p><a href="/newActor?musical=${musical.id}">Add New Actor</a></p>
</body>
</html>