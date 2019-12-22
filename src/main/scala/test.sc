var lst = List(1, 2, 0, 4, 5, 1)

def foo(list: List[Int]): Int = {
  list.find(x => x%3 == 0).map(r => r*2).getOrElse(0)
}

foo(lst)