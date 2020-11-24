###1、Hibernate和MyBatis。这两个框架的主要区别如下：
（1）Hibernate：是一个全表映射的框架。通常开发者只需定义好持久化对象到数据库表的映射关系，就可以通过Hibernate提供的方法完成持久层操作。开发者并不需要熟练的掌握SQL语句的编写，Hibernate会根据制定的存储逻辑，自动的生成对应的SQL，并调用JDBC接口来执行，所以其开发效率会高于MyBatis。然而Hibernate自身也存在着一些缺点，例如它在多表关联时，对SQL查询的支持较差；更新数据时，需要发送所有字段；不支持存储过程；不能通过优化SQL来优化性能等。这些问题导致其只适合在场景不太复杂且对性能要求不高的项目中使用。
（2）MyBatis：是一个半自动映射的框架。这里所谓的“半自动”是相对于Hibernate全表映射而言的，MyBatis需要手动匹配提供POJO、SQL和映射关系，而Hibernate只需提供POJO和映射关系即可。与Hibernate相比，虽然使用MyBatis手动编写SQL要比使用Hibernate的工作量大，但MyBatis可以配置动态SQL并优化SQL，可以通过配置决定SQL的映射规则，它还支持存储过程等。对于一些复杂的和需要优化性能的项目来说，显然使用MyBatis更加合适。

###2、MyBatis框架的工作执行流程如下：
（1）读取MyBatis配置文件mybatis-config.xml。
（2）加载映射文件Mapper.xml。
（3）构建会话工厂。
（4）创建SqlSession对象。
（5）使用Executor接口来操作数据库。
（6）使用MappedStatement类型的参数对映射信息进行封装。
（7）输入参数映射。
（8）输出结果映射。

