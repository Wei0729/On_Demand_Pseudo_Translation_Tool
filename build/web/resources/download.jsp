<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : download
    Created on : Jul 1, 2013, 11:03:10 AM
    Author     : trisoft-admin
-->
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page binding="#{resources$download.page1}" id="page1">
            <webuijsf:html binding="#{resources$download.html1}" id="html1" lang="">
                <webuijsf:head binding="#{resources$download.head1}" id="head1" title="">
                    <webuijsf:link binding="#{resources$download.link1}" id="link1" url="/resources/stylesheet.css"/>
                    <webuijsf:link binding="#{resources$download.link2}" id="link2" url="/resources/stylesheet.css"/>
                </webuijsf:head>
                <webuijsf:body binding="#{resources$download.body1}" id="body1" style="background-color: rgb(255, 255, 255); -rave-layout: grid">
                    <webuijsf:form binding="#{resources$download.form1}" id="form1">
                        <webuijsf:label binding="#{resources$download.label1}" id="label1"
                            style="position: absolute; left: 168px; top: 24px; width: 528px; height: 24px" text="Download Passolo File(s)"/>
                        <h:outputText binding="#{resources$download.outputText1}" id="outputText1" style="position: absolute; left: 552px; top: 360px; width: 216px; height: 48px"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
