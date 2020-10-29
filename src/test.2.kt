fun main() {

    val f1 = Fraction(2F, 4F)
    val f2 = Fraction(6F, 8F)

    println(f1.jami(f2))
    println(f1.namravli(f2))
    println(f1.shekveca())



}

class Fraction(n: Float, d: Float) {

    private var numerator: Float = n
    private var denominator: Float = d

    override fun equals(other: Any?): Boolean {
        if (other is Fraction) {
            if (numerator * other.denominator / denominator == other.numerator) {
                return true
            }
        }
        return false
    }

    override fun toString(): String {
        return "$numerator/$denominator"
    }


    fun jami(other: Fraction): String {

        val mnishv = other.denominator * denominator

        val mricx = other.numerator * denominator + numerator * other.denominator
        return "$mricx/$mnishv"


    }

    fun namravli(other: Fraction): String {

        val mricx1 = numerator * other.numerator
        val mnishv1 = denominator * other.denominator
        return "$mricx1/$mnishv1"

    }

    fun shekveca(): String {

        var mricx3 = numerator
        var mnishv3 = denominator

        if ((denominator % 2).equals(0) && (numerator % 2).equals(0)) {
            mricx3/= 2
            mnishv3 /= 2



        }else if((denominator % 3).equals(0) && (numerator % 3).equals(0)){
            mricx3 /= 3
            mnishv3 /= 3
        }
        return "$mricx3/$mnishv3"

    }
}
