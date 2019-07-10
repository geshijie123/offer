
![](https://user-gold-cdn.xitu.io/2019/7/10/16bdc20d097d857c?w=1170&h=607&f=png&s=235040)
![](https://user-gold-cdn.xitu.io/2019/7/10/16bdc21869e55ffc?w=1185&h=724&f=png&s=261810)
![](https://user-gold-cdn.xitu.io/2019/7/10/16bdc229bf0f4d78?w=1124&h=632&f=png&s=261893)


![](https://user-gold-cdn.xitu.io/2019/7/10/16bdc23ad1a28c5b?w=1310&h=579&f=png&s=229241)

![](https://user-gold-cdn.xitu.io/2019/7/10/16bdc24838114e59)
![](https://user-gold-cdn.xitu.io/2019/7/10/16bdc2550dc256fc?w=1147&h=640&f=png&s=138920)
![](https://user-gold-cdn.xitu.io/2019/7/10/16bdc29981d7d03e?w=784&h=392&f=png&s=136184)
![](https://user-gold-cdn.xitu.io/2019/7/10/16bdc2ab84f93d7c?w=1420&h=726&f=png&s=514037)
![](https://user-gold-cdn.xitu.io/2019/7/10/16bdc2b5533817ef?w=1330&h=741&f=png&s=390738)
![](https://user-gold-cdn.xitu.io/2019/7/10/16bdc2dca38c3503?w=1113&h=543&f=png&s=200453)

![](https://user-gold-cdn.xitu.io/2019/7/10/16bdc319c5f34efa?w=1474&h=599&f=png&s=165866)


![](https://user-gold-cdn.xitu.io/2019/7/10/16bdc329bed5e536?w=1188&h=95&f=png&s=49830)


### 斐波那契数列  优雅实现 （需要加个负数判断）

![](https://user-gold-cdn.xitu.io/2019/7/10/16bdc363bf2cd606?w=974&h=540&f=png&s=400552) 

### 当 参数太大的时候 会 stackOverflowError

![](https://user-gold-cdn.xitu.io/2019/7/10/16bdc48a171b3bc1?w=1198&h=661&f=png&s=266132)
![](https://user-gold-cdn.xitu.io/2019/7/10/16bdc48d48fb489a?w=1189&h=68&f=png&s=56318)
![](https://user-gold-cdn.xitu.io/2019/7/10/16bdc49580b3ff89?w=1075&h=501&f=png&s=262092)
![](https://user-gold-cdn.xitu.io/2019/7/10/16bdc4a63400264a?w=1145&h=217&f=png&s=60934)
![](https://user-gold-cdn.xitu.io/2019/7/10/16bdc4d90d5496ca?w=1206&h=385&f=png&s=138642)
![](https://user-gold-cdn.xitu.io/2019/7/10/16bdc4e98218a767?w=1276&h=508&f=png&s=215240)
![](https://user-gold-cdn.xitu.io/2019/7/10/16bdc543ce9ce1ef?w=1378&h=520&f=png&s=164483)



![](https://user-gold-cdn.xitu.io/2019/7/10/16bdc54ca7eb9530?w=1036&h=224&f=png&s=93209)

![](https://user-gold-cdn.xitu.io/2019/7/10/16bdc5571ffd3a04?w=964&h=275&f=png&s=80486)
![](https://user-gold-cdn.xitu.io/2019/7/10/16bdc56e00a858ef?w=1313&h=384&f=png&s=209699)
![](https://user-gold-cdn.xitu.io/2019/7/10/16bdc5812e1bd6fd?w=605&h=448&f=png&s=79479)
![](https://user-gold-cdn.xitu.io/2019/7/10/16bdc5a08f1e0326?w=1220&h=609&f=png&s=188662)



![](https://user-gold-cdn.xitu.io/2019/7/10/16bdc5afbf1c9c35?w=1035&h=629&f=png&s=307522)
![](https://user-gold-cdn.xitu.io/2019/7/10/16bdc5bf754b33c1?w=1093&h=515&f=png&s=191078)



![](https://user-gold-cdn.xitu.io/2019/7/10/16bdc5d157f6fb6c?w=1199&h=633&f=png&s=685586)
![](https://user-gold-cdn.xitu.io/2019/7/10/16bdc643ffcce662?w=1139&h=621&f=png&s=495772)

### "a"  是堆中的静态常量区  intern后 堆内存也会创建副本
所以 s == s2  为false （因为常量区  跟 堆区 地址不同）

### jdk6之后 可以吧 堆中的引用放进常量区 （之前会复制副本 ，复制多了撑爆内存） s3 是会在堆中创建“aa” 用 intern之后  吧堆中"aa"的引用放入静态区   s4 引用静态区的"aa" 发现 aa已经有了 所以会直接引用 这个地址 所以是 true ~~~
