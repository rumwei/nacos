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
