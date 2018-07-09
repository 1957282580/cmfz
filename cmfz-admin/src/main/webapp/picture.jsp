<%--
  Created by IntelliJ IDEA.
  User: zhangbohao
  Date: 2018/7/6
  Time: 10:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>


<script type="text/javascript">
    $(function(){
        $('#tts').datagrid({
            title:'DataGrid - DetailView',
            width:"100%",
            height:"100%",
            remoteSort:false,
            singleSelect:true,
            nowrap:false,
            fitColumns:true,
            url : "${pageContext.request.contextPath}/Picture/PictureAll",
            columns:[[{
                title : "标识编号",
                field : "picture_id",
                width : 100,
            },{
                title : "文件名",
                field : "picture_path",
                width : 100,
            },{
                title : "描述信息",
                field : "picture_descripti",
                width : 100,
            },{
                title : "轮播图状态",
                field : "picture_status",
                width : 100,
            },{
                title : "轮播图创建时间",
                field : "picture_date",
                width : 100,
            }]],
            view: detailview,
            detailFormatter: function(rowIndex, rowData){
                return '<table><tr>' +
                    '<td rowspan=2 style="border:0"><img src="images/' + rowData.itemid + '.png" style="height:50px;"></td>' +
                    '<td style="border:0">' +
                    '<p>Attribute: ' + rowData.attr1 + '</p>' +
                    '<p>Status: ' + rowData.status + '</p>' +
                    '</td>' +
                    '</tr></table>';
            }
        });
    });



    function cancel(){
        var rowData = $("#tts").datagrid("getSelected");
        alert(rowData);
        $.post("/SSM_EasyUi/user/delete",rowData,function(result){
            if(result.code == 200){
                alert("删除完成");
            }
        });
    }

    function editone(){
        var rowData = $("#tts").datagrid("getSelected");
        console.log(rowData);
        $("#dialog").dialog({
            width:800,
            height:400,
            href:"form.jsp",
            onLoad:function(){
                $("#ff").form("load",rowData);//在加载表单时将行数据加载到表单元素中
            }
        });
    }
    function addone(){
        $("#dialog").dialog({
            width:800,
            height:400,
            href:"form1.jsp",
        });

    }
    function qq(value, name){
        //加载第一页的数据  并且携带额外的请求参数
        $('#tts').datagrid('load',{
            value:value,
            name:name
        });
    }
        //数据表格  加载远程数据 数据来源数据库
      /* /$("#tts").datagrid({
            url : "\${pageContext.request.contextPath}/Picture/PictureAll",
            colums : [[{
                title : "标识编号",
                field : "picture_id",
                width : 100,
            },{
                title : "文件名",
                field : "picture_path",
                width : 100,
            },{
                title : "描述信息",
                field : "picture_descripti",
                width : 100,
            },{
                title : "轮播图状态",
                field : "picture_status",
                width : 100,
            },{
                title : "轮播图创建时间",
                field : "picture_date",
                width : 100,
            }]]
            pagination : true,//如果为true，则在DataGrid控件底部显示分页工具栏。
            pageList:[2,4,6,8,10],//在设置分页属性的时候 初始化页面大小选择列表。
            pageSize : 2,//在设置分页属性的时候初始化页面大小。
            toolbar : "#tb",//!****
            fitColumns:true,//真正的自动展开/收缩列的大小，以适应网格的宽度，防止水平滚动
            singleSelect:true,//如果为true，则只允许选择一行。
        });
    });*/





    /*function cancel(){
        var rowData = $("#tts").datagrid("getSelected");
        alert(rowData);

    }*/




</script>


    <table id="tts" ></table>


   <div id="tb" style="display: none" >
        &lt;%&ndash;修改&ndash;%&gt;
        <a onclick="editone()" class="easyui-linkbutton" data-options="iconCls='icon-edit',plain:true,text:'修改'">
        </a>
        &lt;%&ndash;增加&ndash;%&gt;
        <a onclick="addone()" class="easyui-linkbutton" data-options="iconCls='icon-add',plain:true,text:'增加'">
        </a>
        &lt;%&ndash;删除&ndash;%&gt;
        <a onclick="cancel()" class="easyui-linkbutton" data-options="iconCls='icon-cancel',plain:true,text:'删除'">
        </a>

        <input  id="ss" class="easyui-searchbox" style="width: 300px" data-options="searcher:qq,prompt:'请你输入需要查询的内容'，menu:'#mm'"  />

        <div id="mm" style="width: 120px" >
            <div data-options="name:'picture_status',iconCls:'icon-ok'" >状态</div>
            <div data-options="name:'picture_descripti',iconCls:'icon-ok'" >描述</div>
        </div>

    </div>

