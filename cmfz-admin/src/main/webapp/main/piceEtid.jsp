<%--
  Created by IntelliJ IDEA.
  User: zhangbohao
  Date: 2018/7/6
  Time: 16:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>




    <form id="etidPicture" method="post" enctype="multipart/form-data">
        <div style="margin-left: 10px;margin-top: 20px;width:300px;height:150px;"  >
            <table >
                <tr>
                    <td style="width: 200px" >编号</td>
                    <td><input id="picture_id" class="easyui-textbox"  name="picture_id" readonly="readonly"/></td>
                </tr>


                <tr>
                    <td style="width: 200px" >描述</td>
                    <td><input id="picture_descripti" class="easyui-textbox"  name="picture_descripti"/></td>
                </tr>

                <tr>
                    <td>状态</td>
                    <td>
                        <select name="picture_status">
                            <option>展示</option>
                            <option>未展示</option>
                        </select>
                    </td>
                </tr>

                <tr>
                    <td>请选择上传的图片</td>
                    <td>
                        <input id="fb" type="text" class="easyui-filebox"  name="myFile" />
                    </td>
                </tr>

                <tr>
                    <td><a id="sum" ></a></td>
                    <td><a id="out" ></a></td>
                </tr>
            </table>
        </div>
        <div id="dialog" ></div>
    </form>


