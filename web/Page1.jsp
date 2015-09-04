<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : Page1
    Created on : Jun 24, 2013, 3:39:01 PM
    Author     : trisoft-admin
-->
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page binding="#{Page1.page1}" id="page1">
            <webuijsf:html binding="#{Page1.html1}" id="html1">
                <webuijsf:head binding="#{Page1.head1}" id="head1">
                    <webuijsf:link binding="#{Page1.link1}" id="link1" url="/resources/stylesheet.css"/>
                </webuijsf:head>
                <webuijsf:body binding="#{Page1.body1}" id="body1" style="-rave-layout: grid">
                    <webuijsf:form binding="#{Page1.form1}" id="form1" virtualFormsConfig="">
                        <webuijsf:label binding="#{Page1.label1}" id="label1" labelLevel="1"
                            style="font-size: 18px; height: 24px; left: 72px; top: 24px; position: absolute; width: 550px" text="ESRI UI Project Passolo Pseudo Localization"/>
                        <webuijsf:label binding="#{Page1.label2}" id="label2" style="height: 24px; left: 72px; top: 48px; position: absolute; width: 718px" text="-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------"/>
                        <webuijsf:label binding="#{Page1.label3}" for="fileUpload1" id="label3"
                            style="height: 22px; left: 96px; top: 432px; position: absolute; width: 406px" text=" # Supported file types: Win 32, Win 64, .NET, and DAML"/>
                        <webuijsf:upload binding="#{Page1.fileUpload1}" columns="65" id="fileUpload1" style="height: 24px; left: 72px; top: 528px; position: absolute; width: 408px"/>
                        <webuijsf:label binding="#{Page1.label5}" id="label5" style="height: 24px; left: 72px; top: 384px; position: absolute; width: 718px" text="------------------------------------------------------------------------------------------------------------------------------------------------------------------------------"/>
                        <webuijsf:label binding="#{Page1.label6}" id="label6" style="height: 22px; left: 72px; top: 72px; position: absolute; width: 694px" text="1. Select Target  Language(s):"/>
                        <webuijsf:checkbox binding="#{Page1.checkbox_ar}" id="checkbox_ar" label="ar" onClick="" style="height: 24px; left: 192px; top: 96px; position: absolute; width: 72px"/>
                        <webuijsf:checkbox binding="#{Page1.checkbox_es}" id="checkbox_es" label="es" onClick="" style="height: 24px; left: 72px; top: 144px; position: absolute; width: 72px"/>
                        <webuijsf:checkbox binding="#{Page1.checkbox_de}" id="checkbox_de" label="de" style="height: 24px; left: 552px; top: 96px; position: absolute; width: 72px"/>
                        <webuijsf:checkbox binding="#{Page1.checkbox_fr}" id="checkbox_fr" label="fr" style="height: 24px; left: 432px; top: 144px; position: absolute; width: 72px"/>
                        <webuijsf:checkbox binding="#{Page1.checkbox_it}" id="checkbox_it" label="it" style="height: 24px; left: 672px; top: 144px; position: absolute; width: 72px"/>
                        <webuijsf:checkbox binding="#{Page1.checkbox_ja}" id="checkbox_ja" label="ja"
                            style="height: 22px; left: 72px; top: 192px; position: absolute; width: 70px" valueChangeListenerExpression="#{Page1.checkbox_ja_processValueChange}"/>
                        <webuijsf:checkbox binding="#{Page1.checkbox_ptBR}" id="checkbox_ptBR" label="pt-BR" style="height: 24px; left: 192px; top: 240px; position: absolute; width: 72px"/>
                        <webuijsf:checkbox binding="#{Page1.checkbox_ru}" id="checkbox_ru" label="ru" style="height: 24px; left: 552px; top: 240px; position: absolute; width: 72px"/>
                        <webuijsf:checkbox binding="#{Page1.checkbox_zhcn}" id="checkbox_zhcn" label="zh-cn" style="height: 24px; left: 432px; top: 288px; position: absolute; width: 72px"/>
                        <webuijsf:checkbox binding="#{Page1.checkbox_enGB}" id="checkbox_enGB" label="en-GB" style="height: 24px; left: 72px; top: 96px; position: absolute; width: 72px"/>
                        <webuijsf:button actionExpression="#{Page1.checkAll_button_action}" binding="#{Page1.checkAll_button}" id="checkAll_button"
                            style="height: 24px; left: 551px; top: 360px; position: absolute; width: 72px" text="Check All"/>
                        <webuijsf:button actionExpression="#{Page1.unchekcall_button_action}" binding="#{Page1.unchekAll_button}" id="unchekAll_button"
                            style="height: 24px; left: 695px; top: 360px; position: absolute; width: 72px" text="Uncheck All"/>
                        <webuijsf:label binding="#{Page1.label7}" id="label7" style="height: 24px; left: 72px; top: 576px; position: absolute; width: 718px" text="-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------"/>
                        <webuijsf:button actionExpression="#{Page1.submit_Button_action}" binding="#{Page1.submit_Button}" id="submit_Button"
                            style="height: 24px; left: 71px; top: 624px; position: absolute; width: 95px" text="Submit"/>
                        <webuijsf:button actionExpression="#{Page1.button_Cancel_action}" binding="#{Page1.button_Cancel}" id="button_Cancel"
                            style="height: 24px; left: 335px; top: 624px; position: absolute; width: 96px" text="Cancel"/>
                        <webuijsf:hyperlink binding="#{Page1.hyperlink1}" id="hyperlink1"
                            style="font-size: 16px; height: 24px; left: 288px; top: 744px; position: absolute; width: 190px" text="Download File" visible="false"/>
                        <webuijsf:textArea binding="#{Page1.textArea1}" columns="100" id="textArea1" rows="8"
                            style="height: 48px; left: 72px; top: 792px; position: absolute; width: 120px" visible="false"/>
                        <webuijsf:button actionExpression="#{Page1.button_Start_action}" binding="#{Page1.button_Start}" id="button_Start"
                            style="height: 24px; left: 599px; top: 624px; position: absolute; width: 119px" text="Start a new request"/>
                        <webuijsf:checkbox binding="#{Page1.checkbox_tr}" id="checkbox_tr" label="tr" style="left: 192px; top: 288px; position: absolute; width: 72px"/>
                        <webuijsf:checkbox binding="#{Page1.checkbox_fi}" id="checkbox_fi" label="fi" style="left: 312px; top: 144px; position: absolute; width: 72px"/>
                        <webuijsf:checkbox binding="#{Page1.checkbox_cs}" id="checkbox_cs" label="cs" style="left: 312px; top: 96px; position: absolute; width: 72px"/>
                        <webuijsf:checkbox binding="#{Page1.checkbox_he}" id="checkbox_he" label="he" style="left: 552px; top: 144px; position: absolute; width: 70px"/>
                        <webuijsf:checkbox binding="#{Page1.checkbox_ko}" id="checkbox_ko" label="ko" style="left: 192px; top: 192px; position: absolute; width: 70px"/>
                        <webuijsf:messageGroup binding="#{Page1.messageGroup1}" id="messageGroup1" style="height: 96px; left: 600px; top: 528px; position: absolute; width: 240px"/>
                        <webuijsf:alert binding="#{Page1.alert1}" id="alert1" style="height: 70px; left: 508px; top: 456px; position: absolute; width: 214px" summary="Upload File Error"/>
                        <webuijsf:alert binding="#{Page1.alert2}" id="alert2" style="height: 70px; left: 460px; top: 408px; position: absolute; width: 310px" summary="Language Error"/>
                        <webuijsf:checkbox binding="#{Page1.checkbox_da}" id="checkbox_da" label="da" style="height: 24px; left: 432px; top: 96px; position: absolute; width: 70px"/>
                        <webuijsf:checkbox binding="#{Page1.checkbox_el}" id="checkbox_el" label="el" style="height: 24px; left: 672px; top: 96px; position: absolute; width: 72px"/>
                        <webuijsf:checkbox binding="#{Page1.checkbox_et}" id="checkbox_et" label="et" style="height: 24px; left: 192px; top: 144px; position: absolute; width: 72px"/>
                        <webuijsf:checkbox binding="#{Page1.checkbox_lt}" id="checkbox_lt" label="lt" style="height: 24px; left: 312px; top: 192px; position: absolute; width: 72px"/>
                        <webuijsf:checkbox binding="#{Page1.checkbox_lv}" id="checkbox_lv" label="lv" style="height: 24px; left: 432px; top: 192px; position: absolute; width: 72px"/>
                        <webuijsf:checkbox binding="#{Page1.checkbox_no}" id="checkbox_no" label="no" style="height: 24px; left: 552px; top: 192px; position: absolute; width: 72px"/>
                        <webuijsf:checkbox binding="#{Page1.checkbox_nl}" id="checkbox_nl" label="nl" style="height: 24px; left: 672px; top: 192px; position: absolute; width: 72px"/>
                        <webuijsf:checkbox binding="#{Page1.checkbox_pl}" id="checkbox_pl" label="pl" style="height: 24px; left: 72px; top: 240px; position: absolute; width: 72px"/>
                        <webuijsf:checkbox binding="#{Page1.checkbox_ptPT}" id="checkbox_ptPT" label="pt-PT" style="height: 24px; left: 312px; top: 240px; position: absolute; width: 72px"/>
                        <webuijsf:checkbox binding="#{Page1.checkbox_ro}" id="checkbox_ro" label="ro" style="height: 24px; left: 432px; top: 240px; position: absolute; width: 70px"/>
                        <webuijsf:checkbox binding="#{Page1.checkbox_sv}" id="checkbox_sv" label="sv" style="left: 672px; top: 240px; position: absolute; width: 72px"/>
                        <webuijsf:checkbox binding="#{Page1.checkbox_th}" id="checkbox_th" label="th" style="height: 24px; left: 72px; top: 288px; position: absolute; width: 72px"/>
                        <webuijsf:checkbox binding="#{Page1.checkbox_vi}" id="checkbox_vi" label="vi" style="height: 24px; left: 312px; top: 288px; position: absolute; width: 72px"/>
                        <webuijsf:checkbox binding="#{Page1.checkbox_zhtw}" id="checkbox_zhtw" label="zh-tw"
                            style="height: 24px; left: 552px; top: 288px; position: absolute; width: 70px" valueChangeListenerExpression="#{Page1.checkbox_zhtw_processValueChange}"/>
                        <webuijsf:label binding="#{Page1.label4}" for="fileUpload1" id="label4"
                            style="height: 22px; left: 72px; top: 408px; position: absolute; width: 430px" text="2. Upload a single source file:"/>
                        <webuijsf:label binding="#{Page1.label8}" for="fileUpload1" id="label8"
                            style="height: 22px; left: 96px; top: 456px; position: absolute; width: 406px" text="# If you have multiple source files, you can upload as a zip file"/>
                        <webuijsf:label binding="#{Page1.label9}" for="fileUpload1" id="label9"
                            style="height: 22px; left: 96px; top: 480px; position: absolute; width: 406px" text="# If there is any error, click &quot;Start a new request&quot;"/>
                        <webuijsf:label binding="#{Page1.label10}" for="fileUpload1" id="label10"
                            style="height: 22px; left: 72px; top: 600px; position: absolute; width: 406px" text="3. Click Submit"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
