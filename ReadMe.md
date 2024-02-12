## STRING

---

### `CONCAT`
```java
str = str.concat(str2);
```
### `COMPARE`
```java

boolean b1 = str.contains(str2);
boolean b2 = str.equalsIgnoreCase(str2);
boolean b3 = str.equals(str2);     // exact match (content)
boolean b4 = str==str2;            // referencing same object
```
### `METHODS`
```java
int i = str.indexOf('a');     // -1 if not exist
char c = a.charAt(0);       
```

### `CHAR ARRAY to STRING`
```java
String str = new String(charArray);
```

## SORT - REVERSE ORDER

---

[//]: # (<style>)

[//]: # (    .sort {)

[//]: # (        width: 100%;)

[//]: # (        text-align: left;)

[//]: # (    })

[//]: # (    .sort th {)

[//]: # (        background: #b2b2b2!important;;)

[//]: # (        text-align: center;)

[//]: # (    })

[//]: # (</style>)

[//]: # (<div class="sort">)

|                 | **Array**                                     | **List**                               |
|:----------------|:----------------------------------------------|:---------------------------------------|
| `Sort`          | Arrays.sort(arr);                             | Collections.sort(list);                |
| `Reverse Order` | Arrays.sort(arr, Collections.reverseOrder()); | list.sort(Collections.reverseOrder()); |
</div>

> **Sort order:** numbers ➡️ special chars ➡️ uppercase ➡️ lowercase

# ARRAY

---

### `Initialize an Array`
```java
int[] arr = {10, 20, 30};
int[] array = new int[3];
array[0] = 10;
```
### `SORT`
```java
Arrays.sort(arr);
Collections.sort(list);
```
### `COMPARE`
```java
Arrays.equals(arr1,arr2)
```
### `STRING to ARRAY`
```java
String[] arr = str.split("");
char[] ch = str.toCharArray();
```

# DecimalFormat

---
```java
double pi = 3.14597895623;
String p = new DecimalFormat ("##.##").format(pi); // 3.15    
```
```java
DecimalFormat df = new DecimalFormat("#00.00##");
double d = 120.6;
String s = df.format(d);      // 120.60
String s = df.format(81.9);   // 81.90
```