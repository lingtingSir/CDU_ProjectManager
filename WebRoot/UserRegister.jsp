<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>

    
  <title>注册</title>
	 <link href="css/resource.css" rel="stylesheet" type="text/css" />
    
<script type="text/javascript">
	function ConfirmPassword(){
		var pas1,pas2;
		pas1=document.getElementById("client.ClientPwd").value;
		pas2=document.getElementById("client.ClientConfirmPwd").value;
	if(!(pas1==pas2))
		alert("两次输入的密码不一致，请重新输入！");
	if(pas1.length<8 && pas2.length<8)
		alert("密码必须大于8位，请重新输入！");
	}

</script>
  </head>
     
	
  <body>
  <form action="register" method="post">
  <table  style="text-align: center;" class="infolist_vt">
        <tr>
            <th colspan="2" class="common">
                <h3 >注册</h3>
            <hr align="left"   style="color: Green;width: 100%;height: 3px;"/></th> 
        </tr>
        <tr>
            <th style="width: 80px; height: 25px;" class="common">
                用户名：
            </th>
            <td class="common">
                <input type="text" id="client.ClientName"  name="client.ClientName" Style="width: 200px;" >
               
                
            </td>
        </tr>
        <tr>
            <th class="common">
                用户ID：
            </th>
            <td class="common">
            <input type="text" id="client.ClientId" name="client.ClientId" Style="width: 200px;" >
                
               
            </td>
        </tr>
        <tr  >
            <th class="common">
                设置密码：
            </th>
            <td class="common">
             <input type="password" id="client.ClientPwd" name="client.ClientPwd" Style="width: 200px;" >
              
            </td>
        </tr>
        
        <tr>
            <th class="common">
                确认密码：
            </th>
            <td class="common">
            	 <input type="password" id="client.ClientConfirmPwd" name="client.ClientConfirmPwd"  Style="width: 200px;" >
               
            </td>
        </tr>
        
        <tr>
    
            <th class="common">
                用户描述：
            </th>
            <td class="common">
            	 <input type="text" id="client.ClientDes" name="client.ClientDes"  Style="width: 200px;Height:50px"  onclick= "javascript:GetQueryResult()">
                
            </td>
        </tr>
        <tr>
            <th class="common">
            </th>
            <td class="common">
            	<input type="submit" id="btRegister" name="btRegister" value="注册" Style="width: 60px;" >
            	&nbsp;&nbsp;
                
            </td>
        </tr>
        <td align="center">
				<font color="red"><s:fielderror/><s:property value="message"/></font>
			</td>
    </table>
    </form>
  </body>
</html>
