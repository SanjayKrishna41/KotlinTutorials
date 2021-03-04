package collections

fun main(args : Array<String>){

    //MAP - Key value pairs
    //declaring a map (Immutable fixed size and read-only)
    var map = mapOf<Int,String>(1 to "Vk",33 to "SS",3 to "KW")

    //declaring a map (mutable read and write)
    var m_map = HashMap<Int,String>()
    m_map.put(1,"Sanjay")
    m_map.put(2,"Krishna")
    m_map.put(3,"Sree")

    m_map.replace(2,"Jayalakshmi")
    m_map.replace(3,"Sreedharan")

    //loop to print keys
    for(keys in map.keys){
        println("$keys -> ${map.get(keys)}")
    }
    println("==============================")
    //loop to print keys
    for(keys in m_map.keys){
        println("$keys -> ${m_map.get(keys)}")
    }
}