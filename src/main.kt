fun main(){
var y = arrays(arrayOf(5,6,1,3))
    println(y)
    var x = sum(arrayOf(10.5,"Jane",4.5F,5.5,true))
    println(x)
    var v = vowels(arrayOf('a','e','i','o','u'))
    println(v)
}
//Write a function that takes in an array of integers and returns the product of
//all the elements.
fun arrays(multiply:Array<Int>):Int{
    var product=1
    multiply.forEach { t->
        product*=t

    }
    return product
}

//2.Write a function that takes in an array of mixed types and returns the sum of
//all the decimal elements.
fun sum(mixedarrays:Array<Any>):Double{
    var array = 0.0
    mixedarrays.forEach { v->
        if (v is Double){
            array+=v
        }
    }
    return array
}

//3.Write a function that takes in an array of characters and returns the number of vowels in the array.
fun vowels(arraycharacter:Array<Char>):Int{
    var char = 0
    arraycharacter.forEach { vowel1->
        if (vowel1 =='a'|| vowel1 =='e'||vowel1 == 'i' ||vowel1 =='o'||vowel1 =='u'){
            char++
    }
    }

    return char

}