object Driver extends App {
  private val objElementExtraction = new NthElementExtraction
  private val list = List(1, 5, 4, 9, 7)
  private val toExtract = 2
  try {
    if (toExtract > list.length) {
      throw new IndexOutOfBoundsException
    }
    else {
      val result = objElementExtraction.elementExtraction(list, toExtract)
      print(result)
    }

  } catch {
    case e: IndexOutOfBoundsException => print("Error : Index is greater than List's Length")
    case ex: Exception => ex.getMessage
  }

}