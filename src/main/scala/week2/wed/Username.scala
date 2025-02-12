package week2.wed

class Username {

  def checkUsername (username: String): Boolean = {
    if (username.length >= 8 && username.toLowerCase == username) {
      true
    } else {
      false
    }
  }
}
