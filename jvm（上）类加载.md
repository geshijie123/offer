## java知识考点
![](https://user-gold-cdn.xitu.io/2019/7/8/16bd1223ec227cb4?w=923&h=713&f=png&s=282565)

### 看看你对java的理解
#### 平台无关性  （一处编译到处运行）
#### GC （jvm垃圾回收 不用像c++那样 控制指针）
#### 语言特征（封装集成多态）
#### 面向对象（万物皆对象）
#### 类库（最多类库）
#### 异常处理

### java 反编译  javap -c xxx.class 

![](https://user-gold-cdn.xitu.io/2019/7/8/16bd12e1f683c604?w=1396&h=601&f=png&s=328808)
![](https://user-gold-cdn.xitu.io/2019/7/8/16bd131b65241010?w=1315&h=630&f=png&s=237039)
![](https://user-gold-cdn.xitu.io/2019/7/8/16bd137d8aa6bb30?w=1329&h=693&f=png&s=368170)
![](https://user-gold-cdn.xitu.io/2019/7/8/16bd13ff6c2023eb?w=1346&h=57&f=png&s=36439)


![](https://user-gold-cdn.xitu.io/2019/7/8/16bd1416308f8a7e?w=961&h=534&f=png&s=177299)
### demo

![](https://user-gold-cdn.xitu.io/2019/7/9/16bd6c0bbed98715?w=492&h=312&f=png&s=30809)
![](https://user-gold-cdn.xitu.io/2019/7/9/16bd6c0eeab11fb1?w=1855&h=686&f=png&s=135184)

### classloader

![](https://user-gold-cdn.xitu.io/2019/7/9/16bd6c207826139d?w=1256&h=573&f=png&s=209458)
![](https://user-gold-cdn.xitu.io/2019/7/9/16bd6c247f3d986a?w=824&h=671&f=png&s=228177)
![](https://user-gold-cdn.xitu.io/2019/7/9/16bd6c6f71899260?w=1154&h=607&f=png&s=232689)

### 自定义myClassLoader


![](https://user-gold-cdn.xitu.io/2019/7/9/16bd6e5d10ae198c?w=706&h=611&f=png&s=78630)
![](https://user-gold-cdn.xitu.io/2019/7/9/16bd6d0bd75ea071?w=382&h=180&f=png&s=10536)
![](https://user-gold-cdn.xitu.io/2019/7/9/16bd6e3c752fad51?w=425&h=299&f=png&s=17044)
![](https://user-gold-cdn.xitu.io/2019/7/9/16bd6e42cef80d64?w=1226&h=848&f=png&s=116148)
![](https://user-gold-cdn.xitu.io/2019/7/9/16bd6e482d639d20?w=1007&h=876&f=png&s=88203)
### classloader 就是加载二进制流 然后交给后面的 检验 使用的，
### 其中用到了 try 语法糖喔



![](https://user-gold-cdn.xitu.io/2019/7/9/16bd6e775a337f63?w=942&h=753&f=png&s=570226)
![](https://user-gold-cdn.xitu.io/2019/7/9/16bd74d9d15c0b56?w=1297&h=400&f=png&s=160793)



![](https://user-gold-cdn.xitu.io/2019/7/9/16bd74ec9cd19d85?w=1004&h=487&f=png&s=89232)

![](https://user-gold-cdn.xitu.io/2019/7/9/16bd750bf7bdc82d?w=1210&h=691&f=png&s=288734)
![](https://user-gold-cdn.xitu.io/2019/7/9/16bd758916b41295?w=967&h=363&f=png&s=39599)
![](https://user-gold-cdn.xitu.io/2019/7/9/16bd758e81449456?w=1271&h=645&f=png&s=107127)
![](https://user-gold-cdn.xitu.io/2019/7/9/16bd759dafee89a8?w=1385&h=627&f=png&s=82448)

### class for name 会执行 静态代码 包括类的初始化操作 （类加载+类初始化+类装载）
### loadClass 不会执行类装载 不会初始化 不会执行静态代码块 （只有类加载）

### 举例区别 ： classforname 加载 jdbc 的driver 中，那这个driver有静态代码块就需要使用 forname这样子加载；  loadClass 比如应用启动的时候为了加快启动速度 实现懒加载就会使用loadClass这样子
