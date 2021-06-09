# maven打包
1.报错Too many files with unapproved license
解答：使用 mvn clean install -DskipTests -Drat.skip=true
2.报错No compiler is provided in this environment. Perhaps you are running on a JRE rather than a JDK?
解答：在root模块的pom.xml中加入如下配置
<fork>true</fork>
<executable>
/Library/Java/JavaVirtualMachines/jdk1.8.0_192.jdk/Contents/Home/bin/javac
</executable>
3.报错failed: org.apache.maven.reporting.MavenReportException: Unsupported targetJdk value '8'
解决：注释掉maven-pmd-plugin插件配置


# naming
Nacos从1.4版本开始使用Jraft替换了自研的Raft实现，因此废弃了com.alibaba.nacos.naming.consistency.persistent.raft包下的类


# core
Nacos采用的一致性协议包括Distro协议和Raft协议。
Distro协议：针对临时数据的一致性算法，该类型协议不需要把数据存储到磁盘或者数据库中，因为临时数据通常和服务器保持一个Session会话，会话存在则数据存
           在。也对应着AP协议
Raft协议：针对非临时数据，也对应着CP协议
