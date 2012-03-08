package dojo

import collection.immutable.List

object FunsWithLists {

  def labels(ls: List[Game]) = Nil

  def averageRatingsOf(l:String,  ls:List[Game]) = 0

  def totalRatingsOf(ls: List[Game]):Int = 0

  def totalRatingsOfLabel(label: String, list: List[Game]):Int = 0

  def increaseRatingBy(inc: Int, ls: List[Game]) = Nil

  def decreaseRatingBy(i: Int, s: String, list: List[Game]) = Nil

  def createFunctionToFindGamesByLabel(label: String):(List[Game]) => List[Game] = identity(_)

  def zipWithKey = (f: (Game) => String, ls: List[Game]) => Nil

}
