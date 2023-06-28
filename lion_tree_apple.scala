import scala.collection.immutable.HashMap

//Define a case class to store the entries of Mindful Matters
case class MindfulMatter (key: String, value: String)

//Define a function to add a Mindful Matter
def addMindfulMatter(key: String, value: String): Unit = {
  val newMatter = MindfulMatter(key, value)
  MindfulMatter.put(key, newMatter)
}

//Define a function to update a Mindful Matter
def updateMindfulMatter(key: String, value: String): Unit = {
  val updatedMatter = MindfulMatter(key, value)
  MindfulMatter.update(key, updatedMatter)
}

//Define a function to remove a Mindful Matter
def removeMindfulMatter(key: String): Unit = {
  MindfulMatter.remove(key)
}

//Define a function to get a Mindful Matter
def getMindfulMatter(key: String): MindfulMatter = {
  MindfulMatter.getOrElse(key, null)
}

//Define a HashMap to store the entries of Mindful Matters
object MindfulMatter extends HashMap[String, MindfulMatter]
{
  //Define a function to get the size of Mindful Matters
  def size: Int = MindfulMatter.size
  
  //Define a function to check whether Mindful Matters is empty
  def isEmpty: Boolean = MindfulMatter.isEmpty
  
  //Define a function to get all Mindful Matters
  def getAll: Iterable[MindfulMatter] = MindfulMatter.values
  
  //Define a function to check if Mindful Matter exists
  def contains(key: String): Boolean = MindfulMatter.contains(key)
}