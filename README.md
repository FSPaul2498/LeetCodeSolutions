# LeetCodeSolutions  
LeetCode力扣题解  

这是我的LeetCode CN（力扣-中国站）提交代码记录。  
仅供参考，欢迎勘误。  
This is my code submission record of LeetCode CN Site.  
For reference only, errata are welcome.   

## 代码结构  
MainInput.java为主类，包含主方法、各题方法、简化工具方法等。  
具体如下所示：（以Question 1337为例）  

### 主方法  
记录各题编号和信息，并调用各题方法  
```java
public static void main(String[] args) {
    // Q1337. 矩阵中战斗力最弱的 K 行
    // the-k-weakest-rows-in-a-matrix
    run1337();
}
```

### 各题方法  
调用各题类，传入示例数据  
```java
static void run1337() {...}
```

### 简化工具方法  
常用工具的特殊实现，以简化上述代码  
```java
static void print(...) {...}
```
