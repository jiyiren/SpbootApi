
# SpbootApi

 这个仓库主要是集成Spring-boot,Spring-mvc,Mysql,[Mybatis](http://www.mybatis.org/mybatis-3/zh/index.html),C3p0,[Swagger2](https://swagger.io/)的项目架构,为便于每次新建项目不用从零开始,直接基于此项目结构可快速地进行项目二次开发,免去了pom内容的复制和配置文件的编写。

### 整体项目结构

![arc](http://7xknpe.com1.z0.glb.clouddn.com/spbootapi-arc.png)


### Swagger API UI页面
> 默认访问地址:*http://127.0.0.1:8899/swagger-ui.html*

![ui](http://7xknpe.com1.z0.glb.clouddn.com/spbootapi-swaggerui.png)

### Demo接口
> 测试接口:*http://127.0.0.1:8899/user/1*

![json](http://7xknpe.com1.z0.glb.clouddn.com/spbootapi-json.png)

### 二次开发实践

* 下载项目
	* `git clone https://github.com/jiyiren/SpbootApi.git`
* 命令运行项目
	* `cd SpbootApi`
	* `mvn spring-boot:run` 
* IDE运行项目(推荐Intellij IDEA)
	* 打开ApiApplication.class，内部包含main函数
	* 右击`Run ApiApplication`
* 测试
	* 访问:[http://127.0.0.1:8899](http://127.0.0.1:8899) 返回**Hello World!**
	* 访问:[http://127.0.0.1:8899/user/1](http://127.0.0.1:8899/user/1) 返回json数据
* 修改包名(下面为包含包名的文件)
	* `resources/application.propertis`: 项目总配置文件
	* `java/包名/Swagger2.class`:swagger-ui配置文件
	* `java/包名/c3p0/C3p0AutoConfiguration.class`: c3p0连接池配置文件

### POM依赖包

```xml
<parent>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-parent</artifactId>
	<version>1.5.4.RELEASE</version>
	<relativePath/> <!-- lookup parent from repository -->
</parent>
<!--properties-->
<properties>
	<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
	<project.reporting.outputEncoding>UTF-8</project.reporting.outputEncoding>
	<java.version>1.8</java.version>
	<jacksonVersion>2.8.8</jacksonVersion>
	<c3p0Version>0.9.5.2</c3p0Version>
</properties>
<dependencies>
	<!-- web -->
	<dependency>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-web</artifactId>
	</dependency>
	
	<!--jdbc-->
	<dependency>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-jdbc</artifactId>
	</dependency>
	
	<!--aop-->
	<dependency>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-aop</artifactId>
	</dependency>
	
	<!--测试-->
	<dependency>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-test</artifactId>
		<scope>test</scope>
	</dependency>
	
	<!-- mysql包 -->
	<dependency>
		<groupId>mysql</groupId>
		<artifactId>mysql-connector-java</artifactId>
	</dependency>
	
	<!--jackson包 jackson-core,jackson-databind,jackson-annotations -->
	<dependency>
		<groupId>com.fasterxml.jackson.core</groupId>
		<artifactId>jackson-databind</artifactId>
		<version>${jacksonVersion}</version>
	</dependency>
	
	<!--mybatis-->
	<dependency>
		<groupId>org.mybatis.spring.boot</groupId>
		<artifactId>mybatis-spring-boot-starter</artifactId>
		<version>1.2.0</version>
	</dependency>
	
	<!-- c3p0 和 mchange-commons-java -->
	<dependency>
		<groupId>com.mchange</groupId>
		<artifactId>c3p0</artifactId>
		<version>${c3p0Version}</version>
	</dependency>
	
	<!-- swagger -->
	<dependency>
		<groupId>io.springfox</groupId>
		<artifactId>springfox-swagger2</artifactId>
		<version>2.2.2</version>
	</dependency>
	<dependency>
		<groupId>io.springfox</groupId>
		<artifactId>springfox-swagger-ui</artifactId>
		<version>2.2.2</version>
	</dependency>
</dependencies>
<build>
	<plugins>
	<plugin>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-maven-plugin</artifactId>
	</plugin>
</plugins>
</build>
```
