<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8" isELIgnored="false" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>持名法州主页</title>
<link rel="stylesheet" type="text/css" href="../themes/default/easyui.css">   
<link rel="stylesheet" type="text/css" href="../themes/IconExtension.css">   
<script type="text/javascript" src="../js/jquery.min.js"></script>   
<script type="text/javascript" src="../js/jquery.easyui.min.js"></script>  
<script type="text/javascript" src="../js/easyui-lang-zh_CN.js"></script>
	<script type="text/javascript" src="../js/datagrid-detailview.js"></script>
<script type="text/javascript">



    function addTab(menu_name,menu_url,menu_icon){
        // 创建选项卡面板
        var b = $("#tt").tabs("exists",menu_name);

        if(b){
            $("#tt").tabs("select",menu_name);
        }else{
            $("#tt").tabs("add",{
                title:menu_name,
                iconCls:menu_icon,
				href:"${pageContext.request.contextPath}/"+menu_url,
                closable:true,


            });
        }
    }

    $(function(){
        $.ajax({
            url:"${pageContext.request.contextPath}/Menu/show", // isELIgnored  表示不忽略页面的el表达式
            dataType:"json",
            success:function(res){
                //console.log(res);
                // 遍历响应集合
                // 参数res： 代表的当前遍历的集合
                //    index：当前遍历的下标
                //    obj:   遍历过程中的临时变量
                $.each(res,function(index,obj){
                    console.log(obj);
                    var content = "";
                    $.each(obj.secondMenuList,function(index1,obj1){
                        content += "<p style=\"text-align: center\"><a class=\"easyui-linkbutton\" data-options=\"iconCls:'"+obj1.menu_icon+"',plain:true\" onclick=\"addTab('"+obj1.menu_name+"','"+obj1.menu_url+"','"+obj1.menu_icon+"')\">"+obj1.menu_name+"</a></p>"
                    });

                    $("#aa").accordion("add",{
                        title:obj.menu_name,
                        iconCls:obj.menu_icon,
                        content:content,
                    });
                });
            }
        });

        $("#btn1").linkbutton({

            onClick:function(){
                //展示一个对话窗口
                $("#dialog").dialog({
                    width:400,
                    height:249,
                    title:"修改管理员账户",
                    toolbar:[{
                        iconCls:"icon-help",
                        text:"帮助",
                        handler:function(){
                            alert("帮助");
                        }
                    }],
                   href:"${pageContext.request.contextPath}/main/edit.jsp"
                });
            }
        });


    });









</script>

</head>
<body class="easyui-layout">
<div data-options="region:'north',split:true"
	 style="height:60px;background-color:  #5C160C">
	<div style="font-size: 24px;color: #FAF7F7;font-family: 楷体;font-weight: 900;width: 500px;float:left;padding-left: 20px;padding-top: 10px">
		持名法州后台管理系统
	</div>
	<div style="font-size: 16px;color: #FAF7F7;font-family: 楷体;width: 300px;float:right;padding-top:15px">欢迎您:${sessionScope.manager.mgr_name}
		&nbsp;<a  id="btn1" class="easyui-linkbutton" data-options="iconCls:'icon-edit'">修改密码</a><a href="#"></a>

		&nbsp;<a id="btn2" class="easyui-linkbutton" data-options="iconCls:'icon-01'">退出系统</a>
	</div>
</div>
<div data-options="region:'south',split:true" style="height: 40px;background: #5C160C">
	<div style="text-align: center;font-size:15px; color: #FAF7F7;font-family: 楷体">&copy;百知教育 gaozhy@zparkhr.com.cn
	</div>
</div>

<div data-options="region:'west',title:'导航菜单',split:true" style="width:220px;">
	<div id="aa" class="easyui-accordion" data-options="fit:true">

	</div>
</div>
<div data-options="region:'center'">
	<div id="tt" class="easyui-tabs" data-options="fit:true,narrow:true,pill:true">
		<div title="主页" data-options="iconCls:'icon-neighbourhood',pill:true,narrow:true,fit:true"
			 style="background-image:url(image/shouye.jpg);background-repeat: no-repeat;background-size:100% 100%;"></div>
	</div>
</div>
<div id="dialog"></div>
</body>
</html>