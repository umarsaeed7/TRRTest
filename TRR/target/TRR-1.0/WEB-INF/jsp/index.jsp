<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html lang="en">
    <head>
        <title>Index</title>
        <link href="resources/css/bootstrap.min.css" rel="stylesheet" />
        <link href="resources/css/av-style.css" rel="stylesheet" />
        <script src="resources/js/MyTest.js"></script> 
        <script type='text/javascript' src='http://code.jquery.com/jquery-1.6.2.js'></script>
        <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8.14/jquery-ui.js"></script>
        <link rel="stylesheet" type="text/css" href="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8.14/themes/base/jquery-ui.css" />
        <link rel="stylesheet" type="text/css" href="http://trirand.com/blog/jqgrid/themes/ui.jqgrid.css" />
        <script type='text/javascript' src="http://trirand.com/blog/jqgrid/js/i18n/grid.locale-en.js"></script>
        <script type='text/javascript' src="http://trirand.com/blog/jqgrid/js/jquery.jqGrid.min.js"></script>

        <script>
            $(document).ready(function () {
                $("#btnView").click(function () {
                    var no2Eng = $("#no2Eng").val();
                    var listUrl = "rest/" + no2Eng;
                    $.getJSON(listUrl, function (data) {
                        if ((typeof (data.result) !== 'undefined') && (data.result !== null)) {
                            document.getElementById("placeholder").innerHTML = "<b>" + data.result + "</b>";
                        }
                    });
                });
            });
        </script>
    </head>
    <body>
        <div class="wrapper">
            <!-- header -->
            <header>
                <div class="line"></div>
                <div class="container">
                    <div class="col-sm-6 col-md-6 col-lg-6">
                        <div class="logo">
                            <img src="resources/images/logo.png" alt="Logo" />
                        </div>
                    </div>
                </div>
            </header>
            <!-- end header -->
            <br />
            <div class="container">
                <div class="col-sm-12 col-md-12 col-lg-12">
                    <div class="col-sm-12 col-md-12 col-lg-12 form-bg">
                        <div class="col-sm-12 col-md-12 col-lg-12">
                            <h2>Number to English</h2>
                            <div class="col-sm-12 col-md-12 col-lg-6">
                                <input name="no2Eng" id="no2Eng" class="form-control"/>
                                <input name="btnView" id="btnView" class="btn btn-bg" value="Get English" type="button" />
                                <br/><br/>
                                <div id="placeholder"></div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- footer -->
            <footer>
                <div class="container">
                    <div class="copy-right">Copyrights © 2015. All rights reserved.</div>
                </div>
            </footer> 
            <!-- end footer -->
        </div>
    </body>
</html>
