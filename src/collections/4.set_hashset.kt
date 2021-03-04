package collections

fun main(args : Array<String>){
    //set contains unique list of elements
    var set = setOf<Int>(0,0,0,1,2,3,4,5,67,77,8)
    //mutable set
    val m_set = mutableSetOf<Int>(2,23,4,5,4,5,6,5,12,333,55)
    m_set.remove(2)
    m_set.add(56)
    //hash-set sequence is not gaurented
    val hash_set = hashSetOf<Int>(2,23,4,5,4,5,6,5,12,333,55)


    //print using for-each
    for(element in set){
        println(element)
    }
    //print mutable set
    for(element in m_set){
        println(element)
    }
    //print hash-set set
    for(element in hash_set){
        println(element)
    }
}