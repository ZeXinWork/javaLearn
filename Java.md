#                                           Java

## 一、初始java

### 1、**java是一门面向对象的语言**

### 2、**java是98年sun公司的,2010年被orcle收购**

### 3、**jdk、jre和jvm**

​       **jvm是java的运行环境，java编译后的字节码文件需要放在jvm里执行，jre是jvm+ 核心文件可以用来执行java文件，jdk是java语言工具包(java,javac)如果要开发java则必须要有jdk**          

![](https://static.roi-cloud.com/youshu_file/youshu-enterprise-10019/2023/03/02/54d82f38-59a0-4107-86d4-6f56357e26f4.jpg)

## 二、基础语法

### 1、java的常量与变量

####        标识符

​         定义：**由字母、数字、下划线和$组成的，不能有空格**

####        变量

​         定义：**变量类型 变量名 变量值三部分组成**

​         变量类型：

​                         基础数据类型 **byte short int long  char double float boolean**

​                         引用数据类型 **class interface 数组**

![](https://static.roi-cloud.com/youshu_file/youshu-enterprise-10019/2023/03/02/288d472d-d8cf-477e-8a29-6f8f500384ee.jpg)

####       整形字面值（八进制、十进制、十六进制）

​       八进制：**以0开头的不包含8的**  023 044 077

​      十六进制：**以0x或者0X开头的 包含0-9 a-f（大小写都可）** 0x123af 0x123l（表示long型）

####       基本类型存储空间

​         java内存分为栈、堆和常量池，基本类型的值都存储在栈当中

####        Ascll码

​        一种信息交流的规范  A:65  a:97

####        Unicode编码

​        支持世界上所有字符

![](https://static.roi-cloud.com/youshu_file/youshu-enterprise-10019/2023/03/02/1f9c7424-23f0-4c8e-8e3d-1d2a3d8de26f.jpg)

#### 强制类型转换

 当一个数据的表示范围比另外一个数据大时，大转小需要需要进行强制类型转换（**可能造成精度丢失**），小转大无需强转

![](https://static.roi-cloud.com/youshu_file/youshu-enterprise-10019/2023/03/02/a23d009c-9b46-4560-86c5-da9c5718f9f1.jpg)

#### 一维数组

定义：**数组是按相同的数据类型按顺序组成的一种引用类型**

声明：int[] arr = new int[10]   定义数组的长度为10

​            int[] arr={1,2,3,4,5}       定于数组的初始值

​            数组在内存中被分配的是连续的内存空间

每种类型的数组初始化之后就有了默认值，int类型为0，对象类型的为null，**char类型为空字符，即为\u0000**

#### 增强型for循环

```java
for (int i : intArray) {
   System.out.println(i); // 打印出数组的值
}
```

#### 方法

定义：**用来执行一系列代码的语句块**

**主方法当中调用一个类的方法，必须先创建对应的类**，**因为静态方法只能调用静态成员**

```java
package com.immoc;

public class FunctionDemo1 {
    
    //无参无返回值方法
    public void printStar() {
        System.out.println("********************");
    }

    //无参有返回值
    public int getArea() {
        int width = 10;
        int height = 20;
        printStar()//这里可以直接调用不需要像主方法那样
        return width * height;
    }
    
    //有参无返回值
    public void getMax(int a, int b) {
        System.out.println(a > b ? "a" : "b");
    }
    
    //有参有返回值 算n的阶乘
    public int getFactorial(int n) {
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum = sum * i;
        }
        return sum;
    }
    
    //数组作为参数
    public boolean searchArr(int[] arr, int n) {
        boolean flag = false;
        for (int i : arr) {
            System.out.println(i);
            if (i == n) {
                flag = true;
                break; //退出循环增加效率
            }
        }
        return flag;
    }

    
    public static void main(String[] args) {
        FunctionDemo1 demo1 = new FunctionDemo1();//先创建FunctionDemo1
        demo1.printStar();
        int area = demo1.getArea(); //获取方法返回值
        demo1.getMax(1, 2);
        System.out.println(area);
        int factorial = demo1.getFactorial(2);
        System.out.println(factorial);
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum = sum + demo1.getFactorial(i);//求1+加到n的阶乘 1!+2!+..n!
        }
        System.out.println(sum);
        
        
        int[] arr = {1, 2, 3, 4, 5};
        boolean b = FunctionDemo1.searchArr(arr, 2);
        System.out.println(b);
    }
}

```

方法重载：**方法名相同，参数列表不同，返回值类型不考虑**，**修饰符不考虑**

**基本数据的传值是复制一份值传进去，传的不是地址值，就算在方法当中修改也不会影响基本数据的值**

```java
 public void addNum(int n) {
      n++;
 }

 public static void main(String[] args) {
      int a = 5;
      FunctionDemo3 functionDemo3 = new FunctionDemo3();
      functionDemo3.addNum(a);
      System.out.println(a);//仍然为5  
 }

```

引用类型的传值是直接传地址进去，在方法当中修改就会影响引用对象的值

```java
   public void changeArr(int[] arr) {
        arr[0]=10;
    }

   public static void main(String[] args) {
        int[] a = {1，2};
        FunctionDemo3 functionDemo3 = new FunctionDemo3();
        functionDemo3.changeArr(a);
        System.out.println(a[0]);//值为10 改变了地址值所以外部的变量也发生改变
    }
```

可变参数，如下图的参数a，可以遍历获取值，跟数组一样，如果此时有另外一个方法重载的参数为数组类型，则会报错

![](https://static.roi-cloud.com/youshu_file/youshu-enterprise-10019/2023/03/04/da415c4b-c84c-40d4-9b08-69ae13b65210.png)



## 三、类与对象

### 1、对象的声明与存储

定义：万物皆对象，描述具体事物的数据结构称为对象

对象的声明 ：  Person p = new Person()  =左边的称之为对象声明  =右边称为对象实例化

对象在内存当中的存储：**在栈内存当中开辟一个空间，具体的值存储在堆内存当中，基本类型都是存储在栈内存当中**

![](https://static.roi-cloud.com/youshu_file/youshu-enterprise-10019/2023/03/05/e2bca43b-adde-46cd-8e02-e1f4d2f8b6f5.png)

### 2、对象的封装

定义：将对象的属性隐藏起来，不可以在外部直接访问和操作数据，同时向外部暴露可以访问的接口

![](https://static.roi-cloud.com/youshu_file/youshu-enterprise-10019/2023/03/04/fdd65e64-13e3-4f6b-9975-3fb61a95ee20.png)

实现：用private关键字修饰变量，同时在对象当中暴露get和set方法以获取对象属性

```java
package com.imooc.animal;

public class Cat {
    private String name;
    private int age;


    public Cat() {
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Cat{name = " + name + ", age = " + age + "}";
    }
}

```

#### 3、static关键字

定义：在类当中使用static关键字定义属性和方法，该属性和方法会变成静态成员，**该属性和方法会变成共有属性**，所有实例化的对象访问该属性都是同一个值

![](https://static.roi-cloud.com/youshu_file/youshu-enterprise-10019/2023/03/05/f574ae3a-b520-41c9-af77-6c6d14df96f8.png)

```java
package com.imooc.animal;

public class Cat {
    private String name;
    private int age;
    public static int price;  //static修饰，为静态属性
}

public class CatTest {
    public static void main(String[] args) {
        Cat.price = 123; //通过类名.的方式直接获取属性并赋值
        Cat cat1 = new Cat();
        System.out.println(cat1.price);
    }
}
```

**静态方法当中只能访问静态成员**（静态属性和静态方法），**如果想访问一个对象当中的非静态成员可以实例化一个对象**

#### 4、代码块

代码块分为普通代码块、构造代码块和静态代码块

1、普通代码块就是写在方法内部的代码块，按照语句执行顺序执行的，执行完就销毁

2、构造代码块是写在对象里的，每实例化一个对象就会执行一次

3、**静态代码块也是写在对象里的，不过前面加上static关键字，不管实例化多少个对象只会执行一次**

```java
public class Cat {
    private String name;
    private int age;
    public static int price;  //static修饰，为静态属性
    
    static {
        System.out.println("我只会执行一次");
    }

    {
        System.out.println("只要实例化对象我就会执行");
    }
}

public class CatTest {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
    }
    //执行结果
    //我只会执行一次
    //只要实例化对象我就会执行
    //只要实例化对象我就会执行
}

```

```java
public void testD() {
        {
            int a = 1;
        }
        int a = 2;
        {
            int a = 3 //此处不允许在定义一个a，因为上面已经定义a为2了，在前端可以
        }
     //java当中的代码块是按照顺序执行的，每执行完一个代码块后，代码块当中的变量就会销毁，因此可以在下面定义
     //但a=2不会销毁，所以下面的代码块不能再定义a
    }
```

#### 5、对象的继承

定义：一个对象可以继承另一个对象，被继承的对象成为父类，子类可以访问父类非私有成员

**字类重写父类的方法**

![](https://static.roi-cloud.com/youshu_file/youshu-enterprise-10019/2023/03/06/85862f8d-b27d-4e0a-b962-cfe87280bc96.png)

```java
public class Animal {

    private String name;
    private int age;

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println(this.getName() + "在吃饭");
    }

    public void sleep() {
        System.out.println(this.getName() + "在睡觉");
    }

    public Animal jump() {
        System.out.println(this.getName() + "在跳跃");
        return new Animal();
    }
}


public class Dog extends Animal {
    public void sleep() {  //void + 基本返回类型 返回值必须相同
        System.out.println(this.getName() + "不想睡觉");
    }

    public Dog jump() { //自定义类型 返回值不一定需要相同 但必须是该类及其派生类
        System.out.println(this.getName() + "不想跳跃");
        return new Dog();
    }
}

```

**静态方法不可以被重写，加上重写的注解就会报错，但是可以在子类中重新定一个一样的静态方法，编译器会隔离两个类，都认为他们是单独的方法**

访问修饰符

1、private :只允许在本类当中使用

2、默认：只允许在本类和本包下使用

3、protected：只允许在本类和本包下以及跨包子类下访问

4、public: 可在任何地方访问

![](https://static.roi-cloud.com/youshu_file/youshu-enterprise-10019/2023/03/06/dff34f92-db43-45d4-9027-3e9f30c6db9c.png)

**方法重写当中的访问修饰符，必须比父类的访问范围更大**

**一个子类的实例化过程**

1、先来到子类的构造函数  ->  2、在来到父类的构造函数中  ->父类的静态代码块 ->子类的静态代码块 ->初始化父类的成员变量 ->父类构造代码块 -> 父类构造函数执行结束  ->子类成员初始化 ->子类构造代码块 ->子类构造函数执行结束

![](https://static.roi-cloud.com/youshu_file/youshu-enterprise-10019/2023/03/06/dbc000ba-49c0-44b4-b6ca-c8fa9cb5f6db.png)

**子类会默认调用父类的无参构造方法，子类可以通过super()调用父类其他可访问的构造方法，super只能用在构造方法中且必须在第一行**

![](https://static.roi-cloud.com/youshu_file/youshu-enterprise-10019/2023/03/06/f2cc2603-b0f4-459e-9b0a-e680aa3b603f.png)

**super和this**

![](https://static.roi-cloud.com/youshu_file/youshu-enterprise-10019/2023/03/06/41278928-d9a3-41bd-92d2-16067ada555c.png)

**构造函数中不能同时出现this和super**

```java
public void Animal(){
   this() //this和super只能出现一个
   super(name,age)
}
```

**Object类**

所有类的祖先类都是object类

```java
 Dog dog = new Dog();
 System.out.println(dog.equals(new Dog()));//false
 //dog类当中的equals方法继承于object类，该方法的作用是判断两个对象的地址是否相同
 String str1 = new String("123");
 String str2 = new String("123");
 System.out.println(str1.equals(str2));//true
//继承object的方法可以正常调用以及重写,string当中重写了该方法，string当中的equals方法比较的值字符串值是否相同不在时比较对象地址
```

**final**

用法：1、**当修饰类时，表示该类不可以被继承**

​            2、**修饰类当中的方法时，表示该方法不可被重写**

​            3、修饰变量时

​                  a、**修饰方法局部变量，若是基本类型，则该类型可在被使用前才赋值不需要初始化，且该值一旦赋值不能被改变**，**若是引用类型，则地址不能变，但变量当中的属性值可以发生改变**

​                  b、**修饰类当中的变量，若没有初始化，则该变量只能在构造函数或者构造代码块中被赋值**

**构造函数不能用final关键字修饰**            

**类中的成员变量用statci 和final修饰则表示不能修改只能赋值一次**      

```java
package com.imooc.animal;

/**
 * 测试final修饰类，该类不可被继承
 */
public final class AnimalFinal {
    public final String name="hh"; //只能被赋值一次
    public final void get() { //不能被重写
        System.out.println("father get");
    }
}

public class AnimalFinalTest extends AnimalFinal { //不能继承
    public void get() {
        System.out.println("son get"); //不能重写
    }
}
    
AnimalFinalTest animalFinalTest = new AnimalFinalTest();
System.out.println(animalFinalTest.get());
```

单例设计模式

定义：一个对象只能有一个实例化对象

```java
package com.imooc.animal;

/**
 * 测试单列模式
 */
public class Singleton {

    //懒汉单例模式：在需要的时候才实例化
    private static Singleton singleton;

    private Singleton Singleton() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
    
    //饿汉单例模式，在一开始就实例化
     private static Singleton singleton=new Singleton();

    private Singleton Singleton() {
       
        return singleton;
    }

}

```

#### 6、多态

定义：对象可以向上或者向下转型

​            1、**向上转换，子类可以向上转为父类**

​                  **可以调用子类重写父类的方法以及父类派生的方法**，但不能调用子类独有的方法

```java
        Animal animal = new Cat();
        animal.run();//父类方法可以直接调用
        animal.sleep();//子类方法不可直接调用
```

​             2、**向下转换，父类向下转换为子类**

​                   **可以调用子类独有方法**

```java
        Animal animal = new Cat();
        Cat cat = (Cat) animal;
        Cat cat = new Animal();//不能转，上面能转是因为animal本来指向的就是cat的实例空间现在只是给他还原回去而已
        cat.sleep(); //可以调用子类特殊方法
       
```

什么时候能转什么时候不能转，**必须有要转换的那个对象（Cat）的特性才能转**，如上面animal实际上是new Cat()出来的，所以具有cat的特性才可以向下强转，但是new Animal()没有cat的特性，所以不能转

**instanceof**

定义：判断 **instanceof左边的是不是右边的实例**

```java
      Animal animal = new Cat();
      Cat cat = (Cat) animal;
      if (animal instanceof Cat) { //animal是Cat的实例
          System.out.println("我是cat的实例");
      } 
```

**抽象类**

定义：用来规范子类标准的类成为抽象类，抽象类不能实例化，子类必须实现抽象类当中定义的抽象方法

```java
public abstract class AbAnimal {  
    public abstract void eat(); //子类必须实现该抽象方法 不能用private final static关键字修饰 因为private只能在本类当中使用,final和static不能被重写
}

```

![](https://static.roi-cloud.com/youshu_file/youshu-enterprise-10019/2023/03/13/091ab924-87c2-41e7-8a9c-de76154c1661.png)

![](https://static.roi-cloud.com/youshu_file/youshu-enterprise-10019/2023/03/13/76b03336-8f81-41fc-a88c-62da52ecceb0.png)

#### 7、接口

定义：**用来约束类的规范**，**类实现了这个接口，就必须重写所有的抽象方法**，**否则需要将该类修饰成抽象类**

```java
        package com.imooc;

        /**
         * 测试接口
         */
        public interface Inet {
        
        //接口当中可以包含常量
        // 默认public static final
        int tmp = 20;
        
        //定义抽象方法
           void network();
           void connection();
            
        //默认方法，子类无需重写
         default void open(){
            System.out.println("open");
           }
        }

      
      /**
       *实现接口的类
      */
      public class NetworkC implements Inet {

        private String name;
        private String brand;

        public NetworkC() {
            
        }

        public NetworkC(String name, String brand) {
          this.name = name;
          this.brand = brand;
       }

       @Override
       public void network() {
           System.out.println("network上网");
       }

       @Override
       public void connection() {
          System.out.println("network连接");
      }
          
      @Override
       public void open() {
           Inet.super.open();
           System.out.println(Inet.tmp);//可以直接调用静态成员
        //不能直接Inet.open() 因为Inet只能调用静态成员，默认成员无法直接调用
    }
}


        NetworkC networkC = new NetworkC();
        Inet inet = new NetworkC();
        networkC.setBrand("联想");
        System.out.println(networkC.getBrand());
        inet.connection();
```

**一个类只能继承一个父类**，**但可以实现多个接口**，如果多个接口当中具有同名**默认**方法，则类会报错，因为不知道调用哪个接口的同名方法，此时如果该类还继承了另外一个父类，父类当中也有同名的方法，则会调用该父类。如果多个接口有同名属性，调用该属性则一样会报错，此时如果该类还继承了另外一个父类，父类当中也有同名的属性，调用还是会报错，只能在该子类里自己定义一个属性

```java
public interface IPhone {

    void connection();
    int tmp=30;

    //默认方法，子类无需重写
    default void open(){
        System.out.println("open");
    }
}

public interface Inet {

    int tmp = 20;

     //定义抽象方法
     void network();

     void connection();

     //默认方法，子类无需重写
     default void open(){
         System.out.println("open");
     }
}


public class NetworkCDad {
    
    public static final int tmp = 50
    
    public void open(){
        System.out.println("dad open");
    }
}



public class NetworkC implements Inet,IPhone{} //此时编译器会报错，因为实现的两个接口具有同名的默认方法

public class NetworkC extends NetworkCDad implements Inet,IPhone{} //不会报错因为调用同名方法会去找父类的方法
System.out.println(NetworkCDad.tmp);//报错 不知道用谁的tmp属性

```

**接口的继承**

**一个接口可以继承多个接口，如果继承的多个接口当中包含同名的默认方法，则也会报错**

#### 8、内部类

定义：**一个类定义在另外一个类的内部，该类成为内部类，而另外一个类称为外部类**

![](https://static.roi-cloud.com/youshu_file/youshu-enterprise-1/2023/03/14/1f1e8bb7-4399-4aaa-ba37-e8bdb877d108.png)

![](https://static.roi-cloud.com/youshu_file/youshu-enterprise-100001/2023/03/14/7b7773a9-ee2f-4866-bf84-c05f8136b290.png)

![](https://static.roi-cloud.com/youshu_file/youshu-enterprise-100001/2023/03/14/c8fffc81-c8ae-4a87-9360-62b3bb164059.png)

![](https://static.roi-cloud.com/youshu_file/youshu-enterprise-100001/2023/03/14/d74d17e8-656a-46fe-a526-d1475440b30b.png)

```java
 
 package com.imooc;

/**
 * 用来测试匿名内部类 该类用来当做父类
 */
 public abstract class Person {
    public abstract void read();
 }

 
 public static void main(String[] args) {
        TestAnoymous testAnoymous = new TestAnoymous();
        testAnoymous.getRead(new Person() { //这就是匿名内部类，好处就是节省类的创建
            @Override
            public void read() {
                System.out.println("我在读书");
            }
        });
    }
```

## 四、异常

定义：java程序当中的错误，分为编译时异常和运行时异常

### 1、分类（主要关注**Exception**）

![](https://static.roi-cloud.com/youshu_file/youshu-enterprise-1/2023/03/15/68db14b0-7a5c-481c-99ed-0ad9a4c1df72.png)

#### 2、使用try catch finally处理异常代码块

```java
try{
    //执行语句
}catch(Exception e){ //可以有多个catch语句块，在catch当中return值，此时如果有finally也return值，则catch语句虽然会执行，但返回值取得是finally
    //捕获语句当中的错误
}finally{
    //最后一定会执行的语句，不论是否出错
}
```

#### 3、throw、throws

**throws：向上抛出异常，谁调用谁解决**，**RuntimeException不需要解决**

```java
package com.imooc.test;

import java.util.Scanner;

public class ExceptionTest {
    public static void main(String[] args) {
        ExceptionTest exception = new ExceptionTest();
        exception.test();//不需要处理
        以下是用try/catch的处理方式
        try {
            exception.test();
        } catch (ArithmeticException e) {
            System.out.println("除数不能为0");
            e.printStackTrace();
        }
    }

    public void test() throws ArithmeticException { //这个就是RuntimeException类的异常
        System.out.println("请输入一个整数");
        Scanner scan = new Scanner(System.in);
        int next = scan.nextInt();
        System.out.println("请输入第二个整数");
        int next2 = scan.nextInt();
        System.out.println(next / next2);
    }
}

```

**throw可以手动抛出一个异常，可以自己解决也可以throws向上抛出异常**

```java
public static void main(String[] args) {
        ExceptionTest exception = new ExceptionTest();
        try {
            exception.test();
        } catch (Exception e) {
            System.out.println("除数不能为0");
            e.printStackTrace();
        }
    }

    public void test() throws Exception {
        System.out.println("请输入一个整数");
        Scanner scan = new Scanner(System.in);
        int next = scan.nextInt();
        System.out.println("请输入第二个整数");
        int next2 = scan.nextInt();
        if (next2 == 0) {
            throw new Exception();//手动跑出异常，要么自己解决(try/catch)，要么抛出异常到方法名
        } else {
            System.out.println(next / next2);
        }
    }
```

![](https://static.roi-cloud.com/youshu_file/youshu-enterprise-100001/2023/03/18/15cf9aea-8ad9-463e-a9b3-93fc8c12c03a.jpg)

#### 4、异常链

定义：不断利用try/catch捕获异常，并抛出新的异常

```java
package com.imooc.test;

public class ExceptionTest2 {

    public void test1() throws Exception {
        throw new Exception("第一个异常");
    }

    public void test2() throws Exception {
        try {
            test1();
        } catch (Exception e) {
            throw new Exception("第二个异常", e);
        }

    }

    public void test3() throws Exception {
        try {
            test2();
        } catch (Exception e) {
            throw new Exception("第三个异常", e);
        }

    }

    public static void main(String[] args) {
        ExceptionTest2 exceptionTest2 = new ExceptionTest2();
        try {
            exceptionTest2.test3();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

```



#### 5、自定义异常

```java
package com.imooc.test;

import com.imooc.pojo.HotelException;

public class HotelException extends Exception { //在自定义异常类

    public HotelException() {
        super("自定义的异常");
    }


    public String toString() {
        return "HotelException{}";
    }
}


public class ExceptionTest3 {
    public static void main(String[] args) {
        ExceptionTest3 exceptionTest3 = new ExceptionTest3();
        try {
            exceptionTest3.test();
        } catch (HotelException e) {
            System.out.println(e.getMessage());
        }
    }

    public void test() throws HotelException {
        throw new HotelException();
    }
}

```

![](https://static.roi-cloud.com/youshu_file/youshu-enterprise-100001/2023/03/18/a846b07a-22fb-4fca-af2a-d67c18b62da3.jpg)

## 五、包装类

### 1、定义

**由于基本数据类型不能像对象那样子交互，所以引申出包装类**

#### ![](https://static.roi-cloud.com/youshu_file/youshu-enterprise-100001/2023/03/18/f55bf7e3-bdfa-4ce7-8337-2577524a23d0.png)

![](https://static.roi-cloud.com/youshu_file/youshu-enterprise-100001/2023/03/18/782e0882-6b60-4f72-913e-3d28801d6ea7.jpg)

### 2、包装类比较

```java
        Integer integer = new Integer(100);
        Integer integer2 = new Integer(100);
        System.out.println(integer == integer2); //两个对象比较的是地址值

        Integer int1 = 100;
        Integer int2 = 100;
        System.out.println(int1 == int2); //除了float和double，都有常量池作为缓存,-128-127之间都会缓存

        Integer int3 = 200;
        Integer int4 = 200;
        System.out.println(int3 == int4);//超过上面的区间不会缓存，本质还是两个对象进行比较
        Integer int5 = 500;
        System.out.println(int5 == 500); //自动拆箱
```

### 3、字符串和包装类的转换

```java
public class test2 {
    public static void main(String[] args) {
        //integer转换为String
        String str = new Integer(100).toString();
        String str1 = String.valueOf(new Integer(100));
        //String转换为int
        int int1 = Integer.valueOf("200");
        int int2 = Integer.parseInt("200");
    }
}

```

### 4、字符串类

字符串类的常用方法

 ![](https://static.roi-cloud.com/youshu_file/youshu-enterprise-100001/2023/03/19/97b8e1f7-8089-4ea6-a141-4783feccb419.png)

![](https://static.roi-cloud.com/youshu_file/youshu-enterprise-100001/2023/03/19/0fa68e76-a8ce-4130-b5f5-56de8acdaa40.png)

![](https://static.roi-cloud.com/youshu_file/youshu-enterprise-100001/2023/03/19/a2c044fd-4215-4f93-bd64-ed2d879b37ae.png)

![](https://static.roi-cloud.com/youshu_file/youshu-enterprise-100001/2023/03/19/85870870-1fe2-4951-baa6-23d614d67608.png)

![](https://static.roi-cloud.com/youshu_file/youshu-enterprise-100001/2023/03/19/c8809ede-8e8d-4784-953c-ef739bec5f16.png)

![](https://static.roi-cloud.com/youshu_file/youshu-enterprise-100001/2023/03/20/f7ce65e1-7df0-4950-937e-ffd2054f3077.png)

![](https://static.roi-cloud.com/youshu_file/youshu-enterprise-100001/2023/03/20/bcb633c1-d46a-4f12-915b-58a3529ff243.png)

## 六、集合

### 1、定义

不限制长度的，存储连续的变量的数据结构

### 2、分类

**集合和Map**

集合包含：List、Set

队列：queue

map

![](https://static.roi-cloud.com/youshu_file/youshu-enterprise-100001/2023/03/21/afa4b0f9-9ce8-4f92-aeeb-45dd8eaabc00.png)

![](https://static.roi-cloud.com/youshu_file/youshu-enterprise-100001/2023/03/21/0c4a054e-a321-4c17-8f29-8fe925509ad7.png)

### 3、List

#### a、**ArrayList**

 一种有序的、可重复的的动态数组

![](https://static.roi-cloud.com/youshu_file/youshu-enterprise-100001/2023/03/21/d4471a3e-2806-45d5-b7ea-b157d7128262.png)

```java
package com.imooc.collection.list;

import java.util.ArrayList;

public class ArrayListSample {
    public static void main(String[] args) {
        ArrayList<String> bookList = new ArrayList<>();
        //ArrayList的添加元素方法
        bookList.add("三国演义");
        bookList.add("水浒传");
        bookList.add(1,"红楼梦");//往第一位添加
        bookList.add(bookList.size()-1,"西游记");
        System.out.println(bookList);

        //ArrayList的设置方法
        bookList.set(1, "三国演义啊");
        System.out.println(bookList);
        
        //ArrayList的删除方法
        bookList.remove("三国演义啊");
        System.out.println(bookList);

    }
}

```

#### b、LinkedList

定义：**一种特殊的ArrayList，用法差不多，但他多实现了dQueue接口，底层使用链表存储**

![](https://static.roi-cloud.com/youshu_file/youshu-enterprise-100001/2023/03/21/53520506-d012-45f1-80d4-24a0a7ec6f09.png)

```java
        LinkedList<String> bookList = new LinkedList<>();
        bookList.addFirst("西游记");
        bookList.addLast("水浒传");
        System.out.println(bookList); //[西游记, 水浒传]
```

#### c、Linkedlist和ArrayList的区别

![](https://static.roi-cloud.com/youshu_file/youshu-enterprise-100001/2023/03/21/9e89fe22-0f86-4469-b6e8-87e93c07ac8b.png)

**LinkedList：查询数据慢，增删数据快**

**ArrayList：查询快，增删满**

#### d、三种遍历集合的方式

```java
package com.imooc.collection.list;

import java.util.ArrayList;
import java.util.Iterator;

public class ListLoopSample {
    public static void main(String[] args) {
        ArrayList<String> bookList = new ArrayList<>();
        bookList.add("三国演义");
        bookList.add("水浒传");
        bookList.add(1,"红楼梦");//往第一位添加
        bookList.add(bookList.size()-1,"西游记");
        bookList.forEach(book -> System.out.println(book)); 
        for (String s : bookList) {
            System.out.println(s);
        }
        Iterator<String> iterator = bookList.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }
    }
}
```

#### 4、Set

一种无序的，不可重复的动态数组

![](https://static.roi-cloud.com/youshu_file/youshu-enterprise-100001/2023/03/22/94741e5e-9c41-4884-bfca-d4d767d0b303.png)

##### a、HashSet

![](https://static.roi-cloud.com/youshu_file/youshu-enterprise-100001/2023/03/22/86d8b6b2-374d-4cbe-a10b-aa0a5440d61c.png)

```java
package com.imooc.collection.set;

import java.util.HashSet;

public class HashSetSample {
    public static void main(String[] args) {
        HashSet<String> mobileList = new HashSet<>();
        mobileList.add("999");
        mobileList.add("123");
        mobileList.add("456");
        mobileList.add("123"); //不允许重复插入数据
        mobileList.add("789");

        boolean contains = mobileList.contains("789");
        System.out.println(mobileList); //[123, 456, 789, 999] 无序
        System.out.println(contains);
    }
}

```

为什么HashSet里的数据是精准唯一的？

**用hashCode() 和 equals()方法判断**

![](https://static.roi-cloud.com/youshu_file/youshu-enterprise-100001/2023/03/22/920da13d-bd35-480b-8b79-93af4cccf793.png)

**什么是hashCode值？**

**就是一个类的标识，不同类的标识不一样**

**什么是hash？**

**就是通过散列算法，把任意长度的数据变换成固定的输出**



![](https://static.roi-cloud.com/youshu_file/youshu-enterprise-100001/2023/03/22/4bda3c2d-7db8-4796-b219-dce121daec95.png)

**HashSet排序就是根据Hash值进行排序，但不是Hash值越大越靠后**

![](https://static.roi-cloud.com/youshu_file/youshu-enterprise-100001/2023/03/22/235290e4-3c6b-4121-a6ca-4db61679f9e0.png)

##### b、LinkedHashSet

**定义：实现了HashSet类，也是用Hash值进行存储位置，但是添加了链表的形式记录数据，因此是按插入的顺序提取数据**

![](https://static.roi-cloud.com/youshu_file/youshu-enterprise-100001/2023/03/22/8581a6f7-7730-43ca-8dab-ba86c116e461.png)

**底层的链表结构**

![](https://static.roi-cloud.com/youshu_file/youshu-enterprise-100001/2023/03/22/a7ca0722-4c38-44db-848a-61fb81263fc3.png)

```java
package com.imooc.collection.set;

import java.util.LinkedHashSet;

public class LinkedHashSetSample {
    public static void main(String[] args) {
        LinkedHashSet<String> strings = new LinkedHashSet<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        strings.add("d");

        System.out.println(strings); //[a, b, c, d]，因为有链表所以按插入顺序打印

    }
}

```



##### c、TreeSet

![](https://static.roi-cloud.com/youshu_file/youshu-enterprise-100001/2023/03/22/4ca340dd-9d81-4c7d-977c-41a66cf09197.png)

#### 5、map

定义：**map是一对具有映射关系的键值对组成，每组都是key-value的形式**

![](https://static.roi-cloud.com/youshu_file/youshu-enterprise-100001/2023/03/22/42c011d7-d77a-4b85-a5be-e13ac8b8bb0c.png)

**分类**

![](https://static.roi-cloud.com/youshu_file/youshu-enterprise-100001/2023/03/22/ef280c75-54c8-4b7e-89ba-2e3458d903eb.png)

a、HashMap

1、无序存储

2、也是根据hash值来决定数据存储的位置

![](https://static.roi-cloud.com/youshu_file/youshu-enterprise-100001/2023/03/22/83e1b5f1-2a26-4c7a-8e64-bc9706830a94.png)

## 七、泛型

### 1、定义

**用来定义数据的类型，避免编译时报错**

### 2、自定义类

```java
package com.imooc.generics;

import java.util.ArrayList;
import java.util.Random;

/**
 * 自定义泛型类
 *
 * @param <T>
 */
public class IClass<T> {
    private ArrayList<T> studentList = new ArrayList<>();

    public void addList(T element) {
        this.studentList.add(element);
    }

    public void addList(T[] array) {
        for (T t : array) {
            this.studentList.add(t);
        }
    }
    
    

    public T getRandomItem() {
        int i = new Random().nextInt(studentList.size());
        return this.studentList.get(i);
    }
}

```

### 3、自定义方法类型

```java
 public <T> ArrayList<T> addList(T[] array) {
        ArrayList<T> ts = new ArrayList<>();
        for (T t : array) {
            ts.add(t);
        }
        return ts;
}
```

### 4、通配符

```java
List<?> //任意类型
List<? extends Animal> //Animal类及其子类
List<? super Animal> //Animal类及其父类
```

## 八、多线程

### 1、程序、进程和线程的关系

**程序是一个可执行的静态文件，程序执行时以进程的形式留在操作系统当中，在进程当中又可以开启多个线程，线程相当于是进程的一个任务，线程的执行时间是由CPU决定的，CPU划出时间快来执行，在java当中，java他是多线程程序，一个java进程至少包含main线程和垃圾处理收集线程**

### 2、创建多线程的三种方式

#### a、继承Thread类

**在开发中不推荐，因为类是单继承的**

```java
package com.imooc.thread;

import java.util.Random;

public class ThreadSample1 {

    class RunTest extends Thread{
        @Override
        public void run() {

            int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9,10};
            for (int j = 0; j < arr1.length-1; j++) {
                int i = new Random().nextInt(10);
                try {
                    Thread.sleep(1000);
                    System.out.println(this.getName() + arr1[i]);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void runStart(){
        RunTest runTest = new RunTest();
        RunTest runTest2 = new RunTest();

        runTest.setName("小明");
        runTest2.setName("小张");
        runTest.start();
        runTest2.start();
    }


    public static void main(String[] args) {

        new ThreadSample1().runStart();
    }
}
```

#### b、Runnable接口

```java
package com.imooc.thread;

import java.util.Random;

public class ThreadSample2 {
    class Runner implements  Runnable{
        @Override
        public void run() {
            Integer index = new Random().nextInt(10);

            for (int i = 0; i <10; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(Thread.currentThread().getName() + "已经跑了" + (i + 1) * index);
            }
        }
    }
    public void  startTest(){
        Runner runner = new Runner();
        Thread thread = new Thread(runner);
        thread.setName("小明");
        thread.start();
    }
    public static void main(String[] args) {
        new ThreadSample2().startTest();
    }
}

```

#### c、Callable接口

```java
package com.imooc.thread;

import java.util.Random;
import java.util.concurrent.*;

public class ThreadSample3 {

    class Runner implements Callable<Integer>{

        @Override
        public Integer call() throws Exception {
            int i = new Random().nextInt(10);
            if(i/2==0){
                return 0;
            }
            return 1;
        }
    }

    public void StartTest() {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Runner runner = new Runner();
        Runner runner2 = new Runner();
        Runner runner3 = new Runner();
        Future<Integer> submit = executorService.submit(runner);
        Future<Integer> submit1 = executorService.submit(runner2);
        Future<Integer> submit2 = executorService.submit(runner3);
        executorService.shutdown();


        try {System.out.println(submit.get());
            System.out.println(submit1.get());
            System.out.println(submit2.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new ThreadSample3().StartTest();

    }
}

```

![](https://static.roi-cloud.com/youshu_file/youshu-enterprise-100001/2023/03/27/622a063f-78e0-4604-b2b6-5be4868edcb6.png)

### 3、线程同步

#### a、概念

**多个线程对象去争夺同一个对象**

#### b、用synchronized线程锁解决同步问题

![](https://static.roi-cloud.com/youshu_file/youshu-enterprise-100001/2023/03/27/1ad0f7fb-aa4b-4e2c-8578-a4cbd33b083e.png)

![](https://static.roi-cloud.com/youshu_file/youshu-enterprise-100001/2023/03/27/d5cdd825-1251-42e8-9249-154777cbbc5f.png)

```java
package com.imooc.sync;


public class SyncTest1 {
    Object lock = new Object();
    class printClass {
        //代码块形式
        public void print() throws InterruptedException {
            synchronized (lock){
                Thread.sleep(1000);
                System.out.println("1");
                Thread.sleep(1000);
                System.out.println("2");
                Thread.sleep(1000);
                System.out.println("3");
                Thread.sleep(1000);
                System.out.println("4");
            }

        }
        
        
         public synchronized void  print2() throws InterruptedException {
            Thread.sleep(1000);
            System.out.println("1");
            Thread.sleep(1000);
            System.out.println("2");
            Thread.sleep(1000);
            System.out.println("3");
            Thread.sleep(1000);
            System.out.println("4");
        }

        
         public synchronized static void print3() throws InterruptedException{ 
            Thread.sleep(1000);
            System.out.println("1");
            Thread.sleep(1000);
            System.out.println("2");
            Thread.sleep(1000);
            System.out.println("3");
            Thread.sleep(1000);
            System.out.println("4");
        }
    }

    class Runner implements Runnable{
        printClass pri;
        @Override
        public void run() {
            try {
                pri.print();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void start(){
        printClass printClass = new printClass();
        for (int i = 0; i < 10; i++) {
            Runner runner = new Runner();
            runner.pri = printClass;
            Thread thread = new Thread(runner);
            thread.start();
        }
    }
    public static void main(String[] args) {
        new SyncTest1().start();
    }
}
```

#### c、线程安全案例

```java
// goods
package com.imooc.sync;

import com.imooc.sync.pojo.Counter;
import com.imooc.sync.pojo.Custom;
import com.imooc.sync.pojo.Goods;

public class SyncTest2 {
    public static void main(String[] args) throws InterruptedException {
        Goods goods = new Goods();

        for (int i = 0; i < 5; i++) {
            Custom custom = new Custom();
            custom.goods = goods;
            Thread thread = new Thread(custom);
            thread.start();

        }
        Thread.sleep(50);
        System.out.println(Counter.counter);
    }
}
//custom
package com.imooc.sync.pojo;

public class Custom implements Runnable {

   public Goods goods;

    @Override
    public void run() {
        goods.sale();
    }
}
//custom
package com.imooc.sync.pojo;

public class Goods {
    public synchronized void sale(){
        if(Counter.counter>0){
            System.out.println("用户购买成功");
            Counter.counter--;
        }else{
            System.out.println("用户购买失败，库存不足");
        }
    }
}


//main
package com.imooc.sync;

import com.imooc.sync.pojo.Counter;
import com.imooc.sync.pojo.Custom;
import com.imooc.sync.pojo.Goods;

public class SyncTest2 {
    public static void main(String[] args) throws InterruptedException {
        Goods goods = new Goods();//同一个对象

        for (int i = 0; i < 5; i++) {
            Custom custom = new Custom();
            custom.goods = goods;
            Thread thread = new Thread(custom);
            thread.start();

        }
        Thread.sleep(50);
        System.out.println(Counter.counter);
    }
}
```

#### d、线程池

**JUC：java当中处理并发的包**

![](https://static.roi-cloud.com/youshu_file/youshu-enterprise-100001/2023/03/27/590c97ee-206a-4ce7-a2ed-91978f7296eb.png)

 **定长线程池**

![](https://static.roi-cloud.com/youshu_file/youshu-enterprise-100001/2023/03/27/3377623a-1b72-4b0e-9718-33262e82c27b.png)

**缓存线程池**

![](https://static.roi-cloud.com/youshu_file/youshu-enterprise-100001/2023/03/27/cf4db739-aeab-4a9c-a2b0-4cd35e22d9f6.png)

**单线线程池**

![](https://static.roi-cloud.com/youshu_file/youshu-enterprise-100001/2023/03/27/52506a0d-e706-4f72-abc9-88453ff3d286.png)

**延时线程池**

![](https://static.roi-cloud.com/youshu_file/youshu-enterprise-100001/2023/03/27/2138c0ab-b480-47aa-ad44-8ef11f7c61f2.png)

![](https://static.roi-cloud.com/youshu_file/youshu-enterprise-100001/2023/03/27/17fcc5dd-f863-4806-b057-d32f4d4b4a7f.png)

![](https://static.roi-cloud.com/youshu_file/youshu-enterprise-100001/2023/03/27/b542d723-76a5-4893-95c2-c51d13f0f74d.png)

## 九、IO实现文件的读写与操作

### 1、创建文件

java中操作文件的类都是File类

```java
package com.imooc.Io;

import java.io.File;
import java.io.IOException;

/**
 * 用来测试java IO类创建文件、目录的操作
 */
public class IoSample {
    public static void main(String[] args) {
        File file = new File("d:/b.txt");
        try {
            //在D盘创建b.text  createResult表示创建文件的结果
            boolean createResult = file.createNewFile();
            System.out.println("是否创建成功" + createResult);
            //该文件是否存在
            System.out.println("该文件是否存在" + file.exists());
            //该文件是否为目录
            System.out.println("该文件是否是目录" + file.isDirectory());
            //该文件是否为文件
            System.out.println("该文件是否是文件" + file.isFile());
            //该文件的文件名
            System.out.println("获取该文件的文件名" + file.getName());
            //该文件的内容长度
            System.out.println("该文件的内容长度" + file.length());
            //是否删除成功
            System.out.println("该文件是否删除成功" + file.delete());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

### 2、读取文件

```java
package com.imooc.Io;

import java.io.*;

/**
 * 用来测试读取文件
 */
public class StreamSample {
    public static void main(String[] args) {
        FileInputStream inputStream = null;
        try {
            File f = new File("d:/b.txt");
            f.createNewFile();
            inputStream = new FileInputStream("d:/b.txt");

            byte[] bytArray = new byte[1024];

            int len;

//            while ((len=inputStream.read(bytArray))!=-1){
//   S             System.out.println(len);//文件长度
//            }

            while ((len = inputStream.read()) != -1) {
                System.out.print((char)len); //读取一个字节
            }



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

```

3、写入文件

```java
package com.imooc.Io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 用来测试文件输出(复制文件)
 */

public class StreamSample2 {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        FileInputStream fis = null;
        int len = 0;
        byte[] bty = new byte[1024];
        try {
            fos = new FileOutputStream("d:/c.txt");
            fis = new FileInputStream("d:/b.txt");
//            while ((len = fis.read())!=-1){  按照一个字节一个字节输出
//                fos.write(len);
//            }
            while ((len = fis.read(bty))!=-1){
                fos.write(bty,0,len); //按长度输出
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
```

### 3、Reader和Writer

```java
 public void readTextFile(){
        Reader reader = null;
        try{
            File file = new File("d:/test.txt");
            //实例化Reader对象
            reader = new FileReader(file);
            int ch = 0;
            //逐个字符读取
            while((ch = reader.read()) != -1){
                System.out.print((char)ch);//UTF-8编码集
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if(reader != null){
                try {
                    //关闭reader对象
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    /*Writer写入文本文件过程*/
    public void writeTextFile(){
        Writer writer = null;
        try {
            File file = new File("d:/test.txt");
            //创建文件
            if (!file.exists()) {
                file.createNewFile();
            }
            //实例化writer对象
            writer = new FileWriter(file);
            //write()方法用于覆盖已有文件内容
            writer.write("这是一个新文件New");
            //append()方法用于在文件末尾追加
            writer.append(":Append内容");
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            //关闭writer对象
            if(writer != null){
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
```

### 4、转换流

```java
public void isrSample(){
        FileInputStream fis = null;
        InputStreamReader isr = null;
        try{
            File file = new File("d:/test.txt");
            fis = new FileInputStream(file);
            isr = new InputStreamReader(fis,"UTF-8");
            StringBuffer buffer = new StringBuffer();
            while(isr.ready()){
                buffer.append((char)isr.read());
            }
            System.out.println(buffer.toString());
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if(isr != null){
                try {
                    isr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    //利用OutputStreamWriter写入文本文件
    public void oswSample() {
        FileOutputStream fos = null;
        OutputStreamWriter osw = null;
        try {
            File file = new File("D:/test.txt");
            //创建文件
            if (!file.exists()) {
                file.createNewFile();
            }
            fos = new FileOutputStream(file);
            osw = new OutputStreamWriter(fos, "UTF-8");
            osw.write("这是一个新文件!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (osw != null) {
                    osw.close();
                }
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
```

### 5、Buffer流

```java
 public void readBuffer(){
        Reader reader =null;
        BufferedReader br = null;
        try{
            File file = new File("d:/FileSample.java");
            reader = new FileReader(file);
            br = new BufferedReader(reader);
            String line = null;
            while((line = br.readLine()) != null){
                System.out.println(line); //一次打印出来
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                if (br != null) {
                    br.close();
                }
                if(reader!= null){
                    reader.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
```

### 6、下载图片

```java
package com.imooc.Io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionSample {
    public static void main(String[] args) {
        InputStream is = null;
        OutputStream os = null;
        try {
            URL url = new URL("https://manongbiji.oss-cn-beijing.aliyuncs.com/images/weixin.jpg");
            URLConnection connection = url.openConnection();
            is = connection.getInputStream();
            os = new FileOutputStream("d:/weixin.jpg");
            byte[] bs = new byte[1024];
            int len = 0;
            while((len = is.read(bs)) != -1){
                //System.out.println(len);
                os.write(bs,0,len);
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(os != null){
                    os.close();
                }

                if (is != null) {
                    is.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}

```

### 8、总结

![](https://static.roi-cloud.com/youshu_file/youshu-enterprise-1/2023/03/31/6dc890a0-f4c8-4aba-b1d3-852ce8fa4580.png)

![](https://static.roi-cloud.com/youshu_file/youshu-enterprise-1/2023/03/31/2eec62fc-a6f8-4502-a481-707d086b39d0.png)

![](https://static.roi-cloud.com/youshu_file/youshu-enterprise-1/2023/03/31/7eedbee2-43bd-4327-b818-51cd1986168b.png)
