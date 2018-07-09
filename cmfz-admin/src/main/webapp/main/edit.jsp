<%--
  Created by IntelliJ IDEA.
  User: zhangbohao
  Date: 2018/7/6
  Time: 16:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>

<script type="text/javascript">

    $(function() {
        $("#sum").linkbutton({
            iconCls:"icon-accept",
            text:"提交",
            onClick:function(){
                $("#ff").form("submit",{
                    url:"http://localhost:8088/SSM_EasyUi/user/update",
                    onSubmit:function(){

                    },
                    success:function(result){
                        var result =JSON.parse(result);
                        if(result.code == 200){
                            href="javascript:void(0)";
                            $("#dialog").dialog('close');
                            alert("操作成功");
                        }else{
                            href="javascript:void(0)";
                            alert("操作失败");
                        }
                    }
                });
            }
        });

    });
    function test() {
    }

</script>

<style>
    .aa{
        margin-left:70px;
    }

</style>






<div class="aa">
    <form id="ff" method="post">
        <div style="margin-left: 10px;margin-top: 20px;width:300px;height:150px;"  >
            <table >

                <tr>
                    <td>用户名</td>
                    <td><input id="username" class="easyui-textbox"  name="username"/></td>
                </tr>

                <tr>
                    <td>请输入密码</td>
                    <td>
                        <input id="password1" class="easyui-textbox"  name="password"/>
                    </td>
                </tr>

                <tr>
                    <td>请输入新密码</td>
                    <td>
                        <input id="password2" class="easyui-textbox"  name="password"/>
                    </td>
                </tr>

                <tr>
                    <td><a id="sum" ></a></td>
                    <td><a id="out" ></a></td>
                </tr>
            </table>
        </div>
    </form>
</div>