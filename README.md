# miller_web
###project dir struct description
|-src       
　　|-main       
　　　　|-java　　　　　application library sources - java源代码文件         
　　　　|-resources　　application library resources - 资源库，会自动复制到classes文件夹下       
　　　　|-filters　　　resources filter files - 资源过滤文件     
　　　　|-assembly　　assembly descriptor - 组件的描述配置，如何打包      
　　　　|-config　　　configuration files - 配置文件  
　　　　|-webapp　　　web application sources - web应用的目录，WEB-INF,js,css等          
　　　　|-bin　　　　　脚本库     
　　|-test       
　　　　|-java　　　　单元测试java源代码文件       
　　　　|-resources　测试需要的资源库        
　　　　|-filters　　测试资源过滤库     
　　|-site　　　　　　一些文档        
|-target　　　　　　　存放项目构建后的文件和目录，jar包,war包，编译的class文件等；Maven构建时生成的     
|-pom.xml　　　　　　工程描述文件      
|-LICENSE.txt　　　　license     
|-README.md　　　　　read me              

#create web project use java language 
##framework:
    springmvc
    spring
    mybatis
    mysql
    redis
    kafka
    storm
    spark
    hadoop
    ............
#一、构建web项目环境：
##(1)首先需要给项目变成j2ee项目,加入相应的框架就可以,并更改pom文件(用于项目查找web-info):
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-war-plugin</artifactId>
                <version>2.5</version>
                <configuration>
                    <webResources>
                        <resource>
                            <directory>web</directory>
                        </resource>
                    </webResources>
                </configuration>
            </plugin>
##(2)给pom文件加入项目需要的jar包

##(3)配置web.xml


##mysql struct 
  





