# LeetCodeSolutions

LeetCode力扣题解

这是我的LeetCode CN（力扣-中国站）提交代码记录。  
仅供参考，欢迎勘误。  
This is my code submission record of LeetCode CN Site.  
For reference only, your comment is appreciated on any mistake.

另，我已将提交过的题目标题、链接、提交日期整合成日志，具体请参考 [log.md](log.md)  
I have recorded the title, link and submission date of the problems I submitted, refer to [log.md](log.md) for the submission log.

本项目使用 MIT 开源许可协议，详情请参考 [LICENSE](LICENSE)  
This repository is licensed under the MIT License, refer to [LICENSE](LICENSE) for more information.

## 代码结构

MainInput.java为主类，包含主方法、各题方法、简化工具方法等。  
具体如下所示：（以Question 1337为例）

### 主方法

记录各题编号和信息，并调用各题方法

```java
public static void main(String[]args) {
    // option input
    switch(option){
        // case select
        case 1337:
            run1337();
            break;
        // other cases
        default:
            print("Wrong Problem Num");
    }
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