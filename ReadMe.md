# String

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
boolean b = str.startsWith("Bu");
boolean b = str.startsWith("gun", 6);
boolean b = str.endsWith("ar");

String[] arr = str.split("[?!.>]");     // any character you want
```

### `replaceAll`
```java
// Keep only numbers
str = str.replaceAll("[^0-9]", " ");
// Remove numbers 
str = str.replaceAll("[0-9]", " ");
// Clean whitespaces
str = str.replaceAll("\\s+", " ");
// Remove Special Characters
str = str.replaceAll("[^a-zA-Z0-9]", " ");
// Keep only letters
str = str.replaceAll("[^a-zA-Z]", " ");
// Remove what you want
str = str.replaceAll("[?!.#$,]", " ");
```
### `matches`
```java
boolean hasLowerCaseChar = str.matches("(.*[a-z].*)"),
        hasUpperCaseChar = str.matches("(.*[A-Z].*)"),
        hasDigits = str.matches("(.*[0-9].*)"),
        hasSpecialChar = str.matches("(.*[ -/, :-@].*)");
```

### `CHAR ARRAY to STRING`
```java
String str = new String(charArray);
```

<br>

# StringBuilder

---

```java
StringBuilder sb = new StringBuilder();
StringBuilder sb = new StringBuilder("black");

```
### `METHODS`
```java
String str = sb.toString();

sb.append("tea");
sb.append('s');
sb.append(7);
sb.append(3.16F);
sb.append("String" + true + 123 + 0.5 + 'c' + 1.235f);

int l = sb.length();
char c = sb.charAt(0);

sb.delete(15,23);            // Stringtrue1230.
sb.deleteCharAt(14);         // Stringtrue1230

sb.reverse();

sb.insert(0, 'K');           // Khelloworld
sb.insert(1, 1);             // K1helloworld
sb.insert(2, ":");           // K1:helloworld
sb.replace(0, 3, "");        // helloworld
sb.setLength(5);             // hello
sb.deleteCharAt(2);          // helo
sb.delete(1, 4);             // h
```
<br>

# Array

---

### `Initialize an Array`
```java
int[] arr = {10, 20, 30};
int[] array = new int[3];
array[0] = 10;
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

<br>

# Sort - Reverse Order

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

<br>

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