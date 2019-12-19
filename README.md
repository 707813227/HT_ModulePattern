# HT_ModulePattern

集成开发模式和组件开发模式转换

1.首先打开Android项目的 gradle.properties 文件，然后将 isModule 改为你需要的开发模式（true/false）， 然后点击 "make project" 按钮同步项目；



2.切换android app可以运行单独的组件



项目结构




结构介绍


app组件功能

app组件是空壳工程

1.配置整个项目的Gradle脚本，例如 混淆、签名等

2.app组件中可以初始化全局的库

3.添加 multiDex 功能

4.业务组件管理



common组件功能（功能组件）

common组件是基础库

1.公用的类；例如：网络请求、图片加载、工具类、base类等等；

2.第三方sdk

3.声明APP需要的权限；

4.定义全局通用的主题；

5.values/string

6.assets



main组件功能（业务组件）

1.声明android.intent.category.LAUNCHER

2.SplashActivity

3.MainActivity



a/b组件功能（业务组件）

这两个组件都是业务组件，根据产品的业务逻辑独立成一个组件



组件化实施流程

一：组件模式和集成模式的转换

Android Studio中的Module主要有两种属性，分别为：

1、application属性，可以独立运行的Android程序，也就是我们的APP；

2、library属性，不可以独立运行，一般是Android程序依赖的库文件；

在Android项目中的任何一个build.gradle文件中都可以把gradle.properties中的常量读取出来，我们在gradle.properties中定义一个常量值 isModule（是否是组件开发模式，true为是，false为否）：

业务组件的build.gradle中读取 isModule，但是 gradle.properties 还有一个重要属性： gradle.properties 中的数据类型都是String类型，使用其他数据类型需要自行转换；也就是说我们读到 isModule 是个String类型值，而我们需要的是Boolean值，代码如下



二：组件之间AndroidManifest合并问题

组件要想单独运行就需要一个launch，那么合并的时候就会有多个launch。我们可以在main文件夹下创建一个module文件，创建一个AndroidManifest.xml，然后根据isModule指定AndroidManifest.xml的文件路径，让业务组件在集成模式和组件模式下使用不同的AndroidManifest.xml，在业务组件的 build.gradle 中指定表单的路径，这样表单冲突的问题就可以规避了。





三：组件之间调用和通信

在common组件下依赖

api 'com.alibaba:arouter-api:1.3.1'
annotationProcessor 'com.alibaba:arouter-compiler:1.1.4'
我们使用阿里ARouter作为路由

使用方法如下：

1.在业务组件下依赖

annotationProcessor 'com.alibaba:arouter-compiler:1.1.4'
2.在需要跳转的activity上添加注解@Route(path = "/a/activity")



3.跳转指定的activity

ARouter.getInstance().build("/a/activity").navigation()




