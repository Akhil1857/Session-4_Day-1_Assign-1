class NthElementExtraction {

  //Function takes Generic Argument of List type and an Integer value
  def elementExtraction[T](list: List[T], index: Int): T = {
    val reversedList = list.reverse
    reversedList(index - 1)

  }
}



