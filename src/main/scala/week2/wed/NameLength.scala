package week2.wed

class NameLength {
  def getNameLength(firstName: String, surname: String): Int = {
    if(firstName.length > surname.length) {
      firstName.length
    } else if (firstName.length < surname.length){
      surname.length
    } else 0
  }
}
