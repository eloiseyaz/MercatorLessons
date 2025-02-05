/**
 * Task 1
 *
 * The order of precedence is brackets, the arithmetic operators,eqaulities/inequalities (<, ==, etc.), logcial operators (! then && then ||) and then it is read from left to right.
 */

!(false && false) //a
(!false) && false //b
!false && false //same answer as b so ! is done before &&

!(false || true) //c
(!false) || true //d
!false || true //same answer as d so ! is done before ||

(false && true) || true //e
false && (true || true) //f
false && true || true // same answer as e so && comes before || (also see task 2)

//shows ! is first, then && and finally ||

//Task 2
(true || false && false) //True - && is done before ||

//Task 3
((true || false) && false) //False - brackets are done first

//Task 4
(1 < 4 && 7 != 10 || 9 + 10 == 21) //True - it's equivalent to:
(true && true || false) //which is true regardless of order