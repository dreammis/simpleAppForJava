### 配置tomcat路径的方式

1. 找到conf/server.xml下找到host路径，放入其中，一般为root目录
2. 在conf/server.xml下找到host节点
```$xslt
<Context docBase="D:\pookz\simpleApp\src\com\pookz\doc" path="/simple"></Context>
docBase: 被访问文件的路径
path: 为路由

```
