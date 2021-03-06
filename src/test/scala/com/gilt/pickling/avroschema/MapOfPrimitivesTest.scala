package com.gilt.pickling.avroschema

import org.scalatest.{Assertions, FunSuite}
import com.gilt.pickling.TestObjs._
import com.gilt.pickling.TestUtils._

class MapOfPrimitivesTest extends FunSuite with Assertions {

  //Negative
  test("Pickle a case class with a map other than Map[String, _] fails") {
    intercept[IllegalArgumentException] (Schema(MapOfIntInts(Map(1 -> 2))))
    intercept[IllegalArgumentException] (Schema(classOf[MapOfIntInts]))
    intercept[IllegalArgumentException] (Schema[MapOfIntInts])
  }

  test("Generate schema from a case class with a map of int field") {
    assert(fingerPrint("/avro/maps/MapOfInts.avsc") === fingerPrint(Schema(MapOfInts(Map("key" -> 123)))))
    assert(fingerPrint("/avro/maps/MapOfInts.avsc") === fingerPrint(Schema(classOf[MapOfInts])))
    assert(fingerPrint("/avro/maps/MapOfInts.avsc") === fingerPrint(Schema[MapOfInts]))
  }

  test("Generate schema from a case class with a map of long field") {
    assert(fingerPrint("/avro/maps/MapOfLongs.avsc") === fingerPrint(Schema(MapOfLongs(Map("key" ->123L)))))
    assert(fingerPrint("/avro/maps/MapOfLongs.avsc") === fingerPrint(Schema(classOf[MapOfLongs])))
    assert(fingerPrint("/avro/maps/MapOfLongs.avsc") === fingerPrint(Schema[MapOfLongs]))
  }

  test("Generate schema from a case class with a map of double field") {
    assert(fingerPrint("/avro/maps/MapOfDoubles.avsc") === fingerPrint(Schema(MapOfDoubles(Map("key" ->123D)))))
    assert(fingerPrint("/avro/maps/MapOfDoubles.avsc") === fingerPrint(Schema(classOf[MapOfDoubles])))
    assert(fingerPrint("/avro/maps/MapOfDoubles.avsc") === fingerPrint(Schema[MapOfDoubles]))
  }

  test("Generate schema from a case class with a map of float field") {
    assert(fingerPrint("/avro/maps/MapOfFloats.avsc") === fingerPrint(Schema(MapOfFloats(Map("key" ->123F)))))
    assert(fingerPrint("/avro/maps/MapOfFloats.avsc") === fingerPrint(Schema(classOf[MapOfFloats])))
    assert(fingerPrint("/avro/maps/MapOfFloats.avsc") === fingerPrint(Schema[MapOfFloats]))
  }

  test("Generate schema from a case class with a map of boolean field") {
    assert(fingerPrint("/avro/maps/MapOfBooleans.avsc") === fingerPrint(Schema(MapOfBooleans(Map("key" -> false)))))
    assert(fingerPrint("/avro/maps/MapOfBooleans.avsc") === fingerPrint(Schema(classOf[MapOfBooleans])))
    assert(fingerPrint("/avro/maps/MapOfBooleans.avsc") === fingerPrint(Schema[MapOfBooleans]))
  }

  test("Generate schema from a case class with a map of string field") {
    assert(fingerPrint("/avro/maps/MapOfStrings.avsc") === fingerPrint(Schema(MapOfStrings(Map("key" -> "abc")))))
    assert(fingerPrint("/avro/maps/MapOfStrings.avsc") === fingerPrint(Schema(classOf[MapOfStrings])))
    assert(fingerPrint("/avro/maps/MapOfStrings.avsc") === fingerPrint(Schema[MapOfStrings]))
  }

  test("Generate schema from a case class with a map of char field") {
    assert(fingerPrint("/avro/maps/MapOfChars.avsc") === fingerPrint(Schema(MapOfChars(Map("key" -> 'a')))))
    assert(fingerPrint("/avro/maps/MapOfChars.avsc") === fingerPrint(Schema(classOf[MapOfChars])))
    assert(fingerPrint("/avro/maps/MapOfChars.avsc") === fingerPrint(Schema[MapOfChars]))
  }

  test("Generate schema from a case class with a map of byte field") {
    assert(fingerPrint("/avro/maps/MapOfBytes.avsc") === fingerPrint(Schema(MapOfBytes(Map("key" -> 1.toByte)))))
    assert(fingerPrint("/avro/maps/MapOfBytes.avsc") === fingerPrint(Schema(classOf[MapOfBytes])))
    assert(fingerPrint("/avro/maps/MapOfBytes.avsc") === fingerPrint(Schema[MapOfBytes]))
  }

  test("Generate schema from a case class with a map of short field") {
    assert(fingerPrint("/avro/maps/MapOfShorts.avsc") === fingerPrint(Schema(MapOfShorts(Map("key" -> 1.toShort)))))
    assert(fingerPrint("/avro/maps/MapOfShorts.avsc") === fingerPrint(Schema(classOf[MapOfShorts])))
    assert(fingerPrint("/avro/maps/MapOfShorts.avsc") === fingerPrint(Schema[MapOfShorts]))
  }
}
