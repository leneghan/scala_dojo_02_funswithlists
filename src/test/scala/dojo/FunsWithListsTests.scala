package dojo

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith
import FunsWithLists._
import collection.immutable.List

/*
  Points will be deducted for implementations
  that are not in the spirit of the game,
  eg hard coding values
*/
@RunWith(classOf[JUnitRunner])
class FunsWithListsTests extends FunSuite with ShouldMatchers{

  val games = List(Game("Activision", 30), Game("Zenga", 60), Game("Zenga", 10), Game("EA",60), Game("EA",110))

  test("should return list of labels"){
    val expected = List("Activision", "Zenga", "Zenga", "EA", "EA")
    labels (games) should equal (expected)
  }

  /* 1 BONUS POINT : complete this using only higher order functions */
  test("should return the average rating of games belonging to Zenga"){
    averageRatingsOf ("Zenga", games) should equal (35)
  }

  /* 1 BONUS POINT : complete this using recursion */
  test("should return the total ratings of all games"){
    totalRatingsOf (games) should equal (270)
  }

  /* 1 BONUS POINT : complete this in an imperative style */
  test("should return the total ratings of EA games"){
    totalRatingsOfLabel ("EA", games) should equal (170)
  }

  test("should increase all games rating by 10"){
    val expected = List(Game("Activision", 40), Game("Zenga", 70), Game("Zenga", 20), Game("EA",70), Game("EA",120))
    increaseRatingBy (10, games) should equal (expected)
  }

  test("should decrease all Zenga games rating by 10"){
    val expected = List(Game("Activision", 30), Game("Zenga", 50), Game("Zenga", 0), Game("EA",60), Game("EA",110))
    decreaseRatingBy (10, "Zenga", games) should equal (expected)
  }

  test("should create function to find Activision games"){
    val findByActivision = createFunctionToFindGamesByLabel("Activision")
    findByActivision (games) should equal (List(Game("Activision", 30)))
  }

  test("should return a List of tuples consisting of game label and game"){
    val expected = List(("ACTIVISION",Game("Activision",30)), ("ZENGA",Game("Zenga",60)), ("ZENGA",Game("Zenga",10)), ("EA",Game("EA",60)), ("EA",Game("EA",110)))
    val labelToUpper = (g:Game) => g.label.toUpperCase
    zipWithKey (labelToUpper, games) should equal (expected)
  }

  /* 2 BONUS POINTS : uncomment test and make it pass

  test("find first game with rating of 60 using curried function"){

    val firstGameWithRating60in = firstGameWithRating(60)
    firstGameWithRating60in (games) should be (Game("Zenga", 60))

    val otherGames =(List(Game("Zenga", 30), Game("Activision",20), Game("EA",60)))
    firstGameWithRating60in (otherGames) should be (Game("EA", 60))
  }

  */
  
}
