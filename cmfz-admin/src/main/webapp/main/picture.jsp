<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" isELIgnored="false" %>

    <script type="text/javascript">
    $(function () {
        $('#ttss').datagrid({
            title:'轮播图管理页',
            remoteSort:false,
            singleSelect:true,
            nowrap:false,
            fitColumns:true,
            toolbar:"#tb",
            pagination : true,
            pageList : [ 1, 3, 5, 7, 10 ],
            pageSize:3,
            url:'${pageContext.request.contextPath}/Picture/PictureAll',
            columns:[[
                {field:'picture_id',title:'图片编号',width:120,align:'center'},
                {field:'picture_path',title:'图片路径',width:100,align:'center',sortable:true},
                {field:'picture_date',title:'存储日期',width:80,align:'center',sortable:true},
                {field:'picture_descripti',title:'描述',width:100,align:'center',sortable:true},
                {field:'picture_status',title:'状态',width:60,align:'center'},

            ]],
            view: detailview,
            detailFormatter: function(rowIndex, rowData){
                return "<table><tr><td rowspan=2 style='border:0'><img style='height:80px; width:120px;' src='${pageContext.request.contextPath}/main/image/"+ rowData.picture_path +"' /></tr></td></table>";
            }
        });



        $("#adda").linkbutton({
            onClick:function(){
                //弹出会话窗口
                $("#insertPicture").dialog({
                    width:400,
                    height:250,
                    title:"添加轮播图",
                    toolbar:[{
                        iconCls:"icon-help",
                        text:"帮助",
                        handler:function(){
                            alert("要什么帮助");
                        }
                    }],
                    href:"${pageContext.request.contextPath}/main/piceadd.jsp",
                    modal:true,
                    shadow:true,
                    buttons:[{
                        iconCls:"icon-table_save",
                        text:"保存",
                        handler:function(){
                            //提交表单
                            $("#addPicture").form("submit",{
                                url:"${pageContext.request.contextPath}/Picture/add",
                                onSubmit:function(){
                                    //return $("#form").form("validate");//做字段验证
                                }
                            });
                            $("#addMaster").dialog("close",{
                                href:"${pageContext.request.contextPath}/main/picture.jsp"
                            });
                        }
                    },{
                        iconCls:"icon-cancel",
                        text:"取消",
                        handler:function(){
                            $("#addMaster").dialog("close");
                        }
                    }],
                });
            }
        });
        $("#edit").linkbutton({
            onClick:function(){
                var rowData=$("#ttss").datagrid("getSelected");
                $("#changePicture").dialog({
                    width:400,
                    height:250,
                    title:"修改轮播图",
                    href:"${pageContext.request.contextPath}/main/piceEtid.jsp",
                    modal:true,
                    shadow:true,
                    onLoad:function(){
                        $("#etidPicture").form("load",rowData);
                    },
                    buttons:[{
                        iconCls:"icon-table_save",
                        text:"保存",
                        handler:function(){
                            //提交表单
                            $("#etidPicture").form("submit",{
                                url:"${pageContext.request.contextPath}/Picture/update",
                                success:function(data){
                                    $("#changePicture").dialog("close");
                                    $("#master").datagrid("reload");
                                }
                            });


                        }
                    },{
                        iconCls:"icon-cancel",
                        text:"取消",
                        handler:function(){
                            $("#ttss").datagrid("reload");
                            $("#changePicture").dialog("close");
                        }
                    }],





                });
            }
        });








    });
    </script>
<table id="ttss"></table>


    <div id="tb" style="display: none">
        <a id="adda" href="#" class="easyui-linkbutton"
           data-options="iconCls:'icon-add',plain:true,text:'新增轮播图'"></a>
        <a id="edit" href="#" class="easyui-linkbutton"
           data-options="iconCls:'icon-edit',plain:true,text:'修改'"></a>


    </div>

<div id="insertPicture"></div>
<div id="changePicture"></div>


