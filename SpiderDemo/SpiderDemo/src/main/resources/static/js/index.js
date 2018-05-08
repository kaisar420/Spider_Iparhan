function spiderCompany(){
	alert("企业信息爬去");
	$.ajax({
		  type: 'POST',
		  url: "/spiderCompany",
		  data:{
              "username" : "username",
              "message" : "company"
          },
          success: function(data) {
              alert("企业信息爬取成功!");
          },
		  
		});
}

/**
 * 私募排名数据爬取
 * @returns
 */
function spiderPrivateStock(){
	alert("私募排名信息爬去");
	$.ajax({
		  type: 'POST',
		  url: "/privateStock",
		  data:{
              "username" : "username",
              "message" : "privateStock"
          },
          success: function(data) {
              alert("私募排名信息爬取成功!");
          },
		  
		});
}

/**
 * 海外基金信息爬取
 * @returns
 */
function spiderOverSeasFund(){
	alert("海外基金信息爬去");
	$.ajax({
		  type: 'POST',
		  url: "/overSeasFund",
		  data:{
              "username" : "username",
              "message" : "overSeasFund"
          },
          success: function(data) {
              alert("海外基金信息爬取成功!");
          },
		  
		});
}

/**
 * 单账户基金信息爬取
 * @returns
 */
function spiderProduct(){
	alert("海外基金信息爬去");
	$.ajax({
		  type: 'POST',
		  url: "/spiderProduct",
		  data:{
              "username" : "username",
              "message" : "spiderProduct"
          },
          success: function(data) {
              alert("海外基金信息爬取成功!");
          },
		  
		});
}



/***
 * 新三板信息爬取
 * @returns
 */
function spiderNewThreeFund(){
	alert("海外基金信息爬去");
	$.ajax({
		  type: 'POST',
		  url: "/newThreeFund",
		  data:{
              "username" : "username",
              "message" : "newThreeFund"
          },
          success: function(data) {
              alert("海外基金信息爬取成功!");
          },
		  
		});
}


/**
 * 三月牛基
 * @returns
 */
function spiderThreeMonth (){
	alert("三月牛基爬去");
	$.ajax({
		  type: 'POST',
		  url: "/threeMonth",
		  data:{
              "username" : "username",
              "message" : "threeMonth"
          },
          success: function(data) {
              alert("三月牛基信息爬取成功!");
          },
		  
		});
}


/**
 * FOF基金
 * @returns
 */
function spiderFOFFund(){
	alert("FOF基金信息爬去");
	$.ajax({
		  type: 'POST',
		  url: "/fofFund",
		  data:{
              "username" : "username",
              "message" : "fofFund"
          },
          success: function(data) {
              alert("FOF基金信息爬取成功!");
          },
		  
		});
}


/**
 * 货币基金
 * @returns
 */
function spiderCurrencyFund(){
	alert("货币基金信息爬去");
	$.ajax({
		  type: 'POST',
		  url: "/currencyFund",
		  data:{
              "username" : "username",
              "message" : "currencyFund"
          },
          success: function(data) {
              alert("货币基金信息爬取成功!");
          },
		  
		});
}

