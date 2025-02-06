//Task 1
val nums: Seq[Int] = Seq(1, 2, 3, 4, 5, 6, 7, 8, 9)
val numsFilteredOnce: Seq[Int] = nums.filterNot(num => num % 3 == 0)
val numsFilteredTwice: Seq[Int] = numsFilteredOnce.filterNot(num => num % 4 == 0)

//Task 2
val thirdItem: Int = nums.tail.tail.head