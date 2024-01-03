fun main(args: Array<String>) {

////  var / val
//    var i: Int = 10
//    val j: Int = 10
//
//    i = 20
////    j = 20
//
//    println(i)
//    println(j)

////  null 허용
//    var i: Int = 10
//    var j: Int? = 10
//
////    i = null
//    j = null
//
//    println(i)
//    println(j)

////  타입추론
//    val s = "ABC"
//    val i = 1
//    val l = 1L
//    val d = 1.0
//    val f = 1.0f
//
//    println("s = " + s::class)
//    println("i = " + i::class)
//    println("l = " + l::class)
//    println("d = " + d::class)
//    println("f = " + f::class)

//    if / when
////    대소 비교
//    val priceA: Int = 100
//    val priceB: Int = 200
//
//    if(priceA >= priceB) {
//        println("priceA = $priceA")
//    } else {
//        println("priceB = $priceB")
//    }
//
////    null 체크
//    val price: Int? = null
//
//    if (price == null) {
//        println("null check true")
//    } else {
//        println("price = $price")
//    }
//
////    in 체크
//    val price: Int = 100
//
//    if (price in arrayOf(100, 200, 300)) {
//        println("contain")
//    } else {
//        println("not contained")
//    }
//
////    값 비교
//    val price: Int = 100
//
//    when (price) {
//        100 -> println("1. price = $price")
//        200 -> println("2. price = $price")
//        300 -> println("3. price = $price")
//        else -> println("4. Not")
//    }
//
////    범위 비교
//    val price: Int = 301
//
//    when (price) {
//        in 100..199 -> println("1. price = $price")
//        in 200..299 -> println("2. price = $price")
//        in 300..399 -> println("3. price = $price")
//        else -> println("4. Not")
//    }

    //// function
//    val price1 = 100
//    val price2 = 200
//
//    val price3 = sumPrice(price1, price2)
//    println("price3 = $price3")

    val item = Item("Book", 10000)
    println("item name is ${item.name}, price is ${item.price}")

    item.buy()
    item.sell()
}

// class
class Item(
    val name: String,
    val price: Int
) : ItemTrade {
    override fun buy() {
        println("[buy] $name")
    }

    override fun sell() {
        println("[sell] $name")
    }
}

interface ItemTrade {
    fun buy()
    fun sell()
}

// function
//fun sumPrice(price1: Int, price2: Int): Int {
//    return price1 + price2
//}
//
//fun sumPrice(price1: Int, price2: Int): Int = price1 + price2

