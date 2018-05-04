init
说明：
项目使用spring 4.3.16.RELEASE
使用传统的xml方式集成spring mvc、mybatis
dao层getFullSqlId需要重构
日志记录和异常处理需要加入。

add：2018-5-4：
一、增加jndi支持，两种方式：
1.在项目webapp/META-INF/目录增加context.xml,<Context>元素中增加<Resource>元素,
此时不需要向Tomcat容器中添加数据库驱动jar包和连接池jar到lib中依赖；
ps：缺点，需要修改工程中的context.xml,背离使用jndi的初衷(只对该应用有效，配置见webapp/META-INF/context.xml.bak)。
2.在Tommcat容器中的lib加入数据库驱动jar包和数据库连接池jar依赖包;
a.在server.xml的（应用部署的）上下文<Context></Context>元素中加入<Resource>的配置；
(只对该应用有效，配置见test/server.xml.01)或者test/ROOT.xml.02(该文件复制到D:\OpenSoft\apache-tomcat-8.5.20\conf\Catalina\localhost\下即可部署)
b.在D:\OpenSoft\apache-tomcat-8.5.20\conf\context.xml中配置<Resource>配置同上，见test/context.xml.03
c.在/conf/server.xml中配置全局的jndi配置,然后再/conf/context.xml中引用该配置，详细配置见server.xml.04和context.xml.05

二、spring中applicationContext.xml中配置jndi的两种方式，见配置文件resource/spring/spring-jndi.xml