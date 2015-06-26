//function getCookie(cname) {
//    var name = cname + "=";
//    var ca = document.cookie.split(';');
//    for (var i = 0; i < ca.length; i++) {
//        var c = ca[i];
//        while (c.charAt(0) == ' ')
//            c = c.substring(1);
//        if (c.indexOf(name) != -1)
//            return c.substring(name.length, c.length);
//    }
//    return "";
//}
//function checkCookie() {
//    alert('sdfsdfds');
//    uniqueIdentifier = getCookie('uniqueIdentifier');
//    roleType = getCookie('RoleType');
//    if (uniqueIdentifier != null && uniqueIdentifier != "null" && roleType != null && roleType != "null") {
//        window.location = "${pageContext.request.contextPath}/loginPage";
//    }
//}
//window.focus = checkCookie();