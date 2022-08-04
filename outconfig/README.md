
# 1.application文件优先级-所在位置排序
> 优先级高的会覆盖优先级低的配置
> 以下为优先级从高到低说明
    外部传参方式-特殊（指定外部文件：不会和项目内的其他配置取并集，仅以当前配置为唯一配置）
        VM外部参数：
            -Dspring.config.location=D:\github-all\lf-study-java-spring-boot-init-database-and-import-data\outconfig\application.properties
        程序参数：
            --spring.config.location=D:\github-all\lf-study-java-spring-boot-init-database-and-import-data\outconfig\application.properties
    项目内配置文件（都包含的属性，优先级高的会覆盖优先级低的，不包含的属性会取并集）
        project:/config/（项目根目录下面config文件夹里的配置文件-聚合项目也在根目录下，而不是当前子项目下）
        project:/（项目根目录下面的配置文件-聚合项目也在根目录下，而不是当前子项目下）
        classpath:/config/（Resources文件夹下面config文件夹里的配置文件）
        classpath:/（Resources文件夹下面的配置文件））




    


