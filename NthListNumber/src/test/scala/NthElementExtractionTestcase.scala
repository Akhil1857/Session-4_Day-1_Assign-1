import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper

class NthElementExtractionTestcase extends AnyFlatSpec with Matchers{
  "NthElementExtraction" should "Should return the nth element from the Last" in {
    val obj = new NthElementExtraction
    val list = List(1, 5, 4, 9, 7)
    val elementToExtract = 3
    val result = obj.elementExtraction(list, elementToExtract)
    result shouldBe 4
  }
  "it" should "should return the nth element from the Last" in {
    val obj = new NthElementExtraction
    val list = List(1, 5, 4, 9, 7)
    val elementToExtract = 2
    val result = obj.elementExtraction(list, elementToExtract)
    result shouldBe 9
  }


}
