**README: Array and ArrayList in Java**

### 1. Introduction
This document provides an overview of Java's `Array` and `ArrayList` data structures, their differences, and their implementations in various operations.

### 2. Array in Java
An `Array` is a fixed-size data structure that stores elements of the same data type in contiguous memory locations.

#### **Key Features:**
- Fixed size (cannot be resized dynamically)
- Stores elements of the same data type
- Provides fast access via indexing

#### **Example:**
```java
int[] numbers = new int[5];
numbers[0] = 10;
numbers[1] = 20;
```

### 3. ArrayList in Java
An `ArrayList` is a dynamic array that allows resizing and provides built-in methods for adding, removing, and manipulating elements.

#### **Key Features:**
- Dynamically resizable
- Part of `java.util` package
- Supports different data types via generics

#### **Example:**
```java
import java.util.ArrayList;

ArrayList<Integer> list = new ArrayList<>();
list.add(10);
list.add(20);
```

### 4. Differences Between Array and ArrayList
| Feature      | Array | ArrayList |
|-------------|------|-----------|
| Size        | Fixed | Dynamic   |
| Performance | Faster for primitive types | Slightly slower due to additional overhead |
| Type Safety | Can store primitives | Requires wrapper classes for primitives |
| Built-in Methods | No | Yes (add, remove, etc.) |

### 5. Usage in Student Management System
- **Array**: Used to store fixed data such as batch numbers or IDs.
- **ArrayList**: Used to manage a dynamic list of students where additions and removals happen frequently.

### 6. Conclusion
Understanding the differences between `Array` and `ArrayList` is crucial in selecting the appropriate data structure for different use cases in Java programming.
