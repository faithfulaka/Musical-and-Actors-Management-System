<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<body>
<c:forEach items="${musicals}" var="musical">
    <p>Name: ${musical.name}, Composer: ${musical.composer} <a href="/actors?musical=${musical.id}">actors</a></p>
</c:forEach>
</body>
</html>