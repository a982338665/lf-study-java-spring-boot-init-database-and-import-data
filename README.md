# spring-boot-init-database-and-import-data
# springboot 初始化数据库 和 导入数据
**1.jpa+spring.database:/schema/data:**
    
    1.jpa进行数据表创建
    2.schema/data.sql 进行数据初始化、此处也可将建表语句添加至schema.sql,关闭jpa建表
    
**2.自动执行需要初始化的操作:**

    0.博客：https://blog.csdn.net/ming19951224/article/details/81156904
    0.博客：https://blog.csdn.net/pjmike233/article/details/81908540
    1.添加监听任务：
        1.所在包:listener/
    2.默认监听任务：
        1.ApplicationRunner  spring-boot-database-init-applicationrunner
        2.CommandLineRunner  spring-boot-database-init-other-listener
        可以同时使用ApplicationRunner和CommandLineRunner，
        默认情况下前者比后者先执行，但是这没有必要，使用一个就好了
        3.两者的联系与区别:
            两个接口都有run()方法，只不过它们的参数不一样，
            CommandLineRunner的参数是最原始的参数，没有进行任何处理，
            ApplicationRunner的参数是ApplicationArguments,
            是对原始参数的进一步封装
        