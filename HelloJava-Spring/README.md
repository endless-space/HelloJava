### Spring源码阅读笔记

spring是一个轻量级,无侵入的Java应用开发框架. spring通过下列手段简化Java应用的开发.
* 使用简单的bean的作为基本组件
* 基于面向接口和依赖注入机制实现组件解耦
* 基本AOP机制对横切逻辑进行抽象, 进一步实现逻辑解耦
* 基于各种template简化系统集成

spring框架的核心就是容器. spring框架有两种容器, 一种是BeanFactory, 一种是基于BeanFactory集成了消息, 国际化, 
资源访问能力的ApplicationContext.

#### BeanFactory
