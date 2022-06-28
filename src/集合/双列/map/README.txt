储存的键唯一，一个键唯一对应一个值.

Map<String,String> ma=new HashMap<>();
获取所有键的集合:Set<String> se=ma.keySet();
获取所有值的集合:Collection<String> co=ma.values();
遍历方法一:获取map中的key并将他存储在集合里面，再利用增强for循环和get()方法获得map中的value以达到遍历的目的。
遍历方法二:使用Set<Map.Entry<>>方法可获得键与值的所有集合(包括因键值相同而被覆盖的)。再利用增强for循环遍历的同时使用getKey()和getValue()方法可取得所有的key和value

