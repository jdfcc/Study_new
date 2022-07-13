# 判断进程数据是否安全的依据：
# 是否是多线程环境；
# 是否有多个线程共享一个数据；
# 是否有多条语句对数据进行操作。
# 可用synchronized（new Object){...}语句对操作共享数据代码块给锁起来。
# 同步方法：
# 定义格式： 修饰符 synchronized 方法名（方法参数）{}
# 同步方法的锁的对象是this
# 同步静态方法的锁的对象是该类的字节码文件对象（类名.Class）
# 线程安全类 Vector(代替ArrayList);StringBuffer(代替StringBuilder);HashTable(代替HasMap);
# 在使用Lock锁时由于代码块可能会出问题故使用try{lock.Lock();}finally{lock.unlock}的方式来使用Lock锁。
# Lock lk=new ReentrantLock();
