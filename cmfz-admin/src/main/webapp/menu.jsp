<%--
  Created by IntelliJ IDEA.
  User: zhangbohao
  Date: 2018/7/5
  Time: 10:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false"%>
<html>
<head>
    <title>持明法洲后台管理系统</title>

    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/themes/ui-sunny/easyui.css">
    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/themes/icon.css">
    <script type="text/javascript"
            src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
    <script type="text/javascript"
            src="${pageContext.request.contextPath}/js/jquery.easyui.min.js"></script>
    <script type="text/javascript"
            src="${pageContext.request.contextPath}/js/easyui-lang-zh_CN.js"></script>

    <script type="text/javascript">




    </script>
</head>

    <body class="easyui-layout">
        <div data-options="region:'north',split:true" style="height:80px;">
            <div>
                <span style="font-size:36 ; font-family: 黑体" >持明法洲后台管理系统</span>
            </div>
            <div style="float: right;">
                <span style="font-size: 14">欢迎您：xxx</span><a id="btn"
                                                             class="easyui-linkbutton" data-options="iconCls:'icon-cancel'">登出</a>
            </div>
        </div>
        <div data-options="region:'south',split:true" style="height:100px;">
            <center>&copy 张博浩</center>
        </div>

        <div data-options="iconCls:'icon-man',region:'west',title:'导航菜单',split:true"
             style="width:249px;">
            <div id="aa" class="easyui-accordion" data-options="fit:true">
                <div title="嘀嘀嘀" data-options="iconCls:'icon-save'"
                     style="overflow:auto;padding:10px; text-align: center;">
                    <a class="easyui-linkbutton"
                       data-options="plain:true,iconCls:'icon-search'"
                       onclick="addTab(this,'datagrid.jsp')">菜单项1</a>
                </div>
            </div>
        </div>
        <div data-options="iconCls:'icon-more',region:'center',title:'主页'"  style="padding:5px;background:">


        </div>
    </body>

</html>
