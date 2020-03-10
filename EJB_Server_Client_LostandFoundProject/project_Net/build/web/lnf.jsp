<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
  <script src="http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script>
  <title>www.jb51.net jQuery模糊匹配查询</title>
  <style type="text/css">
    #div_main {
      margin: 0 auto;
      width: 300px;
      height: 400px;
      border: 1px solid black;
      margin-top: 50px;
    }
    #div_txt {
      position: relative;
      width: 200px;
      margin: 0 auto;
      margin-top: 40px;
    }
     #div_button {
      position: relative;
      width: 200px;
      margin: 40px ;
      margin-top: 90px;
    }
    #txt1 {
      width: 99%;
    }
    #div_items {
      position: relative;
      width: 100%;
      height: 200px;
      border: 1px solid #66afe9;
      border-top: 0px;
      overflow: auto;
      display: none;
    }
    .div_item {
      width: 100%;
      height: 20px;
      margin-top: 1px;
      font-size: 13px;
      line-height: 20px;
    }
  </style>
</head>
<body>
  <div id="div_main">
    <!--表单的autocomplete="off"属性设置可以阻止浏览器默认的提示框-->
    <form action="liststuff" method="Post" autocomplete="off">
      <div id="div_txt">
        <!--要模糊匹配的文本框-->
        <input type="text" id="txt1"name="txt1" />
        <!--模糊匹配窗口-->
        <div id="div_items">
          <div class="div_item">bag</div>
          <div class="div_item">BAG</div>
          <div class="div_item">backpack</div>
          <div class="div_item">BACKPACK</div>
          <div class="div_item">key</div>
          <div class="div_item">KEY</div>
          <div class="div_item">wallet</div>
          <div class="div_item">WALLET</div>
          <div class="div_item">mobile phone</div>
          <div class="div_item">MOBILE PHONE</div>
          <div class="div_item">cup</div>
          <div class="div_item">CUP</div>
          <div class="div_item">pants</div>
          <div class="div_item">PANTS</div>
          <div class="div_item">shoes</div>
          <div class="div_item">SHOES</div>
          <div class="div_item">towel</div>
          <div class="div_item">TOWEL</div>
          <div class="div_item">scarf</div>
          <div class="div_item">SCARF</div>
          <div class="div_item">watch</div>
          <div class="div_item">WWATCH</div>
          <div class="div_item">hat</div>
          <div class="div_item">HAT</div>
          <div class="div_item">glassess</div>
          <div class="div_item">GLESSESS</div>
          <div class="div_item">lunch box</div>
          <div class="div_item">LUNCH BOX</div>
          <div class="div_item">food</div>
          <div class="div_item">FOOD</div>
          <div class="div_item">mouse</div>
          <div class="div_item">MOUSE</div>
          <div class="div_item">box</div>
          <div class="div_item">BOX</div>   
              
        </div>
      </div>
        <p><button type="submit" id="button"name="button" value="submit">search</button> </p>
        
        <p><button type="submit" id="button2"name="button" value="submit2">list all stuff</button> </p>
    </form>
  </div>
   
</body>
</html>
<script type="text/javascript">
  //弹出列表框
  $("#txt1").click(function () {
    $("#div_items").css('display', 'block');
    return false;
  });
  //隐藏列表框
  $("body").click(function () {
    $("#div_items").css('display', 'none');
  });
  //移入移出效果
  $(".div_item").hover(function () {
    $(this).css('background-color', '#1C86EE').css('color', 'white');
  }, function () {
    $(this).css('background-color', 'white').css('color', 'black');
  });
  //文本框输入
  $("#txt1").keyup(function () {
    $("#div_items").css('display', 'block');//只要输入就显示列表框
    if ($("#txt1").val().length <= 0) {
      $(".div_item").css('display', 'block');//如果什么都没填，跳出，保持全部显示状态
      return;
    }
    $(".div_item").css('display', 'none');//如果填了，先将所有的选项隐藏
    for (var i = 0; i < $(".div_item").length; i++) {
      //模糊匹配，将所有匹配项显示
      if ($(".div_item").eq(i).text().substr(0, $("#txt1").val().length) == $("#txt1").val()) {
        $(".div_item").eq(i).css('display', 'block');
      }
    }
  });
  //项点击
  $(".div_item").click(function () {
    $("#txt1").val($(this).text());
  });
</script>