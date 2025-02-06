//Task 1 - They are both iterables but a Set is unordered and cannot contain duplicates whereas a Seq is ordered and can contain duplicates.

Set(1, 2) == Set(2, 1, 1, 1) //True - Sets cannot contain duplicates so these both contain a 1 and a 2. Order does not matter so they are equal.

//Task 2 - True - Lists and Seqs are both ordered. These contain the same values in the same order so are equal.

List(3, 4) == Seq(3, 4)

//Task 3 - False - Lists are ordered but Sets are not so these are not equal.
List(5, 6) == Set(5, 6)