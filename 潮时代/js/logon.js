/*第三方登录显示隐藏*/
$(function(){
	$(".ThirdParty-box span").toggle(function(){
		$(".icon-p").slideDown();
	},function(){
		$(".icon-p").slideUp();
	});
	
});
/*第三方更多*/
$(function(){
	$(".ThirdParty-box span").toggle(function(){
		$(".ThirdParty-box span i").css({"background-image":"../img/icon.jpg","background-position":" -274px -23px"})
	},function(){
		$(".ThirdParty-box span i").css({"background-image":"../img/icon.jpg","background-position":" -274px 0"})
	});
	
});
/*手机号码*/
$(function(){
	$(".text-box input").focus(function(){
		$(".text-box").css({"border":"1px solid lightgreen","box-shadow":"0 0 4px 1px rgba(32,157,230,0.4)"});
	});
	$(".text-box input").blur(function(){
		
		var $phone = $(".text-box input").val();
		var $htin = $("#hint1");
		if(/^(13[4-9]|147|15[0-2]|15[7-9]|18[1-3])\d{8}$/.test($phone))
		{
			/*$htin.text("中国移动");*/
			$htin.text(" ");
			$htin.css({"display":"none"});
			$(".text-box").css({"border":"1px solid #e0e0e0","box-shadow":"none"});
		}
		else if(/^(13[0-2]|15[5-6]|18[5-6])\d{8}$/.test($phone))
		{
			/*$htin.text("中国联通");*/
			$htin.text(" ");
			$htin.css({"display":"none"});
			$(".text-box").css({"border":"1px solid #e0e0e0","box-shadow":"none"});
		}
		else if(/^(133|153|180|189)\d{8}$/.test($phone))
		{
			/*$htin.text("中国电信");*/
			$htin.text(" ");
			$htin.css({"display":"none"});
			$(".text-box").css({"border":"1px solid #e0e0e0","box-shadow":"none"});
		}
		else if($phone=="")
		{
			$htin.text("手机号码不能为空");
			$htin.css({"display":"block"});
			$(".text-box").css({"border":"1px solid red","box-shadow":"0 0 4px 1px rgba(233,150,122,0.8)"});
		}
		else
		{
			$htin.text("手机号码不正确");
			$htin.css({"display":"block"});
			$(".text-box").css({"border":"1px solid red","box-shadow":"0 0 4px 1px rgba(233,150,122,0.8)"});
		}
		
	});
});
/*手机动态码*/

$(function(){
	var a;
	$(".authcode").click(function(){
		var sjsarray=new Array(); 	
	    for(var i=0;i<4;i++)
	    {
	    	var index=Math.random()*10;
	    	var num=Math.floor(index);
	    	sjsarray=sjsarray+num;
	    }
	    alert(sjsarray);
	    a=sjsarray;
	});
	
	$(".text-box1 input").focus(function(){
			$(".text-box1").css({"border":"1px solid lightgreen","box-shadow":"0 0 4px 1px rgba(32,157,230,0.4)"});
		});
	$(".text-box1 input").blur(function(){
		/*alert(a);*/
		var $value = $(".text-box1 input").val() 
		var $htin = $("#hint2");
		if($value == ""){
			$htin.text("验证码不能为空 ！");
			$htin.css({"display":"block"});
			$(".text-box1").css({"border":"1px solid red","box-shadow":"0 0 4px 1px rgba(233,150,122,0.8)"});
		}
		else if(a==$value){
			$htin.text(" ");
			$htin.css({"display":"none"});
			$(".text-box1").css({"border":"1px solid #e0e0e0","box-shadow":"none"});
		}
		else if(a!=$value){
			$htin.text("验证码不正确");
			$htin.css({"display":"block"});
			$(".text-box1").css({"border":"1px solid red","box-shadow":"0 0 4px 1px rgba(233,150,122,0.8)"});
		}
		
	});	
});

/*登录*/
/*$(function(){
	$(".loginbtn").click(function(){
		var $box = $(".text-box");
		var $box1 = $(".text-box1");
		if( ($box.css.border="1px solid red") && ($box.css.border="1px solid red") ){
			 alert("请填写正确的手机号码或验证码！");
		}else{
			alert("登录成功");
		}
		
	});
});
*/

/*普通登录手机号码验证*/
$(function(){
	$(".text-box2 input").focus(function(){
		var $htin = $("#hint3");
		$htin.text("请输入登录名 , 登录名可能是您的手机号 , 邮箱或用户名");
		$htin.css({"color":"black"})
		$(".text-box2").css({"border":"1px solid lightgreen","box-shadow":"0 0 4px 1px rgba(32,157,230,0.4)"});
	});
	$(".text-box2 input").blur(function(){
		$(".text-box2").css({"border":"1px solid #e0e0e0"});
		var $phone = $(".text-box2 input").val();
		var $htin = $("#hint3");
		if(/^(13[4-9]|147|15[0-2]|15[7-9]|18[1-3])\d{8}$/.test($phone))
		{
			/*$htin.text("中国移动");*/
			$htin.text(" ");
			$htin.css({"display":"none"});
		}
		else if(/^(13[0-2]|15[5-6]|18[5-6])\d{8}$/.test($phone))
		{
			/*$htin.text("中国联通");*/
			$htin.text(" ");
			$htin.css({"display":"none"});
		}
		else if(/^(133|153|180|189)\d{8}$/.test($phone))
		{
			/*$htin.text("中国电信");*/
			$htin.text(" ");
			$htin.css({"display":"none"});
		}
		else if($phone=="")
		{
			$htin.text("手机号码不能为空");
			$htin.css({"display":"block","color":"red"});
			$(".text-box2").css({"border":"1px solid red","box-shadow":"0 0 4px 1px rgba(233,150,122,0.8)"});
		}
		else
		{
			$htin.text("手机号码不正确");
			$htin.css({"display":"block","color":"red"});
			$(".text-box2").css({"border":"1px solid red","box-shadow":"0 0 4px 1px rgba(233,150,122,0.8)"});
		}
		
	});
});

/*密码*/
$(function(){
	var $htin = $("#hint4");
	$(".text-box3 input").focus(function(){
			$htin.text("请输入登录名 , 登录名可能是您的手机号 , 邮箱或用户名");
			$htin.css({"color":"black"});
			$(".text-box3").css({"border":"1px solid lightgreen","box-shadow":"0 0 4px 1px rgba(32,157,230,0.4)"});
		});
	$(".text-box3 input").blur(function(){
		var $value = $(".text-box3 input").val();
		$(".text-box3").css({"border":"1px solid lightgreen","box-shadow":"none"});
		if($value == ""){
			$htin.text("密码不能为空 ！");
			$htin.css({"display":"block","color":"red"});
			$(".text-box3").css({"border":"1px solid red","box-shadow":"0 0 4px 1px rgba(233,150,122,0.8)"});
		}
		else if($value.length<8 || $value.length>16){
			$htin.text("密码长度在8~16位以内");
			$htin.css({"display":"block","color":"red"});
			$(".text-box3").css({"border":"1px solid red","box-shadow":"0 0 4px 1px rgba(233,150,122,0.8)"});
		}
		else if($value.length>8 || $value.length<16){
			$htin.text(" ");
			$htin.css({"display":"none"});
			$(".text-box3").css({"border":"1px solid #e0e0e0"});
		}
		
	});	
});

/*radio*/
$(function(){
	$("#radio1 input:first").bind("click",function(){
		$(".form1").hide();
		$(".form").show();
	})	
})
$(function(){
	$("#radio2 input:last").bind("click",function(){
		$(".form").hide();
		$(".form1").show();
	})	
})