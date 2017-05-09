<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>爱享文库</title>
	<%@include file="/public/website-head.jspf"%>
    <script type="text/javascript">

    	//加载轮播图
        $(document).ready(function(){
         	 $.ajax({
              	url:'${pageContext.request.contextPath}/base/pictureAction_getBigPicture',
              	data:{},
              	dataType:'json',
              	method:'POST',
              	success:function(data){
              		$("#carousel-animate").empty();
              		for(var i=0;i<data.length;i++){
              			var pi=data[i];
              			var html="<div class='item "+(i==0?'active':'')+" height-control'><a href='#'><img src='http://datamarket-1253539045.costj.myqcloud.com/" + pi['pictureSn'] + "' alt='First slide'></a><div class='carousel-caption'>描述</div></div>";
              			$("#carousel-animate").append(html);
         				$("#carousel-animate").fadeIn('show');
              		}
              	}
              })
              //加载热门下载
              $.ajax({
            	  url:'${pageContext.request.contextPath}/b2c/datumAction_queryHotDown.action',
            	  data:{},
            	  dataType:'json',
            	  method:'POST',
            	  success:function(data){
            		  $("#hot_down").empty();
            		  for(var i=0;i<data.length;i++){
            			  var di=data[i];
            			  var html="<div class='col-sm-3 col-xs-12'><div class='list-group'><a href='${pageContext.request.contextPath}/b2c/datumAction_getByDatumSn?datumSn=" + di['datumSn'] +  "'class='list-group-item ellipsis'><span class='icon-padding color'>◆</span>" + di['datumName'] + "</a></div></div>"
            			  $("#hot_down").append(html);
           				  $("#hot_down").fadeIn('show');
            		  }
            		  
            	  }
              })
          })
       //加载左导航
       $(function(datas){
            $.ajax({
                url:'${pageContext.request.contextPath}/c2c/categoryAction_getIndexCategory',
                dataType:'json', //返回的资料类型
                success:function(data){
                	for(var i=0;i<data.length;i++){
                		var html1='<div class="rel-position hover-active nav-box">'
                        	+	'<a href="javascript:" class="nav-left ellipsis"><strong><span class="glyphicon glyphicon-menu-right"></span><span>'+data[i].categoryName+'</span></strong></a>'
                        	+	'<div class="nav-right row">'
                            +		'<div class="col-xs-12">'                                         
                            +     		'<div class="nav-right-box " >'
                            +       		'<h4 class="nav-right-title" >'+data[i].categoryName+'</h4>'
                            +         		'<hr>'
                            +        		'<ul class="list-inline" id="subCategory">'
                
                    		if(data[i].son.length>0){
                    			var html2='';
                        		for(var j=0;j<data[i].son.length;j++){                   		                       			
                                    html2=html2+'<li><a href="${pageContext.request.contextPath}/b2c/down_list?categoryName='+data[i].son[j].subCategoryName+'">'
                                            	  +data[i].son[j].subCategoryName
                                               +'</a></li>'
                                            
                        		}	
                    		}

                           var html3=       			'</ul>'
                                    +       	'</div>'
                                	+		'</div>'                                   
                                 	+	'</div>'                        

                    	$('#leftNavAreaContent').append(html1+html2+html3);
                	}
                }
            })  
        })
          //左导航条悬浮显示子菜单
          $(document).ready(function (){          	
            	$("#leftNavArea").delegate(".hover-active","mouseover",function(){
            		  var w1=$('#myCarousel').outerWidth(true);//轮播区域大小	
        	      	  var w=$('.left-nav').outerWidth(true);//左导航父菜单宽度
        	      	  $(".nav-right",this).css('left',w);      	      		  
      	      		  $(".nav-right",this).css('width',w1-w);//左导航子菜单宽度
            		  $(".nav-right",this).show();
            	});
            	$("#leftNavArea").delegate(".hover-active","mouseleave",function(){
            		$(".nav-right",this).hide();
          		});
            	
      		});
      	//控制左导航条相关属性
	      	$(function (){
	      		var w=$('.container').outerWidth();
	      		//console.log(w)
	      		if(w<750){
	      			var minw=$('.left-nav').css('min-width');
	      			$('.carousel .left').css('margin-left',minw);
	      		}
	      		else{
		      		$('.left-nav').css('width',0.25*w);	      		
		      		$('.carousel .left').css('margin-left',0.25*w);
		      		 
      			}	
	      	});
      	

   </script>

</head>
<body>
     <!-- 顶部 -->
     <%@include file="header.jsp"%>
    <!-- LOGO搜索 -->
    <%@include file="searchbox.jsp"%>
       
       <!-- 导航及轮播-->
    <div class="container body-area">
    <div class="row">
            <!-- 左区域 分类导航-->
            <div id="nav-Carousel" class="col-xs-12 nav-Carousel">
            	       <!-- 代码begin -->
            	       <!--导航栏  -->
                       <div id="leftNavArea" class="left-nav maincl-border-top">
                            <div class="text-center lead title">分类导航</div>
                            <div id="leftNavAreaContent">
                            
                            </div>                                                                                  
                       </div>
						 
						<!-- 代码end -->
				         <div id="carousel-area" class=" carousel-area">             								 
		             		 <!-- 轮播 -->
		             		<div class="row ">
		             			<div class="col-xs-12">
		             			   <div id="myCarousel" class="carousel ">
						            <!-- 轮播（Carousel）指标 -->
						            <ol class="carousel-indicators">
						                <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
						                <li data-target="#myCarousel" data-slide-to="1"></li>
						                <li data-target="#myCarousel" data-slide-to="2"></li>
						            </ol>   
						            <!-- 轮播（Carousel）项目 -->
						            <div class="carousel-inner" id="carousel-animate">
						            
						            </div>
                                    <!-- 轮播（Carousel）导航 -->
                                    <div class="carousel-nav">
                                        <a class="carousel-control left" href="#myCarousel"  data-slide="prev">
                                            <span class="glyphicon glyphicon-chevron-left"></span>
                                        </a>
                                        <a class="carousel-control right" href="#myCarousel"  data-slide="next">
                                            <span class="glyphicon glyphicon-chevron-right"></span>
                                        </a>
                                    </div>

						        </div>
		             		</div> 
		             	</div>						 
		            </div>
            </div>    
        </div>      
    </div>
    <div class="container"><hr/></div>
       
    <!-- 主体 二-->
    <div class="container main-area">
     <!-- 主bottom-->
        <div class="well hot-area">
        	<div class="box">
	        	<div class="row">       	
	        		 <h3><span class="title"><span class="glyphicon glyphicon-fire icon-padding"></span>热门资料</span></h3>
		             <div><hr class="red-hr fl"/></div>	        	
	        	</div>
	        	<div class="row" id="hot_down">          
		             
							
						
		  	 	</div>
             </div>    
        </div>      
    </div>
    <!-- 页末 -->
    <%@include file="footer.jsp"%>
</body>
</html>