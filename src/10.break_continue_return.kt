fun main(arg : Array<String>){
    //break statement
//    for(i in 1..10){
//        if(i == 5) break;
//        println(i)
//    }
    //break statement with labeled for loop
    outer@ for(i in 1..3){
        inner@ for(j in 1..3){
            if(i ==2 && j == 2) break@outer //breaks out of outer for loop
            println("$i - $j")
        }
    }

    //Continue
    for(i in 1..10){
        if(i == 5) continue;
        println(i)
    }

    //continue statement with labeled for loop
    outer@ for(i in 1..3){
        inner@ for(j in 1..3){
            if(i ==2 ||  j == 2) continue@inner //breaks out of outer for loop
            println("$i - $j")
        }
    }
}