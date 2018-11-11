<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Menus</title>
  <link rel="stylesheet" type="text/css" href="./css/zTreeStyle.css">
  <script type="text/javascript" src="./js/jquery.min.js"></script>
  <script type="text/javascript" src="./js/jquery.ztree.core.js"></script>
  <script type="text/javascript" src="./js/jquery.ztree.excheck.js"></script>
  
    <script type="text/javascript">
          
         var setting = { 
        		  data : {
        			 key: {
        					url: "xUrl"
        				},
        			 keep : { //子节点和父节点属性设置 默认值都为false
        			   leaf : false,//zTree 的节点叶子节点属性锁，是否始终保持 isParent = false
        			   parent : true//zTree 的节点父节点属性锁，是否始终保持 isParent = true
        			 },
            		 simpleData : {
            			   enable : true,//确定 zTree 初始化时的节点数据、异步加载时的节点数据、或 addNodes 方法中输入的 newNodes 数据是否采用简单数据模式 (Array)
            			   idKey : "id",//节点数据中保存唯一标识的属性名称。[setting.data.simpleData.enable = true 时生效]
            			   pIdKey : "pId",//节点数据中保存其父节点唯一标识的属性名称。[setting.data.simpleData.enable = true 时生效]
            			   rootPId : null//用于修正根节点父节点数据，即 pIdKey 指定的属性值。[setting.data.simpleData.enable = true 时生效]
            			 }
        		 },
        		 callback:{
        			 onClick:goTarget
        		 }

               }; 
         
         var zTree;  
         var treeNodes;  
         
         $(document).ready(function(){
      	    $.ajax({  
    	        async : false,  
    	        cache:false,  
    	        type: 'POST',  
    	        dataType : "json",  
    	        url: "${pageContext.request.contextPath }/getMenus",//请求的action路径  
    	        error: function () {//请求失败处理函数  
    	            alert('请求失败');  
   	        },  
    	        success:function(data){ //请求成功后处理函数。  
    	        	console.log(data);
    	            treeNodes = data;   //把后台封装好的简单Json格式赋给treeNodes  
   	       		 }  
    	    });  

    	    zTree = $.fn.zTree.init($("#tree"), setting, treeNodes);
        	});
         
         function goTarget(event,treeId,treeNode){
//        	 if(treeNode.isParent){
//        		 alert("fu jie dian !");
//        		 return;
//        	 }
        	 window.top.content.location.href= treeNode.url;
         }

  </script>
  
</head>
<body>

       <div class="zTreeDemoBackground left">
              <ul id="tree" class="ztree"></ul>
        </div>
          
</body>
</html>