package Konular.Collections.Collections_API;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

/*
    Collections can be corrupted if accessed concurrently (eş zamanlı)
    from multiple threads.

    If two or more threads try to access the collection at the time,
    they can corrupt it, if this collection is not immutable.

    Making collection thread-safe does not guarantee the thread safety
    of the objects it contains. Only immutable objects are automatically
    thread-safe.
 */
public class Thread_Safety {
    /*
        To prevent Collections corruption, you can make collection:
            -- unmodifiable (read-only)  ==> degisiklige izin vermiyor
            -- synchronized (slow)
            -- copy-on-write (fast, but consumes memory)
     */
    public static void main(String[] args) {

        Set<String> set = new HashSet();
        Set<String> readOnlySet = Collections.unmodifiableSet(set);

        Map<String, Integer> map = new HashMap();
        Map<String, Integer> syncMap = Collections.synchronizedMap(map);

        List<String> list = new ArrayList<>();
        List<String> copyOnWriteList = new CopyOnWriteArrayList<>(list);

    }
}
