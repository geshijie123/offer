### jvm自动化的解决了俩个问题
### 对象内存分配的问题  回收分配给对象的内存问题
 
![](https://user-gold-cdn.xitu.io/2019/7/11/16be164b58e50946?w=1030&h=458&f=png&s=115343)
![](https://user-gold-cdn.xitu.io/2019/7/11/16be165cc73c3722?w=1352&h=390&f=png&s=166639)
![](https://user-gold-cdn.xitu.io/2019/7/11/16be1663c7611187?w=1017&h=425&f=png&s=118319)
![](https://user-gold-cdn.xitu.io/2019/7/11/16be16734f284ea4?w=727&h=220&f=png&s=106744)
![](https://user-gold-cdn.xitu.io/2019/7/11/16be16751353c729?w=798&h=364&f=png&s=205739)
### 引用标记算法 无法对循环标记的对象进行回收


![](https://user-gold-cdn.xitu.io/2019/7/11/16be1686d36a4db9?w=1284&h=211&f=png&s=107622)
![](https://user-gold-cdn.xitu.io/2019/7/11/16be168a8e01166b?w=614&h=486&f=png&s=70376)
![](https://user-gold-cdn.xitu.io/2019/7/11/16be169e0fbb541e?w=1070&h=606&f=png&s=185656)


![](https://user-gold-cdn.xitu.io/2019/7/11/16be16ab391615a8?w=1306&h=298&f=png&s=130147)
![](https://user-gold-cdn.xitu.io/2019/7/11/16be16bea21426b7?w=948&h=530&f=png&s=112242)



![](https://user-gold-cdn.xitu.io/2019/7/11/16be16c5790d59b8?w=1134&h=494&f=png&s=132482)

### 年轻代 一般用 复制算法
![](https://user-gold-cdn.xitu.io/2019/7/11/16be16ccb070cc4a?w=1392&h=608&f=png&s=212739)


![](https://user-gold-cdn.xitu.io/2019/7/11/16be16d7a623d23e?w=1400&h=400&f=png&s=167130)
### 老年代 一般用标记整理算法


![](https://user-gold-cdn.xitu.io/2019/7/11/16be16de343cdff4?w=1271&h=607&f=png&s=154599)

![](https://user-gold-cdn.xitu.io/2019/7/11/16be16e6ce91c0cb?w=1378&h=306&f=png&s=119369)


![](https://user-gold-cdn.xitu.io/2019/7/11/16be16ed968d1456?w=825&h=479&f=png&s=184281)
### jdk 67  有老年代


![](https://user-gold-cdn.xitu.io/2019/7/11/16be16f3958f6158?w=912&h=434&f=png&s=180548)
![](https://user-gold-cdn.xitu.io/2019/7/11/16be17095f492933?w=1338&h=423&f=png&s=46301)
### Minor GC 对年轻代使用的gc
### Full GC 对老年代用的gc


![](https://user-gold-cdn.xitu.io/2019/7/11/16be1857de771a7d?w=1162&h=120&f=png&s=93210)
![](https://user-gold-cdn.xitu.io/2019/7/11/16be1745530f94b8?w=1372&h=471&f=png&s=166037)



![](https://user-gold-cdn.xitu.io/2019/7/11/16be17b4b4db848a?w=1235&h=632&f=png&s=124410)
![](https://user-gold-cdn.xitu.io/2019/7/11/16be17c618b9d57d?w=1268&h=651&f=png&s=138276)
![](https://user-gold-cdn.xitu.io/2019/7/11/16be17d032b54365?w=1235&h=655&f=png&s=113839)
![](https://user-gold-cdn.xitu.io/2019/7/11/16be17e6eae754a4?w=1211&h=632&f=png&s=134278)
![](https://user-gold-cdn.xitu.io/2019/7/11/16be17fd99f7631b?w=1284&h=640&f=png&s=174182)
![](https://user-gold-cdn.xitu.io/2019/7/11/16be180a2cc721de?w=1257&h=647&f=png&s=124216)
## 七 又又来了一批 省略 看八 
![](https://user-gold-cdn.xitu.io/2019/7/11/16be1829b9c30c6e?w=1255&h=652&f=png&s=165068)
![](https://user-gold-cdn.xitu.io/2019/7/11/16be183782618705?w=1295&h=664&f=png&s=120641)

### 当一个对象被标记 15次 会进入老年区   ！！！！！

![](https://user-gold-cdn.xitu.io/2019/7/11/16be186637f7f900?w=1266&h=404&f=png&s=132044)
![](https://user-gold-cdn.xitu.io/2019/7/11/16be187a6364eda5?w=1375&h=489&f=png&s=171249)
![](https://user-gold-cdn.xitu.io/2019/7/11/16be188b5993afd1?w=1329&h=486&f=png&s=148219)
![](https://user-gold-cdn.xitu.io/2019/7/11/16be1898a16f8299?w=1207&h=380&f=png&s=61536)
![](https://user-gold-cdn.xitu.io/2019/7/11/16be191ddd345574?w=1309&h=652&f=png&s=245645)



![](https://user-gold-cdn.xitu.io/2019/7/11/16be192b1d9acfed?w=1419&h=394&f=png&s=135711)
### gc是守护线程 gc时 出了gc线程 剩下线程全部暂停   需求:高吞吐 低停顿

![](https://user-gold-cdn.xitu.io/2019/7/11/16be195d35f09954?w=1301&h=571&f=png&s=141655)


![](https://user-gold-cdn.xitu.io/2019/7/11/16be197c5b2d0003?w=1136&h=523&f=png&s=64966)
![](https://user-gold-cdn.xitu.io/2019/7/11/16be196b6706c24b?w=966&h=166&f=png&s=92835)



![](https://user-gold-cdn.xitu.io/2019/7/11/16be19898aa9da16?w=1061&h=730&f=png&s=201718)


![](https://user-gold-cdn.xitu.io/2019/7/11/16be1999b2b98558?w=1236&h=768&f=png&s=317197)
![](https://user-gold-cdn.xitu.io/2019/7/11/16be19a504538741?w=1162&h=628&f=png&s=273839)
![](https://user-gold-cdn.xitu.io/2019/7/11/16be19cc4925a04f?w=1403&h=643&f=png&s=300084)



![](https://user-gold-cdn.xitu.io/2019/7/11/16be19d87df5d4d7?w=1297&h=724&f=png&s=303095)
![](https://user-gold-cdn.xitu.io/2019/7/11/16be19e9d50ea812?w=1403&h=609&f=png&s=172014)
![](https://user-gold-cdn.xitu.io/2019/7/11/16be1a2b374ad8bb?w=1367&h=661&f=png&s=376829)
![](https://user-gold-cdn.xitu.io/2019/7/11/16be1a2d34df0052?w=1151&h=368&f=png&s=169976)



![](https://user-gold-cdn.xitu.io/2019/7/11/16be1a412d1b231a?w=1458&h=661&f=png&s=219908)
![](https://user-gold-cdn.xitu.io/2019/7/11/16be1a56f1bf6b61?w=1314&h=532&f=png&s=172908)
![](https://user-gold-cdn.xitu.io/2019/7/11/16be1a77e36211d2?w=1417&h=602&f=png&s=190956)



![](https://user-gold-cdn.xitu.io/2019/7/11/16be1a89ffaf81ce?w=1355&h=676&f=png&s=259716)
![](https://user-gold-cdn.xitu.io/2019/7/11/16be1ad74fc7c9e3?w=686&h=205&f=png&s=122182)
![](https://user-gold-cdn.xitu.io/2019/7/11/16be1ad2d75eeb5d?w=1263&h=581&f=png&s=598898)



![](https://user-gold-cdn.xitu.io/2019/7/11/16be1ae6dee8f2d5?w=1469&h=566&f=png&s=317084)
![](https://user-gold-cdn.xitu.io/2019/7/11/16be1af62f1e6f2e?w=1296&h=510&f=png&s=252505)
![](https://user-gold-cdn.xitu.io/2019/7/11/16be1b02e3298bd1?w=1106&h=578&f=png&s=264072)
![](https://user-gold-cdn.xitu.io/2019/7/11/16be1b107fc7a891?w=1302&h=613&f=png&s=333859)
![](https://user-gold-cdn.xitu.io/2019/7/11/16be1b2838c1b400?w=1302&h=618&f=png&s=234649)
![](https://user-gold-cdn.xitu.io/2019/7/11/16be1b341c73023e?w=1259&h=601&f=png&s=90525)
![](https://user-gold-cdn.xitu.io/2019/7/11/16be1bd1c29fd709?w=1357&h=317&f=png&s=150821)

## 总结
### java垃圾回收  
### 被判定为垃圾的标准 ：及不再被引用的对象成为垃圾
### 标记垃圾的算法  ：引用计数器   可达性分析
### 垃圾回收的算法 ： 标记清理算法   复制算法  标记整理算法  组合起来的分代收集算法
### gc的分类   minor GC   Full GC
### 年轻代的垃圾收集  eden from to  8:1:1   
### 如何从年轻代晋升到老年代   过大 或者 被引用15+
###  调优参数 
###  老年代的垃圾收集   标记清理算法 标记整理算法  
### 触发 full GC 条件
### 常见的垃圾收集器  G1  CMS  
#### jvm运行模式 等等 
