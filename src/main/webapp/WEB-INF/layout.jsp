<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
<head>
    <title><tiles:getAsString name="title"/></title>
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/webjars/bootstrap/5.0.0-beta2/css/bootstrap.min.css">
    <link rel="stylesheet" href="../styles/main.css">
</head>
<body>
<tiles:insertAttribute name="header"/>
<div id="page-container" class="mt-4">
    <div class="container" id="content-wrap">
        <tiles:insertAttribute name="body"/>
    </div>
    <tiles:insertAttribute name="footer"/>
</div>
</body>
</html>
