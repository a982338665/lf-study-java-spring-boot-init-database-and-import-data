> 1.测试maven打包时，通过profile选择进行打包
> 2.测试插件使用

# 1.测试profile-打包

## 1.idea右侧maven插件图形化打包

    1.pom.xml添加标签 <project>下
        <profiles>
        <profile>
            <!--id表示激活指定的唯一命名ID，activation表示激活方面的配置，-->
            <id>dev</id>
            <properties>
                <!--使用${environment}获取值-->
                <environment>dev</environment>
            </properties>
            <activation>
                <!--activeByDefault为True表示默认激活。-->
                <activeByDefault>true</activeByDefault>
            </activation>
        </profile>
        <profile>
            <id>test</id>
            <properties>
                <environment>test</environment>
            </properties>
        </profile>
        <profile>
            <id>prod</id>
            <properties>
                <environment>prod</environment>
            </properties>
        </profile>
        </profiles>
        <build>
            <!-- 如果需要重命名包名此处进行，否则默认 -->
            <!--        <finalName>hhInterface-xxl-${environment}</finalName>-->
            <plugins>
                <plugin>
                    <groupId>org.springframework.boot</groupId>
                    <artifactId>spring-boot-maven-plugin</artifactId>
                    <configuration>
                        <includeSystemScope>true</includeSystemScope>
                    </configuration>
                </plugin>
            </plugins>
            <resources>
                <!--排除环境配置文件-->
                <resource>
                    <directory>src/main/resources</directory>
                    <excludes>
                        <exclude>application-*.yml</exclude>
                        <exclude>application.yml</exclude>
                    </excludes>
                </resource>
    
                <resource>
                    <directory>src/main/resources</directory>
                    <filtering>true</filtering>
                    <!-- 打包时包含的文件 -->
                    <includes>
                        <!--suppress UnresolvedMavenProperty -->
                        <!--${environment} 即为profile - properties - 下的自定义标签-->
                        <include>application-${environment}.yml</include>
                        <include>application.yml</include>
                    </includes>
                </resource>
            </resources>
        </build>
    2.见img文件夹图形打包

## 2.mvn命令打包
    
    mvn clean package -Pprod -D maven.test.skip=true 
    mvn clean package -D maven.test.skip=true -P dev

## 3.启动命令

    java -jar spring-boot-application-profile-idea-assembly-test-2.1.3.RELEASE.jar --spring.profiles.active=dev
