
/**
 * 企业信息爬虫
 * @returns
 */
function spiderCompany(){
	alert("ajax 调用了");
	$.ajax({
		  type: 'POST',
		  url: "/spiderCompany",
		  data:{
              "username" : "username",
              "message" : "company"
          },
          success: function(data) {
              alert("成功了吧");
          },
          error:function(){
              alert("代码问题吧");
          }
		});
}


/**
 * 三月牛基爬虫
 * @returns
 */
function spiderBigThreeMonth(){
	alert("ajax 调用了");
	$.ajax({
		  type: 'POST',
		  url: "/threeMonth",
		  data:{
              "username" : "username",
              "message"  : "company"
          },
          success: function(data) {
              alert("成功了吧");
          },
          error:function(){
              alert("代码问题吧");
          }
		});
}


/**
 * 私募排行数据交互
 * @returns
 */
function spiderPrivateStock(){
	alert("ajax 调用了===私募排行");
	$.ajax({
		  type: 'POST',
		  url: "/privateStock",
		  data:{
              "username" : "username",
              "message" : "privateStock"
          },
          success: function(data) {
              alert("成功了吧");
          },
          error:function(){
              alert("代码问题吧");
          }
		});
}