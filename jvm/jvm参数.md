### 常用组合
```
-Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:+HeapDumpOnOutOfMemoryError
```

### GC相关
```
-XX:+PrintGCDetails 启用垃圾回收日志
-XX:+PrintGCTimeStamps 打印垃圾回收时间信息时的时间格式
```

### 堆空间相关
```
-xms 初始堆内存
-xmx 最大堆内存
-xmn 年轻代内存
XX:PermSize 初始持久代内存
-XX:MaxPermSize 最大持久代内存
-XX:SurvivorRatio=8 Eden空间与From Survivor空间的比例
-XX:NewRatio=3 设置新生代和年老代的比值
```

### 垃圾收集器相关
```
-XX:+UseSerialGC
```