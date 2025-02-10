package week2.mon.morningCodeAlong.library

class ReadingFormat

trait AudioBook extends ReadingFormat //Extending a class using the keyword extends. We can only extend 1 class per 'thing' (object, trait, class).

trait DigitalBook extends ReadingFormat

trait PhysicalBook extends ReadingFormat

//By having each format extending the superclass/parent 'ReadingFormat' we are grouping these together and giving each train access to any methods in the parent class.