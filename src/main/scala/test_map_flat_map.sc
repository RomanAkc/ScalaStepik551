import scala.None

def divide(x: Double, y:Double): Option[Double] = {
  if (y == 0) None else Some(x / y)
}

def convert(x: Double, y: Double): Option[Double] = {
  divide(x,y).map(x => x*x)
}

def convertEx(x: Double, y: Double, z: Double): Option[Double] = {
  divide(x,y).flatMap(x => if (x>z) Some(x*x) else None)
}

convert(5, 3)
convert(100, 3)
convert(100, 0)

convertEx(5,3,0)
convertEx(100,3,0)
convertEx(100,0,0)
