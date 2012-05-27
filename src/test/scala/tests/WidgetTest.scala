package tests
 
import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner




@RunWith(classOf[JUnitRunner])
class WidgetTest extends FunSuite {
 
  test("colour") {
    expect("Blue") { new Widget().colour }
  }
 
  test("disposition") {
    expect("Awesome") { new Widget().disposition }
  }
}
