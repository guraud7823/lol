/**
 * 
 */
function Submit(frm, cmd, subcmd){
	//if(frm == null) return isNullchk(frm, false);
	frm.method = "get";
	frm.action = "/movie/"+cmd.value+"/"+subcmd.value+".do";
	frm.submit();
}
function Submit(frm, cmd, subcmd, etc){
	//if(frm == null) return isNullchk(frm, false);
	frm.method = "post";
	frm.action = "/movie/"+cmd.value+"/"+subcmd.value+".do"+etc;
	frm.submit();
}
function isNullChk(obj, alertView){ 
	if(obj == null) return alertView == false ? false : alert(obj+" 입니다.");
	if(obj == "NaN") return alertView == false ? false : alert(obj+" 입니다");
	if (new String(obj).valueOf() == "undefined")  return alertView == false ? true : alert(obj+" 입니다");
}