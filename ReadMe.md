# Java

---
#### parseInt vs valueOf
```java
int n = Integer.parseInt("77");
Integer i = Integer.valueOf("77");
String str = String.valueOf(77);
```
#### Collections

```java
Collections.reverse(list);
Collections.sort(list);
Collections.addAll(list, arr);
int n = Collections.frequency(list, element);
```

#### String
```java
String str = "Java";
String str = new String("Java");
String str = new String(charArray);
```
#### StringBuilder
```java
StringBuilder sb = new StringBuilder();
StringBuilder sb = new StringBuilder("black");
sb.append("black");
```
#### Array
```java
int[] arr = {10, 20, 30};
int[] arr = new int[3];
String[] arr = str.split(" ");
char[] arr = str.toCharArray();
arr[0] = 10;
```
#### List
```java
List<String> list = new ArrayList<>();
List<String> list = new ArrayList<>(Arrays.asList("A","B","C"));
List<String> list = Arrays.asList(str.split("\\s+"));
List<String> list = Arrays.asList(arr);
list.add("A");
```
#### Set
```java
Set<String> set = new HashSet<>();
Set<String> set = new HashSet<>(list);
Set<String> set = new HashSet<>(Arrays.asList(arr));
set.add("Hello");
```
#### Map
```java
Map<String, Integer> map = new HashMap<>();
Map map = new HashMap();
map.put(key, value);
```

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

# StringBuilder

---

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

# Array

---

### `Initialize an Array`
```java
int[] arr = {10, 20, 30};
int[] array = new int[3];
array[0] = 10;
```
```java
System.out.println(Arrays.toString(arr));
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
### `Copying one array to another`
```java
int[] a = {10, 20, 30, 40, 50};
int[] b = Arrays.copyOf(a, a.length);    // [10, 20, 30, 40, 50]
int[] c = Arrays.copyOf(a, 3);           // [10, 20, 30]
int[] d = Arrays.copyOf(a, 7);           // [10, 20, 30, 40, 50, 0, 0]
int[] e = Arrays.copyOfRange(a, 1, 4);   // [20, 30, 40]

>> you can also use foreach loop to copy an array
```
### `Fill an array`
```java
String[] values = new String[5];
Arrays.fill(values, 2, 4, "cat");       // [null, null, cat, cat, null]
```

# SET

---
```java
Set<String> set = new HashSet<>();
set.add("Hello");
boolean B = set.contains("Hello"); 
set.remove("Hello");
set.clear();    // []        

// combine sets
set1.addAll(set2);
set.addAll(list);

// To find intersection (common values)
set1.retainAll(set2);

// To find the difference (set1'in set2'den farkı)
set1.removeAll(set2);
```


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

# Character

---
```java
assertTrue(Character.isDigit('7'));
assertTrue(Character.isLetter('a'));
assertTrue(Character.isAlphabetic('a'));

assertTrue(Character.isLowerCase('a'));
assertTrue(Character.isUpperCase('A'));

assertTrue(Character.isWhitespace(' '));

int n = Character.getNumericValue('9');     // n= 9    
```

<br>

# Iterator

---
```java
Iterator<Integer> iterator = list.iterator();

while(iterator.hasNext()) {
    Integer i = iterator.next();
    if(i < 10) {
        iterator.remove();
    }
} 
```
```java
/* *** ITERATE KEYS *** */
Set<String> keys = map.keySet();
Iterator<String> iter = keys.iterator();
while (iter.hasNext()) {
    if (iter.next().equalsIgnoreCase("Hello"))
        iter.remove();
}
```
<br>

# MAP

---
```java
Map<String, Integer> map = new HashMap<>();

map.put(key, value);
map.remove(key);
map.get(key);
map.replace(key, oldValue, newValue);

int s = map.size();
boolean b = map.containsKey(key);
boolean b = map.containsValue(value);
boolean b = map.isEmpty();

map2.putAll(map1);

map.forEach((K, V) -> System.out.println(K + ":" + V));
```
### `Map Entry`
```java
for (Map.Entry<String, Integer> pairs : map.entrySet()) {
    System.out.println(pairs);
    System.out.print(pairs.getKey());
    System.out.print(pairs.getValue());
}
```
```java
System.out.println("Map :" + map);               //  {Melisa=8, Duru=9, Hidayet=6, Batu=3}
System.out.println("Set :" + map.entrySet());    //  [Melisa=8, Duru=9, Hidayet=6, Batu=3]
System.out.println("Values :" + map.values());   //  [8, 9, 6, 3]
System.out.println("Keys :" + map.keySet());     //  [Melisa, Duru, Hidayet, Batu]
```
```java
Collection<Integer> myValues = map.values();
myValues.removeIf(integer -> integer == 7);

Set<String> myKeys = map.keySet();
myKeys.removeIf(s -> s.equalsIgnoreCase("Hello"));
```

<br>

# Remove if

---

|                                | **removeIf**                                                                                        | 
|:-------------------------------|:------------------------------------------------------------------------------------------------|
| **`List<String>`**             | list.removeIf(s -> s.equalsIgnoreCase("..."));                                                  |      
| **`Map<String, Integer> map`** | `Collection`<Integer> myValues = `map.values()`;<br>myValues.removeIf(integer -> integer == 2); |      
| **`Map<String, Integer> map`** | `Set`<String> myKeys = `map.keySet()`;<br>myKeys.removeIf(s -> s.equalsIgnoreCase("Privet")); |

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

<br>