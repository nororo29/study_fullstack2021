## Day13
2021.05.31

- 배열
  - index활용
  - ArrayList
  - Arrays.asList()
  - System.arraycopy()
  - Iterator
- 컬렉션 프레임워크
  - 제네릭
  - List : ArrayList, Vector, LinkedList
  - Set : HashSet, TreeSet
  - Map : HashTable, HashMap, TreeMap, Properties
- 예외처리
- static
- Inner class

---
- List(순서 O) : ArrayList(stack, queue), Vector(동기화), LinkedList
- Set(순서 X, 중복 X) : HashSet, TreeSet(정렬)
- Map(key(중복 X) - value) : HashMap, HashTable(동기화), TreeMap(정렬)

  - 중복 : `equals()`, `hashCode()` 구현
  - 정렬 : Comparable-`compareTo()` or Comparator-`compare()` 구현
