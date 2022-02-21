<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>请求失败页面</title>
    <#include "common.ftl">
    <link rel="stylesheet" href="${ctx}/css/index.css" media="all">
</head>
<body>
<div class="layui-container">
    <div>
        错误代码：${code}
        错误信息：${msg}
    </div>
</div>
<script src="${ctx}/js/index.js" charset="utf-8"></script>
</body>
</html>