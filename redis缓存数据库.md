
![](https://user-gold-cdn.xitu.io/2019/7/4/16bbd27ef29ecc8c?w=1008&h=643&f=png&s=186667)

![](https://user-gold-cdn.xitu.io/2019/7/4/16bbd2948a809ca0?w=1226&h=598&f=png&s=178702)
![](https://user-gold-cdn.xitu.io/2019/7/4/16bbd2997f687246?w=1196&h=579&f=png&s=153048)
![](https://user-gold-cdn.xitu.io/2019/7/4/16bbd2dda58c1998?w=1348&h=601&f=png&s=268271)
![](https://user-gold-cdn.xitu.io/2019/7/4/16bbd2e3f3243d82?w=1142&h=372&f=png&s=218692)
![](https://user-gold-cdn.xitu.io/2019/7/4/16bbd2ef40f02d1a?w=1015&h=618&f=png&s=219743)
![](https://user-gold-cdn.xitu.io/2019/7/4/16bbd2f43eb24e3f?w=1018&h=556&f=png&s=162712)
![](https://user-gold-cdn.xitu.io/2019/7/4/16bbd39d99ef9764?w=1292&h=538&f=png&s=176077)

### redis 常用的数据类型
![](https://user-gold-cdn.xitu.io/2019/7/4/16bbd561a59cba80?w=1404&h=795&f=png&s=338369)
![](https://user-gold-cdn.xitu.io/2019/7/4/16bbd5c3079af09f?w=1306&h=539&f=png&s=310507)
![](https://user-gold-cdn.xitu.io/2019/7/4/16bbd5c8dbc2f5aa?w=971&h=521&f=png&s=198305)

### 操作线上模糊匹配key
![](https://user-gold-cdn.xitu.io/2019/7/4/16bbd639f9bad3a7?w=1200&h=220&f=png&s=138079)
#### keys 会返回所有 数据比较大多慢，造成卡顿，数据量多 不推荐使用
![](https://user-gold-cdn.xitu.io/2019/7/4/16bbd60b0fdfffab?w=1442&h=641&f=png&s=403951)
#### scan 指令 可以快速返回 模糊匹配数
####  java 开发 直接用set数组接收 scan 返回的集合 然后默认去重  暴力快速  例如下面
![](https://user-gold-cdn.xitu.io/2019/7/4/16bbd6681bdbbe73?w=757&h=659&f=png&s=256322)
### 1)里面 游标值  
### 2)里面 是values

### java开发可以使用jedisUtil 开发包
![](https://user-gold-cdn.xitu.io/2019/7/4/16bbd63058917dd7?w=787&h=561&f=png&s=282477)



### redis 分布式锁

![](https://user-gold-cdn.xitu.io/2019/7/4/16bbd6854b3e7d9a)

![](https://user-gold-cdn.xitu.io/2019/7/4/16bbd698ce3c6b9f)
![](https://user-gold-cdn.xitu.io/2019/7/4/16bbd69ab09aaa65)

### 设置key过期时间
![](https://user-gold-cdn.xitu.io/2019/7/4/16bbd6c98f7efdbd?w=1437&h=632&f=png&s=286454)
![](https://user-gold-cdn.xitu.io/2019/7/4/16bbd6bb96d23c6b?w=645&h=572&f=png&s=193087)


#### 原子性问题解决

![](https://user-gold-cdn.xitu.io/2019/7/4/16bbd6d9b9dd8d91?w=1312&h=638&f=png&s=262481)
![](https://user-gold-cdn.xitu.io/2019/7/4/16bbd6e7d6a33bef?w=1281&h=301&f=png&s=151546)
![](https://user-gold-cdn.xitu.io/2019/7/4/16bbd6ecf806be49?w=764&h=284&f=png&s=121177)

#### 拓展 

![](https://user-gold-cdn.xitu.io/2019/7/4/16bbd6f6026ba1b2?w=1435&h=366&f=png&s=223656)



### redis 做原子队列

![](https://user-gold-cdn.xitu.io/2019/7/4/16bbd6fd4ad5f040?w=1256&h=254&f=png&s=129409)



![](https://user-gold-cdn.xitu.io/2019/7/4/16bbd7236baaae5e?w=1338&h=533&f=png&s=194115)

![](https://user-gold-cdn.xitu.io/2019/7/4/16bbd75ccd1953fe?w=1041&h=626&f=png&s=314662)
![](https://user-gold-cdn.xitu.io/2019/7/4/16bbd726a0974d06?w=1169&h=440&f=png&s=121274)
![](https://user-gold-cdn.xitu.io/2019/7/4/16bbd7282c2e779c?w=995&h=571&f=png&s=224502)
#### 简单的 多个订阅模式 

![](https://user-gold-cdn.xitu.io/2019/7/4/16bbd7881443968b?w=1246&h=854&f=png&s=546821)
![](https://user-gold-cdn.xitu.io/2019/7/4/16bbd742d5932268?w=1043&h=339&f=png&s=107888)


### redis 持久化 

![](https://user-gold-cdn.xitu.io/2019/7/4/16bbd79682d5206c?w=1267&h=231&f=png&s=114390)
#### redis conf 配置持久化 
save 900 1  //900s有一条写入指令 产生一个快照
save 300 10 // 300s有10条写入 产生一个快照
save 60 10000 // 60s 有10000次写入  备份一下 
// save ""  -----禁用rdbcompression 

stop-writes-on-bgsave-error yes //当备份出错时 主进程停止写入操作 为了保护持久化的数据一致性 （如果系统有完善的监控系统可以关闭，一般默认开启）
rdbcompression yes // 在备份的时候 先压缩 再备份  （会占用cpu使用率  如果禁用  添加 save "" 就可以禁用了 ）


![](https://user-gold-cdn.xitu.io/2019/7/4/16bbd83a68b1e241?w=955&h=349&f=png&s=163581)
![](https://user-gold-cdn.xitu.io/2019/7/4/16bbd8383139937d?w=424&h=533&f=png&s=139162)


![](https://user-gold-cdn.xitu.io/2019/7/4/16bbd8449fbc2367?w=915&h=451&f=png&s=136940)
子进程 不会直接复制所有的主进程的数据 而是公用一个空间，只有数据不同时 会虚拟化一个空间出来 

![](https://user-gold-cdn.xitu.io/2019/7/4/16bbd866b2494d8e?w=963&h=427&f=png&s=369132)

![](https://user-gold-cdn.xitu.io/2019/7/4/16bbd85620211f7e?w=942&h=569&f=png&s=137024)
![](https://user-gold-cdn.xitu.io/2019/7/4/16bbd87b2081d078?w=455&h=293&f=png&s=55953)

![](https://user-gold-cdn.xitu.io/2019/7/4/16bbd88ed7198455?w=1139&h=496&f=png&s=123780)


### AOF持久化 

![](https://user-gold-cdn.xitu.io/2019/7/4/16bbd89d4d3c4903?w=1035&h=376&f=png&s=132896)
#### AOf默认是关闭的 如何打开
conf 里面的 appendonly no 改为 yes 
appendfilename "appendonly.aof" // 默认保存的文件的名字
appendfsync everysec // always  每个操作实例化到磁盘  everysec（默认） 没秒同步一次  no 就是不了

![](https://user-gold-cdn.xitu.io/2019/7/4/16bbd8fd9cd66c6f?w=594&h=350&f=png&s=106084)
![](https://user-gold-cdn.xitu.io/2019/7/4/16bbd9054a75b0dd?w=724&h=657&f=png&s=275340)


![](https://user-gold-cdn.xitu.io/2019/7/4/16bbd91b3621b199?w=1157&h=589&f=png&s=243769)

![](https://user-gold-cdn.xitu.io/2019/7/4/16bbd93334b38450?w=1020&h=556&f=png&s=93599)

### 文件恢复数据 （重启即可）
    
![](https://user-gold-cdn.xitu.io/2019/7/4/16bbd93bee4a069a?w=876&h=637&f=png&s=136496)

### RDB AOF 优缺点

![](https://user-gold-cdn.xitu.io/2019/7/4/16bbd94b39ced4f6?w=1092&h=524&f=png&s=178714)


![](https://user-gold-cdn.xitu.io/2019/7/4/16bbd95abf122059?w=1031&h=636&f=png&s=182907)
![](https://user-gold-cdn.xitu.io/2019/7/4/16bbd97484c00a10?w=1036&h=397&f=png&s=74830)


### redis Pipeline
![](https://user-gold-cdn.xitu.io/2019/7/4/16bbd9919096872f?w=928&h=529&f=png&s=153064)
#### Pipeline 就跟 批量插入数据库数据一样  合并访问接口一样  减少 io次数  减少 每一次的提交返回，  大大的提高性能
### redis 主从 哨兵 同步机制

![](https://user-gold-cdn.xitu.io/2019/7/4/16bbd9d74f278241?w=1091&h=597&f=png&s=150766)

![](https://user-gold-cdn.xitu.io/2019/7/4/16bbd9e44ec49607?w=1111&h=564&f=png&s=195398)
![](https://user-gold-cdn.xitu.io/2019/7/4/16bbd9f03806e14a?w=1203&h=418&f=png&s=125907)

### 缺点 不能高可用 主redis 挂了 就gg

![](https://user-gold-cdn.xitu.io/2019/7/4/16bbda1303a53a33?w=1145&h=484&f=png&s=137705)


![](https://user-gold-cdn.xitu.io/2019/7/4/16bbda2a796674e2?w=1160&h=586&f=png&s=170377)

### redis 集群 

![](https://user-gold-cdn.xitu.io/2019/7/4/16bbda3e63a1621e?w=1128&h=433&f=png&s=136003)
![](https://user-gold-cdn.xitu.io/2019/7/4/16bbda50265f9592?w=1129&h=645&f=png&s=209906)
![](https://user-gold-cdn.xitu.io/2019/7/4/16bbda5223e3e1b2?w=883&h=557&f=png&s=163834)
![](https://user-gold-cdn.xitu.io/2019/7/4/16bbda5ec9ab76e3?w=871&h=559&f=png&s=213304)

![](https://user-gold-cdn.xitu.io/2019/7/4/16bbdb10ffca1472?w=903&h=553&f=png&s=207273)
![](https://user-gold-cdn.xitu.io/2019/7/4/16bbdb14296f9fa0?w=890&h=502&f=png&s=183207)

![](https://user-gold-cdn.xitu.io/2019/7/4/16bbda90f0dbe942?w=955&h=553&f=png&s=222828)
#### a可能会爆


![](https://user-gold-cdn.xitu.io/2019/7/4/16bbdab673275e83?w=950&h=555&f=png&s=204384)


### 总结

![](https://user-gold-cdn.xitu.io/2019/7/4/16bbdac9992ae4d3?w=1062&h=79&f=png&s=42944)
![](https://user-gold-cdn.xitu.io/2019/7/4/16bbdacf32c4f9d6?w=1097&h=133&f=png&s=45277)
