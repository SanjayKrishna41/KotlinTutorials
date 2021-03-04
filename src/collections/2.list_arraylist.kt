package collections

fun main(arg : Array<String>){

    //declaring immutable list
    val im_list = listOf<String>("AB","VK","MAX")
    //  im_list[0] = "1" returns error because listof is read only

    //declaring mutable list
    val m_list = mutableListOf<String>()

    //adding elements
    m_list.add(0,"AB")
    m_list.add(1,"VK")
    m_list.add(2,"MAX")
    m_list.add(3,"SAM")

    m_list.add(1,"SIRAJ")
    m_list.removeAt(1)
    println("Immutable List : ")
    //printing immutable list
    for(element in im_list){
        print("$element ")
    }

    println()

    println("=============================")
    println("Mutable List : ")
    //printing Mutable list
    for(element in m_list){
        print("$element ")
    }
    println()
    println("=============================")
}