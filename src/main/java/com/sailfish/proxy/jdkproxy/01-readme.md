JDK主要做一下工作：
- 获取GreetingImpl的所有接口列表
- 确定生成的代理类的类名，默认为com.sun.proxy.$ProxyXXXX;
- 根据需要实现接口信息，在代码中动态创建该Proxy类的字节码
- 将对应的字节码转换为对应的class对象
- 创建InvocationHandler实例handler，用来处理Proxy所有的方法调用
- Proxy的class对象，已创建handler对象为参数，实例化一个proxy对象