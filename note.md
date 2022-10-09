10/7 Springboot整合MyBatisPlus

10/8 1 配置yml,注意要把MybatisPlusApplication放在和pojo等包的同目录下，不然会无法注入bean
     2 创建Mapper并测试crud
     3 创建Service并测试crud
     4 注解@TableId和@TableName,逐渐生成策略
     5 注解@TableLogic可以实现逻辑删除，但数据表要添加一个字段logic_id，类型为int，默认值是0（表示未删除）。
       进行操作删除后，实质上是把logic_id设置为1,。进行select操作时where的条件是logic_id = 0。

10/9 1 分页功能、锁功能、配置多数据源
     2 Wrapper
     3 MybatisX插件快速生成mapper、service、xml以及crud