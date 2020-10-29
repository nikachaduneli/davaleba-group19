fun main(){
    val aPoint = Point(3F , 4F)
    val bPoint = Point(3F , 4F)

    println(aPoint.equals(bPoint))
    println(aPoint)
    //println(aPoint.move())
}

class Point(x:Float, y:Float ){

    private var xPos = x
    private var yPos = y

    override fun equals(other: Any?): Boolean {
        if (other is Point){
            if(xPos == other.xPos && yPos == other.yPos){
                return true
            }
        }
        return false
    }

    override fun toString(): String {
        return "$xPos,$yPos"
    }

    /*fun move():String{
        val xx = -xPos
        val yy = -yPos
        return"$xx,$yy"
    }

*/


}
