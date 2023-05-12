<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@taglib prefix="jstl"	uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="security" uri="http://www.springframework.org/security/tags"%>
<%@taglib prefix="display" uri="http://displaytag.sf.net"%>

<p><spring:message code="profile.see_trainings" /></p>
<display:table pagesize="5" name="trainings" id="row"
	requestURI="profile/see_trainings.do">
	<display:column property="title" titleKey="profile.trainingtitle" />
	<display:column property="description" titleKey="profile.trainingdescription" />
</display:table>
