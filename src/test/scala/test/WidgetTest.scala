package tests
 
import org.scalatest.FunSuite
import test.Widget
 
class WidgetTest extends FunSuite {
 
  test("colour") {
    expect("Blue") { new Widget().colour }
  }
 
  test("disposition") {
    expect("Awesome") { new Widget().disposition }
  }
}
