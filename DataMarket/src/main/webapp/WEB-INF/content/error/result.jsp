<%@ page contentType="text/html; charset=UTF-8" language="java" errorPage="" %>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>结果</title>
</head>
<body>
    <form  role="form" action="search_s" method="post">
        <div>
            <label>builder</label>
        </div>
        <input type="text" name="builder">
        <div>
            <label>model</label>           
        </div>
         <input type="text" name="model">
        <div>
            <label>type</label>
        </div>
        <input type="text" name="type">
        <div>
            <label>backWood</label>
        </div>
        <input type="text" name="backWood">
        <div>
            <label>topWood</label>
        </div>
        <input type="text" name="topWood">
            <button type="submit">查询</button>
    </form>
</body>