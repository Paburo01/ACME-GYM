<%--
 * action-1.jsp
 *
 * Copyright (C) 2018 Universidad de Sevilla
 * 
 * The use of this project is hereby constrained to the conditions of the 
 * TDG Licence, a copy of which you may download from 
 * http://www.tdg-seville.info/License.html
 --%>

<%@page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>
<%@taglib prefix="display" uri="http://displaytag.sf.net"%>

<p>
	<spring:message code="profile.see_activities" />
</p>
<display:table pagesize="5" name="activities" id="row"
	requestURI="profile/see_activities.do">
	<display:column property="title" titleKey="profile.title" />
	<display:column property="description" titleKey="profile.description" />
	<display:column property="day" titleKey="profile.day" />
	<display:column property="maxMembers" titleKey="profile.maxMembers" />
	<display:column property="startTime" titleKey="profile.startTime" />
	<display:column property="endTime" titleKey="profile.endTime" />
	<display:column property="image" titleKey="profile.image" />
</display:table>